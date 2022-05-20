/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Controlador_CitaMedica;
import Controlador.Controlador_RecetaMedica;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Moisky
 */
public class Ventana_21_RegistrarRecetaMedicaEspecialista extends javax.swing.JFrame {

    private Controlador_CitaMedica citasMedicasNotificar = new Controlador_CitaMedica();
    private String especialidad;
    private Ventana_21_RegistrarRecetaMedicaEspecialista ventana;
    private JFrame ventanaAnterior;
    private String nombrePaciente;
    private String apellidoPaternoPaciente;
    private String apellidoMaternoPaciente;
    private String diagnosticoTitulo;
    private String diagnosticoDescripcion;
    public Ventana_21_RegistrarRecetaMedicaEspecialista() {
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Ventana_21_RegistrarRecetaMedicaEspecialista getVentana() {
        return ventana;
    }

    public void setVentana(Ventana_21_RegistrarRecetaMedicaEspecialista ventana) {
        this.ventana = ventana;
    }

    public JFrame getVentanaAnterior() {
        return ventanaAnterior;
    }

    public void setVentanaAnterior(JFrame ventanaAnterior) {
        this.ventanaAnterior = ventanaAnterior;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getApellidoPaternoPaciente() {
        return apellidoPaternoPaciente;
    }

    public void setApellidoPaternoPaciente(String apellidoPaternoPaciente) {
        this.apellidoPaternoPaciente = apellidoPaternoPaciente;
    }

    public String getApellidoMaternoPaciente() {
        return apellidoMaternoPaciente;
    }

    public void setApellidoMaternoPaciente(String apellidoMaternoPaciente) {
        this.apellidoMaternoPaciente = apellidoMaternoPaciente;
    }

    public String getDiagnosticoTitulo() {
        return diagnosticoTitulo;
    }

    public void setDiagnosticoTitulo(String diagnosticoTitulo) {
        this.diagnosticoTitulo = diagnosticoTitulo;
    }

    public String getDiagnosticoDescripcion() {
        return diagnosticoDescripcion;
    }

    public void setDiagnosticoDescripcion(String diagnosticoDescripcion) {
        this.diagnosticoDescripcion = diagnosticoDescripcion;
    }

    
    public void iniciar(String nombre){
        this.initComponents();
        this.numeroCitas.setText(citasMedicasNotificar.numeroCitaMedicasPendientes());
        this.nombreOcupacion.setText(nombre);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LogoEM = new javax.swing.JLabel();
        nomEmpresaCliente1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        LogoST = new javax.swing.JLabel();
        Separador1 = new javax.swing.JSeparator();
        Separador2 = new javax.swing.JSeparator();
        Version = new javax.swing.JLabel();
        Softeam = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Separador5 = new javax.swing.JSeparator();
        Separador4 = new javax.swing.JSeparator();
        Separador3 = new javax.swing.JSeparator();
        Separador6 = new javax.swing.JSeparator();
        Separador7 = new javax.swing.JSeparator();
        nombreOcupacion = new javax.swing.JLabel();
        correoElectronico = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        numeroCitas = new javax.swing.JLabel();
        TxtRegistrar1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        txtContraseña = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtUsuario8 = new javax.swing.JLabel();
        txtUsuario7 = new javax.swing.JLabel();
        dia = new javax.swing.JComboBox<>();
        mes = new javax.swing.JComboBox<>();
        txtUsuario1 = new javax.swing.JLabel();
        txtUsuario3 = new javax.swing.JLabel();
        año = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoEM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/T3.2.png"))); // NOI18N
        jPanel2.add(LogoEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        nomEmpresaCliente1.setFont(new java.awt.Font("SF UI Text", 0, 18)); // NOI18N
        nomEmpresaCliente1.setForeground(new java.awt.Color(255, 255, 255));
        nomEmpresaCliente1.setText("ESPECIALIDADES MÉDICAS");
        jPanel2.add(nomEmpresaCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 500));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoST.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/T2.9.png"))); // NOI18N
        jPanel3.add(LogoST, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel3.add(Separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));
        jPanel3.add(Separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        Version.setBackground(new java.awt.Color(102, 102, 102));
        Version.setFont(new java.awt.Font("SF UI Text", 0, 10)); // NOI18N
        Version.setForeground(new java.awt.Color(102, 102, 102));
        Version.setText("VERSION 0.1");
        jPanel3.add(Version, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        Softeam.setFont(new java.awt.Font("SF UI Text", 0, 10)); // NOI18N
        Softeam.setForeground(new java.awt.Color(102, 102, 102));
        Softeam.setText("SOFTEAM");
        jPanel3.add(Softeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, -1, -1));

        jButton3.setText("REGISTRAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 160, 60));
        jPanel3.add(Separador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));
        jPanel3.add(Separador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));
        jPanel3.add(Separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));
        jPanel3.add(Separador6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));
        jPanel3.add(Separador7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        nombreOcupacion.setFont(new java.awt.Font("SF UI Text", 1, 22)); // NOI18N
        nombreOcupacion.setText("REGISTRAR");
        jPanel3.add(nombreOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        correoElectronico.setBackground(new java.awt.Color(255, 255, 255));
        correoElectronico.setFont(new java.awt.Font("SF UI Text", 1, 12)); // NOI18N
        correoElectronico.setForeground(new java.awt.Color(190, 190, 190));
        correoElectronico.setBorder(null);
        correoElectronico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                correoElectronicoMousePressed(evt);
            }
        });
        jPanel3.add(correoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 160, -1));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 190, 0));

        jPanel5.setBackground(new java.awt.Color(174, 175, 195));
        jPanel5.setForeground(new java.awt.Color(174, 175, 195));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numeroCitas.setForeground(new java.awt.Color(255, 255, 255));
        numeroCitas.setText("Hay 0 citas Pendientes A Revisar");
        jPanel5.add(numeroCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 220, 30));

        TxtRegistrar1.setFont(new java.awt.Font("SF UI Text", 1, 22)); // NOI18N
        TxtRegistrar1.setText("REGISTRAR");
        jPanel3.add(TxtRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 190, 10));

        descripcion.setBackground(new java.awt.Color(255, 255, 255));
        descripcion.setColumns(20);
        descripcion.setRows(5);
        jScrollPane1.setViewportView(descripcion);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 190, 160));

        txtContraseña.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtContraseña.setText("DESCRIPCION");
        jPanel3.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("SF UI Text", 1, 12)); // NOI18N
        titulo.setForeground(new java.awt.Color(190, 190, 190));
        titulo.setBorder(null);
        titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tituloMousePressed(evt);
            }
        });
        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });
        jPanel3.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 130, -1));

        txtUsuario.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtUsuario.setText("TITULO");
        jPanel3.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 180, 10));

        txtUsuario8.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtUsuario8.setText("FECHA ");
        jPanel3.add(txtUsuario8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        txtUsuario7.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtUsuario7.setText("DIA");
        jPanel3.add(txtUsuario7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel3.add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" }));
        jPanel3.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        txtUsuario1.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtUsuario1.setText("MES");
        jPanel3.add(txtUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        txtUsuario3.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtUsuario3.setText("AÑO");
        jPanel3.add(txtUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032" }));
        jPanel3.add(año, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 450, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.ventanaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        Ventana_16_NotificacionesEspecialista administrar = new Ventana_16_NotificacionesEspecialista();
        administrar.setVentana(administrar);
        administrar.setVentanaAnterior(this.ventana);
        administrar.iniciar(nombreOcupacion.getText());
        administrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel5MousePressed

    private void correoElectronicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoElectronicoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoElectronicoMousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.guardar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMousePressed

    }//GEN-LAST:event_tituloMousePressed

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloActionPerformed
    public void guardar(){
        if (!"".equals(dia.getSelectedItem().toString()))
            if (!"".equals(mes.getSelectedItem().toString()))
                if (!"".equals(año.getSelectedItem().toString()))
                        if (!"".equals(descripcion.getText())) {
                            Controlador.Controlador_RecetaMedica recetasMedicas = new Controlador_RecetaMedica();
                            recetasMedicas.guardar(diagnosticoTitulo, descripcion.getText(),dia.getSelectedItem().toString(),mes.getSelectedItem().toString(),año.getSelectedItem().toString(),nombrePaciente,apellidoPaternoPaciente,apellidoMaternoPaciente);
                            JOptionPane.showMessageDialog(null, "Se ha guardado receta medica con exito");
                            Ventana_22_ReporteEspecialista reporte = new Ventana_22_ReporteEspecialista();
                            reporte.setVentana(reporte);
                            reporte.setNombrePaciente(nombrePaciente);
                            reporte.setApellidoPaternoPaciente(apellidoPaternoPaciente);
                            reporte.setApellidoMaternoPaciente(apellidoMaternoPaciente);
                            reporte.setDiagnosticoPaciente(diagnosticoDescripcion);
                            reporte.setTituloRecetaMedica(diagnosticoTitulo);
                            reporte.setRecetaMedica( descripcion.getText());
                            reporte.setVentanaAnterior(this.ventana);
                            reporte.setDia(dia.getSelectedItem().toString());
                            reporte.setMes(mes.getSelectedItem().toString());
                            reporte.setAño(año.getSelectedItem().toString());
                            reporte.iniciar(nombreOcupacion.getText());
                            reporte.setVisible(true);
                            this.dispose();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(rootPane, "Escriba las medicinas");
                        }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Seleccione un año");
                }
            else{
                JOptionPane.showMessageDialog(rootPane, "Seleccione un mes");
            }
        else{
            JOptionPane.showMessageDialog(rootPane, "Seleccione un dia");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoEM;
    private javax.swing.JLabel LogoST;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JSeparator Separador3;
    private javax.swing.JSeparator Separador4;
    private javax.swing.JSeparator Separador5;
    private javax.swing.JSeparator Separador6;
    private javax.swing.JSeparator Separador7;
    private javax.swing.JLabel Softeam;
    private javax.swing.JLabel TxtRegistrar1;
    private javax.swing.JLabel Version;
    private javax.swing.JComboBox<String> año;
    private javax.swing.JTextField correoElectronico;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JLabel nomEmpresaCliente1;
    private javax.swing.JLabel nombreOcupacion;
    private javax.swing.JLabel numeroCitas;
    private javax.swing.JTextField titulo;
    private javax.swing.JLabel txtContraseña;
    private javax.swing.JLabel txtUsuario;
    private javax.swing.JLabel txtUsuario1;
    private javax.swing.JLabel txtUsuario3;
    private javax.swing.JLabel txtUsuario7;
    private javax.swing.JLabel txtUsuario8;
    // End of variables declaration//GEN-END:variables
}
