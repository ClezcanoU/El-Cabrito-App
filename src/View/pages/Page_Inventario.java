
package View.pages;

import Modelo.interfaz.ModelCelda;
import View.Tabla.*;
import javax.swing.ImageIcon;


public class Page_Inventario extends javax.swing.JPanel {

    private Form_Menu formMenu = new Form_Menu();
    
    public Page_Inventario() {
        initComponents();
        tabla1.addTableStyle(jScrollPane1);
        initDataTable();
        cardMenu1.setDatos("Ajiaco",10000,"Sopas","Sopa tradicional con papas, maíz, pollo y guascas");
        cardMenu1.setImage(new ImageIcon(getClass().getResource("/View/Icon/sopa.png")));
        cardMenu2.setDatos("Pechuga Gratinada",18000,"Especiales","Pechuga a la plancha con queso");
        cardMenu2.setImage(new ImageIcon(getClass().getResource("/View/Icon/pollo.png")));
    }
    
    private void initDataTable() {
        tabla1.addTableCell(new CellCodigo(), 0);
        tabla1.addTableCell(new CellNombreProducto(), 1);
        tabla1.addTableCell(new CellCantidad(), 2);
        tabla1.addTableCell(new CellUbicacion(), 3);
        tabla1.addTableCell(new CellBotones(), 4);
        
        tabla1.addRow(new ModelCelda("0001","Arroz lb",2,"almacen 1"),false);  //  ture is animate row
        tabla1.addRow(new ModelCelda("0002","Limon lb",4,"cocina"),false);  //  ture is animate row
        tabla1.addRow(new ModelCelda("0003","pepsi bt",25,"nevera 1"),false);  //  ture is animate row
//        tabla1.editRowAt(0);
//        table1.addTableCell(new CellGender(), 1);
//        table1.addTableCell(new CellAge(), 2);
//        table1.addTableCell(new CellAddress(), 3);
//        table1.addTableCell(new CellTel(), 4);
//        table1.addRow(new ModelStaff(new ModelName("Ra", "Ven", new ImageIcon(getClass().getResource("/com/raven/icon/profile.jpg")), ""), "Male", 18, "Raven123@gmail.com", "010 000 000"), false);  //  ture is animate row
//        table1.addRow(new ModelStaff(new ModelName("Jon", "Cina", new ImageIcon(getClass().getResource("/com/raven/icon/profile.jpg")), ""), "Female", 30, "Raven123@gmail.com", "100 123 123"), false);  //  ture is animate row
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        panelRedondeado1 = new View.Swing.PanelRedondeado();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new View.Tabla.Tabla();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        panelRedondeado2 = new View.Swing.PanelRedondeado();
        cardMenu1 = new View.Component.CardMenu();
        cardMenu2 = new View.Component.CardMenu();
        modernButton1 = new View.Swing.ModernButton();

        jLabel2.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INSUMOS");

        panelRedondeado1.setBackground(new java.awt.Color(60, 60, 60));
        panelRedondeado1.setOpaque(true);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60)));

        tabla1.setBackground(new java.awt.Color(60, 60, 60));
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Cantidad", "Ubicacion", "Botones"
            }
        ));
        jScrollPane1.setViewportView(tabla1);
        if (tabla1.getColumnModel().getColumnCount() > 0) {
            tabla1.getColumnModel().getColumn(2).setPreferredWidth(40);
            tabla1.getColumnModel().getColumn(3).setResizable(false);
            tabla1.getColumnModel().getColumn(4).setResizable(false);
            tabla1.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        javax.swing.GroupLayout panelRedondeado1Layout = new javax.swing.GroupLayout(panelRedondeado1);
        panelRedondeado1.setLayout(panelRedondeado1Layout);
        panelRedondeado1Layout.setHorizontalGroup(
            panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondeado1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
        );
        panelRedondeado1Layout.setVerticalGroup(
            panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );

        jLabel3.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RECOMENDACIONES");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        panelRedondeado2.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado2.setOpaque(true);

        javax.swing.GroupLayout panelRedondeado2Layout = new javax.swing.GroupLayout(panelRedondeado2);
        panelRedondeado2.setLayout(panelRedondeado2Layout);
        panelRedondeado2Layout.setHorizontalGroup(
            panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(cardMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cardMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        panelRedondeado2Layout.setVerticalGroup(
            panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cardMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        modernButton1.setText("Menu");
        modernButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modernButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRedondeado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelRedondeado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(modernButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRedondeado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modernButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelRedondeado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void modernButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modernButton1ActionPerformed
        // TODO add your handling code here:
        formMenu.setVisible(true);
    }//GEN-LAST:event_modernButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.Component.CardMenu cardMenu1;
    private View.Component.CardMenu cardMenu2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private View.Swing.ModernButton modernButton1;
    private View.Swing.PanelRedondeado panelRedondeado1;
    private View.Swing.PanelRedondeado panelRedondeado2;
    private View.Tabla.Tabla tabla1;
    // End of variables declaration//GEN-END:variables
}
