
package elcabrito;

import java.util.List;


public class Menu {
    
    private String Categoria;
    private List<Producto> productos;

    public Menu(String Categoria, List<Producto> productos) {
        this.Categoria = Categoria;
        this.productos = productos;
    }
    
}
