/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author monta
 */
public class TableAchat {
    ArrayList<Achat> Table;
    Connection con;
PreparedStatement pst;
ResultSet rs;
public void conect() throws SQLException, ClassNotFoundException{
    Class.forName("org.sqlite.JDBC");
 con=DriverManager.getConnection("jdbc:sqlite:data.db");
} 
    public TableAchat() {
        Table=new ArrayList<>();
        
        try{
             
           conect();
        Statement st=(Statement) con.createStatement() ;      
        rs = st.executeQuery("select * from achat order by DATE_ACHAT desc");
       while(rs.next()){
          Achat p;
               p = new Achat( rs.getInt("ID_ACHAT"),rs.getDouble("MONTANT_TOTALE"),rs.getDouble("MONTANT_DEPOSER"),rs.getDouble("MONTENT_RESTE"),rs.getString("DATE_ACHAT"),rs.getInt("CODE_CLIENT"));
           
           Table.add(p);    
       }
               con.close();
       }catch(Exception e){e.printStackTrace();
       }
    }

    public ArrayList<Achat> getTable() {
        return Table;
    }
  public ArrayList<Achat> rechrcheAchatClient(int id ){
    ArrayList   cherche=new ArrayList<>();
  /* try{
             
           conect();
        Statement st=(Statement) con.createStatement() ;      
        rs = st.executeQuery("select ID_ACHAT,MONTANT_TOTALE,MONTANT_DEPOSER,MONTENT_RESTE,DATE_ACHAT from achat where CODE_CLIENT= "+id+" order by DATE_ACHAT");
       while(rs.next()){
          Achat p;
             p = new Achat( rs.getInt("ID_ACHAT"),rs.getDouble("MONTANT_TOTALE"),rs.getDouble("MONTANT_DEPOSER"),rs.getDouble("MONTENT_RESTE"),rs.getString("DATE_ACHAT"),rs.getInt("CODE_CLIENT"));
           cherche.add(p);    
       }
               con.close();
       }catch(Exception e){e.printStackTrace();
       }*/
   for(Achat a : Table){
    if (a.getIdclient()==id)
           cherche.add(a);}
  return cherche;
  }
  public double sommeMONTANT_TOTALE (){
  double sum =0;
  for(Achat a : Table){
 sum+=  a.getMONTANT_TOTALE();
  
  }
  return sum;
  }  
     public double sommeMONTANT_DEPOSER (){
  double sum =0;
  for(Achat a : Table){
 sum+=  a.getMONTANT_DEPOSER();
  
  }
  return sum;
  }  
   
      public double sommeMONTANT_DEPOSERClient (int id){
  double sum =0;
  for(Achat a : Table){
      if(id==a.getIdclient())
        sum+= a.getMONTANT_DEPOSER();
  
  }
  return sum;
  }  
   public double sommeMONTANT_TOTALEClient (int id){
  double sum =0;
  for(Achat a : Table){
      if(id==a.getIdclient())
      sum+=  a.getMONTANT_TOTALE();
  
  }
  return sum;
  }  
    public double sommeMONTANT_resteClient (int id){
  double sum =0;
  for(Achat a : Table){
      if(id==a.getIdclient())
      sum+=  a.getMONTENT_RESTE();
  
  }
  return sum;
  }  
  
  
}
