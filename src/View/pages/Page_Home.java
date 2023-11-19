
package View.pages;

import Modelo.interfaz.Model_Card;
import View.Swing.ScrollBarCustom2;
import java.awt.Color;
import javax.swing.ImageIcon;


public class Page_Home extends javax.swing.JPanel {


    public Page_Home() {
        initComponents();
        
        sptabla.getViewport().setBackground(Color.WHITE);
        sptabla.setVerticalScrollBar(new ScrollBarCustom2());
        sptabla.getVerticalScrollBar().setBackground(Color.WHITE);
        
        //Anexion de los datos de las cards
        card1.setData(new Model_Card("Mesas",new ImageIcon(getClass().getResource("/View/Icon/4.png")),"Disponibles","14",
                new ImageIcon(getClass().getResource("/View/Icon/box2.png")),"Ocupadas","6"));
        card2.setData(new Model_Card("Pedidos",new ImageIcon(getClass().getResource("/View/Icon/3.png")),"Entregados","18",
                new ImageIcon(getClass().getResource("/View/Icon/truck.png")),"Pendientes","4"));
        card3.setData(new Model_Card("Ventas",new ImageIcon(getClass().getResource("/View/Icon/inboxes.png")),"Platos Vendidos","40",
                new ImageIcon(getClass().getResource("/View/Icon/cash.png")),"Valor","$$$$$$"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        card1 = new View.Component.CardResumen();
        card2 = new View.Component.CardResumen();
        card3 = new View.Component.CardResumen();
        sptabla = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(242, 242, 242));

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card1.setColor1(new java.awt.Color(56, 40, 203));
        card1.setColor2(new java.awt.Color(34, 165, 201));
        panel.add(card1);

        card2.setColor1(new java.awt.Color(255, 44, 40));
        card2.setColor2(new java.awt.Color(249, 145, 18));
        panel.add(card2);

        card3.setColor1(new java.awt.Color(0, 191, 143));
        card3.setColor2(new java.awt.Color(0, 88, 26));
        panel.add(card3);

        jTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"empleado 1", "salon 1", "activo"},
                {"empleado 2", "salon 3", "descanso"},
                {"empleado 3", "salon 3", "activo"},
                {"empleado 4", "cocina", "activo"},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Empleado", "Lugar", "Estado"
            }
        ));
        jTable1.setOpaque(false);
        sptabla.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(605, 605, 605)
                        .addComponent(sptabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sptabla, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.Component.CardResumen card1;
    private View.Component.CardResumen card2;
    private View.Component.CardResumen card3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLayeredPane panel;
    private javax.swing.JScrollPane sptabla;
    // End of variables declaration//GEN-END:variables
}
