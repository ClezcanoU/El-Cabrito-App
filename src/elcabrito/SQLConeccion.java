
package elcabrito;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLConeccion {
    Connection SQLConexion;
    
    public SQLConeccion(){
        
        String host = "localhost";
        String puerto = "3306";
        String nameDB ="cabritobasedatos";
        
        String usuario = "root";
        String pass = "";
        
        String driver = "com.mysql.cj.jdbc.Driver";
        
        String databaseURL = "jdbc:mysql://"+host+":"+puerto+"/"+nameDB+"?useSSL=false";
        
        try{
            Class.forName(driver);
            SQLConexion = DriverManager.getConnection(databaseURL,usuario,pass);
            System.out.println("Coneccion Exitosa");
        }catch(Exception ex){
            
        }
    }
    
    public Connection getConectarDB(){
        return SQLConexion;
    }
}
