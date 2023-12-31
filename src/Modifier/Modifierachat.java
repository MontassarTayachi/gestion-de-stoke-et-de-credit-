/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Modifier;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author monta
 */
public class Modifierachat extends javax.swing.JFrame {

    /**
     * Creates new form Modifierachat
     */
Connection con;
PreparedStatement pst;
ResultSet rs;
int id;
int idcli;
 public void conect() throws SQLException{
 con=DriverManager.getConnection("jdbc:sqlite:data.db");
} 
    public Modifierachat(int id,int idcli) {
        initComponents();
          setBackground(new Color (0,0,0,0));
        this.id=id;
        this.idcli=idcli;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new swing.PanelBorder();
        txtnom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        kButton2 = new swing.KButton();
        kButton3 = new swing.KButton();
        jLabel7 = new javax.swing.JLabel();
        buttonBadges1 = new swing.ButtonBadges();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(140, 122, 230));
        panelBorder1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnom.setBackground(new java.awt.Color(140, 122, 230));
        txtnom.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        txtnom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(135, 206, 250)));
        panelBorder1.add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 97, 234, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setText("MONTANT_DEPOSER");
        panelBorder1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 65, 142, -1));

        kButton2.setForeground(new java.awt.Color(0, 0, 0));
        kButton2.setText("Modifier");
        kButton2.setkBackGroundColor(new java.awt.Color(224, 255, 255));
        kButton2.setkEndColor(new java.awt.Color(135, 206, 250));
        kButton2.setkHoverEndColor(new java.awt.Color(224, 255, 255));
        kButton2.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton2.setkHoverStartColor(new java.awt.Color(224, 255, 255));
        kButton2.setkPressedColor(new java.awt.Color(224, 255, 255));
        kButton2.setkSelectedColor(new java.awt.Color(224, 255, 255));
        kButton2.setkStartColor(new java.awt.Color(36, 196, 96));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        panelBorder1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 108, 31));

        kButton3.setForeground(new java.awt.Color(0, 0, 0));
        kButton3.setText("Annuler");
        kButton3.setkBackGroundColor(new java.awt.Color(224, 255, 255));
        kButton3.setkEndColor(new java.awt.Color(135, 206, 250));
        kButton3.setkHoverEndColor(new java.awt.Color(224, 255, 255));
        kButton3.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton3.setkHoverStartColor(new java.awt.Color(224, 255, 255));
        kButton3.setkPressedColor(new java.awt.Color(224, 255, 255));
        kButton3.setkSelectedColor(new java.awt.Color(224, 255, 255));
        kButton3.setkStartColor(new java.awt.Color(204, 204, 204));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        panelBorder1.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 108, 31));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(33, 63, 86));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("-- CREDIT");
        panelBorder1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 160, 41));

        buttonBadges1.setBackground(new java.awt.Color(135, 206, 250));
        buttonBadges1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/close.png"))); // NOI18N
        buttonBadges1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBadges1ActionPerformed(evt);
            }
        });
        panelBorder1.add(buttonBadges1, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 6, -1, 27));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
float[] som = new float [3];
        try{
           conect();
           
        Statement st=(Statement) con.createStatement() ;      
        rs = st.executeQuery("select MONTANT_TOTALE,MONTANT_DEPOSER,MONTENT_RESTE,DATE_ACHAT from achat where CODE_CLIENT= '"+idcli +"' and ID_ACHAT = '"+id+"' ");
             while(rs.next()){
           som[0]=rs.getFloat("MONTANT_TOTALE");
            som[1]=rs.getFloat("MONTANT_DEPOSER");
             som[2]=rs.getFloat("MONTENT_RESTE"); 
       }   
            con.close();
         som[1]=som[1]+Float.parseFloat(txtnom.getText());
         som[2]=som[1]-som[0];
           conect();
            String sql="update ACHAT set MONTANT_TOTALE= "+som[0]+", MONTANT_DEPOSER="+som[1]+" , MONTENT_RESTE = "+som[2]+"  , DATE_ACHAT = current_date where ID_ACHAT= '"+id+"' and CODE_CLIENT= '"+idcli+"' ";
            pst=con.prepareStatement(sql);
            pst.execute();   
            con.close();
        
            txtnom.setText(null);
           dispose();
            
            
       }catch(Exception e){e.printStackTrace();
       } 
             
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        txtnom.setText(null);
      

    }//GEN-LAST:event_kButton3ActionPerformed

    private void buttonBadges1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBadges1ActionPerformed
        dispose();
    }//GEN-LAST:event_buttonBadges1ActionPerformed

   
    public static void main(int id,int idcli) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modifierachat( id, idcli).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ButtonBadges buttonBadges1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private swing.KButton kButton2;
    private swing.KButton kButton3;
    private swing.PanelBorder panelBorder1;
    private javax.swing.JTextField txtnom;
    // End of variables declaration//GEN-END:variables
}
