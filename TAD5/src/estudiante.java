public class estudiante extends javax.swing.JFrame {
    //... atributos
    private cEstudiante e1;
    public estudiante() {
        initComponents();
        //... constructor
        e1= new cEstudiante();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        la_dni = new javax.swing.JLabel();
        tf_dni = new javax.swing.JTextField();
        la_ap = new javax.swing.JLabel();
        tf_ap = new javax.swing.JTextField();
        la_nom = new javax.swing.JLabel();
        tf_nom = new javax.swing.JTextField();
        rb_masculino = new javax.swing.JRadioButton();
        rb_femenino = new javax.swing.JRadioButton();
        la_ecivil = new javax.swing.JLabel();
        cb_ecivil = new javax.swing.JComboBox<>();
        la_fnacimiento = new javax.swing.JLabel();
        tf_fnacimiento = new javax.swing.JTextField();
        la_codE = new javax.swing.JLabel();
        tf_codE = new javax.swing.JTextField();
        la_semI = new javax.swing.JLabel();
        tf_semI = new javax.swing.JTextField();
        la_eProf = new javax.swing.JLabel();
        cb_eProf = new javax.swing.JComboBox<>();
        la_correoI = new javax.swing.JLabel();
        tf_correoI = new javax.swing.JTextField();
        bu_registrar = new javax.swing.JButton();
        bu_mostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        la_dni.setText("Ingrese DNI:");

        tf_dni.setColumns(8);

        la_ap.setText("Ingrese apellidos:");

        tf_ap.setColumns(15);

        la_nom.setText("Ingrese nombres:");

        tf_nom.setColumns(15);

        rb_masculino.setSelected(true);
        rb_masculino.setText("Masculino");

        rb_femenino.setText("Femenino");

        la_ecivil.setText("Seleccione estado civil:");

        cb_ecivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero (a)", "Casado (a)", "Viudo (a)", "Divorsiado (a)" }));

        la_fnacimiento.setText("Fecha nacimiento (dd/mm/aaaa):");

        tf_fnacimiento.setColumns(8);

        la_codE.setText("Código:");

        tf_codE.setColumns(8);

        la_semI.setText("Semestre ingreso:");

        tf_semI.setColumns(8);

        la_eProf.setText("Seleccione Escuela P:");

        cb_eProf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingenería de Sistemas", "Ingeniería Agroindustrial", "Ingeniería Civil", "Ingeniería Ambiental" }));

        la_correoI.setText("Correo institucional:");

        tf_correoI.setColumns(15);

        bu_registrar.setText("Registrar");
        bu_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_registrarMouseClicked(evt);
            }
        });

        bu_mostrar.setText("Mostrar");
        bu_mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_mostrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(la_ap)
                            .addComponent(la_dni))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_ap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bu_registrar))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(la_nom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bu_mostrar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rb_masculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_femenino))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(la_ecivil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_ecivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(la_fnacimiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_fnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(la_semI)
                            .addComponent(la_codE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_codE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_semI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(la_eProf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_eProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(la_correoI)
                        .addGap(18, 18, 18)
                        .addComponent(tf_correoI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_dni)
                    .addComponent(tf_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_ap)
                    .addComponent(tf_ap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bu_registrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_nom)
                    .addComponent(tf_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bu_mostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_masculino)
                    .addComponent(rb_femenino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_ecivil)
                    .addComponent(cb_ecivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_fnacimiento)
                    .addComponent(tf_fnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_codE)
                    .addComponent(tf_codE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_semI)
                    .addComponent(tf_semI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_eProf)
                    .addComponent(cb_eProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_correoI)
                    .addComponent(tf_correoI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bu_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_registrarMouseClicked
        //... registrar datos persona
        e1.mDNI(tf_dni.getText());
        e1.mApellidos(tf_ap.getText());
        e1.mNombres(tf_nom.getText());
        e1.mSexo(rb_masculino.isSelected()?1:0);
        e1.mEcivil(cb_ecivil.getSelectedIndex());
        //... hacer uso del metodo subString()
        String fecha= tf_fnacimiento.getText();
        int dia= Integer.parseInt(fecha.substring(0, 2));
        e1.mFnacimiento(dia, 12, 2024);
        //... registrar datos del estudiante
        e1.mCodigo(tf_codE.getText());
        e1.mSingreso(tf_semI.getText());
        e1.mEprofesional(cb_eProf.getSelectedIndex());
        e1.mCorreoI(tf_correoI.getText());
        //... limpiar
        limpiarDatos();
    }//GEN-LAST:event_bu_registrarMouseClicked

    private void bu_mostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_mostrarMouseClicked
        //... recuperar datos de la persona
        tf_dni.setText(e1.sDNI());
        tf_ap.setText(e1.sApellidos());
        tf_nom.setText(e1.sNombres());
        rb_masculino.setSelected(true);
        if(e1.sSexo()==0){ rb_femenino.setSelected(true);}
        cb_ecivil.setSelectedIndex(e1.sEcivil());
        tf_fnacimiento.setText(e1.sFnacimiento().toString());
        //... recuperar datos de la estudiante
        tf_codE.setText(e1.sCodigo());
        tf_semI.setText(e1.sSingreso());
        cb_eProf.setSelectedIndex(e1.sEprofesional());
        tf_correoI.setText(e1.sCorreoI());
    }//GEN-LAST:event_bu_mostrarMouseClicked
    private void limpiarDatos(){
        //... limpiar datos de la persona
        tf_dni.setText(""); tf_ap.setText(""); tf_nom.setText("");
        rb_masculino.setSelected(true);
        cb_ecivil.setSelectedIndex(0);
        tf_fnacimiento.setText("");
        //... limpiar datos del estudiante
        tf_codE.setText(""); tf_semI.setText("");
        cb_eProf.setSelectedIndex(0);
        tf_correoI.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new estudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bu_mostrar;
    private javax.swing.JButton bu_registrar;
    private javax.swing.JComboBox<String> cb_eProf;
    private javax.swing.JComboBox<String> cb_ecivil;
    private javax.swing.JLabel la_ap;
    private javax.swing.JLabel la_codE;
    private javax.swing.JLabel la_correoI;
    private javax.swing.JLabel la_dni;
    private javax.swing.JLabel la_eProf;
    private javax.swing.JLabel la_ecivil;
    private javax.swing.JLabel la_fnacimiento;
    private javax.swing.JLabel la_nom;
    private javax.swing.JLabel la_semI;
    private javax.swing.JRadioButton rb_femenino;
    private javax.swing.JRadioButton rb_masculino;
    private javax.swing.JTextField tf_ap;
    private javax.swing.JTextField tf_codE;
    private javax.swing.JTextField tf_correoI;
    private javax.swing.JTextField tf_dni;
    private javax.swing.JTextField tf_fnacimiento;
    private javax.swing.JTextField tf_nom;
    private javax.swing.JTextField tf_semI;
    // End of variables declaration//GEN-END:variables
}
