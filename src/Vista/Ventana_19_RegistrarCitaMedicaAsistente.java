/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Controlador_CitaMedica;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Moisky
 */
public class Ventana_19_RegistrarCitaMedicaAsistente extends javax.swing.JFrame {

    private Controlador_CitaMedica citasMedicasNotificar = new Controlador_CitaMedica();
    private Ventana_19_RegistrarCitaMedicaAsistente ventana;
    private JFrame ventanaAnterior;
    private String nombrePacientev;
    private String apellidoPaternoPacientev;
    private String apellidoMaternoPacientev;
    private String estadov;
    public Ventana_19_RegistrarCitaMedicaAsistente(String nombrePacientev,String apellidoPaternoPacientev,String apellidoMaternoPacientev) {
        this.nombrePacientev = nombrePacientev;
        this.apellidoPaternoPacientev = apellidoPaternoPacientev;
        this.apellidoMaternoPacientev = apellidoMaternoPacientev;
        this.estadov = "pendiente";
    }

    public Ventana_19_RegistrarCitaMedicaAsistente getVentana() {
        return ventana;
    }

    public void setVentana(Ventana_19_RegistrarCitaMedicaAsistente ventana) {
        this.ventana = ventana;
    }

    public JFrame getVentanaAnterior() {
        return ventanaAnterior;
    }

    public void setVentanaAnterior(JFrame ventanaAnterior) {
        this.ventanaAnterior = ventanaAnterior;
    }

    public String getNombrePacientev() {
        return nombrePacientev;
    }

    public void setNombrePacientev(String nombrePacientev) {
        this.nombrePacientev = nombrePacientev;
    }

    public String getApellidoPaternoPacientev() {
        return apellidoPaternoPacientev;
    }

    public void setApellidoPaternoPacientev(String apellidoPaternoPacientev) {
        this.apellidoPaternoPacientev = apellidoPaternoPacientev;
    }

    public String getApellidoMaternoPacientev() {
        return apellidoMaternoPacientev;
    }

    public void setApellidoMaternoPacientev(String apellidoMaternoPacientev) {
        this.apellidoMaternoPacientev = apellidoMaternoPacientev;
    }

    public String getEstadov() {
        return estadov;
    }

