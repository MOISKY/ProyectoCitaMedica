package Controlador;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Controlador_Paciente{
    public static Conexion conexion = new Conexion();
    public static PreparedStatement sentencia_Preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    
    public int guardar(String nombre,String apellidoPaterno,String apellidoMaterno,String edad,String sexo,String estatura,String curp,String dni){
        int resultado = 0;
        Connection cn = null;
        String sentenciaGuardar = "INSERT INTO paciente(nombre,apellidoPaterno,apellidoMaterno,edad,sexo,estatura,curp,dni) VALUES(?,?,?,?,?,?,?,?)";
        try{
            cn = conexion.getConexion();
            sentencia_Preparada = cn.prepareStatement(sentenciaGuardar);
            sentencia_Preparada.setString(1, nombre);
            sentencia_Preparada.setString(2, apellidoPaterno);
            sentencia_Preparada.setString(3, apellidoMaterno);
            sentencia_Preparada.setString(4, edad);
            sentencia_Preparada.setString(5, sexo);
            sentencia_Preparada.setString(6, estatura);
            sentencia_Preparada.setString(7, curp);
            sentencia_Preparada.setString(8, dni);
            resultado = sentencia_Preparada.executeUpdate();
            sentencia_Preparada.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        return resultado;
    }
}
