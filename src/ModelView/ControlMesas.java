
package ModelView;

public class ControlMesas {
    
    static public int calcularPorcentaje(int cantidadEstado, int mesas){
        double porcentaje = (cantidadEstado * 100)/mesas;
        return (int) porcentaje;
    }
}
