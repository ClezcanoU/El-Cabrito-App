
package elcabrito;

public class Cliente {
    private int id;
    private String nombre;
    private String direccion;
    private String tel1;
    private String tel2;
    private String email;

    public Cliente(int id, String nombre, String direccion, String tel1, String tel2, String email) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tel1 = tel1;
        this.tel2 = tel2;
        this.email = email;
    }
    
    //Codigo sql SELECT * FROM clientes;
    
    //INSERT INTO clientes(`ID`, `NOMBRE`, `DIRECCION`, `TEL1`, `TEL2`, `EMAIL`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]')

    //DELETE FROM clientes WHERE id
    
    //UPDATE clientes SET `ID`='[value-1]',`NOMBRE`='[value-2]',`DIRECCION`='[value-3]',`TEL1`='[value-4]',`TEL2`='[value-5]',`EMAIL`='[value-6]' WHERE id
}

