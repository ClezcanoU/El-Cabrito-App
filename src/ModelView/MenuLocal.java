
package ModelView;

import Modelo.Menu;
import Modelo.Producto;
import javax.swing.ImageIcon;


public class MenuLocal {
    
    Menu menu = new Menu();
    
    public Menu MenuLocal(){
        menu.agregarProducto(new Producto("Hamburguesa Clásica", new ImageIcon("/View/Icon/hamburguesa.png"), 20, 8.000));
        menu.agregarProducto(new Producto("Churrasco de Res", new ImageIcon("/View/Icon/churrasco.png"), 15, 14.000));
        menu.agregarProducto(new Producto("Ensalada César", new ImageIcon("/View/Icon/ensalada.png"), 10, 6.000));
        menu.agregarProducto(new Producto("Pollo a la Parrilla", new ImageIcon("/View/Icon/pollo.png"), 18, 12.000));
        menu.agregarProducto(new Producto("Papas Fritas", new ImageIcon("/View/Icon/papas.png"), 25, 4.000));
        menu.agregarProducto(new Producto("Tacos de Carnitas", new ImageIcon("/View/Icon/tacos.png"), 12, 10.000));
        menu.agregarProducto(new Producto("Pizza Margarita", new ImageIcon("/View/Icon/pizza.png"), 8, 11.000));
        menu.agregarProducto(new Producto("Sopa de Tomate", new ImageIcon("/View/Icon/sopa.png"), 15, 7.000));
        menu.agregarProducto(new Producto("Burrito de Pollo", new ImageIcon("/View/Icon/burrito.png"), 10, 9.000));
        menu.agregarProducto(new Producto("Ceviche de Camarones", new ImageIcon("/View/Icon/ceviche.png"), 12, 13.000));
        menu.agregarProducto(new Producto("Costillas BBQ", new ImageIcon("/View/Icon/costillas.png"), 20, 16.000));
        menu.agregarProducto(new Producto("Pan con Ajo", new ImageIcon("/View/Icon/ajo.png"), 15, 5.000));
        menu.agregarProducto(new Producto("Tarta de Chocolate", new ImageIcon("/View/Icon/tarta.png"), 8, 8.000));
        menu.agregarProducto(new Producto("Sándwich Club", new ImageIcon("/View/Icon/sandwich.png"), 18, 9.000));
        menu.agregarProducto(new Producto("Arroz con Pollo", new ImageIcon("/View/Icon/arroz.png"), 12, 11.000));
        menu.agregarProducto(new Producto("Helado de Vainilla", new ImageIcon("/View/Icon/helado.png"), 25, 3.000));
        menu.agregarProducto(new Producto("Pastel de Queso", new ImageIcon("/View/Icon/pastel.png"), 8, 7.000));
        menu.agregarProducto(new Producto("Torta de Zanahoria", new ImageIcon("/View/Icon/torta.png"), 10, 8.000));
        menu.agregarProducto(new Producto("Cóctel de Frutas", new ImageIcon("/View/Icon/coctel.png"), 15, 6.000));
        menu.agregarProducto(new Producto("Camarones a la Diabla", new ImageIcon("/View/Icon/camarones.png"), 10, 15.000));
        menu.agregarProducto(new Producto("Quesadillas", new ImageIcon("/View/Icon/quesadillas.png"), 12, 10.000));
        menu.agregarProducto(new Producto("Batido de Fresa", new ImageIcon("/View/Icon/batido.png"), 20, 8.000));
        menu.agregarProducto(new Producto("Flan de Vainilla", new ImageIcon("/View/Icon/flan.png"), 8, 6.000));
        menu.agregarProducto(new Producto("Sushi Variado", new ImageIcon("/View/Icon/sushi.png"), 15, 18.000));
        menu.agregarProducto(new Producto("Cerveza Artesanal", new ImageIcon("/View/Icon/cerveza.png"), 30, 4.000));

        return menu;
    }
 
}
