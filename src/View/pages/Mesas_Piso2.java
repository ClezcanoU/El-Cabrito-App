
package View.pages;

import ModelView.MesaListener;
import Modelo.Mesa;
import View.Component.CardMesa;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;


public class Mesas_Piso2 extends javax.swing.JPanel implements MesaListener{

    private Form_Mesas formMesas;
    private Color color;
    
    private Map<String, CardMesa> mapMesas = new HashMap<>();
    
    private ImageIcon Icon = new ImageIcon(getClass().getResource("/View/Icon/Tenedor.png"));

    public Mesas_Piso2() {
        initComponents();
        init();
        mapMesas.put("#10", cardMesa1);
        mapMesas.put("#11", cardMesa2);
        mapMesas.put("#12", cardMesa3);
        mapMesas.put("#13", cardMesa4);
        mapMesas.put("#14", cardMesa5);
        mapMesas.put("#15", cardMesa6);
        mapMesas.put("#16", cardMesa7);
        mapMesas.put("#17", cardMesa8);
    }
    
    public void init(){
        cardMesa1.setData(new Mesa("Mesa #10","10",Icon,"","",""));
        cardMesa2.setData(new Mesa("Mesa #11","11",Icon,"","",""));
        cardMesa3.setData(new Mesa("Mesa #12","12",Icon,"","",""));
        cardMesa4.setData(new Mesa("Mesa #13","13",Icon,"","",""));
        cardMesa5.setData(new Mesa("Mesa #14","14",Icon,"","",""));
        cardMesa6.setData(new Mesa("Mesa #15","15",Icon,"","",""));
        cardMesa7.setData(new Mesa("Mesa #16","16",Icon,"","",""));
        cardMesa8.setData(new Mesa("Mesa #17","17",Icon,"","",""));
        
        agregarMouseListenerACardMesas();
        formMesas = new Form_Mesas();
    }
    
    private void agregarMouseListenerACardMesas() {
        cardMesa1.addMouseListener(crearMouseListener("Mesa #10"));
        cardMesa2.addMouseListener(crearMouseListener("Mesa #11"));
        cardMesa3.addMouseListener(crearMouseListener("Mesa #12"));
        cardMesa4.addMouseListener(crearMouseListener("Mesa #13"));
        cardMesa5.addMouseListener(crearMouseListener("Mesa #14"));
        cardMesa6.addMouseListener(crearMouseListener("Mesa #15"));
        cardMesa7.addMouseListener(crearMouseListener("Mesa #16"));
        cardMesa8.addMouseListener(crearMouseListener("Mesa #17"));
    }
    
