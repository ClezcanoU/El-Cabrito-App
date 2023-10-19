
package Modelo;

public class Producto {
    private int id;
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(int id, String codigo, String nombre, int cantidad, double precio) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    //obtener producto
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    
    //codigo sql SELECT * FROM productos;

    //INSERT INTO productos(`ID`, `CODIGO`, `NOMBRE`, `CANTIDAD`, `PRECIO`, `HUBICACION`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]')
    
    //DELETE FROM productos WHERE id
    
    //UPDATE productos SET `ID`='[value-1]',`CODIGO`='[value-2]',`NOMBRE`='[value-3]',`CANTIDAD`='[value-4]',`PRECIO`='[value-5]',`HUBICACION`='[value-6]' WHERE id

}