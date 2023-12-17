/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package dashbare1;

import Data.TableAchat;
import Data.TableProduit;
import com.raven.chart.ModelChart;
import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author monta
 */
public class dashbar1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form dashbar1
     */
    public dashbar1() {
        initComponents();
            this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui =(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        setBackground(new Color(0,0,0,0));
          chart.addLegend("Income", new Color(12, 84, 175), new Color(0, 108, 247));
        chart.addLegend("Expense", new Color(54, 4, 143), new Color(104, 49, 200));
        chart.addLegend("Profit", new Color(5, 125, 0), new Color(95, 209, 69));
        chart.addLegend("Cost", new Color(186, 37, 37), new Color(241, 100, 120));
        chart.addData(new ModelChart("January", new double[]{500, 200, 80, 89}));
        chart.addData(new ModelChart("February", new double[]{600, 750, 90, 150}));
        chart.addData(new ModelChart("March", new double[]{200, 350, 460, 900}));
        chart.addData(new ModelChart("April", new double[]{480, 150, 750, 700}));
        chart.addData(new ModelChart("May", new double[]{350, 540, 300, 150}));
        chart.addData(new ModelChart("June", new double[]{190, 280, 81, 200}));
        chart.start();
        lineChart1.addLegend("Income", new Color(12, 84, 175), new Color(0, 108, 247));
        lineChart1.addLegend("Expense", new Color(54, 4, 143), new Color(104, 49, 200));
        lineChart1.addLegend("Profit", new Color(5, 125, 0), new Color(95, 209, 69));
        lineChart1.addLegend("Cost", new Color(186, 37, 37), new Color(241, 100, 120));
        lineChart1.addData(new ModelChart("January", new double[]{500, 200, 80, 89}));
        lineChart1.addData(new ModelChart("February", new double[]{600, 750, 90, 150}));
        lineChart1.addData(new ModelChart("March", new double[]{200, 350, 460, 900}));
        lineChart1.addData(new ModelChart("April", new double[]{480, 150, 750, 700}));
        lineChart1.addData(new ModelChart("May", new double[]{350, 540, 300, 150}));
        lineChart1.addData(new ModelChart("June", new double[]{190, 280, 81, 200}));
        lineChart1.start();
        TableAchat a =new TableAchat();
        double j=(a.sommeMONTANT_DEPOSER()/ a.sommeMONTANT_TOTALE())*100;
        int i=(int)j;
       progress1.setValue(i);
        TableProduit p =new TableProduit();
        i =(int)(p.sumStoke()*0.1);
        progress2.setValue(i);
        progress1.start();
        progress2.start();
        progress3.start();
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
        panelBorder1 = new swing.PanelBorder();
        progress2 = new com.raven.swing.progress.Progress();
        progress1 = new com.raven.swing.progress.Progress();
        progress3 = new com.raven.swing.progress.Progress();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelBorder2 = new swing.PanelBorder();
        chart = new com.raven.chart.Chart();
        panelBorder3 = new swing.PanelBorder();
        lineChart1 = new com.raven.chart.LineChart();

        setBackground(new java.awt.Color(224, 255, 255));
        setOpaque(true);

        degrade1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBorder1.setBackground(new java.awt.Color(52, 52, 105));

        progress2.setBackground(new java.awt.Color(132, 66, 246));
        progress2.setForeground(new java.awt.Color(0, 255, 255));
        progress2.setValue(50);

        progress1.setBackground(new java.awt.Color(0, 255, 0));
        progress1.setForeground(new java.awt.Color(255, 204, 204));
        progress1.setValue(70);

        progress3.setBackground(new java.awt.Color(255, 204, 204));
        progress3.setForeground(new java.awt.Color(255, 102, 102));
        progress3.setValue(90);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 141, 24));
        jLabel3.setText("Report Monthly");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 141, 24));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Taux de Credit");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 141, 24));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Taux de Stoke");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 141, 24));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Total Expense");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(progress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(progress3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(59, 59, 59)
                .addComponent(jLabel6)
                .addGap(57, 57, 57))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(progress1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(progress2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(progress3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        degrade1.add(panelBorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        panelBorder2.setBackground(new java.awt.Color(52, 52, 105));

        chart.setBackground(new java.awt.Color(51, 0, 255));

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, 989, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        degrade1.add(panelBorder2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 1040, 450));

        panelBorder3.setBackground(new java.awt.Color(52, 52, 105));

        lineChart1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelBorder3Layout = new javax.swing.GroupLayout(panelBorder3);
        panelBorder3.setLayout(panelBorder3Layout);
        panelBorder3Layout.setHorizontalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lineChart1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder3Layout.setVerticalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lineChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        degrade1.add(panelBorder3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 530, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(degrade1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(degrade1, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.chart.Chart chart;
    private swing.degrade degrade1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private com.raven.chart.LineChart lineChart1;
    private swing.PanelBorder panelBorder1;
    private swing.PanelBorder panelBorder2;
    private swing.PanelBorder panelBorder3;
    private com.raven.swing.progress.Progress progress1;
    private com.raven.swing.progress.Progress progress2;
    private com.raven.swing.progress.Progress progress3;
    // End of variables declaration//GEN-END:variables
}
