package Controlador;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Controlador_RecetaMedica{
    public static Conexion conexion = new Conexion();
    public static PreparedStatement sentencia_Preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    
    public int guardar(String tituloDiagnostico,String medicamentos,String diaFecha,String mesFecha,String añoFecha,String nombrePaciente,String apellidoPaternoPaciente,String apellidoMaternoPaciente){
        int resultado = 0;
        Connection cn = null;
        String sentenciaGuardar = "INSERT INTO recetamedica(tituloDiagnostico,medicamentos,diaFecha,mesFecha,añoFecha,nombrePaciente,apellidoPaternoPaciente,apellidoMaternoPaciente) VALUES(?,?,?,?,?,?,?,?)";
        try{
            cn = conexion.getConexion();
            sentencia_Preparada = cn.prepareStatement(sentenciaGuardar);
            sentencia_Preparada.setString(1, tituloDiagnostico);
            sentencia_Preparada.setString(2, medicamentos);
            sentencia_Preparada.setString(3 ,diaFecha);
            sentencia_Preparada.setString(4, mesFecha);
            sentencia_Preparada.setString(5, añoFecha);
            sentencia_Preparada.setString(6, nombrePaciente);
            sentencia_Preparada.setString(7, apellidoPaternoPaciente);
            sentencia_Preparada.setString(8, apellidoMaternoPaciente);
            resultado = sentencia_Preparada.executeUpdate();
            sentencia_Preparada.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        return resultado;
    }
}
