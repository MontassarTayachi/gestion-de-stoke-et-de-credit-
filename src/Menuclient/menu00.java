/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Menuclient;

import Ajouter.AjouterClient;
import Clientdetailler.menudetailer;
import Data.Client;
import Data.TableAchat;
import Data.TableClient;
import Modifier.Modifierclient;
import Supprimer.SupprimerClient;
import Supprimer.SupprimerProduit;
import Table.ScrollBar;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import swing.EventCallBack;
import swing.EventTextField;

/**
 *
 * @author monta
 */
public class menu00 extends javax.swing.JInternalFrame {

    /**
     * Creates new form menu
     */
    void Afficher(ArrayList<Client> lolo){
     
    DefaultTableModel model = (DefaultTableModel) table1.getModel() ;

         model.getDataVector().removeAllElements();
    revalidate();
        ((DefaultTableModel)table1.getModel()).setNumRows(0);
         TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                Modifier.Modifierclient menu = new Modifierclient(table1.valusId(row));
               menu.main(table1.valusId(row)); 
            }

            @Override
            public void onDelete(int row) {
                if (table1.isEditing()) {
                    table1.getCellEditor().stopCellEditing();
                }
              Supprimer.SupprimerClient sup =new SupprimerClient( table1.valusId(row));
             sup.main(table1.valusId(row));
      
            }

