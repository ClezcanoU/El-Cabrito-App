// Universidad Nacional
// Autor: Christian David Lezcano M

package elcabrito;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ElCabrito {
    
    public static void main(String[] args) {
        
        SQLConeccion sqlConeccion = new SQLConeccion();
        
        // Obtener la conexión a la base de datos
        InsumoDAO insumoDAO = new InsumoDAO(sqlConeccion);
        
        // Llama al método para listar insumos
        listaInsumos(insumoDAO);
        
        // Cierra la conexión cuando ya no sea necesaria
        sqlConeccion.cerrarConexion();
        
    }
    
    public static void listaInsumos(InsumoDAO insumoDAO){
        System.out.println("Listado de Insumos:");
        List<Insumo> insumos = insumoDAO.listarInsumos();
        for (Insumo insumo : insumos) {
            System.out.println(insumo.toString());
        }
    }
    
}
