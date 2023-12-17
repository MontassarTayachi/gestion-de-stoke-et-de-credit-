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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author monta
 */
public class Client {
     Connection con;
PreparedStatement pst;
ResultSet rs;






public void conect() throws SQLException, ClassNotFoundException{
    Class.forName("org.sqlite.JDBC");
 con=DriverManager.getConnection("jdbc:sqlite:data.db");
} 
private String nom;
private int telephone;
private int id;

    public Client(String nom, int telephone, int id) {
        this.nom = nom;
        this.telephone = telephone;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getTelephone() {
        return telephone;
    }
public void supprimer(){
try {     
           conect();
            String sql="delete from CLIENTS where id_clients= ? ";
            pst=con.prepareStatement(sql);
            pst.setInt(1,id);
            
            pst.execute();
            
            con.close();
            
            
              Option o =new Option("SUPPRIMER REUSSI");
              o.main("SUPPRIMER REUSSI");
        } catch (Exception e) {   
         Option o =new Option("SUPPRIMER ERREUR");
              o.main("SUPPRIMER ERREUR");
        }

}
    



    
   
}
