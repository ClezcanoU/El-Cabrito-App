
package Modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Menu {

    private List<Producto> productos;

    public Menu() {
        this.productos = new ArrayList<>();
    }

    // CREATE: Agregar un nuevo producto al menú
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    // READ: Obtener todos los productos del menú
    public List<Producto> obtenerProductos() {
        return new ArrayList<>(productos); // Devuelve una copia para evitar cambios externos
    }

    // READ: Obtener un producto por su código
    public Producto obtenerProductoPorCodigo(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null; // Si no se encuentra el producto
    }

    // UPDATE: Actualizar la información de un producto
    public boolean actualizarProducto(Producto productoActualizado) {
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto.getCodigo().equals(productoActualizado.getCodigo())) {
                // Actualizar información del producto
                producto.setNombre(productoActualizado.getNombre());
                producto.setImagen(productoActualizado.getImagen());
                producto.setCantidad(productoActualizado.getCantidad());
                producto.setPrecio(productoActualizado.getPrecio());
                return true; // Producto actualizado exitosamente
            }
        }
        return false; // Producto no encontrado
    }

    // DELETE: Eliminar un producto por su código
    public boolean eliminarProductoPorCodigo(String codigo) {
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto.getCodigo().equals(codigo)) {
                iterator.remove(); // Eliminar el producto
                return true; // Producto eliminado exitosamente
            }
        }
        return false; // Producto no encontrado
    }
    
    // Otros métodos útiles, según tus necesidades
}
