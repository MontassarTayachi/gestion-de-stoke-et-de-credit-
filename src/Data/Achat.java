/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Supprimer.Option;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




/**
 *
 * @author monta
 */
public class Achat {
  Connection con;
PreparedStatement pst;
ResultSet rs;
 public void conect() throws SQLException{
 con=DriverManager.getConnection("jdbc:sqlite:data.db");
} 
    int  ID_ACHAT;
  double  MONTANT_TOTALE;
  double  MONTANT_DEPOSER;
  double  MONTENT_RESTE;
  String  DATE_ACHAT;
  int  idclient;
  
  public Achat(int ID_ACHAT, double MONTANT_TOTALE, double MONTANT_DEPOSER, double MONTENT_RESTE, String DATE_ACHAT,int  idclient) {
        this.ID_ACHAT = ID_ACHAT;
        this.MONTANT_TOTALE = MONTANT_TOTALE;
        this.MONTANT_DEPOSER = MONTANT_DEPOSER;
        this.MONTENT_RESTE = MONTENT_RESTE;
        this.DATE_ACHAT = DATE_ACHAT;
        this.idclient=idclient;
    }

    public String  getDATE_ACHAT() {
        return DATE_ACHAT;
    }

    public double getMONTANT_DEPOSER() {
        return MONTANT_DEPOSER;
    }

    public double getMONTANT_TOTALE() {
        return MONTANT_TOTALE;
    }

    public double getMONTENT_RESTE() {
        return MONTENT_RESTE;
    }

    public int getID_ACHAT() {
        return ID_ACHAT;
    }

    public int getIdclient() {
        return idclient;
    }
    
   public void SupprimerAchat(int idAchat,int IdClient){
     try {
           conect();
            String sql="delete from DATE_ACHAT where IDACHAT = ?  ";
            pst=con.prepareStatement(sql);
            pst.setString(1,Integer.toString(idAchat));
       
            pst.execute();
             sql="delete from ACHAT where CODE_CLIENT= ? and ID_ACHAT = ?  ";
            pst=con.prepareStatement(sql);
            pst.setString(1,Integer.toString(IdClient));
            pst.setString(2,Integer.toString(idAchat));
            pst.execute();           
            con.close();
             
              Option o =new Option("SUPPRIMER REUSSI");
              o.main("SUPPRIMER REUSSI");
        } catch (Exception e) {   
         Option o =new Option("SUPPRIMER ERREUR");
              o.main("SUPPRIMER ERREUR");
        }

   
   }
    public DefaultTableModel Table2(int id,int idcl){
          String[] client= {"ID_PRODUIT","NOM_PRODUIT","PRIX","QANTITE"};
       String [] afficher =new String[4];
       DefaultTableModel model = new DefaultTableModel(null,client);
       try{
           
           conect();
           
          
        Statement st=(Statement) con.createStatement() ;      
        rs = st.executeQuery(" select ID_PRODUIT,NOM_PRODUIT,PRIX,QANTITE from PRODUIT,ACHAT,DATE_ACHAT where ACHAT.CODE_CLIENT='"+idcl+"'  and ACHAT.ID_ACHAT= '" +id+"'  and ACHAT.ID_ACHAT=DATE_ACHAT.IDACHAT and DATE_ACHAT.IDPRODUIT=produit.ID_PRODUIT ");
             while(rs.next()){
           afficher[0]=rs.getString("ID_PRODUIT");
           afficher[1]=rs.getString("NOM_PRODUIT");
           afficher[2]=rs.getString("PRIX")+"   TND";
           afficher[3]=rs.getString("QANTITE");  
           model.addRow(afficher);
       }
     
               con.close();
       }catch(Exception e){e.printStackTrace();
       }

   
   return model;} 
   
}
