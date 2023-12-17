/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package MenuProduit;

import Ajouter.Ajouterproduit;
import Data.Client;
import Data.Produit;
import Data.TableClient;
import Data.TableProduit;
import Menuclient.Model_Card;
import Menuclient.TableActionCellEditor;
import Menuclient.TableActionCellRender;
import Menuclient.TableActionEvent;
import Modifier.ModifierProduit;
import Modifier.Modifierclient;
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
public class MenuProduit extends javax.swing.JInternalFrame {

    /**
     * Creates new form MenuProduit
     */
   void Afficher(ArrayList<Produit> lolo){
     
    DefaultTableModel model = (DefaultTableModel) table1.getModel() ;

         model.getDataVector().removeAllElements();
    revalidate();
        ((DefaultTableModel)table1.getModel()).setNumRows(0);
         TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                Modifier.ModifierProduit menu = new ModifierProduit(table1.valusId(row),table1.valusSTOKE(row));
               menu.main(table1.valusId(row),table1.valusSTOKE(row)); 
            }

            @Override
            public void onDelete(int row) {
                if (table1.isEditing()) {
                    table1.getCellEditor().stopCellEditing();
                }
             Supprimer.SupprimerProduit sup =new SupprimerProduit( table1.valusId(row));
             sup.main(table1.valusId(row));
             
            }

