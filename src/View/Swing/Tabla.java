
package View.Swing;

import Modelo.interfaz.StatusType;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class Tabla extends JTable{

    public Tabla() {
        setShowHorizontalLines(true);
        setShowVerticalLines(false);
        setGridColor(new Color(230,230,230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TablaHeader header = new TablaHeader(value + "");
                if(column==4){
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                if(column != 4){
                    Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
                    com.setBackground(Color.WHITE);
                    setBorder(noFocusBorder);
                    if(isSelected){
                        com.setForeground(new Color(15,89,140));
                    }else{
                        com.setForeground(new Color(120,120,120));
                    }
                    return com;
                }else{
                    StatusType type = (StatusType)value;
                    CellStatus cell = new CellStatus(type);
                    return cell;
                }
                
            }
            
        });
    }
    public void addRow(Object[] row){
        DefaultTableModel model = (DefaultTableModel)getModel();
        model.addRow(row);
    }
    
}
