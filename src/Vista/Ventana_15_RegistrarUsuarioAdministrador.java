package Vista;

import Controlador.Controlador_Usuario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ventana_15_RegistrarUsuarioAdministrador extends javax.swing.JFrame {
    private Character caracter;
    private boolean bandera = false;
    private Controlador_Usuario usuarios = new Controlador_Usuario();
    private Ventana_01_Inicio ventanaSiguiente = new Ventana_01_Inicio();
    private Ventana_15_RegistrarUsuarioAdministrador ventana;
    private JFrame ventanaAnterior;
    public Ventana_15_RegistrarUsuarioAdministrador() {
        initComponents();
        this.textoEspecialidad.setVisible(false);
        this.especialidad.setVisible(false);
    }

    public Ventana_15_RegistrarUsuarioAdministrador getVentana() {
        return ventana;
    }

    public void setVentana(Ventana_15_RegistrarUsuarioAdministrador ventana) {
        this.ventana = ventana;
    }

    
    public Ventana_01_Inicio getVentanaSiguiente() {
        return ventanaSiguiente;
    }

    public void setVentanaSiguiente(Ventana_01_Inicio ventanaSiguiente) {
        this.ventanaSiguiente = ventanaSiguiente;
    }

    public JFrame getVentanaAnterior() {
        return ventanaAnterior;
    }

    public void setVentanaAnterior(JFrame ventanaAnterior) {
        this.ventanaAnterior = ventanaAnterior;
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
        contraseña = new javax.swing.JPasswordField();
        Separador5 = new javax.swing.JSeparator();
        txtContraseña = new javax.swing.JLabel();
        Separador4 = new javax.swing.JSeparator();
        txtPuesto = new javax.swing.JLabel();
        apellidoMaterno = new javax.swing.JTextField();
        txtMaterno = new javax.swing.JLabel();
        Separador3 = new javax.swing.JSeparator();
        Separador6 = new javax.swing.JSeparator();
        apellidoPaterno = new javax.swing.JTextField();
        txtPaterno = new javax.swing.JLabel();
        Separador7 = new javax.swing.JSeparator();
        nombre = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JLabel();
        TxtRegistrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textoEspecialidad = new javax.swing.JLabel();
        correoElectronico = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        especialidad = new javax.swing.JComboBox<>();
        ocupacion = new javax.swing.JComboBox<>();

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

        jButton2.setText("regresar");
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

        contraseña.setBackground(new java.awt.Color(255, 255, 255));
        contraseña.setForeground(new java.awt.Color(190, 190, 190));
        contraseña.setBorder(null);
        contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contraseñaMousePressed(evt);
            }
        });
        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
        jPanel3.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 160, -1));
        jPanel3.add(Separador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        txtContraseña.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtContraseña.setText("CONTRASEÑA");
        jPanel3.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));
        jPanel3.add(Separador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        txtPuesto.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtPuesto.setText("OCUPACION");
        jPanel3.add(txtPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        apellidoMaterno.setBackground(new java.awt.Color(255, 255, 255));
        apellidoMaterno.setFont(new java.awt.Font("SF UI Text", 1, 12)); // NOI18N
        apellidoMaterno.setForeground(new java.awt.Color(190, 190, 190));
        apellidoMaterno.setBorder(null);
        apellidoMaterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                apellidoMaternoMousePressed(evt);
            }
        });
        jPanel3.add(apellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 130, -1));

        txtMaterno.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtMaterno.setText("APELLIDO MATERNO");
        jPanel3.add(txtMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));
        jPanel3.add(Separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));
        jPanel3.add(Separador6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        apellidoPaterno.setBackground(new java.awt.Color(255, 255, 255));
        apellidoPaterno.setFont(new java.awt.Font("SF UI Text", 1, 12)); // NOI18N
        apellidoPaterno.setForeground(new java.awt.Color(190, 190, 190));
        apellidoPaterno.setBorder(null);
        apellidoPaterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                apellidoPaternoMousePressed(evt);
            }
        });
        apellidoPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoPaternoActionPerformed(evt);
            }
        });
        jPanel3.add(apellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 130, -1));

        txtPaterno.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtPaterno.setText("APELLIDO PATERNO");
        jPanel3.add(txtPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));
        jPanel3.add(Separador7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("SF UI Text", 1, 12)); // NOI18N
        nombre.setForeground(new java.awt.Color(190, 190, 190));
        nombre.setBorder(null);
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreMousePressed(evt);
            }
        });
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel3.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 130, -1));

        txtUsuario.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtUsuario.setText("NOMBRE");
        jPanel3.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        TxtRegistrar.setFont(new java.awt.Font("SF UI Text", 1, 22)); // NOI18N
        TxtRegistrar.setText("REGISTRAR");
        jPanel3.add(TxtRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jLabel1.setText("CORREO ELECTRONICO");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        textoEspecialidad.setText("ESPECIALISTA");
        jPanel3.add(textoEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

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
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 180, 10));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 180, 10));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 180, 20));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 190, 10));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 190, 10));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 190, 10));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 190, 0));

        especialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cardiologia", "neurologia", "nefrologia", "medicina interna", "vascular", "metabolismo", "nutricion" }));
        especialidad.setToolTipText("");
        especialidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                especialidadItemStateChanged(evt);
            }
        });
        jPanel3.add(especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 190, -1));

        ocupacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "asistente", "administrador", "especialista" }));
        ocupacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ocupacionItemStateChanged(evt);
            }
        });
        ocupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupacionActionPerformed(evt);
            }
        });
        jPanel3.add(ocupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 190, -1));

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
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.guardar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void contraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaMousePressed

    }//GEN-LAST:event_contraseñaMousePressed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaActionPerformed

    private void apellidoMaternoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidoMaternoMousePressed

    }//GEN-LAST:event_apellidoMaternoMousePressed

    private void apellidoPaternoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidoPaternoMousePressed

    }//GEN-LAST:event_apellidoPaternoMousePressed

    private void apellidoPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoPaternoActionPerformed

    private void nombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMousePressed

    }//GEN-LAST:event_nombreMousePressed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void correoElectronicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoElectronicoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoElectronicoMousePressed

    private void especialidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_especialidadItemStateChanged

    }//GEN-LAST:event_especialidadItemStateChanged

    private void ocupacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ocupacionItemStateChanged
        if ("especialista".equals(this.ocupacion.getSelectedItem().toString())) {
            this.textoEspecialidad.setVisible(true);
            this.especialidad.setVisible(true);
            this.bandera = true;
        } else if ("asistente".equals(this.ocupacion.getSelectedItem().toString())) {
            this.textoEspecialidad.setVisible(false);
            this.especialidad.setVisible(false);
            this.bandera = false;
        } else if ("administrador".equals(this.ocupacion.getSelectedItem().toString())) {
            this.textoEspecialidad.setVisible(false);
            this.especialidad.setVisible(false);
            this.bandera = false;
        }
    }//GEN-LAST:event_ocupacionItemStateChanged

    private void ocupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ocupacionActionPerformed
    public void guardar(){
        if ("".equals(correoElectronico.getText())== false)
        if (noEsAlphanumerico(nombre.getText()) == false)
            if(noEsAlphanumerico(apellidoPaterno.getText()) == false)  
                if (noEsAlphanumerico(apellidoMaterno.getText())== false)
                    if("".equals(contraseña.getText())== false) 
                        if(ocupacion.getSelectedItem().toString() != null ){
                            if (this.bandera == true) {
                                this.usuarios.guardar(correoElectronico.getText(), nombre.getText(), apellidoPaterno.getText(), apellidoMaterno.getText(), contraseña.getText(), ocupacion.getSelectedItem().toString(), especialidad.getSelectedItem().toString(),"nuevo");
                                JOptionPane.showMessageDialog(rootPane, "Se a completado su Registro con exito");
                                this.abrirPantalla();
                            }
                            else
                                if (this.bandera == false) {
                                    if (especialidad.getSelectedItem().toString() != null) {
                                        this.usuarios.guardar(correoElectronico.getText(), nombre.getText(), apellidoPaterno.getText(), apellidoMaterno.getText(), contraseña.getText(), ocupacion.getSelectedItem().toString(),"","nuevo");
                                        JOptionPane.showMessageDialog(rootPane, "Se a completado su Registro con exito");
                                        this.abrirPantalla();
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(rootPane, "Escoja una especialidad");
                                    }
                                }
                        }else{
                            JOptionPane.showMessageDialog(rootPane, "Escoja una ocupacion");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(rootPane, "Escriba una contraseña");
                        }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Escriba una apellido Materno");
                    }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Escriba un apellido Paterno");
                }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Escriba un nombre");
            }
        else{
            JOptionPane.showMessageDialog(rootPane, "Escriba un correo Electronico");
        }
    }
    public boolean noEsAlphanumerico(String texto){
        boolean bandera = false;
        for (int i = 0; i < texto.length(); i++) {
            if (!caracter.isLetterOrDigit(texto.charAt(i))) {
                bandera = true;
                break;
            }
        }
        if (bandera == true ) {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void abrirPantalla(){
        ventanaSiguiente.setVisible(true);
        this.dispose();
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
    private javax.swing.JLabel TxtRegistrar;
    private javax.swing.JLabel Version;
    private javax.swing.JTextField apellidoMaterno;
    private javax.swing.JTextField apellidoPaterno;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JTextField correoElectronico;
    private javax.swing.JComboBox<String> especialidad;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel nomEmpresaCliente1;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> ocupacion;
    private javax.swing.JLabel textoEspecialidad;
    private javax.swing.JLabel txtContraseña;
    private javax.swing.JLabel txtMaterno;
    private javax.swing.JLabel txtPaterno;
    private javax.swing.JLabel txtPuesto;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
