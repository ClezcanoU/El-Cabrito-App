
package Modelo;

import java.sql.Timestamp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PedidoDAO {
    
    private SQLConeccion sqlConexion; 

    public PedidoDAO(SQLConeccion sqlConexion) {
        this.sqlConexion = sqlConexion; 
    }
    
    public List<Pedido> listarPedidos() {
        List<Pedido> pedidos = new ArrayList<>();
        String consulta = "SELECT * FROM pedidos";

        try (PreparedStatement statement = sqlConexion.getConectarDB().prepareStatement(consulta);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Pedido pedido = new Pedido();
                pedido.setId(resultSet.getInt("ID"));
                pedido.setFecha(resultSet.getTimestamp("FECHA"));
                pedido.setCliente(resultSet.getString("CLIENTE"));
                pedido.setTipo(resultSet.getInt("TIPO"));
                pedido.setEstado(resultSet.getString("ESTADO"));
                pedidos.add(pedido);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pedidos;
    }

    public void agregarPedido(Pedido pedido) {
        String consulta = "INSERT INTO pedidos (FECHA, CLIENTE, TIPO, ESTADO) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = sqlConexion.getConectarDB().prepareStatement(consulta)) {
            statement.setTimestamp(1, pedido.getFecha());
            statement.setString(2, pedido.getCliente());
            statement.setInt(3, pedido.getTipo());
            statement.setString(4, pedido.getEstado());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void actualizarPedido(Pedido pedido) {
        String consulta = "UPDATE pedidos SET FECHA = ?, CLIENTE = ?, TIPO = ?, ESTADO = ? WHERE ID = ?";

        try (PreparedStatement statement = sqlConexion.getConectarDB().prepareStatement(consulta)) {
            statement.setTimestamp(1, pedido.getFecha());
            statement.setString(2, pedido.getCliente());
            statement.setInt(3, pedido.getTipo());
            statement.setString(4, pedido.getEstado());
            statement.setInt(5, pedido.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarPedido(int id) {
        String consulta = "DELETE FROM pedidos WHERE ID = ?";

        try (PreparedStatement statement = sqlConexion.getConectarDB().prepareStatement(consulta)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
