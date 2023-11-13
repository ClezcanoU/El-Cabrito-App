
package View.pages;

import Modelo.interfaz.Model_Card;
import View.Component.CardMesa;
import java.awt.Color;
import javax.swing.ImageIcon;


public class Page_Mesas extends javax.swing.JPanel {


    public Page_Mesas() {
        initComponents();
        init();
    }
    
    public void init(){
        
        //Datos grafica
        /*pieChart1.setChartType(PieChart.PeiChartType.DEFAULT);
        pieChart1.addData(new ModelPieChart("Tigher", 50, new Color(23, 126, 238)));
        pieChart1.addData(new ModelPieChart("ABC", 50, new Color(221, 65, 65)));
        pieChart1.addData(new ModelPieChart("Coca", 50, new Color(47, 157, 64)));
        pieChart1.addData(new ModelPieChart("Vita", 60, new Color(196, 151, 58)));*/
        
        //Datos de barras
        libresBar.setForeground(new Color(18, 163, 24));
        libresBar.setValue(40);
        libresBar.setColorString(new Color(0, 0, 0));
        
        ocupadasBar.setForeground(new Color(206, 28, 28));
        ocupadasBar.setValue(30);
        ocupadasBar.setColorString(new Color(0, 0, 0));
        
        //Datos comboBox
        comboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Piso 1", "Piso 2", "Terraza"}));
        comboBox.setSelectedIndex(-1);
        comboBox.setLabeText("Piso");
        
        
        //Datos de mesa
        cardMesa1.setData(new Model_Card("Mesa #1",new ImageIcon(getClass().getResource("/View/Icon/Tenedor.png"))));
        cardMesa1.setEstado(CardMesa.Estado.OCUPADO);
        cardMesa2.setData(new Model_Card("Mesa #2",new ImageIcon(getClass().getResource("/View/Icon/Tenedor.png"))));
        cardMesa2.setEstado(CardMesa.Estado.LIBRE);
        cardMesa3.setData(new Model_Card("Mesa #3",new ImageIcon(getClass().getResource("/View/Icon/Tenedor.png"))));
        cardMesa4.setData(new Model_Card("Mesa #4",new ImageIcon(getClass().getResource("/View/Icon/Tenedor.png"))));
        cardMesa5.setData(new Model_Card("Mesa #5",new ImageIcon(getClass().getResource("/View/Icon/Tenedor.png"))));
        cardMesa6.setData(new Model_Card("Mesa #6",new ImageIcon(getClass().getResource("/View/Icon/Tenedor.png"))));
        cardMesa7.setData(new Model_Card("Mesa #7",new ImageIcon(getClass().getResource("/View/Icon/Tenedor.png"))));
        cardMesa8.setData(new Model_Card("Mesa #8",new ImageIcon(getClass().getResource("/View/Icon/Tenedor.png"))));
        cardMesa9.setData(new Model_Card("Mesa #9",new ImageIcon(getClass().getResource("/View/Icon/Tenedor.png"))));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new View.Swing.PanelBorder();
        jLabel3 = new javax.swing.JLabel();
        libresBar = new View.Swing.ProgressBarCustom();
        ocupadasBar = new View.Swing.ProgressBarCustom();
        jLabel2 = new javax.swing.JLabel();
        comboBox = new View.Swing.ComboBoxCustom();
        panelMesas = new View.Swing.PanelBorder();
        cardMesa1 = new View.Component.CardMesa();
        cardMesa2 = new View.Component.CardMesa();
        cardMesa3 = new View.Component.CardMesa();
        cardMesa4 = new View.Component.CardMesa();
        cardMesa5 = new View.Component.CardMesa();
        cardMesa6 = new View.Component.CardMesa();
        cardMesa7 = new View.Component.CardMesa();
        cardMesa8 = new View.Component.CardMesa();
        cardMesa9 = new View.Component.CardMesa();

        setBackground(new java.awt.Color(242, 242, 242));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Ocupadas");

        libresBar.setBackground(new java.awt.Color(242, 242, 242));

        ocupadasBar.setBackground(new java.awt.Color(242, 242, 242));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Libres");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel2)
                .addGap(66, 66, 66)
                .addComponent(libresBar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addComponent(ocupadasBar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(libresBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ocupadasBar, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        comboBox.setBackground(new java.awt.Color(242, 242, 242));
        comboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxItemStateChanged(evt);
            }
        });

        panelMesas.setLayout(new java.awt.GridLayout(3, 3, 20, 50));
        panelMesas.add(cardMesa1);
        panelMesas.add(cardMesa2);
        panelMesas.add(cardMesa3);
        panelMesas.add(cardMesa4);
        panelMesas.add(cardMesa5);
        panelMesas.add(cardMesa6);
        panelMesas.add(cardMesa7);
        panelMesas.add(cardMesa8);
        panelMesas.add(cardMesa9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelMesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelMesas, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxItemStateChanged
        // TODO add your handling code here:
        //mostrarMesasSeleccionadas(comboBox.getSelectedIndex());
        System.out.println(comboBox.getSelectedItem()+" :"+ comboBox.getSelectedIndex());
        // Lógica para mostrar las mesas correspondientes al piso seleccionado
        /*switch (pisoSeleccionado) {
            case "Piso 1":
                mostrarMesasPiso(1);
                break;
            case "Piso 2":
                mostrarMesasPiso(2);
                break;
            // Agregar más casos según los pisos que tengas
            default:
                break;
        }*/
    }//GEN-LAST:event_comboBoxItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.Component.CardMesa cardMesa1;
    private View.Component.CardMesa cardMesa2;
    private View.Component.CardMesa cardMesa3;
    private View.Component.CardMesa cardMesa4;
    private View.Component.CardMesa cardMesa5;
    private View.Component.CardMesa cardMesa6;
    private View.Component.CardMesa cardMesa7;
    private View.Component.CardMesa cardMesa8;
    private View.Component.CardMesa cardMesa9;
    private View.Swing.ComboBoxCustom comboBox;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private View.Swing.ProgressBarCustom libresBar;
    private View.Swing.ProgressBarCustom ocupadasBar;
    private View.Swing.PanelBorder panelBorder1;
    private View.Swing.PanelBorder panelMesas;
    // End of variables declaration//GEN-END:variables
}
