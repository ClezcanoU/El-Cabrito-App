
package View.Swing;

import Modelo.interfaz.StatusType;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;


public class TableStatus extends JLabel{

    public TableStatus() {
        setForeground(Color.WHITE);
    }
    
    private StatusType type;

    public StatusType getType() {
        return type;
    }
    
    public void setType(StatusType type){
        this.type = type;
        setText(type.toString());
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        if(type!=null){
            Graphics2D g2 = (Graphics2D)g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            GradientPaint gG;
            if(type == StatusType.PENDIENTE){
                gG = new GradientPaint(0, 0, new Color(56,40,203), 0, getHeight(), new Color(34,165,201));
            }else if(type == StatusType.COMPLETADO){
                gG = new GradientPaint(0, 0, new Color(0,191,143), 0, getHeight(), new Color(0,88,26));
            }else{
                gG = new GradientPaint(0, 0, new Color(255,44,40), 0, getHeight(), new Color(249,145,18));
            }
            g2.setPaint(gG);
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 1, 1);
        }
        super.paintComponent(g);
    }
    
    
}
