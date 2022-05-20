package Vista;

import Controlador.Controlador_CitaMedica;
import Controlador.Controlador_Paciente;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ventana_18_RegistrarPacienteAsistente extends javax.swing.JFrame {
    private Controlador_CitaMedica citasMedicasNotificar = new Controlador_CitaMedica();
    private Ventana_18_RegistrarPacienteAsistente ventana;
    private JFrame ventanaAnterior;
    public Ventana_18_RegistrarPacienteAsistente() {
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
        txtContraseña = new javax.swing.JLabel();
        Separador4 = new javax.swing.JSeparator();
        txtPuesto = new javax.swing.JLabel();
        edadtxt = new javax.swing.JTextField();
        txtMaterno = new javax.swing.JLabel();
        Separador3 = new javax.swing.JSeparator();
        Separador6 = new javax.swing.JSeparator();
        apellidoPaternotxt = new javax.swing.JTextField();
        txtPaterno = new javax.swing.JLabel();
        Separador7 = new javax.swing.JSeparator();
        nombretxt = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JLabel();
        nombreOcupacion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textoEspecialidad = new javax.swing.JLabel();
        estatura = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        sexo = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        numeroCitas = new javax.swing.JLabel();
        TxtRegistrar1 = new javax.swing.JLabel();
        curp = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        dni = new javax.swing.JTextField();
        textoEspecialidad1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        apellidoMaternotxt = new javax.swing.JTextField();

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
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 60));

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
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 110, 40));
        jPanel3.add(Separador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        txtContraseña.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtContraseña.setText("EDAD");
        jPanel3.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));
        jPanel3.add(Separador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        txtPuesto.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtPuesto.setText("SEXO");
        jPanel3.add(txtPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        edadtxt.setBackground(new java.awt.Color(255, 255, 255));
        edadtxt.setFont(new java.awt.Font("SF UI Text", 1, 12)); // NOI18N
        edadtxt.setForeground(new java.awt.Color(190, 190, 190));
        edadtxt.setBorder(null);
        edadtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                edadtxtMousePressed(evt);
            }
        });
        jPanel3.add(edadtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 130, -1));

        txtMaterno.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtMaterno.setText("APELLIDO MATERNO");
        jPanel3.add(txtMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));
        jPanel3.add(Separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));
        jPanel3.add(Separador6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        apellidoPaternotxt.setBackground(new java.awt.Color(255, 255, 255));
        apellidoPaternotxt.setFont(new java.awt.Font("SF UI Text", 1, 12)); // NOI18N
        apellidoPaternotxt.setForeground(new java.awt.Color(190, 190, 190));
        apellidoPaternotxt.setBorder(null);
        apellidoPaternotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                apellidoPaternotxtMousePressed(evt);
            }
        });
        apellidoPaternotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoPaternotxtActionPerformed(evt);
            }
        });
        jPanel3.add(apellidoPaternotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 130, -1));

        txtPaterno.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtPaterno.setText("APELLIDO PATERNO");
        jPanel3.add(txtPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));
        jPanel3.add(Separador7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        nombretxt.setBackground(new java.awt.Color(255, 255, 255));
        nombretxt.setFont(new java.awt.Font("SF UI Text", 1, 12)); // NOI18N
        nombretxt.setForeground(new java.awt.Color(190, 190, 190));
        nombretxt.setBorder(null);
        nombretxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombretxtMousePressed(evt);
            }
        });
        nombretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretxtActionPerformed(evt);
            }
        });
        jPanel3.add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 130, -1));

        txtUsuario.setFont(new java.awt.Font("SF UI Text", 0, 12)); // NOI18N
        txtUsuario.setText("NOMBRE");
        jPanel3.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        nombreOcupacion.setFont(new java.awt.Font("SF UI Text", 1, 22)); // NOI18N
        nombreOcupacion.setText("REGISTRAR");
        jPanel3.add(nombreOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel1.setText("ESTATURA");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        textoEspecialidad.setText("DNI");
        jPanel3.add(textoEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        estatura.setBackground(new java.awt.Color(255, 255, 255));
        estatura.setFont(new java.awt.Font("SF UI Text", 1, 12)); // NOI18N
        estatura.setForeground(new java.awt.Color(190, 190, 190));
        estatura.setBorder(null);
        estatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                estaturaMousePressed(evt);
            }
        });
        estatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estaturaActionPerformed(evt);
            }
        });
        jPanel3.add(estatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 160, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 180, 10));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 180, 10));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 180, 20));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 190, 10));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 190, 10));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 190, 10));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 190, 0));

        sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "hombre", "mujer", "indefinido" }));
        sexo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sexoItemStateChanged(evt);
            }
        });
        sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoActionPerformed(evt);
            }
        });
        jPanel3.add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 190, -1));

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

        curp.setBackground(new java.awt.Color(255, 255, 255));
        curp.setFont(new java.awt.Font("SF UI Text", 1, 12)); // NOI18N
        curp.setForeground(new java.awt.Color(190, 190, 190));
        curp.setBorder(null);
        curp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                curpMousePressed(evt);
            }
        });
        curp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curpActionPerformed(evt);
            }
        });
        jPanel3.add(curp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 160, -1));
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 190, 10));
        jPanel3.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 190, 10));

        dni.setBackground(new java.awt.Color(255, 255, 255));
        dni.setFont(new java.awt.Font("SF UI Text", 1, 12)); // NOI18N
        dni.setForeground(new java.awt.Color(190, 190, 190));
        dni.setBorder(null);
        dni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dniMousePressed(evt);
            }
        });
        dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniActionPerformed(evt);
            }
        });
        jPanel3.add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 160, -1));

        textoEspecialidad1.setText("CURP");
        jPanel3.add(textoEspecialidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        jButton4.setText("LIMPIAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 110, 40));

        apellidoMaternotxt.setBackground(new java.awt.Color(255, 255, 255));
        apellidoMaternotxt.setFont(new java.awt.Font("SF UI Text", 1, 12)); // NOI18N
        apellidoMaternotxt.setForeground(new java.awt.Color(190, 190, 190));
        apellidoMaternotxt.setBorder(null);
        apellidoMaternotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                apellidoMaternotxtMousePressed(evt);
            }
        });
        jPanel3.add(apellidoMaternotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 130, -1));

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

    public Ventana_18_RegistrarPacienteAsistente getVentana() {
        return ventana;
    }

    public void setVentana(Ventana_18_RegistrarPacienteAsistente ventana) {
        this.ventana = ventana;
    }

    public JFrame getVentanaAnterior() {
        return ventanaAnterior;
    }

    public void setVentanaAnterior(JFrame ventanaAnterior) {
        this.ventanaAnterior = ventanaAnterior;
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.ventanaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.guardar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void edadtxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edadtxtMousePressed

    }//GEN-LAST:event_edadtxtMousePressed

    private void apellidoPaternotxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidoPaternotxtMousePressed

    }//GEN-LAST:event_apellidoPaternotxtMousePressed

    private void apellidoPaternotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoPaternotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoPaternotxtActionPerformed

    private void nombretxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombretxtMousePressed

    }//GEN-LAST:event_nombretxtMousePressed

    private void nombretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretxtActionPerformed

    private void estaturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estaturaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_estaturaMousePressed

    private void sexoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sexoItemStateChanged

    }//GEN-LAST:event_sexoItemStateChanged

    private void sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoActionPerformed

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        Ventana_17_NotificacionesAsistente administrar = new Ventana_17_NotificacionesAsistente();
        administrar.setVentana(administrar);
        administrar.setVentanaAnterior(this.ventana);
        administrar.iniciar(nombreOcupacion.getText());
        administrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel5MousePressed

    private void estaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estaturaActionPerformed

    private void curpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curpMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_curpMousePressed

    private void curpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_curpActionPerformed

    private void dniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dniMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniMousePressed

    private void dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        this.limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void apellidoMaternotxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidoMaternotxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoMaternotxtMousePressed
    public void guardar(){
        if (!"".equals(nombretxt.getText()))
            if (!"".equals(apellidoPaternotxt.getText()))
                if (!"".equals(apellidoMaternotxt.getText()))
                    if (!"".equals(edadtxt.getText()))
                        if (sexo.getSelectedItem().toString() != null)
                            if (!"".equals(estatura.getText()))
                                if (!"".equals(curp.getText()))
                                    if (!"".equals(dni.getText())) {
                                        Controlador_Paciente pacientes = new Controlador_Paciente();
                                        pacientes.guardar(nombretxt.getText(), apellidoPaternotxt.getText(), apellidoMaternotxt.getText(), edadtxt.getText(), sexo.getSelectedItem().toString(), estatura.getText(), curp.getText(), dni.getText());
                                        JOptionPane.showMessageDialog(rootPane, "SE GUARDADO LA INFORMACION DEL PACIENTE CON EXITO");
                                        Ventana_19_RegistrarCitaMedicaAsistente registrarCitaMedica = new Ventana_19_RegistrarCitaMedicaAsistente(nombretxt.getText(),apellidoPaternotxt.getText(),apellidoMaternotxt.getText());
                                        registrarCitaMedica.setVentana(registrarCitaMedica);
                                        registrarCitaMedica.setVentanaAnterior(this.ventana);
                                        registrarCitaMedica.iniciar(nombreOcupacion.getText());
                                        registrarCitaMedica.setVisible(true);
                                        this.dispose();
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(rootPane, "Escriba el dni");
                                    }
                                else
                                {
                                    JOptionPane.showMessageDialog(rootPane, "Escriba el curp");
                                }
                            else
                            {
                                JOptionPane.showMessageDialog(rootPane, "Escriba el estatura");
                            }
                        else
                        {
                            JOptionPane.showMessageDialog(rootPane, "Selecciona el sexo");
                        }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Escriba la edad");
                    }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Escriba apellido Materno");
                }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Escriba apellido Paterno");
            }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Escriba Nombre");
        }
    }
        public void limpiar(){
        this.nombretxt.setText("");
        this.apellidoPaternotxt.setText("");
        this.edadtxt.setText("");
        this.edadtxt.setText("");
        this.sexo.setSelectedIndex(0);
        this.estatura.setText("");
        this.curp.setText("");
        this.dni.setText("");
        JOptionPane.showMessageDialog(rootPane, "SE HA LIMPIADO DE VENTANA");
    }
    public void iniciar(String nombre){
        this.initComponents();
        this.numeroCitas.setText(citasMedicasNotificar.numeroCitaMedicasRealizadas());
        this.nombreOcupacion.setText(nombre);
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
    private javax.swing.JTextField apellidoMaternotxt;
    private javax.swing.JTextField apellidoPaternotxt;
    private javax.swing.JTextField curp;
    private javax.swing.JTextField dni;
    private javax.swing.JTextField edadtxt;
    private javax.swing.JTextField estatura;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel nomEmpresaCliente1;
    private javax.swing.JLabel nombreOcupacion;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JLabel numeroCitas;
    private javax.swing.JComboBox<String> sexo;
    private javax.swing.JLabel textoEspecialidad;
    private javax.swing.JLabel textoEspecialidad1;
    private javax.swing.JLabel txtContraseña;
    private javax.swing.JLabel txtMaterno;
    private javax.swing.JLabel txtPaterno;
    private javax.swing.JLabel txtPuesto;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
