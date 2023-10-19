
package View.pages;

import Modelo.interfaz.Model_Card;
import java.util.ArrayList;
import javax.swing.ImageIcon;


public class Page_Mesas extends javax.swing.JPanel {


    public Page_Mesas() {
        initComponents();
        init();
    }
    
    public void init(){
        card_Mesa1.setData(new Model_Card("MESA 1",new ImageIcon(getClass().getResource("/View/Icon/plusCircle.png"))));
        card_Mesa2.setData(new Model_Card("MESA 2",new ImageIcon(getClass().getResource("/View/Icon/plusCircle.png"))));
        card_Mesa3.setData(new Model_Card("MESA 3",new ImageIcon(getClass().getResource("/View/Icon/plusCircle.png"))));
        card_Mesa4.setData(new Model_Card("MESA 4",new ImageIcon(getClass().getResource("/View/Icon/plusCircle.png"))));
        card_Mesa5.setData(new Model_Card("MESA 5",new ImageIcon(getClass().getResource("/View/Icon/plusCircle.png"))));
        card_Mesa6.setData(new Model_Card("MESA 6",new ImageIcon(getClass().getResource("/View/Icon/plusCircle.png"))));
        card_Mesa7.setData(new Model_Card("MESA 7",new ImageIcon(getClass().getResource("/View/Icon/plusCircle.png"))));
        card_Mesa8.setData(new Model_Card("MESA 8",new ImageIcon(getClass().getResource("/View/Icon/plusCircle.png"))));
        card_Mesa9.setData(new Model_Card("MESA 9",new ImageIcon(getClass().getResource("/View/Icon/plusCircle.png"))));
        card_Mesa10.setData(new Model_Card("MESA 10",new ImageIcon(getClass().getResource("/View/Icon/plusCircle.png"))));
        card_Mesa11.setData(new Model_Card("MESA 11",new ImageIcon(getClass().getResource("/View/Icon/plusCircle.png"))));
        card_Mesa12.setData(new Model_Card("MESA 12",new ImageIcon(getClass().getResource("/View/Icon/plusCircle.png"))));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        card_Mesa1 = new View.Component.Card_Mesa();
        card_Mesa2 = new View.Component.Card_Mesa();
        card_Mesa3 = new View.Component.Card_Mesa();
        card_Mesa4 = new View.Component.Card_Mesa();
        card_Mesa5 = new View.Component.Card_Mesa();
        card_Mesa6 = new View.Component.Card_Mesa();
        card_Mesa7 = new View.Component.Card_Mesa();
        card_Mesa8 = new View.Component.Card_Mesa();
        card_Mesa9 = new View.Component.Card_Mesa();
        card_Mesa10 = new View.Component.Card_Mesa();
        card_Mesa11 = new View.Component.Card_Mesa();
        card_Mesa12 = new View.Component.Card_Mesa();

        setBackground(new java.awt.Color(242, 242, 242));

        jScrollPane1.setBorder(null);

        jLayeredPane1.setBackground(new java.awt.Color(242, 242, 242));
        jLayeredPane1.setLayout(new java.awt.GridLayout(3, 4, 20, 20));
        jLayeredPane1.add(card_Mesa1);
        jLayeredPane1.add(card_Mesa2);
        jLayeredPane1.add(card_Mesa3);
        jLayeredPane1.add(card_Mesa4);
        jLayeredPane1.add(card_Mesa5);
        jLayeredPane1.add(card_Mesa6);
        jLayeredPane1.add(card_Mesa7);
        jLayeredPane1.add(card_Mesa8);
        jLayeredPane1.add(card_Mesa9);
        jLayeredPane1.add(card_Mesa10);
        jLayeredPane1.add(card_Mesa11);
        jLayeredPane1.add(card_Mesa12);

        jScrollPane1.setViewportView(jLayeredPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.Component.Card_Mesa card_Mesa1;
    private View.Component.Card_Mesa card_Mesa10;
    private View.Component.Card_Mesa card_Mesa11;
    private View.Component.Card_Mesa card_Mesa12;
    private View.Component.Card_Mesa card_Mesa2;
    private View.Component.Card_Mesa card_Mesa3;
    private View.Component.Card_Mesa card_Mesa4;
    private View.Component.Card_Mesa card_Mesa5;
    private View.Component.Card_Mesa card_Mesa6;
    private View.Component.Card_Mesa card_Mesa7;
    private View.Component.Card_Mesa card_Mesa8;
    private View.Component.Card_Mesa card_Mesa9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
