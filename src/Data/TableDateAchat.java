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
public class TableDateAchat {
       Connection con;
PreparedStatement pst;
ResultSet rs;
    ArrayList <Date_Achat> Table ;
public void conect() throws SQLException, ClassNotFoundException{
    Class.forName("org.sqlite.JDBC");
 con=DriverManager.getConnection("jdbc:sqlite:data.db");
} 

    public TableDateAchat() {
    Table=new ArrayList<>();
        try{
           conect();
        Statement st=(Statement) con.createStatement() ;      
        rs = st.executeQuery("select * from date_Achat");
       while(rs.next()){
         Date_Achat p;
               p = new Date_Achat(rs.getInt("idproduit"),rs.getInt("qantite"));
           Table.add(p);    
       }
               con.close();
       }catch(Exception e){e.printStackTrace();
       }
    }
    public int nombredevente(int id){
    int     nb=0;
        for (Date_Achat a :Table){
        if(a.getIdProduit()==id)
            nb+=a.getQantite();
        
        
        }
    
    return nb;
    }
}
