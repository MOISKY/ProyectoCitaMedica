package Controlador;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Controlador_Usuario{
    public static Conexion conexion = new Conexion();
    public static PreparedStatement sentencia_Preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    
    public int guardar(String correoElectronico,String nombre,String apellidoPaterno,String apellidoMaterno,String contraseña,String ocupacion,String especialidad,String estado){
        int resultado = 0;
        Connection cn = null;
        String sentenciaGuardar = "INSERT INTO usuario(correoElectronico,nombre,apellidoPaterno,apellidoMaterno,contraseña,ocupacion,especialidad,estado) VALUES(?,?,?,?,?,?,?,?)";
        try{
            cn = conexion.getConexion();
            sentencia_Preparada = cn.prepareStatement(sentenciaGuardar);
            sentencia_Preparada.setString(1, correoElectronico);
            sentencia_Preparada.setString(2, nombre);
            sentencia_Preparada.setString(3, apellidoPaterno);
            sentencia_Preparada.setString(4, apellidoMaterno);
            sentencia_Preparada.setString(5, contraseña);
            sentencia_Preparada.setString(6, ocupacion);
            sentencia_Preparada.setString(7, especialidad);
            sentencia_Preparada.setString(8, estado);
            resultado = sentencia_Preparada.executeUpdate();
            sentencia_Preparada.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        return resultado;
    }
    public static String BuscarUsuarioRegistrado(String correo,String contraseña){
            String busqueda_usuario=null;
             Connection Conexion=null;
        try{
            Connection cn=conexion.getConexion(); 
            String sentencia_buscar_usuario=("SELECT correoElectronico,nombre,apellidoPaterno,apellidoMaterno,contraseña,ocupacion,especialidad FROM usuario WHERE correoElectronico = '" + correo + "' && contraseña = '" + contraseña+ "'");
            PreparedStatement setencia_Preparada=cn.prepareStatement(sentencia_buscar_usuario);
            resultado=setencia_Preparada.executeQuery();
            if(resultado.next()){
                busqueda_usuario="Usuario encontrado";
            }else{
                busqueda_usuario="Usuario no encontrado";
            }
           
        }catch(Exception e){
                 System.out.println(e);
            }
        return busqueda_usuario;
    }
    
    public static String BuscarOcupacion(String correo,String contraseña){
            String ocupacion=null;
            Connection Conexion=null;
            try{
                Connection cn=conexion.getConexion();
               String sentencia_buscar = ("SELECT ocupacion FROM usuario WHERE correoElectronico = '" + correo + "' && contraseña = '" + contraseña+ "'");
               sentencia_Preparada =cn.prepareStatement(sentencia_buscar);
               resultado= sentencia_Preparada.executeQuery();
               if(resultado.next()){
                   ocupacion=resultado.getString("ocupacion");
                   }
            }catch(Exception e){
                 System.out.println(e);
            }
            return ocupacion;
        }
    
    public static String BuscarEspecialidad(String correo,String contraseña){
        String especialidad = null;
        Connection Conexion = null;
        try {
            Connection cn = conexion.getConexion();
            String sentencia_buscar = ("SELECT especialidad FROM usuario WHERE correoElectronico = '" + correo + "' && contraseña = '" + contraseña + "'");
            sentencia_Preparada = cn.prepareStatement(sentencia_buscar);
            resultado = sentencia_Preparada.executeQuery();
            if (resultado.next()) {
                especialidad = resultado.getString("especialidad");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return especialidad;
    }
    
        public static String BuscarNombreCompleto(String correo,String contraseña){
            String nombreCompleto = "";
            Connection Conexion=null;
            try{
                Connection cn=conexion.getConexion();
               String sentencia_buscar = ("SELECT ocupacion,nombre,apellidoPaterno,apellidoMaterno FROM usuario WHERE correoElectronico = '" + correo + "' && contraseña = '" + contraseña+ "'");
               sentencia_Preparada =cn.prepareStatement(sentencia_buscar);
               resultado= sentencia_Preparada.executeQuery();
               if(resultado.next()){
                   nombreCompleto += resultado.getString("ocupacion");
                   nombreCompleto += " ";
                   nombreCompleto +=resultado.getString("nombre");
                   nombreCompleto +=" ";
                   nombreCompleto += resultado.getString("apellidoPaterno");
                   nombreCompleto +=" ";
                   nombreCompleto += resultado.getString("apellidoMaterno");
                   }
            }catch(Exception e){
                 System.out.println(e);
            }
            return nombreCompleto;
        }
    public String numeroUsuariosNuevos() {
        int citasMedicas = 0;
        String sql = "SELECT nombre,apellidoPaterno,apellidoMaterno FROM usuario WHERE estado = 'nuevo'";
        Connection conexion1 = conexion.getConexion();
        try {
            Statement st = (Statement) conexion1.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                citasMedicas++;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return "Hay " + citasMedicas + " usuarios nuevos";
    }
}