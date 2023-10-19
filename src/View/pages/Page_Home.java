
package View.pages;

import Modelo.interfaz.Model_Card;
import java.awt.Color;
import javax.swing.ImageIcon;


public class Page_Home extends javax.swing.JPanel {


    public Page_Home() {
        initComponents();
        
        sptabla.getViewport().setBackground(Color.WHITE);
        
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
        card1 = new View.Component.Card();
        card2 = new View.Component.Card();
        card3 = new View.Component.Card();
        grafica1 = new View.Component.Grafica();
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
                {"empleado 4", "cocina", "activo"}
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
                        .addGap(10, 10, 10)
                        .addComponent(grafica1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(grafica1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sptabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.Component.Card card1;
    private View.Component.Card card2;
    private View.Component.Card card3;
    private View.Component.Grafica grafica1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLayeredPane panel;
    private javax.swing.JScrollPane sptabla;
    // End of variables declaration//GEN-END:variables
}
