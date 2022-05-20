package Vista;

import Controlador.Controlador_Usuario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ventana_01_Inicio extends javax.swing.JFrame {
    private Controlador_Usuario usuarios = new Controlador_Usuario();
    private Ventana_01_Inicio ventana;
    private JFrame ventanaAnterior;
    private Ventana_02_Asistente ventanaSiguiente01 = new Ventana_02_Asistente();
    private Ventana_04_Administrador ventanaSiguiente02 = new Ventana_04_Administrador();
    private Ventana_03_Especialista ventanaSiguiente03 = new Ventana_03_Especialista();
    public Ventana_01_Inicio() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LogoEM = new javax.swing.JLabel();
        nomEmpresaCliente1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LogoST = new javax.swing.JLabel();
        TxtIniciarsesion = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        correoElectronico = new javax.swing.JTextField();
        Separador1 = new javax.swing.JSeparator();
        txtContraseña = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        Separador2 = new javax.swing.JSeparator();
        Version = new javax.swing.JLabel();
        Softeam = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 500));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoST.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/T2.9.png"))); // NOI18N
        jPanel3.add(LogoST, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        TxtIniciarsesion.setFont(new java.awt.Font("SF UI Text", 1, 22)); // NOI18N
        TxtIniciarsesion.setText("INICIAR SESIÓN");
        jPanel3.add(TxtIniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        txtUsuario.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtUsuario.setText("USUARIO");
        jPanel3.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        correoElectronico.setBackground(new java.awt.Color(255, 255, 255));
        correoElectronico.setFont(new java.awt.Font("SF UI Text", 1, 12)); // NOI18N
        correoElectronico.setForeground(new java.awt.Color(204, 204, 204));
        correoElectronico.setBorder(null);
        correoElectronico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                correoElectronicoMousePressed(evt);
            }
        });
        correoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoElectronicoActionPerformed(evt);
            }
        });
        jPanel3.add(correoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 200, -1));
        jPanel3.add(Separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        txtContraseña.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtContraseña.setText("CONTRASEÑA");
        jPanel3.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        contraseña.setBackground(new java.awt.Color(255, 255, 255));
        contraseña.setBorder(null);
        contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contraseñaMousePressed(evt);
            }
        });
        jPanel3.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 210, -1));
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
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 260, 10));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 260, 20));

        jButton3.setText("INGRESAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 160, 60));

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

    public Ventana_01_Inicio getVentana() {
        return ventana;
    }

    public void setVentana(Ventana_01_Inicio ventana) {
        this.ventana = ventana;
    }

    public JFrame getVentanaAnterior() {
        return ventanaAnterior;
    }

    public void setVentanaAnterior(JFrame ventanaAnterior) {
        this.ventanaAnterior = ventanaAnterior;
    }

    public Ventana_02_Asistente getVentanaSiguiente01() {
        return ventanaSiguiente01;
    }

    public void setVentanaSiguiente01(Ventana_02_Asistente ventanaSiguiente01) {
        this.ventanaSiguiente01 = ventanaSiguiente01;
    }

    public Ventana_04_Administrador getVentanaSiguiente02() {
        return ventanaSiguiente02;
    }

    public void setVentanaSiguiente02(Ventana_04_Administrador ventanaSiguiente02) {
        this.ventanaSiguiente02 = ventanaSiguiente02;
    }

    public Ventana_03_Especialista getVentanaSiguiente03() {
        return ventanaSiguiente03;
    }

    public void setVentanaSiguiente03(Ventana_03_Especialista ventanaSiguiente03) {
        this.ventanaSiguiente03 = ventanaSiguiente03;
    }
        public void iniciarSesion(){
       String busqueda_usuario = usuarios.BuscarUsuarioRegistrado(correoElectronico.getText(), contraseña.getText());
            if (!"".equals(correoElectronico.getText()))
                if (!"".equals(contraseña.getText())) {
                    if ("".equals(correoElectronico.getText()) == true && "".equals(contraseña.getText()) == true) {
                        JOptionPane.showMessageDialog(this, " los campos estan vacios, favor de llenarlos para continuar");
                    } 
                    else {
                        if (busqueda_usuario.equals("Usuario encontrado") == true) {
                            if ("especialista".equals(usuarios.BuscarOcupacion(correoElectronico.getText(), contraseña.getText()))) {
                                JOptionPane.showMessageDialog(this, "Bienvenido iniciaste sesion como especialista(Administrador)");
                                String especialidad = usuarios.BuscarEspecialidad(correoElectronico.getText(), contraseña.getText());
                                this.ventanaSiguiente03.setVentana(ventanaSiguiente03);
                                this.ventanaSiguiente03.setVentanaAnterior(this.ventana);
                                this.ventanaSiguiente03.iniciar( usuarios.BuscarNombreCompleto(correoElectronico.getText(), contraseña.getText()),especialidad);
                                this.ventanaSiguiente03.setVisible(true);
                                this.dispose();
                            }
                            else 
                                if ("asistente".equals(usuarios.BuscarOcupacion(correoElectronico.getText(), contraseña.getText()))) {
                                    JOptionPane.showMessageDialog(this, "Bienvenido iniciaste sesion como asistente");
                                    this.ventanaSiguiente01.setVentana(ventanaSiguiente01);
                                    this.ventanaSiguiente01.setVentanaAnterior(this.ventana);
                                    this.ventanaSiguiente01.iniciar(usuarios.BuscarNombreCompleto(correoElectronico.getText(), contraseña.getText()));
                                    this.ventanaSiguiente01.setVisible(true);
                                    this.dispose();
                            }
                                else if ("administrador".equals(usuarios.BuscarOcupacion(correoElectronico.getText(), contraseña.getText()))) {
                                    JOptionPane.showMessageDialog(this, "Bienvenido iniciaste sesion como administrador");
                                    this.ventanaSiguiente02.setVentana(ventanaSiguiente02);
                                    this.ventanaSiguiente02.setVentanaAnterior(this.ventana);
                                    this.ventanaSiguiente02.iniciar(usuarios.BuscarNombreCompleto(correoElectronico.getText(), contraseña.getText()));
                                    this.ventanaSiguiente02.setVisible(true);
                                    this.dispose();
                            } 
                        }
                        else 
                        {
                            JOptionPane.showMessageDialog(this, " Usuario no registrado, favor de darse de alta");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Ingrese la contraseña");
                }
            else {
                JOptionPane.showMessageDialog(rootPane, "Ingrese el correoElectronico");
            }
    }
    private void correoElectronicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoElectronicoMousePressed

    }//GEN-LAST:event_correoElectronicoMousePressed

    private void correoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoElectronicoActionPerformed

    private void contraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaMousePressed

    }//GEN-LAST:event_contraseñaMousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        iniciarSesion();
    }//GEN-LAST:event_jButton3ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoEM;
    private javax.swing.JLabel LogoST;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JLabel Softeam;
    private javax.swing.JLabel TxtIniciarsesion;
    private javax.swing.JLabel Version;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JTextField correoElectronico;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel nomEmpresaCliente1;
    private javax.swing.JLabel txtContraseña;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
