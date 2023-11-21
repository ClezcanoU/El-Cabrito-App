
package View.pages;

import Modelo.Pedido;
import Modelo.Pedido.Estado;
import Modelo.Pedido.TIPO;
import View.Component.CardPedido;
import View.Swing.ScrollBarCustom2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class Page_Pedidos extends javax.swing.JPanel {

    List<CardPedido> listaDomicilios = new ArrayList<>();
    List<CardPedido> listaMesasPedidos = new ArrayList<>();
    
    private JPanel listDomiciliosPanel;
    private JPanel listMesasPanel;

    public Page_Pedidos() {
        initComponents();

        init();
    }
    
    final public void init(){
        
        listDomiciliosPanel = new JPanel(new GridLayoutWithGap(50, 1, 0, 4));
        JScrollPane scrollDomicilios = new JScrollPane(listDomiciliosPanel);
        
        scrollDomicilios.setBorder(null);
        scrollDomicilios.getViewport().setBackground(Color.WHITE);
        scrollDomicilios.setVerticalScrollBar(new ScrollBarCustom2());
        scrollDomicilios.getVerticalScrollBar().setBackground(Color.WHITE);
        panelDPendientes.add(scrollDomicilios, BorderLayout.CENTER);
        
        listMesasPanel = new JPanel(new GridLayoutWithGap(50, 1, 0, 4));
        JScrollPane scrollMesas = new JScrollPane(listMesasPanel);
        
        scrollMesas.setBorder(null);
        scrollMesas.getViewport().setBackground(Color.WHITE);
        scrollMesas.setVerticalScrollBar(new ScrollBarCustom2());
        scrollMesas.getVerticalScrollBar().setBackground(Color.WHITE);
        panelMPendientes.add(scrollMesas, BorderLayout.CENTER);
        
        //Designacion de los items de los comboBox
        
        cbDomicilios.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Realizado", "Pendiente", "En Proceso"}));
        cbDomicilios.setSelectedIndex(-1);
        cbDomicilios.setLabeText("Estado");
        
        cbMesas.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Realizado", "Pendiente", "En Proceso"}));
        cbMesas.setSelectedIndex(-1);
        cbMesas.setLabeText("Estado");

        CardPedido newPedido1 = new CardPedido();
        newPedido1.setDatos(new Pedido("#0001","Mesa #1",TIPO.LOCAL,Estado.PENDIENTE));
        listMesasPanel.add(newPedido1);

        CardPedido newPedido2 = new CardPedido();
        newPedido2.setDatos(new Pedido("#0002","David",TIPO.ENVIO,Estado.PENDIENTE));
        listDomiciliosPanel.add(newPedido2);
        CardPedido newPedido3 = new CardPedido();
        newPedido3.setDatos(new Pedido("#0003","Luis",TIPO.ENVIO,Estado.ENPROCESO));
        listDomiciliosPanel.add(newPedido3);
        CardPedido newPedido4 = new CardPedido();
        newPedido4.setDatos(new Pedido("#0003","Miguel",TIPO.LOCAL,Estado.REALIZADO));
        listDomiciliosPanel.add(newPedido4);
        
    }
    
    //Clase para personalizar el GridLayout con gap vertical 
    public static class GridLayoutWithGap extends GridLayout {
        private int verticalgap;

        public GridLayoutWithGap(int rows, int cols, int horizontalgap, int verticalgap) {
            super(rows, cols, horizontalgap, verticalgap);
            this.verticalgap = verticalgap;
        }

        @Override
        public int getVgap() {
            return verticalgap;
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new View.Swing.PanelBorder();
        panelDomicilios = new View.Swing.PanelRedondeado();
        panelDPendientes = new View.Swing.PanelBorder();
        jlDomicilios = new javax.swing.JLabel();
        cbDomicilios = new View.Swing.ComboBoxCustom();
        jbAgregarDomi = new View.Swing.ModernButton();
        panelMesas = new View.Swing.PanelRedondeado();
        panelMPendientes = new View.Swing.PanelBorder();
        jlMesas = new javax.swing.JLabel();
        cbMesas = new View.Swing.ComboBoxCustom();

        panelDPendientes.setLayout(new java.awt.BorderLayout());

        jlDomicilios.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jlDomicilios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDomicilios.setText("Domicilios");

        cbDomicilios.setBackground(new java.awt.Color(246, 246, 246));

        jbAgregarDomi.setText("Agregar");

        javax.swing.GroupLayout panelDomiciliosLayout = new javax.swing.GroupLayout(panelDomicilios);
        panelDomicilios.setLayout(panelDomiciliosLayout);
        panelDomiciliosLayout.setHorizontalGroup(
            panelDomiciliosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDomiciliosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDomiciliosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDPendientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlDomicilios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelDomiciliosLayout.createSequentialGroup()
                        .addComponent(cbDomicilios, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jbAgregarDomi, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelDomiciliosLayout.setVerticalGroup(
            panelDomiciliosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDomiciliosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlDomicilios, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panelDomiciliosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbDomicilios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAgregarDomi, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelDPendientes, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMPendientes.setLayout(new java.awt.BorderLayout());

        jlMesas.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jlMesas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMesas.setText("Mesas");

        cbMesas.setBackground(new java.awt.Color(246, 246, 246));

        javax.swing.GroupLayout panelMesasLayout = new javax.swing.GroupLayout(panelMesas);
        panelMesas.setLayout(panelMesasLayout);
        panelMesasLayout.setHorizontalGroup(
            panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMesasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMPendientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlMesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelMesasLayout.createSequentialGroup()
                        .addComponent(cbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 238, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelMesasLayout.setVerticalGroup(
            panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMesasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelMPendientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDomicilios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panelMesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDomicilios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.Swing.ComboBoxCustom cbDomicilios;
    private View.Swing.ComboBoxCustom cbMesas;
    private View.Swing.ModernButton jbAgregarDomi;
    private javax.swing.JLabel jlDomicilios;
    private javax.swing.JLabel jlMesas;
    private View.Swing.PanelBorder panelDPendientes;
    private View.Swing.PanelRedondeado panelDomicilios;
    private View.Swing.PanelBorder panelMPendientes;
    private View.Swing.PanelRedondeado panelMesas;
    private View.Swing.PanelBorder panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
