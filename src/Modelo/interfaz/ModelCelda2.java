
package Modelo.interfaz;

import com.raven.table.model.TableRowData;

public class ModelCelda2 extends TableRowData{

    public ModelName getName() {
        return name;
    }

    public void setName(ModelName name) {
        this.name = name;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ModelCelda2(ModelName name, String lugar, String estado) {
        this.name = name;
        this.lugar = lugar;
        this.estado = estado;
    }

    public ModelCelda2() {
    }

    private ModelName name;
    private String lugar;
    private String estado;

    @Override
    public Object[] toTableRow() {
        return new Object[]{name, lugar, estado};
    }
    
}
