
package ModelView;


public interface MesaListener {
    void limpiarMesa(String mesa);
    void ocuparMesa(String mesa);
    void actualizarFactura(String mesa, String nuevaFactura);
    void actualizarProductos(String mesa, String nuevosProductos);
    void actualizarNotas(String mesa, String nuevasNotas);
    void mensajeNotificacion();
}
