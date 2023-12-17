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

/**
 *
 * @author monta
 */
public class TableProduit {

    
   
    Connection con;
PreparedStatement pst;
ResultSet rs;
    private ArrayList<Produit> Table;

public void conect() throws SQLException, ClassNotFoundException{
    Class.forName("org.sqlite.JDBC");
 con=DriverManager.getConnection("jdbc:sqlite:data.db");
} 

    

        public TableProduit() {
            Table=new ArrayList<>();
            try{
           conect();
        Statement st=(Statement) con.createStatement() ;      
        rs = st.executeQuery("select * from produit order by NOM_PRODUIT");
       while(rs.next()){
       int id=   rs.getInt("ID_PRODUIT");
         String nom =rs.getString("NOM_PRODUIT");
         double prix=rs.getDouble("PRIX");
          String categorie =rs.getString("CATEGORIE");
         int stoke=  rs.getInt("stoke");
           Produit p=new Produit(nom, stoke, categorie, prix, id);
           Table.add(p);
          
       }
       
      
               con.close();
       }catch(Exception e){e.printStackTrace();
       }
   
            
        }

    public ArrayList<Produit> getTable() {
        return Table;
    }

public int sumStoke(){
int stoke=0;
for(Produit p : Table)
    stoke+=p.getStoke();

return stoke;
}
 public Produit produitplusVante(){
    int s=0;
    TableDateAchat achat =new TableDateAchat();
    Produit p = null ;
    for(Produit e :Table){
    if (achat.nombredevente( e.getId())>s){
        s=achat.nombredevente( e.getId());
        p=e;
    }
    }
    return p;
    }
  public Produit produitmoisVante(){
    int s=999999999;
    TableDateAchat achat =new TableDateAchat();
    Produit p = null ;
    for(Produit e :Table){
    if (achat.nombredevente( e.getId())<s){
        s=achat.nombredevente( e.getId());
        p=e;
    }
    }
    return p;
    }
   public Produit produitplusdeStoke(){
    int s=0;
   
    Produit p = null ;
    for(Produit e :Table){
    if (e.getStoke()>s){
        s=e.getStoke();
        p=e;
    }
    }
    return p;
    }
 
    
}
