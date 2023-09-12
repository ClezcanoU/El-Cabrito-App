
package elcabrito;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private int id;
    private LocalDateTime fecha;
    private String cliente;
    private int tipo;
    private String estado;
    private List<Producto> productos;

    public Pedido(int id, LocalDateTime fecha, String cliente, int tipo, String estado, List<Producto> productos) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.tipo = tipo;
        this.estado = estado;
        this.productos = productos;
    }

    
    //cambiar Estado
    public void setEstado(String estado) {
        this.estado = estado;
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
