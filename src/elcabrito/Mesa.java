
package elcabrito;

public class Mesa {
    private int id;
    private String numero;
    private String estado;
    private Pedido pedido;
    private String nota;

    public Mesa(int id, String numero, String estado, Pedido pedido, String nota) {
        this.id = id;
        this.numero = numero;
        this.estado = estado;
        this.pedido = pedido;
        this.nota = nota;
    }

    //cambiar estado
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //codigo sql SELECT * FROM mesa;
    
    //INSERT INTO mesas(`ID`, `NUMERO`, `ESTADO`, `NOTAS`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]')

    //DELETE FROM mesas WHERE id
    
    //UPDATE mesas SET `ID`='[value-1]',`NUMERO`='[value-2]',`ESTADO`='[value-3]',`NOTAS`='[value-4]' WHERE id
}
