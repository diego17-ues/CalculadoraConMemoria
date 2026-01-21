package calculadoraDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class CalculadoraDAO {
    conexion Conexion;
    //Metodo que extrae todos los registros de la db//}
    public void consulta(){
        String sentenciaSQL="SELECT * from calculadora_db";
        try{
            Connection con=Conexion.getConection();
            PreparedStatement consulta=con.prepareStatement(sentenciaSQL);
            ResultSet res=consulta.executeQuery();
            while(res.next()){
                
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
    }
}
