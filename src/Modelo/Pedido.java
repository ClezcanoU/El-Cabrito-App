
package Modelo;

import java.sql.Timestamp;
import javax.swing.Icon;

public class Pedido extends ElementoRestaurante{
    
    private Timestamp fecha;
    private String cliente;
    private int tipo;
    private String estado;
    private String productos;

    //Constructores
    
    public Pedido(Timestamp fecha, String cliente, int tipo, String estado, String productos, int id) {
        super(id);
        this.fecha = fecha;
        this.cliente = cliente;
        this.tipo = tipo;
        this.estado = estado;
        this.productos = productos;
    }

    public Pedido() {
    }

    //Getters and Setters
    
    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }
    
}
