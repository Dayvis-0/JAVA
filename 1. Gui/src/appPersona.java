import javax.swing.JOptionPane;

public class appPersona extends javax.swing.JFrame {
    
    private cPersona aP1;
    
    public appPersona() {
        initComponents();
        
        aP1 = new cPersona();
    }
    
    private void mostrarDatos() {
        String rta = "DNI: " + aP1.sDNI();
        
        rta = rta + "\nNombres: " + aP1.sNombres();
        rta = rta + "\nApellidos: " + aP1.sApellidos();
        rta = rta + "\nFecha de nacimiento: " + aP1.sFNacimiento();
        rta = rta + "\nSexo: " + sexo(aP1.sSexo());
        rta = rta + "\nEstado civil: " + estadoCivil(aP1.sECivil(), aP1.sSexo());
        
        ta_panel.setText(rta);
    }

    public void limpiarDatos () {
        tf_DNI.setText(""); tf_nombre.setText(""); tf_apellido.setText(""); 
        tf_fech_naci.setText("");
        rb_masculino.setSelected(true);
        cb_ecivil.setSelectedIndex(0);
        
        ta_panel.setText("");
    }

    public String sexo(int pSexo) {
        return pSexo == 1 ? "Masculino": "Femenino";
    }
    
    public String estadoCivil(int pECivil, int pSexo) {
        switch (pECivil) {
            case 0 -> { return (pSexo == 1? "Soltero" : "Soltera") ;}
            case 1 -> { return (pSexo == 1? "Casado" : "Casada"); }
            case 2 -> { return (pSexo == 1? "Viudo" : "Viuda"); }
            case 3 -> { return (pSexo == 1? "Divorciado" : "Divorciada"); }
        }
        return null;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_sexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_DNI = new javax.swing.JTextField();
        tf_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_apellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_fech_naci = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rb_masculino = new javax.swing.JRadioButton();
        rb_femenino = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        cb_ecivil = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_panel = new javax.swing.JTextArea();
        bu_agregar = new javax.swing.JButton();
        bu_modificar = new javax.swing.JButton();
        bu_eliminar = new javax.swing.JButton();
        bu_cancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cb_mostrar = new javax.swing.JComboBox<>();
        bu_ejecutar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese DNI: ");

        jLabel2.setText("Ingrese nombres: ");

        jLabel3.setText("Ingrese apellidos");

        jLabel4.setText("Fecha de nacimiento (dd/mm/aaaa):");

        jLabel5.setText("Sexo:");

        bg_sexo.add(rb_masculino);
        rb_masculino.setText("Masculino");

        bg_sexo.add(rb_femenino);
        rb_femenino.setText("Femenino");

        jLabel6.setText("Seleccione estado civil:");

        cb_ecivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solter@", "Casad@", "Viud@", "Divorciad@" }));

        ta_panel.setColumns(20);
        ta_panel.setRows(5);
        jScrollPane1.setViewportView(ta_panel);

        bu_agregar.setText("Agregar");
        bu_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_agregarMouseClicked(evt);
            }
        });

        bu_modificar.setText("Modificar");
        bu_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_modificarMouseClicked(evt);
            }
        });

        bu_eliminar.setText("Eliminar");
        bu_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_eliminarMouseClicked(evt);
            }
        });

        bu_cancelar.setText("Cancelar");
        bu_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_cancelarMouseClicked(evt);
            }
        });

        jLabel7.setText("Operaciones:");

        cb_mostrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Texto", "Mostrar" }));

        bu_ejecutar.setText("Ejecutar");
        bu_ejecutar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_ejecutarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(tf_fech_naci, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_masculino, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_femenino, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_DNI, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(tf_nombre)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_ecivil, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(cb_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(bu_ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bu_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(bu_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bu_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(bu_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bu_agregar)
                    .addComponent(bu_modificar)
                    .addComponent(bu_eliminar)
                    .addComponent(bu_cancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4)
                        .addGap(15, 15, 15)
                        .addComponent(tf_fech_naci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rb_masculino)
                            .addComponent(rb_femenino))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cb_ecivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cb_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu_ejecutar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bu_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_agregarMouseClicked
        // TODO add your handling code here:
        
        if (aP1.validateDNI(tf_DNI.getText())){
            aP1.mDNI(tf_DNI.getText());        
        }
        else {
            JOptionPane.showMessageDialog(null, "DNI incorrecto");
        }
        aP1.mNombres(tf_nombre.getText());
        aP1.mApellidos(tf_apellido.getText());
        
        String fecha = tf_fech_naci.getText();
        int dia = Integer.parseInt(fecha.substring(0, 2));
        int mes = Integer.parseInt(fecha.substring(3, 5));
        int anio = Integer.parseInt(fecha.substring(6));
        
        aP1.mFNacimiento(dia, mes, anio);
        
        aP1.mSexo(rb_masculino.isSelected() ? 1 : 0);
        aP1.mECivil(cb_ecivil.getSelectedIndex());
        
        limpiarDatos();
    }//GEN-LAST:event_bu_agregarMouseClicked

    private void bu_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_cancelarMouseClicked
        // TODO add your handling code here:
        
        mostrarDatos();
    }//GEN-LAST:event_bu_cancelarMouseClicked

    private void bu_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_eliminarMouseClicked
        // TODO add your handling code here:
        String dni = tf_DNI.getText();
        if (dni.equals(aP1.sDNI())){
            aP1.mDNI(""); aP1.mNombres(""); aP1.mApellidos(""); 
            aP1.mSexo(0); aP1.mECivil(0);
            aP1.mFNacimiento(1, 1, 1000);
            JOptionPane.showMessageDialog(null, "Persona eliminada");
            limpiarDatos();
        }
        else {
            JOptionPane.showMessageDialog(null, "Persona no registrada");
        }
    }//GEN-LAST:event_bu_eliminarMouseClicked

    private void bu_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_modificarMouseClicked
        // TODO add your handling code here:
        // recuperar datos
        String dni = tf_DNI.getText(), name = tf_nombre.getText(), ape = tf_apellido.getText();
        int sexo = (rb_masculino.isSelected()? 1: 0), eCivil = cb_ecivil.getSelectedIndex();
        String fn = tf_fech_naci.getText();
        int dia = Integer.parseInt(fn.substring(0, 2)), mes = Integer.parseInt(fn.substring(3,5)), 
                anio = Integer.parseInt(fn.substring(6));
        // Validar datos
        if (aP1.mFNacimiento(dia, mes, anio) && aP1.validarPersona(dni, ape, name)) {
            if (dni.equals(aP1.sDNI())) {
                aP1.mDNI(dni); aP1.mNombres(name); aP1.mApellidos(ape);
                aP1.mECivil(eCivil); aP1.mSexo(sexo);
                JOptionPane.showMessageDialog(null, "Persona modificada");
                limpiarDatos();
            }
            else { JOptionPane.showMessageDialog(null, "Persona no registrada"); }
        }
        else { JOptionPane.showMessageDialog(null, "Datos incompletos"); }
        
    }//GEN-LAST:event_bu_modificarMouseClicked

    private void bu_ejecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_ejecutarMouseClicked
        // TODO add your handling code here:
        int opc = cb_mostrar.getSelectedIndex();
        switch (opc) {
            case 0: ta_panel.setText("Texto: " + aP1.toString()); break;
            case 1: mostrarDatos(); break;
        }
    }//GEN-LAST:event_bu_ejecutarMouseClicked

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
            java.util.logging.Logger.getLogger(appPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                appPersona p1 = new appPersona();
                
                p1.setVisible(true);
                p1.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_sexo;
    private javax.swing.JButton bu_agregar;
    private javax.swing.JButton bu_cancelar;
    private javax.swing.JButton bu_ejecutar;
    private javax.swing.JButton bu_eliminar;
    private javax.swing.JButton bu_modificar;
    private javax.swing.JComboBox<String> cb_ecivil;
    private javax.swing.JComboBox<String> cb_mostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rb_femenino;
    private javax.swing.JRadioButton rb_masculino;
    private javax.swing.JTextArea ta_panel;
    private javax.swing.JTextField tf_DNI;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_fech_naci;
    private javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables
}
