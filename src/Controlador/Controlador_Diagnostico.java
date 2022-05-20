package Controlador;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Controlador_Diagnostico{
    public static Conexion conexion = new Conexion();
    public static PreparedStatement sentencia_Preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    
    public int guardar(String titulo,String descripcion,String nombrePaciente,String apellidoPaternoPaciente,String apellidoMaternoPaciente){
        int resultado = 0;
        Connection cn = null;
        String sentenciaGuardar = "INSERT INTO diagnostico(titulo,descripcion,nombrePaciente,apellidoPaternoPaciente,apellidoMaternoPaciente) VALUES(?,?,?,?,?)";
        try{
            cn = conexion.getConexion();
            sentencia_Preparada = cn.prepareStatement(sentenciaGuardar);
            sentencia_Preparada.setString(1, titulo);
            sentencia_Preparada.setString(2, descripcion);
            sentencia_Preparada.setString(3, nombrePaciente);
            sentencia_Preparada.setString(4, apellidoPaternoPaciente);
            sentencia_Preparada.setString(5, apellidoMaternoPaciente);
            resultado = sentencia_Preparada.executeUpdate();
            sentencia_Preparada.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        return resultado;
    }
}