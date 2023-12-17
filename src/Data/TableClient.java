/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class TableClient {
    Connection con;
PreparedStatement pst;
ResultSet rs;
    private ArrayList<Client> Table;

public void conect() throws SQLException, ClassNotFoundException{
    Class.forName("org.sqlite.JDBC");
 con=DriverManager.getConnection("jdbc:sqlite:data.db");
} 



    public TableClient() {
     Table=new ArrayList<>();
        try{
           conect();
        Statement st=(Statement) con.createStatement() ;      
        rs = st.executeQuery("select * from clients order by NOM_COMPLET");
       while(rs.next()){
         Client p;
               p = new Client( rs.getString("NOM_COMPLET"),rs.getInt("NUM_TEL"),rs.getInt("ID_CLIENTS"));
           Table.add(p);    
       }
               con.close();
       }catch(Exception e){e.printStackTrace();
       }
    }
    public ArrayList<Client>chercher(String re){
    ArrayList<Client> tabler =new ArrayList<>();
     try{
           conect();
        Statement st=(Statement) con.createStatement() ;      
        rs = st.executeQuery("select * from clients where NOM_COMPLET like  '%"+re+"%'  or NUM_TEL like  '%"+re+"%' or ID_CLIENTS like  '%"+re+"%' ");
       while(rs.next()){
            Client p;
               p = new Client( rs.getString("NOM_COMPLET"),rs.getInt("NUM_TEL"),rs.getInt("ID_CLIENTS"));
               tabler.add(p);    
       }
      
               con.close();
       }catch(Exception e){e.printStackTrace();
       
       }
    return tabler;}       
    
    
    public Client getClient(int id){
   Client p = null ;
        for(Client c : this.Table)
            if(c.getId()==id)
                p=new Client(c.getNom(),c.getTelephone(),id);
   return p;
    }
    
    

    public ArrayList<Client> getTable() {
        return Table;
    }
    public Client clientfidel(){
  double prix=0;
  TableAchat p=new TableAchat();
  Client c = null;
  for(Client e :Table)
      if(p.sommeMONTANT_TOTALEClient(e.getId())>=prix)
      {
          prix=p.sommeMONTANT_TOTALEClient(e.getId());
          c=e;
      }
  return c;
  }
     public Client clientmosel(){
  double prix=0;
  TableAchat p=new TableAchat();
  Client c = null;
  for(Client e :Table)
      if(p.sommeMONTANT_resteClient(e.getId())<=prix)
      {
          prix=p.sommeMONTANT_resteClient(e.getId());
          c=e;
      }
  return c;
  }
      public Client clientMo5les(){
  double taux=0;
  TableAchat p=new TableAchat();
   double taux1;
  Client c = null;
     for(Client e :Table){
         taux1=p.sommeMONTANT_DEPOSERClient(e.getId())/p.sommeMONTANT_TOTALEClient(e.getId());
      if(taux1>=taux)
      {
          taux=taux1;
          c=e;
      }
         }
  return c;
  }
    
    }

