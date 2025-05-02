import javax.swing.*;

public class persona extends javax.swing.JFrame {
    //... atributos
    private cPersona p1;
    
    public void mostrar () {
        String rta = "DNI: " + p1.sDNI();
        
        rta = rta + "\nNombre: " + p1.sNombres();
        rta = rta + "\nApellidos: " + p1.sApellidos();
        rta = rta + "\nFecha nacimiento: " + p1.sFnacimiento();
        
        switch (p1.sSexo()) {
            case 1: rta = rta + "\nSexo: Masculino"; break;                
            case 0: rta = rta + "\nSexo: Femenino"; break;                
        }
        
        switch (p1.sEcivil()) {
            case 0: rta = rta + "\nEstado civil: Soltero"; break; 
            case 1: rta = rta + "\nEstado civil: Casado"; break;   
            case 2: rta = rta + "\nEstado civil: Viudo"; break;
            case 3: rta = rta + "\nEstado civil: Divorciado"; break;    
        }
        
        ta_mostrar.setText(rta);
    }
    
    public boolean validarDNI (String pValidarDNI) {
        /*matches(String, ICharSequence) - coincide | Complila la expresion regular dada e intenta hacer coincidir la entrada especifica
        en ella devuelve true si coinciden, en caso contrario false | \\d{8} Las barras invertidas \ son caracteres de escape 
        \d es un metacaracter que representa cualquier digito numerico (0-9)
        {} cantidad exacta de las repeticiones del elemento anterior*/
        return pValidarDNI.matches("\\d{8}") || pValidarDNI.matches("");
    }
    
    public boolean validarNomApe(String pvalidarNomApe){
        return pvalidarNomApe.matches("[a-zA-Z]+");
    }
    
    public persona() {
        initComponents();
        //... constructor
        p1= new cPersona();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_sexo = new javax.swing.ButtonGroup();
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
        bu_mostrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bu_agregar = new javax.swing.JButton();
        bu_modificar = new javax.swing.JButton();
        bu_limpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_mostrar = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        la_dni.setText("Ingrese DNI:");

        tf_dni.setColumns(8);

        la_ap.setText("Ingrese apellidos:");

        tf_ap.setColumns(15);

        la_nom.setText("Ingrese nombres:");

        tf_nom.setColumns(15);
        tf_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nomActionPerformed(evt);
            }
        });

        bg_sexo.add(rb_masculino);
        rb_masculino.setSelected(true);
        rb_masculino.setText("Masculino");
        rb_masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_masculinoActionPerformed(evt);
            }
        });

        bg_sexo.add(rb_femenino);
        rb_femenino.setText("Femenino");

        la_ecivil.setText("Seleccione estado civil:");

        cb_ecivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero (a)", "Casado (a)", "Viudo (a)", "Divorciado (a)" }));
        cb_ecivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ecivilActionPerformed(evt);
            }
        });

        la_fnacimiento.setText("Fecha nacimiento (dd/mm/aaaa):");

        tf_fnacimiento.setColumns(8);

        bu_mostrar.setText("Mostrar");
        bu_mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_mostrarMouseClicked(evt);
            }
        });

        jLabel1.setText("Sexo");

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

        bu_limpiar.setText("Limpiar");
        bu_limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_limpiarMouseClicked(evt);
            }
        });

        ta_mostrar.setColumns(20);
        ta_mostrar.setRows(5);
        ta_mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ta_mostrarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ta_mostrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(la_ecivil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(bu_mostrar))
                                    .addComponent(cb_ecivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(rb_masculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_femenino)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tf_fnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(la_fnacimiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bu_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(la_dni)
                                            .addGap(38, 38, 38)
                                            .addComponent(tf_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(la_nom)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tf_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(la_ap)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf_ap, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bu_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(bu_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(la_dni)
                            .addComponent(tf_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu_agregar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(la_nom)
                                    .addComponent(tf_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(la_ap)
                                    .addComponent(tf_ap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(bu_modificar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(la_fnacimiento)
                            .addComponent(bu_limpiar))
                        .addGap(10, 10, 10)
                        .addComponent(tf_fnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_masculino)
                    .addComponent(rb_femenino)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_ecivil)
                    .addComponent(cb_ecivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bu_mostrar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bu_mostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_mostrarMouseClicked
        // TODO add your handling code here:
        
        mostrar();
    }//GEN-LAST:event_bu_mostrarMouseClicked

    private void tf_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nomActionPerformed

    private void bu_limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_limpiarMouseClicked
        // TODO add your handling code here:
        limpiarDatos();
        
        ta_mostrar.setText("");
    }//GEN-LAST:event_bu_limpiarMouseClicked

    private void bu_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_modificarMouseClicked
        // TODO add your handling code here:
        
        limpiarDatos();
    }//GEN-LAST:event_bu_modificarMouseClicked

    private void bu_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_agregarMouseClicked
        // TODO add your handling code here:
        //... registrar datos
        
        if (validarDNI(tf_dni.getText()) && validarNomApe(tf_nom.getText()) && validarNomApe(tf_ap.getText())) {
            p1.mDNI(tf_dni.getText());
            p1.mApellidos(tf_ap.getText()); 
            p1.mNombres(tf_nom.getText());
        }
        else {
            JOptionPane.showMessageDialog(null,"Datos invalidos", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            limpiarDatos();
        }
        p1.mSexo(rb_masculino.isSelected()?1:0);
        p1.mEcivil(cb_ecivil.getSelectedIndex());
        //... hacer uso del metodo subString()
        String fecha= tf_fnacimiento.getText();
        int dia= Integer.parseInt(fecha.substring(0, 2));
        p1.mFnacimiento(dia, 12, 2024);
        
        limpiarDatos();
    }//GEN-LAST:event_bu_agregarMouseClicked

    private void ta_mostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta_mostrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ta_mostrarMouseClicked

    private void rb_masculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_masculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_masculinoActionPerformed

    private void cb_ecivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ecivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ecivilActionPerformed
    private void limpiarDatos(){
        tf_dni.setText(""); tf_ap.setText(""); tf_nom.setText("");
        rb_masculino.setSelected(true);
        cb_ecivil.setSelectedIndex(0);
        tf_fnacimiento.setText("");
        
        ta_mostrar.setText("");
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
            java.util.logging.Logger.getLogger(persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                persona p1 = new persona();
                
                p1.setVisible(true);
                p1.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_sexo;
    private javax.swing.JButton bu_agregar;
    private javax.swing.JButton bu_limpiar;
    private javax.swing.JButton bu_modificar;
    private javax.swing.JButton bu_mostrar;
    private javax.swing.JComboBox<String> cb_ecivil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel la_ap;
    private javax.swing.JLabel la_dni;
    private javax.swing.JLabel la_ecivil;
    private javax.swing.JLabel la_fnacimiento;
    private javax.swing.JLabel la_nom;
    private javax.swing.JRadioButton rb_femenino;
    private javax.swing.JRadioButton rb_masculino;
    private javax.swing.JTextArea ta_mostrar;
    private javax.swing.JTextField tf_ap;
    private javax.swing.JTextField tf_dni;
    private javax.swing.JTextField tf_fnacimiento;
    private javax.swing.JTextField tf_nom;
    // End of variables declaration//GEN-END:variables
}
