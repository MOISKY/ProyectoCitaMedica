package Vista;

import Conexion.Conexion;
import Controlador.Controlador_CitaMedica;
import Controlador.Controlador_Usuario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ventana_03_Especialista extends javax.swing.JFrame {
    private Controlador_CitaMedica citasMedicasNotificar = new Controlador_CitaMedica();
    private Controlador_CitaMedica citasMedicas = new Controlador_CitaMedica();
    private String especialidad;
    private Conexion conexion = new Conexion();
    private Ventana_03_Especialista ventana;
    private JFrame ventanaAnterior;
    public Ventana_03_Especialista() {
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
        nombreOcupacion = new javax.swing.JLabel();
        Separador1 = new javax.swing.JSeparator();
        Separador2 = new javax.swing.JSeparator();
        Version = new javax.swing.JLabel();
        Softeam = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        numeroCitas = new javax.swing.JLabel();

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
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 500));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoST.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/T2.9.png"))); // NOI18N
        jPanel3.add(LogoST, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        nombreOcupacion.setFont(new java.awt.Font("SF UI Text", 1, 22)); // NOI18N
        nombreOcupacion.setText("ESPECIALISTA");
        jPanel3.add(nombreOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));
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

        jButton1.setText("CONSULTAR PACIENTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 200, 80));

        jButton3.setText("CONSULTAR HISTORIAL PACIENTE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 200, 80));

        jButton4.setText("CONSULTAR CITAS MEDICAS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 200, 90));

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

    public Ventana_03_Especialista getVentana() {
        return ventana;
    }

    public void setVentana(Ventana_03_Especialista ventana) {
        this.ventana = ventana;
    }

    public JFrame getVentanaAnterior() {
        return ventanaAnterior;
    }

    public void setVentanaAnterior(JFrame ventanaAnterior) {
        this.ventanaAnterior = ventanaAnterior;
    }
    public void iniciar(String nombre,String especialidad){
        this.initComponents();
        this.numeroCitas.setText(citasMedicasNotificar.numeroCitaMedicasPendientes());
        this.nombreOcupacion.setText(nombre);
        this.especialidad = especialidad;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Ventana_09_ConsultarPacienteEspecialista citaMedica = new Ventana_09_ConsultarPacienteEspecialista();
        citaMedica.setVentana(citaMedica);
        citaMedica.setVentanaAnterior(this.ventana);
        citaMedica.iniciar(nombreOcupacion.getText(),this.especialidad);
        citaMedica.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Ventana_07_ConsultarHistorialEspecialista historial = new Ventana_07_ConsultarHistorialEspecialista();
        historial.setVentana(historial);
        historial.setVentanaAnterior(this.ventana);
        historial.iniciar(nombreOcupacion.getText());
        historial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Ventana_08_ConsultarCitaMedicaEspecialista citaMedica = new Ventana_08_ConsultarCitaMedicaEspecialista();
        citaMedica.setVentana(citaMedica);
        citaMedica.setVentanaAnterior(this.ventana);
        citaMedica.iniciar(nombreOcupacion.getText(),this.especialidad);
        citaMedica.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoEM;
    private javax.swing.JLabel LogoST;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JLabel Softeam;
    private javax.swing.JLabel Version;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel nomEmpresaCliente1;
    private javax.swing.JLabel nombreOcupacion;
    private javax.swing.JLabel numeroCitas;
    // End of variables declaration//GEN-END:variables
}
