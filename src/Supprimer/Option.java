/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Supprimer;

import java.awt.Color;

/**
 *
 * @author monta
 */
public class Option extends javax.swing.JFrame {

    String text;
    public Option(String text) {
        initComponents();
        setBackground(new Color(0,0,0,0));
        this.text=text;
        opt.setText(text);
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
        kButton2 = new swing.KButton();
        kButton3 = new swing.KButton();
        buttonBadges1 = new swing.ButtonBadges();
        opt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(140, 122, 230));

        kButton2.setForeground(new java.awt.Color(0, 0, 0));
        kButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Modifier/checkbox.png"))); // NOI18N
        kButton2.setText("ok");
        kButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kButton2.setkBackGroundColor(new java.awt.Color(224, 255, 255));
        kButton2.setkEndColor(new java.awt.Color(135, 206, 250));
        kButton2.setkHoverEndColor(new java.awt.Color(224, 255, 255));
        kButton2.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton2.setkHoverStartColor(new java.awt.Color(224, 255, 255));
        kButton2.setkPressedColor(new java.awt.Color(224, 255, 255));
        kButton2.setkSelectedColor(new java.awt.Color(224, 255, 255));
        kButton2.setkStartColor(new java.awt.Color(0, 204, 0));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

        kButton3.setForeground(new java.awt.Color(0, 0, 0));
        kButton3.setText("Annuler");
        kButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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

        buttonBadges1.setBackground(new java.awt.Color(135, 206, 250));
        buttonBadges1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/close.png"))); // NOI18N
        buttonBadges1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBadges1ActionPerformed(evt);
            }
        });

        opt.setBackground(new java.awt.Color(255, 255, 255));
        opt.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        opt.setForeground(new java.awt.Color(33, 63, 86));
        opt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opt.setText("Validation de suprimation");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(opt)
                .addGap(73, 73, 73)
                .addComponent(buttonBadges1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(buttonBadges1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                        .addComponent(opt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
    
        dispose();
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_kButton3ActionPerformed

    private void buttonBadges1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBadges1ActionPerformed
        dispose();
    }//GEN-LAST:event_buttonBadges1ActionPerformed

  
    public static void main(String text) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Option(text).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ButtonBadges buttonBadges1;
    private swing.KButton kButton2;
    private swing.KButton kButton3;
    private javax.swing.JLabel opt;
    private swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