     private MouseListener crearMouseListener(String nombreMesa) {
        return new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println("Clic en " + nombreMesa);
                MostrarDatosMesa(nombreMesa);
            }
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (evt.getSource() instanceof CardMesa) {
                    CardMesa mesa = (CardMesa) evt.getSource();
                    setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    mesa.setBorderColor(Color.RED);
                }
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (evt.getSource() instanceof CardMesa) {
                    CardMesa mesa = (CardMesa) evt.getSource();
                    mesa.setBorderColor(Color.WHITE);
                    setCursor(Cursor.getDefaultCursor());
                }
            }
        };
    }
     
    private void MostrarDatosMesa(String nombreMesa) {
        String mesa = nombreMesa.split(" ").length > 1 ? nombreMesa.split(" ")[1] : nombreMesa;
        formMesas.setTitulo(mesa);
        CardMesa cardMesa = mapMesas.get(mesa);
        color = cardMesa.getColorForState(cardMesa.getEstado());
        if (cardMesa != null) {
            formMesas.setProductos(cardMesa.getPedido());
            formMesas.setFactura(cardMesa.getFactura());
            formMesas.setNotas(cardMesa.getNota());
        } else {
            System.out.println("La mesa " + mesa + " no existe");
        }
        
        
        formMesas.cambiarColor(color);
        formMesas.setMesaListener(this);
        formMesas.setVisible(true);
        formMesas.setLocationRelativeTo(null);
    }
    
    //limpia la mesa cambiando el estado
    @Override
    public void limpiarMesa(String mesa) {
        CardMesa cardMesa = mapMesas.get(mesa);

        if (cardMesa != null) {
            cardMesa.setEstado(CardMesa.Estado.LIBRE);
            formMesas.cambiarColor(color);
            System.out.println("Limpiando en " + mesa);
        } else {
            System.out.println("La mesa " + mesa + " no existe");
        }
    }
    
    @Override
    public void ocuparMesa(String mesa) {
        CardMesa cardMesa = mapMesas.get(mesa);
        
        if (cardMesa != null) {
            cardMesa.setEstado(CardMesa.Estado.OCUPADO);
            formMesas.cambiarColor(color);
            System.out.println("Mesa " + mesa + " ocupada");
        } else {
            System.out.println("La mesa " + mesa + " no existe");
        }
    }
    
    @Override
    public void actualizarFactura(String mesa, String nuevaFactura) {
        CardMesa cardMesa = mapMesas.get(mesa);
        
        if (cardMesa != null) {
            cardMesa.setFactura(nuevaFactura);
            System.out.println("Factura " + mesa + " actualizada");
        } else {
            System.out.println("La mesa " + mesa + " no existe");
        }
    }
    
    @Override
    public void actualizarProductos(String mesa, String nuevosProductos) {
      CardMesa cardMesa = mapMesas.get(mesa);
        
        if (cardMesa != null) {
            cardMesa.setPedido(nuevosProductos);
            System.out.println("Pedido " + mesa + " actualizado");
        } else {
            System.out.println("La mesa " + mesa + " no existe");
        }
    }
    
     
    @Override
    public void actualizarNotas(String mesa, String nuevasNotas) {
      CardMesa cardMesa = mapMesas.get(mesa);
        
        if (cardMesa != null) {
            cardMesa.setNota(nuevasNotas);
            System.out.println("Nota " + mesa + " actualizado");
        } else {
            System.out.println("La mesa " + mesa + " no existe");
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMesa = new View.Swing.PanelBorder();
        cardMesa1 = new View.Component.CardMesa();
        cardMesa2 = new View.Component.CardMesa();
        cardMesa3 = new View.Component.CardMesa();
        cardMesa4 = new View.Component.CardMesa();
        cardMesa5 = new View.Component.CardMesa();
        cardMesa6 = new View.Component.CardMesa();
        cardMesa7 = new View.Component.CardMesa();
        cardMesa8 = new View.Component.CardMesa();
        cardVacia1 = new View.Component.CardVacia();

        panelMesa.setLayout(new java.awt.GridLayout(3, 3, 20, 50));
        panelMesa.add(cardMesa1);
        panelMesa.add(cardMesa2);
        panelMesa.add(cardMesa3);
        panelMesa.add(cardMesa4);
        panelMesa.add(cardMesa5);
        panelMesa.add(cardMesa6);
        panelMesa.add(cardMesa7);
        panelMesa.add(cardMesa8);

        javax.swing.GroupLayout cardVacia1Layout = new javax.swing.GroupLayout(cardVacia1);
        cardVacia1.setLayout(cardVacia1Layout);
        cardVacia1Layout.setHorizontalGroup(
            cardVacia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        cardVacia1Layout.setVerticalGroup(
            cardVacia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        panelMesa.add(cardVacia1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.Component.CardMesa cardMesa1;
    private View.Component.CardMesa cardMesa2;
    private View.Component.CardMesa cardMesa3;
    private View.Component.CardMesa cardMesa4;
    private View.Component.CardMesa cardMesa5;
    private View.Component.CardMesa cardMesa6;
    private View.Component.CardMesa cardMesa7;
    private View.Component.CardMesa cardMesa8;
    private View.Component.CardVacia cardVacia1;
    private View.Swing.PanelBorder panelMesa;
    // End of variables declaration//GEN-END:variables

}
