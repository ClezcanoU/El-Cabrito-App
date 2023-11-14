
package Modelo;

import javax.swing.Icon;

public class Producto {
    private int id;
    private String codigo;
    private String nombre;
    private Icon imagen;
    private int cantidad;
    private double precio;

    public Producto(int id, String codigo, String nombre, Icon imagen, int cantidad, double precio) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.imagen = imagen;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Producto(String nombre, Icon imagen, int cantidad, double precio) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Icon getImagen() {
        return imagen;
    }

    public void setImagen(Icon imagen) {
        this.imagen = imagen;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", imagen=" + imagen + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }

}