            @Override
            public void onView(int row) {
                menudetailer view =new menudetailer(table1.valusId(row));
                view.main(table1.valusId(row));
            }
        };
         table1.getColumnModel().getColumn(3).setCellRenderer(new TableActionCellRender());
        table1.getColumnModel().getColumn(3).setCellEditor(new TableActionCellEditor(event));
    
        for ( Client c : lolo ){
        table1.addRow(new Object[]{c.getId(), c.getNom(), c.getTelephone()});
        }  
    }
    void  Table(){
     TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                Modifier.Modifierclient menu = new Modifierclient(table1.valusId(row));
               menu.main(table1.valusId(row));             
            }

            @Override
            public void onDelete(int row) {
                if (table1.isEditing()) {
                    table1.getCellEditor().stopCellEditing();
                }
              Supprimer.SupprimerClient sup =new SupprimerClient( table1.valusId(row));
             sup.main(table1.valusId(row));
             
            }

            @Override
            public void onView(int row) {
                 if (table1.isEditing()) {
                    table1.getCellEditor().stopCellEditing();
                }
               menudetailer view =new menudetailer(table1.valusId(row));
                view.main(table1.valusId(row));
            }
        };
      
        table1.getColumnModel().getColumn(3).setCellRenderer(new TableActionCellRender());
        table1.getColumnModel().getColumn(3).setCellEditor(new TableActionCellEditor(event));
       Data.TableClient lolo =new TableClient();
          jScrollPane2.setVerticalScrollBar(new ScrollBar());
        jScrollPane2.getVerticalScrollBar().setBackground(Color.WHITE);
        jScrollPane2.getViewport().setBackground(new Color(36,36,77));
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        jScrollPane2.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        for ( Client c : lolo.getTable() ){
        table1.addRow(new Object[]{c.getId(), c.getNom(), c.getTelephone()});
        }    }
    public menu00() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        TableClient tabe =new TableClient();
         TableAchat p=new TableAchat();
         card1.setData(new Model_Card(new ImageIcon(getClass().getResource("ajouter.png")), "Ajouter Client", "", ""));
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("profit.png")), "Client Le Plus Achete", tabe.clientfidel().getNom(), p.sommeMONTANT_TOTALEClient(tabe.clientfidel().getId())+" TND"));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("profit.png")), "Client Le Plus Entette ", tabe.clientmosel().getNom(), p.sommeMONTANT_resteClient(tabe.clientmosel().getId())+"  TND"));
         card4.setData(new Model_Card(new ImageIcon(getClass().getResource("profit.png")), "Client Le Plus Payant ", tabe.clientMo5les().getNom(), ""));
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui =(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        Table();
       textFieldAnimation1.addEvent(new EventTextField() {
            @Override
            public void onPressed(EventCallBack call) {
      
                try {
                       TableClient tabe=new TableClient();
                       String recherche =textFieldAnimation1.getText();
            ArrayList<Client> re=tabe.chercher(recherche);
                    Afficher(re);
                    Thread.sleep(20);
                    call.done();
                       
                } catch (Exception e) {
                    System.err.println(e);
                }
             
            }

            @Override
            public void onCancel() {

            }
        });                 

        
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        degrade1 = new swing.degrade();
        textFieldAnimation1 = new swing.TextFieldAnimation();
        card1 = new swing.cardbuton();
        card2 = new swing.cardbuton();
        card3 = new swing.cardbuton();
        card4 = new swing.cardbuton();
        jSeparator1 = new javax.swing.JSeparator();
        panelBorder1 = new swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new Menuclient.Table();
        buttonBadges1 = new swing.ButtonBadges();

        setBackground(new java.awt.Color(224, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1094, 774));
        setVisible(false);

        degrade1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldAnimation1.setBackground(new java.awt.Color(255, 255, 255));
        textFieldAnimation1.setAnimationColor(new java.awt.Color(36, 36, 77));
        textFieldAnimation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldAnimation1ActionPerformed(evt);
            }
        });
        degrade1.add(textFieldAnimation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 470, -1));

        card1.setColor1(new java.awt.Color(51, 51, 255));
        card1.setColor2(new java.awt.Color(153, 0, 51));
        card1.setkBackGroundColor(new java.awt.Color(241, 246, 249));
        card1.setkEndColor(new java.awt.Color(241, 246, 249));
        card1.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        card1.setkHoverForeGround(new java.awt.Color(241, 246, 249));
        card1.setkHoverStartColor(new java.awt.Color(36, 36, 77));
        card1.setkPressedColor(new java.awt.Color(51, 51, 255));
        card1.setkSelectedColor(new java.awt.Color(51, 0, 255));
        card1.setkStartColor(new java.awt.Color(0, 0, 153));
        card1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card1MouseClicked(evt);
            }
        });
        degrade1.add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 70, 190, 180));

        card2.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        card2.setkEndColor(new java.awt.Color(242, 141, 24));
        card2.setkHoverEndColor(new java.awt.Color(248, 188, 119));
        card2.setkHoverForeGround(java.awt.Color.pink);
        card2.setkHoverStartColor(new java.awt.Color(228, 189, 145));
        card2.setkPressedColor(new java.awt.Color(222, 171, 112));
        card2.setkSelectedColor(new java.awt.Color(226, 175, 116));
        card2.setkStartColor(new java.awt.Color(242, 141, 24));
        card2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card2MouseClicked(evt);
            }
        });
        degrade1.add(card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 253, 180));

        card3.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        card3.setkEndColor(new java.awt.Color(93, 100, 123));
        card3.setkHoverEndColor(new java.awt.Color(185, 185, 188));
        card3.setkHoverForeGround(java.awt.Color.pink);
        card3.setkHoverStartColor(new java.awt.Color(167, 169, 175));
        card3.setkPressedColor(new java.awt.Color(101, 117, 169));
        card3.setkSelectedColor(new java.awt.Color(39, 56, 113));
        card3.setkStartColor(new java.awt.Color(93, 100, 123));
        card3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card3MouseClicked(evt);
            }
        });
        degrade1.add(card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 253, 180));

        card4.setkBackGroundColor(new java.awt.Color(247, 202, 24));
        card4.setkEndColor(new java.awt.Color(247, 202, 24));
        card4.setkHoverEndColor(new java.awt.Color(232, 214, 166));
        card4.setkHoverForeGround(new java.awt.Color(224, 196, 118));
        card4.setkHoverStartColor(new java.awt.Color(215, 164, 22));
        card4.setkPressedColor(new java.awt.Color(251, 209, 15));
        card4.setkSelectedColor(new java.awt.Color(235, 208, 135));
        card4.setkStartColor(new java.awt.Color(247, 202, 24));
        card4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card4MouseClicked(evt);
            }
        });
        degrade1.add(card4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, 253, 180));

        jSeparator1.setBackground(new java.awt.Color(242, 141, 24));
        jSeparator1.setForeground(new java.awt.Color(242, 141, 24));
        jSeparator1.setOpaque(true);
        degrade1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 1050, -1));

        panelBorder1.setBackground(new java.awt.Color(36, 36, 77));
        panelBorder1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 141, 24));
        jLabel1.setText("Table Clients");
        panelBorder1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jScrollPane2.setBorder(null);
        jScrollPane2.setOpaque(false);

        table1.setBackground(new java.awt.Color(36, 36, 77));
        table1.setForeground(new java.awt.Color(255, 255, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Non&&Prenom", "Telephone", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setToolTipText("");
        jScrollPane2.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setResizable(false);
            table1.getColumnModel().getColumn(0).setPreferredWidth(50);
            table1.getColumnModel().getColumn(1).setResizable(false);
            table1.getColumnModel().getColumn(1).setPreferredWidth(40);
            table1.getColumnModel().getColumn(2).setResizable(false);
            table1.getColumnModel().getColumn(2).setPreferredWidth(50);
            table1.getColumnModel().getColumn(3).setResizable(false);
        }

        panelBorder1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 990, 390));

        buttonBadges1.setBackground(new java.awt.Color(242, 141, 24));
        buttonBadges1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/refresh (1).png"))); // NOI18N
        buttonBadges1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBadges1ActionPerformed(evt);
            }
        });
        panelBorder1.add(buttonBadges1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 51, 35));

        degrade1.add(panelBorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 1040, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(degrade1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(degrade1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldAnimation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldAnimation1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldAnimation1ActionPerformed

    private void buttonBadges1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBadges1ActionPerformed
        TableClient tabe=new TableClient();
                       String recherche ="";
            ArrayList<Client> re=tabe.chercher(recherche);
                    Afficher(re);
      
          textFieldAnimation1.setText(null);
       
    }//GEN-LAST:event_buttonBadges1ActionPerformed

    private void card1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card1MouseClicked
       Ajouter.AjouterClient aa=new AjouterClient();
       aa.main(null);
    }//GEN-LAST:event_card1MouseClicked

    private void card2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card2MouseClicked
     TableClient t = new TableClient();
        menudetailer men =new menudetailer(t.clientfidel().getId());
        men.main(t.clientfidel().getId());
    }//GEN-LAST:event_card2MouseClicked

    private void card3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card3MouseClicked
     TableClient t = new TableClient();
        menudetailer men =new menudetailer(t.clientmosel().getId());
        men.main(t.clientmosel().getId());
    }//GEN-LAST:event_card3MouseClicked

    private void card4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card4MouseClicked
       TableClient t = new TableClient();
        menudetailer men =new menudetailer(t.clientMo5les().getId());
        men.main(t.clientMo5les().getId());
    }//GEN-LAST:event_card4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ButtonBadges buttonBadges1;
    private swing.cardbuton card1;
    private swing.cardbuton card2;
    private swing.cardbuton card3;
    private swing.cardbuton card4;
    private swing.degrade degrade1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private swing.PanelBorder panelBorder1;
    private Menuclient.Table table1;
    private swing.TextFieldAnimation textFieldAnimation1;
    // End of variables declaration//GEN-END:variables
}
