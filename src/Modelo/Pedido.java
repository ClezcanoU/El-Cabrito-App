
package Modelo;

import java.sql.Timestamp;
import java.util.List;

public class Pedido {
    private int id;
    private Timestamp fecha;
    private String cliente;
    private int tipo;
    private String estado;
    private List<Producto> productos;

    public Pedido(int id, Timestamp fecha, String cliente, int tipo, String estado, List<Producto> productos) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.tipo = tipo;
        this.estado = estado;
        this.productos = productos;
    }

    public Pedido() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    //consultar Pedido
    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", fecha=" + fecha + ", cliente=" + cliente + ", productos=" + productos + '}';
    }
    
    //codigo sql SELECT * FROM pedidos 

    //INSERT INTO pedidos(`ID`, `FECHA`, `CLIENTE`, `TIPO`, `ESTADO`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]')

    //DELETE FROM pedidos WHERE id
    
    //UPDATE pedidos SET `ID`='[value-1]',`FECHA`='[value-2]',`CLIENTE`='[value-3]',`TIPO`='[value-4]',`ESTADO`='[value-5]' WHERE id
}
