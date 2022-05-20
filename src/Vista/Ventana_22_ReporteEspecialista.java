package Vista;

import Controlador.Controlador_CitaMedica;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ventana_22_ReporteEspecialista extends javax.swing.JFrame {
    private Controlador_CitaMedica citasMedicasNotificar = new Controlador_CitaMedica();
    private String especialidad;
    private Ventana_22_ReporteEspecialista ventana;
    private JFrame ventanaAnterior;
    private String nombrePaciente;
    private String apellidoPaternoPaciente;
    private String apellidoMaternoPaciente;
    private String diagnosticoPaciente;
    private String tituloRecetaMedica;
    private String recetaMedica;
    private String dia;
    private String mes;
    private String año;
    public Ventana_22_ReporteEspecialista() {
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Ventana_22_ReporteEspecialista getVentana() {
        return ventana;
    }

    public void setVentana(Ventana_22_ReporteEspecialista ventana) {
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

    public String getDiagnosticoPaciente() {
        return diagnosticoPaciente;
    }

    public void setDiagnosticoPaciente(String diagnosticoPaciente) {
        this.diagnosticoPaciente = diagnosticoPaciente;
    }

    public String getTituloRecetaMedica() {
        return tituloRecetaMedica;
    }

    public void setTituloRecetaMedica(String tituloRecetaMedica) {
        this.tituloRecetaMedica = tituloRecetaMedica;
    }

    public String getRecetaMedica() {
        return recetaMedica;
    }

    public void setRecetaMedica(String recetaMedica) {
        this.recetaMedica = recetaMedica;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }
    public void iniciar(String nombre){
        this.initComponents();
        this.numeroCitas.setText(citasMedicasNotificar.numeroCitaMedicasPendientes());
        this.nombreOcupacion.setText(nombre);
        this.nombreTxt.setText(nombrePaciente);
        this.apellidoPaternotxt.setText(apellidoPaternoPaciente);
        this.apellidoMaternotxt.setText(apellidoMaternoPaciente);
        this.diagnosticotxt.setText(diagnosticoPaciente);
        this.tituloDiagnosticotxt.setText(tituloRecetaMedica);
        this.recetatxt.setText(recetaMedica);
        this.diaTxt.setText(dia);
        this.mesTxt.setText(mes);
        this.añoTxt.setText(año);
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
        jSeparator9 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        numeroCitas = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        apellidoPaternotxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        apellidoMaternotxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tituloDiagnosticotxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        diagnosticotxt = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        diaTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        mesTxt = new javax.swing.JTextField();
        añoTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        recetatxt = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        nombreOcupacion = new javax.swing.JLabel();
        TxtRegistrar2 = new javax.swing.JLabel();

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

        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 60));

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

        jLabel4.setText("Nombre Paciente");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        nombreTxt.setBackground(new java.awt.Color(255, 255, 255));
        nombreTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nombreTxt.setEnabled(false);
        jPanel3.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 130, -1));

        jLabel6.setText("Apellido Paterno Paciente");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        apellidoPaternotxt.setBackground(new java.awt.Color(255, 255, 255));
        apellidoPaternotxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        apellidoPaternotxt.setEnabled(false);
        jPanel3.add(apellidoPaternotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 140, -1));

        jLabel8.setText("Apellido Materno Paciente");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        apellidoMaternotxt.setBackground(new java.awt.Color(255, 255, 255));
        apellidoMaternotxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        apellidoMaternotxt.setEnabled(false);
        jPanel3.add(apellidoMaternotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 150, -1));

        jLabel9.setText("Titulo Diagnostico");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        tituloDiagnosticotxt.setBackground(new java.awt.Color(255, 255, 255));
        tituloDiagnosticotxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tituloDiagnosticotxt.setEnabled(false);
        jPanel3.add(tituloDiagnosticotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 130, -1));

        jLabel1.setText("Diagnostico Paciente");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        diagnosticotxt.setBackground(new java.awt.Color(255, 255, 255));
        diagnosticotxt.setColumns(20);
        diagnosticotxt.setRows(5);
        diagnosticotxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        diagnosticotxt.setEnabled(false);
        jScrollPane1.setViewportView(diagnosticotxt);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel11.setText("dia");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        diaTxt.setBackground(new java.awt.Color(255, 255, 255));
        diaTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(diaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 40, -1));

        jLabel12.setText("mes");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        mesTxt.setBackground(new java.awt.Color(255, 255, 255));
        mesTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(mesTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 40, 20));

        añoTxt.setBackground(new java.awt.Color(255, 255, 255));
        añoTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(añoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 40, -1));

        jLabel13.setText("año");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        recetatxt.setBackground(new java.awt.Color(255, 255, 255));
        recetatxt.setColumns(20);
        recetatxt.setRows(5);
        recetatxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        recetatxt.setEnabled(false);
        jScrollPane2.setViewportView(recetatxt);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 190, 140));

        jLabel3.setText("Receta Medica");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        nombreOcupacion.setFont(new java.awt.Font("SF UI Text", 1, 22)); // NOI18N
        nombreOcupacion.setText("REPORTE");
        jPanel3.add(nombreOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, 20));

        TxtRegistrar2.setFont(new java.awt.Font("SF UI Text", 1, 22)); // NOI18N
        TxtRegistrar2.setText("REPORTE");
        jPanel3.add(TxtRegistrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

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

        public void crearArchivo(){
        JOptionPane.showMessageDialog(rootPane, "Generando Reporte");
        try {
            FileWriter archivo = new FileWriter("Archivo.txt");
            BufferedWriter buffer = new BufferedWriter(archivo);
            String texto = "Reporte\n"+"Nombre:"+nombrePaciente+"\nApellido Paterno:"+apellidoPaternoPaciente+"\nApellido Materno"+apellidoMaternoPaciente+"\nDiagnostico\n"+"Titulo Diagnostico: "+tituloRecetaMedica+"\nDescripcion Diagnostico: "+diagnosticoPaciente+"\nReceta\n"+"dia: "+dia+"mes: "+mes+"año: "+ año+"\nMedicamentos:"+recetaMedica;
            buffer.write(texto);
            buffer.close();
        } catch (IOException ex) {
            Logger.getLogger(Ventana_22_ReporteEspecialista.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Se ha generado reporte exitosamente");
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed

    }//GEN-LAST:event_jPanel5MousePressed

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
    private javax.swing.JLabel TxtRegistrar2;
    private javax.swing.JLabel Version;
    private javax.swing.JTextField apellidoMaternotxt;
    private javax.swing.JTextField apellidoPaternotxt;
    private javax.swing.JTextField añoTxt;
    private javax.swing.JTextField diaTxt;
    private javax.swing.JTextArea diagnosticotxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField mesTxt;
    private javax.swing.JLabel nomEmpresaCliente1;
    private javax.swing.JLabel nombreOcupacion;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JLabel numeroCitas;
    private javax.swing.JTextArea recetatxt;
    private javax.swing.JTextField tituloDiagnosticotxt;
    // End of variables declaration//GEN-END:variables
}
