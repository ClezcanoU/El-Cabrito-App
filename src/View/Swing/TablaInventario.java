
package View.Swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import ModelView.MenuLocal;
import Modelo.Menu;
import Modelo.Producto;

public class TablaInventario {
    private JTable tabla;

    public TablaInventario() {
        // Crea una instancia de MenuLocal para obtener el menú
        MenuLocal menuLocal = new MenuLocal();
        Menu menu = menuLocal.MenuLocal();

        // Obtiene la lista de productos del menú
        List<Producto> productos = menu.obtenerProductos();

        // Configura el modelo de la tabla
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");

        for (Producto producto : productos) {
            // Agrega cada producto como una fila en la tabla
            modelo.addRow(new Object[]{producto.getNombre(), producto.getCantidad(), producto.getPrecio()});
        }

        // Crea la tabla con el modelo
        tabla = new JTable(modelo);

    }
}
