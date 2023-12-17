/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Data;

import Supprimer.Option;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author monta
 */
public class Produit {

    private String nom;
    private int Stoke;
    private String gategorie;
    private Double prix;
    private int id;
 Connection con;
PreparedStatement pst;
ResultSet rs;






public void conect() throws SQLException, ClassNotFoundException{
    Class.forName("org.sqlite.JDBC");
 con=DriverManager.getConnection("jdbc:sqlite:data.db");
} 
    public Produit(String nom, int Stoke, String gategorie, Double prix, int id) {
        this.nom = nom;
        this.Stoke = Stoke;
        this.gategorie = gategorie;
        this.prix = prix;
        this.id = id;
    }

    public String getGategorie() {
        return gategorie;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public Double getPrix() {
        return prix;
    }

    public int getStoke() {
        return Stoke;
    }
    public void supprimer_produit(){
             try {
         
            conect();
              
            String sql="delete from PRODUIT where ID_PRODUIT=?";
            pst=con.prepareStatement(sql);
            pst.setInt(1,id);
            pst.execute();
            
            con.close();
            
             Option o =new Option("SUPPRIMER REUSSI");
              o.main("SUPPRIMER REUSSI");
        } catch (Exception e) {   
         Option o =new Option("SUPPRIMER ERREUR");
              o.main("SUPPRIMER ERREUR");}}
    public void dimnuerStoke(int stokedimuner,int codeproduit)throws Exception{
   
            int stoke = 0;
            conect();
            Statement st=(Statement) con.createStatement() ;
            rs = st.executeQuery("select stoke from produit where ID_PRODUIT= "+codeproduit);
            while(rs.next()){
                stoke=rs.getInt("stoke");            }
            if(stoke >=stokedimuner ){            
            stoke=stoke-stokedimuner;
            String sql=" update PRODUIT set stoke ="+stoke+" where ID_PRODUIT= '"+codeproduit+"' ";
            pst=con.prepareStatement(sql);
            pst.execute();
            con.close();}
            else {
                
                Option o =new Option("STOKE INSUFFISANT LE STOKE RESTE EST "+stoke);
              o.main(" STOKE INSUFFISANT LE STOKE RESTE EST "+stoke);
                throw new Exception();
                 }
}
    
       public void AugmenterStoke(int Stokk){
        try{
            
            int stoke = 0;
            int stoke2;
            conect();
            Statement st=(Statement) con.createStatement() ;
            rs = st.executeQuery("select stoke from produit where ID_PRODUIT= '"+ id+"' ");
            while(rs.next()){
                stoke=rs.getInt("stoke");}
            stoke2=Stokk;
            stoke=stoke+stoke2;
            String sql=" update PRODUIT set stoke ="+stoke+" where ID_PRODUIT= '"+ id+"' ";
            pst=con.prepareStatement(sql);
            pst.execute();
           con.close();
            Option o =new Option("MODIFICATION DE STOKE REUSSI ");
              o.main("MODIFICATION DE STOKE REUSSI ");
          
        }catch(Exception e){
           Option o =new Option("MODIFICATION DE STOKE ERREUR ");
              o.main("MODIFICATION DE STOKE ERREUR ");
        }
       }  
       public ArrayList<Produit> recherche(String re){
           ArrayList<Produit> table =new ArrayList<>();
        try{
                conect();
                Statement st=(Statement) con.createStatement() ;
                rs = st.executeQuery("select * from produit where NOM_PRODUIT like  '%"+re+"%' or  CATEGORIE like '%"+re+"%'");
                while(rs.next()){
                    Produit p ;
               p=new Produit (    rs.getString("NOM_PRODUIT"),rs.getInt("stoke"),rs.getString("CATEGORIE"),rs.getDouble("PRIX"),rs.getInt("ID_PRODUIT"));
                table.add(p);
                                   }
              
                con.close();
               
            }catch(Exception e){e.printStackTrace();
            }
       
       return table;
       }

   
    

   
}
