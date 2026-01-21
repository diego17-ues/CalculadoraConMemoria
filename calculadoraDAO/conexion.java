package calculadoraDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class conexion {
   public Connection getConection(){
        Connection conexion=null;
        try{
        conexion=DriverManager.getConnection("jdbc:postgresql://localhost:5433/calculadora_bd","calculadora_user","");
    }catch(SQLException ex){
        ex.printStackTrace();
    }
    return conexion;
}
 
}
