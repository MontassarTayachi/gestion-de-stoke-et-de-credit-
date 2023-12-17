/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Facture;

import Menuclient.Table;
import Table.ScrollBar;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author monta
 */
public class Facture extends javax.swing.JFrame {
    String idAchat;
    String idClient;
    JTable tables;
    String Nomclient;
    String Telephone;
    String montotal;
    String mondepo;
    String Montentres;
   
    public Facture(String idAchat, String idClient, JTable table, String Nomclient, String Telephone, String montotal, String mondepo, String Montentres) {
        
          this.idAchat = idAchat;
        this.idClient = idClient;
        this.tables = table;
        this.Nomclient = Nomclient;
        this.Telephone = Telephone;
        this.montotal = montotal;
        this.mondepo = mondepo;
        this.Montentres = Montentres;
        initComponents();
         jScrollPane1.setVerticalScrollBar(new ScrollBar());
        jScrollPane1.getVerticalScrollBar().setBackground(Color.WHITE);
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        TXTACHAT.setText(this.idAchat );
        TXTIDENTIFIANT.setText(this.Nomclient);
        TXTREFERECNCECLENT.setText(this.idClient);
        TXTTELEPHONE.setText(this.Telephone);
        TXTMontantTotale.setText(this.montotal+"  TND");
        TXTMontantDEPOSER.setText(this.mondepo+"  TND");
        TXTMontantREST.setText(this.Montentres+ "   TND");
        this.table.setModel(tables.getModel()); 
        Date d1 = new Date();
        Date1.setText(d1+"");
        
    }
   public void imprimer(){
   PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("Print Data");
            
            job.setPrintable(new Printable(){
            public int print(Graphics pg,PageFormat pf, int pageNum){
                    pf.setOrientation(PageFormat.LANDSCAPE);
                 if(pageNum > 0){
                    return Printable.NO_SUCH_PAGE;
                }
                
                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(1,1);
                
                panel.print(g2);
         
               
                return Printable.PAGE_EXISTS;
                         
                
            }
    });
            boolean ok = job.printDialog();
        if(ok){
        try{
            
        job.print();
        }
        catch (PrinterException ex){
	ex.printStackTrace();
}
        }
   
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new Menuclient.Table();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Date1 = new javax.swing.JLabel();
        TXTREFERECNCECLENT = new javax.swing.JLabel();
        TXTTELEPHONE = new javax.swing.JLabel();
        TXTACHAT = new javax.swing.JLabel();
        TXTIDENTIFIANT = new javax.swing.JLabel();
        TXTMontantTotale = new javax.swing.JLabel();
        TXTMontantREST = new javax.swing.JLabel();
        TXTMontantDEPOSER = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RECU DE PAIEMENT ");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 316, 91));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("ACHAT");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 309, 169, 38));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("REFERECNCE CLENT");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 177, 169, 38));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("IDENTIFIANT");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 221, 169, 38));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("TELEPHONE");
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 265, 169, 38));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/sami-frip-low-resolution-logo-black-on-transparent-background.png"))); // NOI18N
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jScrollPane1.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 353, 501, 347));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Montant Totale");
        panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 720, 169, 38));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Montant Reste");
        panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 800, 169, 38));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Montant Deposer");
        panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 760, 169, 38));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("LE ");
        panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 756, -1, -1));

        Date1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Date1.setText("fghjk");
        panel.add(Date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 783, 138, -1));

        TXTREFERECNCECLENT.setText("REFERECNCE CLENT");
        panel.add(TXTREFERECNCECLENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 177, -1, 38));

        TXTTELEPHONE.setText("IDENTIFIANT");
        panel.add(TXTTELEPHONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 265, 169, 38));

        TXTACHAT.setText("IDENTIFIANT");
        panel.add(TXTACHAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 309, 169, 38));

        TXTIDENTIFIANT.setText("IDENTIFIANT");
        panel.add(TXTIDENTIFIANT, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 221, 169, 38));

        TXTMontantTotale.setText("Montant Totale");
        panel.add(TXTMontantTotale, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 718, 169, 38));

        TXTMontantREST.setText("Montant Totale");
        panel.add(TXTMontantREST, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 800, 169, 38));

        TXTMontantDEPOSER.setText("Montant Totale");
        panel.add(TXTMontantDEPOSER, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 760, 169, 38));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date1;
    private javax.swing.JLabel TXTACHAT;
    private javax.swing.JLabel TXTIDENTIFIANT;
    private javax.swing.JLabel TXTMontantDEPOSER;
    private javax.swing.JLabel TXTMontantREST;
    private javax.swing.JLabel TXTMontantTotale;
    private javax.swing.JLabel TXTREFERECNCECLENT;
    private javax.swing.JLabel TXTTELEPHONE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private Menuclient.Table table;
    // End of variables declaration//GEN-END:variables
}