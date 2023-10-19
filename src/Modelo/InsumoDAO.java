
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InsumoDAO {

    private SQLConeccion sqlConexion; 

    public InsumoDAO(SQLConeccion sqlConexion) {
        this.sqlConexion = sqlConexion; 
    }


    public List<Insumo> listarInsumos() {
        // Implementa la lógica para listar insumos desde la base de datos
        List<Insumo> insumos = new ArrayList<>();
        String consulta = "SELECT * FROM insumos";

        try (PreparedStatement statement = sqlConexion.getConectarDB().prepareStatement(consulta);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Insumo insumo = new Insumo();
                insumo.setId(resultSet.getInt("ID"));
                insumo.setCodigo(resultSet.getString("CODIGO"));
                insumo.setNombre(resultSet.getString("NOMBRE"));
                insumo.setCantidad(resultSet.getInt("CANTIDAD"));
                insumo.setPrecio(resultSet.getDouble("PRECIO"));
                insumo.setUbicacion(resultSet.getString("UBICACION"));
                insumos.add(insumo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return insumos;
    }


    public Insumo obtenerInsumoPorId(int id) {
        Insumo insumo = null;
        String consulta = "SELECT * FROM insumos WHERE ID = ?";

        try (PreparedStatement statement = sqlConexion.getConectarDB().prepareStatement(consulta)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    insumo = new Insumo();
                    insumo.setId(resultSet.getInt("ID"));
                    insumo.setCodigo(resultSet.getString("CODIGO"));
                    insumo.setNombre(resultSet.getString("NOMBRE"));
                    insumo.setCantidad(resultSet.getInt("CANTIDAD"));
                    insumo.setPrecio(resultSet.getDouble("PRECIO"));
                    insumo.setUbicacion(resultSet.getString("UBICACION"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return insumo;
    }


    public void agregarInsumo(Insumo insumo) {
        String consulta = "INSERT INTO insumos (CODIGO, NOMBRE, CANTIDAD, PRECIO, UBICACION) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement statement = sqlConexion.getConectarDB().prepareStatement(consulta)) {
            statement.setString(1, insumo.getCodigo());
            statement.setString(2, insumo.getNombre());
            statement.setInt(3, insumo.getCantidad());
            statement.setDouble(4, insumo.getPrecio());
            statement.setString(5, insumo.getUbicacion());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void actualizarInsumo(Insumo insumo) {
        String consulta = "UPDATE insumos SET CODIGO = ?, NOMBRE = ?, CANTIDAD = ?, PRECIO = ?, UBICACION = ? WHERE ID = ?";

        try (PreparedStatement statement = sqlConexion.getConectarDB().prepareStatement(consulta)) {
            statement.setString(1, insumo.getCodigo());
            statement.setString(2, insumo.getNombre());
            statement.setInt(3, insumo.getCantidad());
            statement.setDouble(4, insumo.getPrecio());
            statement.setString(5, insumo.getUbicacion());
            statement.setInt(6, insumo.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void eliminarInsumo(int id) {
        String consulta = "DELETE FROM insumos WHERE ID = ?";

        try (PreparedStatement statement = sqlConexion.getConectarDB().prepareStatement(consulta)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
