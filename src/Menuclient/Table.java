package Menuclient;

import Table.TableHeader;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Table extends JTable {

    public Table() {
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                
                if (i1 == 4) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
       
    }

    public void addRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
    }
    public int  valusId(int row){
     DefaultTableModel model = (DefaultTableModel) getModel();
    int valeur= (int) model.getValueAt(row, 0);
     return valeur;
    }
 public int  valusSTOKE(int row){
     DefaultTableModel model = (DefaultTableModel) getModel();
    int valeur= (int) model.getValueAt(row, 2);
     return valeur;
    }   
 public int  valuspos1(int row){
     DefaultTableModel model = (DefaultTableModel) getModel();
    int valeur= (int) model.getValueAt(row, 1);
     return valeur;
    }    

}
