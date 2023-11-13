
package View.Component;

import Modelo.interfaz.Model_Card;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;



public class CardMesa extends javax.swing.JPanel {

    private Estado estado = Estado.MANTENIMIENTO;
    private final int shadowSize = 5;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
        repaint();
    }
    
    public void setData(Model_Card data){
        lbTitulo.setText(data.getTitulo());
        lbIcon.setIcon(data.getIcon1());
    }
    
    
    public CardMesa() {
        initComponents();
        setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/Tenedor.png"))); // NOI18N

        lbTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Mesa #1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getColorForState(estado));
        g2.fillRect(6, 5, 10, getHeight() - shadowSize * 2 + 1);
        g2.drawString(estado.toString(), 20, 20);
        g2.dispose();
    }

    private Color getColorForState(Estado estado) {
        switch (estado) {
            case LIBRE:
                return new Color(18, 163, 24);
            case OCUPADO:
                return new Color(206, 28, 28);
            case MANTENIMIENTO:
                return new Color(241, 196, 15);
            default:
                return Color.BLACK; // Color por defecto
        }
    }

    
    public static enum Estado {
        LIBRE, OCUPADO, MANTENIMIENTO
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
