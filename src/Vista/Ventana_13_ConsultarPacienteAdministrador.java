/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Conexion.Conexion;
import Controlador.Controlador_CitaMedica;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Moisky
 */
public class Ventana_13_ConsultarPacienteAdministrador extends javax.swing.JFrame {
    private int numeroFilas = 0;
    private Controlador_CitaMedica citasMedicasNotificar = new Controlador_CitaMedica();
    private DefaultTableModel modelo;
    private Conexion usuarios = new Conexion();
    private Connection conexion = usuarios.getConexion();
    private JFrame ventana;
    private JFrame ventanaAnterior;
    public Ventana_13_ConsultarPacienteAdministrador() {
    }

    public JFrame getVentana() {
        return ventana;
    }

    public void setVentana(JFrame ventana) {
        this.ventana = ventana;
    }

    public JFrame getVentanaAnterior() {
        return ventanaAnterior;
    }

    public void setVentanaAnterior(JFrame ventanaAnterior) {
        this.ventanaAnterior = ventanaAnterior;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nomEmpresaClient = new javax.swing.JLabel();
        nomEmpresaCliente1 = new javax.swing.JLabel();
        logoEmpresaCliente = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        nombreOcupacion = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        nombreOcupacion1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        botonEliminar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        busqueda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(174, 175, 195));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomEmpresaClient.setFont(new java.awt.Font("SF UI Text", 1, 13)); // NOI18N
        nomEmpresaClient.setForeground(new java.awt.Color(255, 255, 255));
        nomEmpresaClient.setText("ESPECIALIDADES");
        jPanel2.add(nomEmpresaClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        nomEmpresaCliente1.setFont(new java.awt.Font("SF UI Text", 1, 13)); // NOI18N
        nomEmpresaCliente1.setForeground(new java.awt.Color(255, 255, 255));
        nomEmpresaCliente1.setText("MEDICAS");
        jPanel2.add(nomEmpresaCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        logoEmpresaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoC.png"))); // NOI18N
        jPanel2.add(logoEmpresaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jButton3.setText("REGRESAR A PANTALLA ANTERIOR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 230, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 730));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreOcupacion.setFont(new java.awt.Font("SF UI Text", 1, 24)); // NOI18N
        nombreOcupacion.setText("Bienvenido + Nombre Asistente");
        jPanel3.add(nombreOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        tipo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nombre", "apellidoPaterno", "apellidoMaterno" }));
        jPanel3.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 110, 30));

        jButton7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton7.setText("BUSCAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 120, 50));

        nombreOcupacion1.setFont(new java.awt.Font("SF UI Text", 1, 24)); // NOI18N
        nombreOcupacion1.setText("CONSULTAR CITA MEDICA");
        jPanel3.add(nombreOcupacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 1010, -1));

        botonEliminar.setText("ELIMINAR");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 200, 80));

        botonModificar.setText("MODIFICAR");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        jPanel3.add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 560, 200, 80));
        jPanel3.add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 255, 28));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1070, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1310, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed

        try {
            this.modificarRegistro();
        } catch (SQLException ex) {
            Logger.getLogger(Ventana_13_ConsultarPacienteAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed

        this.eliminarRegistro();
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.ventanaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (!"".equals(busqueda.getText())) {
            if ("nombre".equals(tipo.getSelectedItem().toString())) {
                this.recargar("nombrePaciente", busqueda.getText());
                this.botonEliminar.setEnabled(true);
                this.botonModificar.setEnabled(true);
            } else if ("apellidoPaterno".equals(tipo.getSelectedItem().toString())) {
                this.recargar("apellidoPaterno", busqueda.getText());
                this.botonEliminar.setEnabled(true);
            } else if ("apellidoMaterno".equals(tipo.getSelectedItem().toString())) {
                this.recargar("apellidoMaterno", busqueda.getText());
                this.botonEliminar.setEnabled(true);
                this.botonModificar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Seleccione un tipo de busqueda");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Ingrese palabra a buscar");
        }
    }//GEN-LAST:event_jButton7ActionPerformed
    public void modificarRegistro() throws SQLException{
        for (int i = 0; i < this.numeroFilas; i++) {
            modificar(i);
        }
    }
    public void modificar(int fila){
        String id = this.tabla.getValueAt(fila, 0).toString();
        String nombre = this.tabla.getValueAt(fila, 1).toString();
        String apellidoPaterno = this.tabla.getValueAt(fila, 2).toString();
        String apellidoMaterno = this.tabla.getValueAt(fila, 3).toString();
        String edad = this.tabla.getValueAt(fila, 4).toString();
        String sexo = this.tabla.getValueAt(fila, 5).toString();
        String estatura = this.tabla.getValueAt(fila, 6).toString();
        String curp = this.tabla.getValueAt(fila, 7).toString();
        String dni = this.tabla.getValueAt(fila, 8).toString();
        try {
            PreparedStatement ps = conexion.prepareStatement("update paciente set nombre='"+nombre+"', apellidoPaterno='"+apellidoPaterno+"',apellidoMaterno='"+apellidoMaterno+"',edad='"+edad+"',sexo='"+sexo+"',estatura='"+estatura+"',curp='"+curp+"',dni='"+dni+"' where id= '" + id +"'");
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se han modificado los datos");
        } catch (SQLException ex) {
            Logger.getLogger(Ventana_13_ConsultarPacienteAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarRegistro(){
        try{
            int fila = tabla.getSelectedRow();
            String sql = "delete from paciente where id =" + tabla.getValueAt(fila, 0);
            Statement st = conexion.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Paciente eliminado Satisfactoriamente");
            }
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar paciente"+e);
        }
    }
    public void cargar(){
        String[] informacionPedido = {"id","nombre","apellidoPaterno","apellidoMaterno","edad","sexo","estatura","curp","dni"};
        String[] registros = new String[50];
        String sql ="SELECT *FROM paciente";
        modelo = new DefaultTableModel(null,informacionPedido);
        Conexion conexion = new Conexion();
        Connection conexion1 = conexion.getConexion();
        try{
            Statement st = (Statement) conexion1.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("id");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("apellidoPaterno");
                registros[3] = rs.getString("apellidoMaterno");
                registros[4] = rs.getString("edad");
                registros[5] = rs.getString("sexo");
                registros[6] = rs.getString("estatura");
                registros[7] = rs.getString("curp");
                registros[8] = rs.getString("dni");
                modelo.addRow(registros);
                this.numeroFilas ++;
            }
            tabla.setModel(modelo);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
     }
    public void iniciar(String nombre){
        this.initComponents();
        this.nombreOcupacion.setText(nombre);
    }
    public void recargar(String texto,String buscar){
        String[] informacionPedido = {"id","nombre","apellidoPaterno","apellidoMaterno","edad","sexo","estatura","curp","dni"};
        String[] registros = new String[50];
        String sql ="SELECT id,nombre,apellidoPaterno,apellidoMaterno,edad,sexo,estatura,curp,dni FROM paciente WHERE "+texto+" = '" + buscar + "'";
        modelo = new DefaultTableModel(null,informacionPedido);
        Conexion conexion = new Conexion();
        Connection conexion1 = conexion.getConexion();
        try{
            Statement st = (Statement) conexion1.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("id");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("apellidoPaterno");
                registros[3] = rs.getString("apellidoMaterno");
                registros[4] = rs.getString("edad");
                registros[5] = rs.getString("sexo");
                registros[6] = rs.getString("estatura");
                registros[7] = rs.getString("curp");
                registros[8] = rs.getString("dni");
                modelo.addRow(registros);
            }
            tabla.setModel(modelo);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField busqueda;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logoEmpresaCliente;
    private javax.swing.JLabel nomEmpresaClient;
    private javax.swing.JLabel nomEmpresaCliente1;
    private javax.swing.JLabel nombreOcupacion;
    private javax.swing.JLabel nombreOcupacion1;
    private javax.swing.JTable tabla;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
