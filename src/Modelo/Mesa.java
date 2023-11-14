
package Modelo;

import javax.swing.Icon;

public class Mesa {
    private int id;
    private String Titulo;
    private String numero;
    private Icon icon1;
    private String pedido;
    private String factura;
    private String nota;

    public Mesa(int id, String Titulo, String numero, Icon icon1, String pedido, String factura, String nota) {
        this.id = id;
        this.Titulo = Titulo;
        this.numero = numero;
        this.icon1 = icon1;
        this.pedido = pedido;
        this.factura = factura;
        this.nota = nota;
    }

    public Mesa(String Titulo, String numero, Icon icon1, String pedido, String factura, String nota) {
        this.Titulo = Titulo;
        this.numero = numero;
        this.icon1 = icon1;
        this.pedido = pedido;
        this.factura = factura;
        this.nota = nota;
    }

    public Mesa(String Titulo, Icon icon1) {
        this.Titulo = Titulo;
        this.icon1 = icon1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Icon getIcon1() {
        return icon1;
    }

    public void setIcon1(Icon icon1) {
        this.icon1 = icon1;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
    
}
