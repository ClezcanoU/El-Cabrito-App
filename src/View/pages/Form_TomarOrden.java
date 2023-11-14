
package View.pages;

import ModelView.MenuLocal;
import Modelo.Menu;
import Modelo.Producto;
import View.Component.CardMenu;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;


public class Form_TomarOrden extends javax.swing.JFrame {

    public Form_TomarOrden() {
        initComponents();
        headerMoving.initMoving(Form_TomarOrden.this);
        init();
    }
    
    private void init() {
        List<Producto> productos = new ArrayList<>();

        // Crear una instancia de MenuLocal para obtener el menú
        MenuLocal menuLocal = new MenuLocal();
        Menu menu = menuLocal.MenuLocal();

        // Obtener la lista de productos del menú
        productos = menu.obtenerProductos();

        // Verificar si hay suficientes productos en el menú
        if (productos.size() >= 24) {
            // Configurar la información para todas las cardMenu y almacenar precios en un array
            List<Double> precios = new ArrayList<>();

            for (int i = 1; i <= 24; i++) {
                Producto producto = productos.get(i);
                CardMenu cardMenu = obtenerCardMenuSegunIndice(i);

                // Configurar la información para la cardMenu actual
                cardMenu.setNombre(producto.getNombre());
                cardMenu.setImagen(producto.getImagen());
                // Almacenar el precio en el array
                precios.add(producto.getPrecio());
            }

            // Hacer lo que necesites con el array de precios
            // Por ejemplo, imprimirlos
            System.out.println("Precios almacenados en el array: " + precios);
        } else {
            // Manejar el caso en que no haya suficientes productos en el menú
            System.out.println("No hay suficientes productos en el menú.");
        }
    }

    // Método auxiliar para obtener la cardMenu según el índice
    private CardMenu obtenerCardMenuSegunIndice(int indice) {
        switch (indice) {
            case 1: return cardMenu1;
            case 2: return cardMenu2;
            case 3: return cardMenu3;
            case 4: return cardMenu4;
            case 5: return cardMenu5;
            case 6: return cardMenu6;
            case 7: return cardMenu7;
            case 8: return cardMenu8;
            case 9: return cardMenu9;
            case 10: return cardMenu10;
            case 11: return cardMenu11;
            case 12: return cardMenu12;
            case 13: return cardMenu13;
            case 14: return cardMenu14;
            case 15: return cardMenu15;
            case 16: return cardMenu16;
            case 17: return cardMenu17;
            case 18: return cardMenu18;
            case 19: return cardMenu19;
            case 20: return cardMenu20;
            case 21: return cardMenu21;
            case 22: return cardMenu22;
            case 23: return cardMenu23;
            case 24: return cardMenu24;
           
            default: return null;
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbCerrar = new View.Swing.ModernButton();
        headerMoving = new View.Component.HeaderMoving();
        panelBorder = new View.Swing.PanelBorder();
        cardMenu1 = new View.Component.CardMenu();
        cardMenu2 = new View.Component.CardMenu();
        cardMenu3 = new View.Component.CardMenu();
        cardMenu4 = new View.Component.CardMenu();
        cardMenu5 = new View.Component.CardMenu();
        cardMenu6 = new View.Component.CardMenu();
        cardMenu7 = new View.Component.CardMenu();
        cardMenu8 = new View.Component.CardMenu();
        cardMenu9 = new View.Component.CardMenu();
        cardMenu10 = new View.Component.CardMenu();
        cardMenu11 = new View.Component.CardMenu();
        cardMenu12 = new View.Component.CardMenu();
        cardMenu13 = new View.Component.CardMenu();
        cardMenu14 = new View.Component.CardMenu();
        cardMenu15 = new View.Component.CardMenu();
        cardMenu16 = new View.Component.CardMenu();
        cardMenu17 = new View.Component.CardMenu();
        cardMenu18 = new View.Component.CardMenu();
        cardMenu19 = new View.Component.CardMenu();
        cardMenu20 = new View.Component.CardMenu();
        cardMenu21 = new View.Component.CardMenu();
        cardMenu22 = new View.Component.CardMenu();
        cardMenu23 = new View.Component.CardMenu();
        cardMenu24 = new View.Component.CardMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jbCerrar.setBackground(new java.awt.Color(255, 153, 153));
        jbCerrar.setText("Cerrar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        headerMoving.setBackground(new java.awt.Color(255, 255, 255));

        panelBorder.setLayout(new java.awt.GridLayout(4, 4, 20, 5));
        panelBorder.add(cardMenu1);
        panelBorder.add(cardMenu2);
        panelBorder.add(cardMenu3);
        panelBorder.add(cardMenu4);
        panelBorder.add(cardMenu5);
        panelBorder.add(cardMenu6);
        panelBorder.add(cardMenu7);
        panelBorder.add(cardMenu8);
        panelBorder.add(cardMenu9);
        panelBorder.add(cardMenu10);
        panelBorder.add(cardMenu11);
        panelBorder.add(cardMenu12);
        panelBorder.add(cardMenu13);
        panelBorder.add(cardMenu14);
        panelBorder.add(cardMenu15);
        panelBorder.add(cardMenu16);
        panelBorder.add(cardMenu17);
        panelBorder.add(cardMenu18);
        panelBorder.add(cardMenu19);
        panelBorder.add(cardMenu20);
        panelBorder.add(cardMenu21);
        panelBorder.add(cardMenu22);
        panelBorder.add(cardMenu23);
        panelBorder.add(cardMenu24);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addComponent(panelBorder, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(headerMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(panelBorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form_TomarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_TomarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_TomarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_TomarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_TomarOrden().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.Component.CardMenu cardMenu1;
    private View.Component.CardMenu cardMenu10;
    private View.Component.CardMenu cardMenu11;
    private View.Component.CardMenu cardMenu12;
    private View.Component.CardMenu cardMenu13;
    private View.Component.CardMenu cardMenu14;
    private View.Component.CardMenu cardMenu15;
    private View.Component.CardMenu cardMenu16;
    private View.Component.CardMenu cardMenu17;
    private View.Component.CardMenu cardMenu18;
    private View.Component.CardMenu cardMenu19;
    private View.Component.CardMenu cardMenu2;
    private View.Component.CardMenu cardMenu20;
    private View.Component.CardMenu cardMenu21;
    private View.Component.CardMenu cardMenu22;
    private View.Component.CardMenu cardMenu23;
    private View.Component.CardMenu cardMenu24;
    private View.Component.CardMenu cardMenu3;
    private View.Component.CardMenu cardMenu4;
    private View.Component.CardMenu cardMenu5;
    private View.Component.CardMenu cardMenu6;
    private View.Component.CardMenu cardMenu7;
    private View.Component.CardMenu cardMenu8;
    private View.Component.CardMenu cardMenu9;
    private View.Component.HeaderMoving headerMoving;
    private View.Swing.ModernButton jbCerrar;
    private View.Swing.PanelBorder panelBorder;
    // End of variables declaration//GEN-END:variables
}
