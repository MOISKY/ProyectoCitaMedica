package Controlador;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
public class Controlador_CitaMedica{
    private ArrayList<CitaMedica> citasMedicas = new ArrayList<>();
    public static Conexion conexion = new Conexion();
    public static PreparedStatement sentencia_Preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    
    public int guardar(String dia,String mes,String año,String especialidad,String horaInicio,String minutosInicio,String horaFinal,String minutosFinal,String nombrePaciente,String apellidoPaternoPaciente,String apellidoMaternoPaciente,String estado){
        int resultado = 0;
        Connection cn = null;
        String sentenciaGuardar = "INSERT INTO citamedica(dia,mes,año,especialidad,horaInicio,minutosInicio,horaFinal,minutosFinal,nombrePaciente,apellidoPaternoPaciente,apellidoMaternoPaciente,estadoCitaMedica) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            cn = conexion.getConexion();
            sentencia_Preparada = cn.prepareStatement(sentenciaGuardar);
            sentencia_Preparada.setString(1, dia);
            sentencia_Preparada.setString(2, mes);
            sentencia_Preparada.setString(3, año);
            sentencia_Preparada.setString(4, especialidad);
            sentencia_Preparada.setString(5, horaInicio);
            sentencia_Preparada.setString(6, minutosInicio);
            sentencia_Preparada.setString(7, horaFinal);
            sentencia_Preparada.setString(8, minutosFinal);
            sentencia_Preparada.setString(9, nombrePaciente);
            sentencia_Preparada.setString(10, apellidoPaternoPaciente);
            sentencia_Preparada.setString(11, apellidoMaternoPaciente);
            sentencia_Preparada.setString(12, estado);
            resultado = sentencia_Preparada.executeUpdate();
            sentencia_Preparada.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        return resultado;
    }
    
    public String numeroCitaMedicasRealizadas(){
        int citasMedicas = 0;
        String sql ="SELECT dia,mes,año,especialidad,horaInicio,minutosInicio,horaFinal,minutosFinal,nombrePaciente,apellidoPaternoPaciente,apellidoMaternoPaciente,estadoCitaMedica FROM citamedica WHERE estadoCitaMedica = 'realizada'";
        Connection conexion1 = conexion.getConexion();
        try{
            Statement st = (Statement) conexion1.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                citasMedicas ++;
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return "Hay " +citasMedicas+ " citas pendientes a revisar";
     }
    
    public String numeroCitaMedicasPendientes(){
        int citasMedicas = 0;
        String sql ="SELECT dia,mes,año,especialidad,horaInicio,minutosInicio,horaFinal,minutosFinal,nombrePaciente,apellidoPaternoPaciente,apellidoMaternoPaciente,estadoCitaMedica FROM citamedica WHERE estadoCitaMedica = 'pendiente'";
        Connection conexion1 = conexion.getConexion();
        try{
            Statement st = (Statement) conexion1.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                citasMedicas ++;
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return "Hay " +citasMedicas+ " citas pendientes a revisar";
     }
    public void setCitaMedicas(){
        String sql ="SELECT *FROM citamedica";
        Conexion conexion = new Conexion();
        Connection conexion1 = conexion.getConexion();
        try{
            Statement st = (Statement) conexion1.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                citasMedicas.add(new CitaMedica(rs.getString("dia"), rs.getString("mes"), rs.getString("año"), rs.getString("especialidad"), rs.getString("horaInicio"), rs.getString("minutosInicio"), rs.getString("horaFinal"), rs.getString("minutosFinal")));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public ArrayList<CitaMedica> getCitaMedicas(){
        return citasMedicas;
    }
}