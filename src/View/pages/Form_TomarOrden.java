
package View.pages;

import Modelo.Producto;
import View.Component.CardProducto;
import View.Swing.ScrollBarCustom2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class Form_TomarOrden extends javax.swing.JFrame {

    private JPanel cardsPanel;
    private List<CardProducto> listaCards = new ArrayList<>();

    public Form_TomarOrden() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        headerMoving.initMoving(Form_TomarOrden.this);
        headerMoving.setColor(new Color(0,153,153));
        setLocationRelativeTo(null);
        init();
        
        ItemListener categoriaListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    cbAnexos.setSelectedIndex(-1);
                    int index = cbCategoria.getSelectedIndex();
                    CardProducto newProduct = new CardProducto();
                    if (index == 0){
                        for (int i = 0; i < 10; i++) {
                            CardProducto newProductPrueba = new CardProducto();
                            newProductPrueba.setDatos(new Producto("Pan con Ajo"+i,"#01","Entradas", 15, 5.000));
                            listaCards.add(newProductPrueba);
                        }
                        agregarCard(listaCards); 
                    } else if(index == 1){
                        newProduct.setDatos(new Producto("Hamburguesa Clásica","#02","Especiales",20,8.000));
                        listaCards.add(newProduct);
                        agregarCard(listaCards);    
                    } else if(index == 2){
                        newProduct.setDatos(new Producto("Sopa de Tomate","#03", "Sopas", 15, 7.000));
                        listaCards.add(newProduct);
                        agregarCard(listaCards);  
                    } else if(index == 3){
                        newProduct.setDatos(new Producto("Cerveza Artesanal","#04","Bebidas", 30, 4.000));
                        listaCards.add(newProduct);
                        agregarCard(listaCards);  
                    } else if(index == 4){
                        newProduct.setDatos(new Producto("Flan de Vainilla","#05","Postres", 8, 6.000));
                        listaCards.add(newProduct);
                        agregarCard(listaCards);  
                    }
                }
            }
        };
        
        ItemListener anexosListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    cbCategoria.setSelectedIndex(-1);
                    int index = cbAnexos.getSelectedIndex();
                    CardProducto newProduct = new CardProducto();
                    if (index == 0){
                        for (int i = 0; i < 10; i++) {
                            CardProducto newProductPrueba = new CardProducto();
                            newProductPrueba.setDatos(new Producto("salsa de tomate"+i,"#06","Salsas", 15, 5.000));
                            listaCards.add(newProductPrueba);
                        }
                        agregarCard(listaCards); 
                    } else if(index == 1){
                        newProduct.setDatos(new Producto("Arroz Blanco","#07","Porciones",20,8.000));
                        listaCards.add(newProduct);
                        agregarCard(listaCards);    
                    } else if(index == 2){
                        newProduct.setDatos(new Producto("Arepa Boyacense","#08","Acompañantes", 15, 7.000));
                        listaCards.add(newProduct);
                        agregarCard(listaCards);  
                    }
                }
            }
        };
        cbCategoria.addItemListener(categoriaListener);
        cbAnexos.addItemListener(anexosListener);
        
    }
    
    private void init(){
        
        cardsPanel = new JPanel(new GridLayoutWithGap(50, 1, 0, 4)); // 1 columna, filas dinámicas
        JScrollPane scrollProductos = new JScrollPane(cardsPanel);
        
        scrollProductos.setBorder(null);
        scrollProductos.getViewport().setBackground(Color.WHITE);
        scrollProductos.setVerticalScrollBar(new ScrollBarCustom2());
        scrollProductos.getVerticalScrollBar().setBackground(Color.WHITE);
        

        panelProductos.add(scrollProductos, BorderLayout.CENTER);
        
        
        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Entradas", "Especiales", "Sopas", "Bebidas", "Postres"}));
        cbCategoria.setSelectedIndex(-1);
        cbCategoria.setLabeText("Categoria");
        
        cbAnexos.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Salsas", "Porciones", "Acompañantes"}));
        cbAnexos.setSelectedIndex(-1);
        cbAnexos.setLabeText("Anexos");
        
    }
    
    // Clase personalizada para GridLayout con gap vertical
    private static class GridLayoutWithGap extends GridLayout {
        private int vgap;

        public GridLayoutWithGap(int rows, int cols, int hgap, int vgap) {
            super(rows, cols, hgap, vgap);
            this.vgap = vgap;
        }

        @Override
        public int getVgap() {
            return vgap;
        }
    }
    
    
    
    public void agregarCard(List<CardProducto> cards) {
        cardsPanel.removeAll();
        for (CardProducto card : cards) {
            card.setButtonListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    actualizarOrden();
                    System.out.println("Se hizo clic en el botón de la CardProducto");
                }
            });
            cardsPanel.add(card);
        }
        cardsPanel.revalidate(); // Actualizar el diseño
        cardsPanel.repaint();    // Volver a pintar
        listaCards.clear();
    }
    
    public void limpiarForm(){
        listaCards.clear();
        cardsPanel.removeAll();
        cbCategoria.setSelectedIndex(-1);
        cbAnexos.setSelectedIndex(-1);
        jtPedido.setText("");
        repaint();
    }

    
    public void actualizarOrden(){
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRedondeado1 = new View.Swing.PanelRedondeado();
        jbCerrar = new View.Swing.ModernButton();
        headerMoving = new View.Component.HeaderMoving();
        jlTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPedido = new javax.swing.JTextArea();
        jbConfirmar = new View.Swing.ModernButton();
        jLabel1 = new javax.swing.JLabel();
        cbCategoria = new View.Swing.ComboBoxCustom();
        cbAnexos = new View.Swing.ComboBoxCustom();
        panelProductos = new View.Swing.PanelBorder();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jbCerrar.setText("Cerrar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        headerMoving.setBackground(new java.awt.Color(0, 153, 153));

        jlTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Tomar Orden");

        jtPedido.setColumns(20);
        jtPedido.setRows(5);
        jScrollPane1.setViewportView(jtPedido);

        jbConfirmar.setText("Confirmar");
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("------ ORDEN ------");

        cbCategoria.setBackground(new java.awt.Color(246, 246, 246));
        cbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaActionPerformed(evt);
            }
        });

        cbAnexos.setBackground(new java.awt.Color(246, 246, 246));
        cbAnexos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAnexosActionPerformed(evt);
            }
        });

        panelProductos.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelRedondeado1Layout = new javax.swing.GroupLayout(panelRedondeado1);
        panelRedondeado1.setLayout(panelRedondeado1Layout);
        panelRedondeado1Layout.setHorizontalGroup(
            panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondeado1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRedondeado1Layout.createSequentialGroup()
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(cbAnexos, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRedondeado1Layout.createSequentialGroup()
                        .addGap(0, 95, Short.MAX_VALUE)
                        .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRedondeado1Layout.createSequentialGroup()
                        .addComponent(panelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondeado1Layout.createSequentialGroup()
                                .addComponent(jbConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panelRedondeado1Layout.setVerticalGroup(
            panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                .addComponent(headerMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRedondeado1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbAnexos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondeado1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRedondeado1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRedondeado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRedondeado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        dispose();
        limpiarForm();  
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void cbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaActionPerformed

    }//GEN-LAST:event_cbCategoriaActionPerformed

    private void cbAnexosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAnexosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAnexosActionPerformed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        // TODO add your handling code here:
        limpiarForm();
    }//GEN-LAST:event_jbConfirmarActionPerformed

    
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
    private View.Swing.ComboBoxCustom cbAnexos;
    private View.Swing.ComboBoxCustom cbCategoria;
    private View.Component.HeaderMoving headerMoving;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private View.Swing.ModernButton jbCerrar;
    private View.Swing.ModernButton jbConfirmar;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextArea jtPedido;
    private View.Swing.PanelBorder panelProductos;
    private View.Swing.PanelRedondeado panelRedondeado1;
    // End of variables declaration//GEN-END:variables
}