            @Override
            public void onView(int row) {
                System.out.println("View row : " + row);
            }
        };
         table1.getColumnModel().getColumn(5).setCellRenderer(new TableActionCellRender());
        table1.getColumnModel().getColumn(5).setCellEditor(new TableActionCellEditor(event));
    
        for ( Produit c : lolo ){
        table1.addRow(new Object[]{c.getId(), c.getNom(), c.getStoke(),c.getGategorie(),c.getPrix()+" TND"});
        }  
    }
    void  Table(){
     TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                 Modifier.ModifierProduit menu = new ModifierProduit(table1.valusId(row),table1.valusSTOKE(row));
               menu.main(table1.valusId(row),table1.valusSTOKE(row));    
            }

            @Override
            public void onDelete(int row) {
                if (table1.isEditing()) {
                    table1.getCellEditor().stopCellEditing();
                }
                 Supprimer.SupprimerProduit sup =new SupprimerProduit( table1.valusId(row));
             sup.main(table1.valusId(row));
            }

            @Override
            public void onView(int row) {
                System.out.println("View row : " + row);
            }
        };
      
        table1.getColumnModel().getColumn(5).setCellRenderer(new TableActionCellRender());
        table1.getColumnModel().getColumn(5).setCellEditor(new TableActionCellEditor(event));
       Data.TableProduit lolo =new TableProduit();
          jScrollPane2.setVerticalScrollBar(new ScrollBar());
        jScrollPane2.getVerticalScrollBar().setBackground(Color.WHITE);
        jScrollPane2.getViewport().setBackground(new Color(36,36,77));
        JPanel p = new JPanel();
        p.setBackground(new Color(36,36,77));
        jScrollPane2.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        for ( Produit c : lolo.getTable() ){
        table1.addRow(new Object[]{c.getId(), c.getNom(), c.getStoke(),c.getGategorie(),c.getPrix()+" TND"});
        }    }
    public MenuProduit() {
        initComponents();
        TableProduit tabe =new TableProduit();
         card1.setData(new Model_Card(new ImageIcon(getClass().getResource("ajouter-un-produit.png")), "Ajouter Produit", "", ""));
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/Menuclient/flag.png")), "Produit Le Plus Vendu", tabe.produitplusVante().getNom(), ""));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/Menuclient/flag.png")), "Produit Le Moin Vendu", tabe.produitmoisVante().getNom(), ""));
         card4.setData(new Model_Card(new ImageIcon(getClass().getResource("/Menuclient/stock.png")), "Produit la Plus Stoke", tabe.produitplusdeStoke().getNom(), ""));
           this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui =(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        Table();
        
        textFieldAnimation1.addEvent(new EventTextField() {
            @Override
            public void onPressed(EventCallBack call) {
      
                try {
                          Produit p =new Produit(null, 0, null, 0.0, 0);
                       String recherche =textFieldAnimation1.getText();
            ArrayList<Produit> re=p.recherche(recherche);
                    Afficher(re);
                    Thread.sleep(20);
                    call.done();
                  
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
        panelBorder3 = new swing.PanelBorder();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new Menuclient.Table();
        jLabel1 = new javax.swing.JLabel();
        buttonBadges1 = new swing.ButtonBadges();
        textFieldAnimation1 = new swing.TextFieldAnimation();
        card1 = new swing.cardbuton();
        card2 = new swing.cardbuton();
        card3 = new swing.cardbuton();
        card4 = new swing.cardbuton();
        jSeparator1 = new javax.swing.JSeparator();

        degrade1.setPreferredSize(new java.awt.Dimension(1094, 774));
        degrade1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBorder3.setBackground(new java.awt.Color(36, 36, 77));

        jScrollPane2.setBorder(null);

        table1.setBackground(new java.awt.Color(36, 36, 77));
        table1.setForeground(new java.awt.Color(255, 255, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PRODUIT", "NOM PORODUIT", "STOKE", "CATEGORIE", "PRIX", "ACTION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setToolTipText("");
        table1.setOpaque(false);
        jScrollPane2.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setResizable(false);
            table1.getColumnModel().getColumn(0).setPreferredWidth(20);
            table1.getColumnModel().getColumn(1).setResizable(false);
            table1.getColumnModel().getColumn(1).setPreferredWidth(70);
            table1.getColumnModel().getColumn(2).setResizable(false);
            table1.getColumnModel().getColumn(2).setPreferredWidth(20);
            table1.getColumnModel().getColumn(3).setResizable(false);
            table1.getColumnModel().getColumn(3).setPreferredWidth(70);
            table1.getColumnModel().getColumn(4).setResizable(false);
            table1.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 141, 24));
        jLabel1.setText("Table Produit");

        buttonBadges1.setBackground(new java.awt.Color(242, 141, 24));
        buttonBadges1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/refresh (1).png"))); // NOI18N
        buttonBadges1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBadges1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder3Layout = new javax.swing.GroupLayout(panelBorder3);
        panelBorder3.setLayout(panelBorder3Layout);
        panelBorder3Layout.setHorizontalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(panelBorder3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonBadges1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelBorder3Layout.setVerticalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonBadges1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        degrade1.add(panelBorder3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 1040, 460));

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
        card1.setkHoverEndColor(new java.awt.Color(241, 246, 249));
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
        card2.setkHoverEndColor(new java.awt.Color(242, 141, 24));
        card2.setkHoverForeGround(java.awt.Color.pink);
        card2.setkHoverStartColor(new java.awt.Color(242, 141, 24));
        card2.setkIndicatorColor(new java.awt.Color(242, 141, 24));
        card2.setkPressedColor(new java.awt.Color(242, 141, 24));
        card2.setkSelectedColor(new java.awt.Color(242, 141, 24));
        card2.setkStartColor(new java.awt.Color(242, 141, 24));
        degrade1.add(card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 253, 180));

        card3.setkBackGroundColor(new java.awt.Color(93, 100, 123));
        card3.setkEndColor(new java.awt.Color(93, 100, 123));
        card3.setkHoverEndColor(new java.awt.Color(93, 100, 123));
        card3.setkHoverForeGround(new java.awt.Color(93, 100, 123));
        card3.setkHoverStartColor(new java.awt.Color(93, 100, 123));
        card3.setkIndicatorColor(new java.awt.Color(93, 100, 123));
        card3.setkPressedColor(new java.awt.Color(93, 100, 123));
        card3.setkSelectedColor(new java.awt.Color(93, 100, 123));
        card3.setkStartColor(new java.awt.Color(93, 100, 123));
        degrade1.add(card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 253, 180));

        card4.setkBackGroundColor(new java.awt.Color(247, 202, 24));
        card4.setkEndColor(new java.awt.Color(247, 202, 24));
        card4.setkHoverEndColor(new java.awt.Color(247, 202, 24));
        card4.setkHoverForeGround(new java.awt.Color(247, 202, 24));
        card4.setkHoverStartColor(new java.awt.Color(247, 202, 24));
        card4.setkIndicatorColor(new java.awt.Color(247, 202, 24));
        card4.setkPressedColor(new java.awt.Color(247, 202, 24));
        card4.setkSelectedColor(new java.awt.Color(247, 202, 24));
        card4.setkStartColor(new java.awt.Color(247, 202, 24));
        degrade1.add(card4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, 253, 180));

        jSeparator1.setBackground(new java.awt.Color(242, 141, 24));
        jSeparator1.setForeground(new java.awt.Color(242, 141, 24));
        jSeparator1.setOpaque(true);
        degrade1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 1050, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(degrade1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(degrade1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldAnimation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldAnimation1ActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_textFieldAnimation1ActionPerformed

    private void buttonBadges1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBadges1ActionPerformed
       Produit p =new Produit(null, 0, null, 0.0, 0);
                       String recherche =textFieldAnimation1.getText();
            ArrayList<Produit> re=p.recherche(recherche);
                    Afficher(re);       
 textFieldAnimation1.setText(null);
    }//GEN-LAST:event_buttonBadges1ActionPerformed

    private void card1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card1MouseClicked
   Ajouterproduit p =new Ajouterproduit();
   p.main(null);
    }//GEN-LAST:event_card1MouseClicked


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
    private swing.PanelBorder panelBorder3;
    private Menuclient.Table table1;
    private swing.TextFieldAnimation textFieldAnimation1;
    // End of variables declaration//GEN-END:variables
}