    public void setEstadov(String estadov) {
        this.estadov = estadov;
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
        jSeparator9 = new javax.swing.JSeparator();
        TxtRegistrar1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        numeroCitas = new javax.swing.JLabel();
        dia = new javax.swing.JComboBox<>();
        mes = new javax.swing.JComboBox<>();
        año = new javax.swing.JComboBox<>();
        especialidad = new javax.swing.JComboBox<>();
        horaInicio = new javax.swing.JComboBox<>();
        minutosInicio = new javax.swing.JComboBox<>();
        horaFinal = new javax.swing.JTextField();
        minutosFinal = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JLabel();
        txtUsuario1 = new javax.swing.JLabel();
        txtUsuario2 = new javax.swing.JLabel();
        txtUsuario3 = new javax.swing.JLabel();
        txtUsuario4 = new javax.swing.JLabel();
        txtUsuario5 = new javax.swing.JLabel();
        txtUsuario6 = new javax.swing.JLabel();
        txtUsuario7 = new javax.swing.JLabel();
        txtUsuario8 = new javax.swing.JLabel();
        txtUsuario9 = new javax.swing.JLabel();
        txtUsuario10 = new javax.swing.JLabel();

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
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 60));

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
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 110, 50));
        jPanel3.add(Separador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));
        jPanel3.add(Separador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));
        jPanel3.add(Separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));
        jPanel3.add(Separador6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));
        jPanel3.add(Separador7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        nombreOcupacion.setFont(new java.awt.Font("SF UI Text", 1, 22)); // NOI18N
        nombreOcupacion.setText("REGISTRAR");
        jPanel3.add(nombreOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 190, 0));

        TxtRegistrar1.setFont(new java.awt.Font("SF UI Text", 1, 22)); // NOI18N
        TxtRegistrar1.setText("REGISTRAR");
        jPanel3.add(TxtRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

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

        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel3.add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" }));
        jPanel3.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032" }));
        jPanel3.add(año, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        especialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cardiologia", "neurologia", "nefrologia", "medicina interna", "vascular", "metabolismo", "nutricion" }));
        jPanel3.add(especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        horaInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        horaInicio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                horaInicioItemStateChanged(evt);
            }
        });
        jPanel3.add(horaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        minutosInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "20", "40" }));
        minutosInicio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                minutosInicioItemStateChanged(evt);
            }
        });
        minutosInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minutosInicioActionPerformed(evt);
            }
        });
        jPanel3.add(minutosInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        horaFinal.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(horaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 90, -1));

        minutosFinal.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(minutosFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 100, -1));

        txtUsuario.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtUsuario.setText("ESPECIALIDAD");
        jPanel3.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        txtUsuario1.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtUsuario1.setText("MES");
        jPanel3.add(txtUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        txtUsuario2.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtUsuario2.setText("MINUTOS");
        jPanel3.add(txtUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        txtUsuario3.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtUsuario3.setText("AÑO");
        jPanel3.add(txtUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        txtUsuario4.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtUsuario4.setText("MINUTOS FINAL");
        jPanel3.add(txtUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 100, -1));

        txtUsuario5.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtUsuario5.setText("HORA ");
        jPanel3.add(txtUsuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        txtUsuario6.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtUsuario6.setText("HORA FINAL");
        jPanel3.add(txtUsuario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        txtUsuario7.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtUsuario7.setText("DIA");
        jPanel3.add(txtUsuario7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtUsuario8.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtUsuario8.setText("FECHA ");
        jPanel3.add(txtUsuario8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        txtUsuario9.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtUsuario9.setText("HORA DE CITA MEDICA");
        jPanel3.add(txtUsuario9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        txtUsuario10.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtUsuario10.setText("HORA DE FINALIZACION DE CITA MEDICA");
        jPanel3.add(txtUsuario10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.guardar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        Ventana_17_NotificacionesAsistente administrar = new Ventana_17_NotificacionesAsistente();
        administrar.setVentana(administrar);
        administrar.setVentanaAnterior(this.ventana);
        administrar.iniciar(nombreOcupacion.getText());
        administrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel5MousePressed

    private void horaInicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_horaInicioItemStateChanged

    }//GEN-LAST:event_horaInicioItemStateChanged

    private void minutosInicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_minutosInicioItemStateChanged

        if ("0".equals(this.minutosInicio.getSelectedItem().toString())) {
            this.horaFinal.setText(this.horaInicio.getSelectedItem().toString());
            this.minutosFinal.setText("20");
        } else if ("20".equals(this.minutosInicio.getSelectedItem().toString())) {
            this.horaFinal.setText(this.horaInicio.getSelectedItem().toString());
            this.minutosFinal.setText("40");
        }else if ("40".equals(this.minutosInicio.getSelectedItem().toString())) {
            this.horaFinal.setText(String.valueOf(Integer.parseInt(this.horaInicio.getSelectedItem().toString())+1));
            this.minutosFinal.setText("0");
        }
    }//GEN-LAST:event_minutosInicioItemStateChanged

    private void minutosInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minutosInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minutosInicioActionPerformed
public void guardar(){
        String dia = this.dia.getSelectedItem().toString();
        String mes = this.mes.getSelectedItem().toString();
        String año = this.año.getSelectedItem().toString();
        String horaInicio = this.horaInicio.getSelectedItem().toString();
        String minutosInicio = this.minutosInicio.getSelectedItem().toString();
        String horaFinal = this.horaFinal.getText();
        String minutosFinal = this.minutosFinal.getText();
        String especialidad = this.especialidad.getSelectedItem().toString();
        if (dia != null) 
            if (mes != null)
                if (año != null)
                    if (horaInicio != null) 
                        if (minutosInicio != null)
                            if (horaFinal != null)
                                if (minutosFinal != null)
                                    if (especialidad != null) {
                                        this.verificarCita(dia, mes, año, especialidad, horaInicio, minutosInicio, horaFinal, minutosFinal, nombrePacientev, apellidoPaternoPacientev, apellidoMaternoPacientev, estadov);
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(rootPane,"Selecciona Especialidad");
                                    }
                                else{
                                    JOptionPane.showMessageDialog(rootPane, "Selcciona minutos finales");
                                }
                            else{
                                JOptionPane.showMessageDialog(rootPane, "Selecciona hora final");
                            }
                        else{
                            JOptionPane.showMessageDialog(rootPane, "Selecciona minutos iniciales");
                        }
                    else{
                        JOptionPane.showMessageDialog(rootPane, "Selecciona hora Inicial");
                    }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Selecciona año");
                }
            else{
                JOptionPane.showMessageDialog(rootPane, "Selecciona mes");
            }
        else{
            JOptionPane.showMessageDialog(rootPane, "Selecciona dia");
        }
    }
    public void limpiar(){
        dia.setSelectedIndex(0);
        mes.setSelectedIndex(0);
        año.setSelectedIndex(0);
        horaInicio.setSelectedIndex(0);
        horaFinal.setText("");
        minutosInicio.setSelectedIndex(0);
        minutosFinal.setText("");
    }
    public void iniciar(String nombre){
        this.initComponents();
        this.numeroCitas.setText(citasMedicasNotificar.numeroCitaMedicasRealizadas());
        this.nombreOcupacion.setText(nombre);
        this.citasMedicasNotificar.setCitaMedicas();
    }
    public void verificarCita(String dia, String mes,String año,String especialidad, String horaInicio,String minutosInicio,String horaFinal,String minutosFinal,String nombrePaciente,String apellidoPaternoPaciente,String apellidoMaternoPaciente,String estado){
        boolean encontrar = false;
        for (int i = 0; i < citasMedicasNotificar.getCitaMedicas().size(); i++) {
            String diaCita = citasMedicasNotificar.getCitaMedicas().get(i).getDia();
            String mesCita = citasMedicasNotificar.getCitaMedicas().get(i).getMes();
            String añoCita = citasMedicasNotificar.getCitaMedicas().get(i).getAño();
            String horaInicioCita = citasMedicasNotificar.getCitaMedicas().get(i).getHoraInicio();
            String minutosInicioCita = citasMedicasNotificar.getCitaMedicas().get(i).getMinutosInicio();
            String horaFinalCita = citasMedicasNotificar.getCitaMedicas().get(i).getHoraFinal();
            String minutosFinalCita = citasMedicasNotificar.getCitaMedicas().get(i).getMinutosFinal();
            String especialidadCita = citasMedicasNotificar.getCitaMedicas().get(i).getEspecialidad();
            if ((!dia.equals(diaCita)) && (!mes.equals(mesCita)) && (!año.equals(añoCita)) && (!horaInicio.equals(horaInicioCita)) && (!minutosInicio.equals(minutosInicioCita)) && (!horaFinal.equals(horaFinalCita)) && (!minutosFinal.equals(minutosFinalCita)) && (!especialidad.equals(especialidadCita))) {
                encontrar = true;
            }
            else{
                encontrar = false;
            }
        }
        if (encontrar == true) {
            this.abrir(dia, mes, año, especialidad, horaInicio, minutosInicio, horaFinal, minutosFinal, nombrePaciente, apellidoPaternoPaciente, apellidoMaternoPaciente, estado);
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Cita Medica ya registrada verifique su formulario");
        }
    }
    public void abrir(String dia, String mes,String año,String especialidad, String horaInicio,String minutosInicio,String horaFinal,String minutosFinal,String nombrePaciente,String apellidoPaternoPaciente,String apellidoMaternoPaciente,String estado){
        int confirmar = JOptionPane.showConfirmDialog(rootPane, "CONFIRMAR CITA MEDICA");
        if (confirmar == 0) {
            Controlador_CitaMedica citasMedicas = new Controlador_CitaMedica();
            citasMedicas.guardar(dia, mes, año, especialidad, horaInicio, minutosInicio, horaFinal, minutosFinal, nombrePaciente, apellidoPaternoPaciente, apellidoMaternoPaciente, estado);
            JOptionPane.showMessageDialog(rootPane, "Se ha registrado su cita con exito");
            Ventana_05_ConsultarCitaMedicaAsistente verCitaMedica = new Ventana_05_ConsultarCitaMedicaAsistente();
            verCitaMedica.setVentana(verCitaMedica);
            verCitaMedica.setVentanaAnterior(this.ventana);
            verCitaMedica.iniciar(nombreOcupacion.getText());
            verCitaMedica.setVisible(true);
            this.dispose();
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
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JComboBox<String> especialidad;
    private javax.swing.JTextField horaFinal;
    private javax.swing.JComboBox<String> horaInicio;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JTextField minutosFinal;
    private javax.swing.JComboBox<String> minutosInicio;
    private javax.swing.JLabel nomEmpresaCliente1;
    private javax.swing.JLabel nombreOcupacion;
    private javax.swing.JLabel numeroCitas;
    private javax.swing.JLabel txtUsuario;
    private javax.swing.JLabel txtUsuario1;
    private javax.swing.JLabel txtUsuario10;
    private javax.swing.JLabel txtUsuario2;
    private javax.swing.JLabel txtUsuario3;
    private javax.swing.JLabel txtUsuario4;
    private javax.swing.JLabel txtUsuario5;
    private javax.swing.JLabel txtUsuario6;
    private javax.swing.JLabel txtUsuario7;
    private javax.swing.JLabel txtUsuario8;
    private javax.swing.JLabel txtUsuario9;
    // End of variables declaration//GEN-END:variables
}
