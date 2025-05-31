
import javax.swing.JOptionPane;

public class appPersona extends javax.swing.JFrame {
    //... atributos
    private cPersona aP;
    public appPersona() {
        initComponents();
        //... construir clase
        aP= new cPersona();
    }

    //... metodos privados
    private void limpiar(){
        tf_dni.setText(""); tf_apellidos.setText(""); tf_nombres.setText("");
        rb_masculino.setSelected(true);
        cb_eCivil.setSelectedIndex(0);
        ff_fNacimiento.setText("");
    }
    private void mostrar(){
        String rta= "Persona:";
        rta= rta+"\nDNI: "+aP.sDNI();
        rta= rta+"\nApellidos: "+aP.sApellidos();
        rta= rta+"\nNombres: "+aP.sNombres();
        String ec= "", sexo= (aP.sSexo()==1?"Masculino":"Femenino");
        rta= rta+"\nSexo: "+sexo;
        switch (aP.sEcivil()) {
            case 0: ec= "Solter@"; break;
            case 1: ec= "Casad@"; break;
            case 2: ec= "Viud@"; break;
            case 3: ec= "Divorsiad@"; break;
        }
        rta= rta+"\nEstado civil: "+ec;
        rta= rta+"\nFecha nacimiento: "+aP.sFnacimiento();
        //... mostrar
        ta_panel.setText(rta);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_sexo = new javax.swing.ButtonGroup();
        la_dni = new javax.swing.JLabel();
        la_apellidos = new javax.swing.JLabel();
        la_nombres = new javax.swing.JLabel();
        la_sexo = new javax.swing.JLabel();
        la_eCivil = new javax.swing.JLabel();
        la_fNacimiento = new javax.swing.JLabel();
        la_operaciones = new javax.swing.JLabel();
        tf_dni = new javax.swing.JTextField();
        tf_apellidos = new javax.swing.JTextField();
        tf_nombres = new javax.swing.JTextField();
        rb_masculino = new javax.swing.JRadioButton();
        rb_femenino = new javax.swing.JRadioButton();
        cb_eCivil = new javax.swing.JComboBox<>();
        ff_fNacimiento = new javax.swing.JFormattedTextField();
        cb_operaciones = new javax.swing.JComboBox<>();
        bu_registrar = new javax.swing.JButton();
        bu_modificar = new javax.swing.JButton();
        bu_cancelar = new javax.swing.JButton();
        bu_eliminar = new javax.swing.JButton();
        sp_panel = new javax.swing.JScrollPane();
        ta_panel = new javax.swing.JTextArea();
        bu_ejecutar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Persona");

        la_dni.setText("DNI:");

        la_apellidos.setText("Apellidos:");

        la_nombres.setText("Nombres:");

        la_sexo.setText("Sexo:");

        la_eCivil.setText("Estado civil:");

        la_fNacimiento.setText("Fecha nacimiento (dd/mm/aaaa):");

        la_operaciones.setText("Operaciones:");

        tf_dni.setColumns(5);

        tf_apellidos.setColumns(10);

        tf_nombres.setColumns(10);

        bg_sexo.add(rb_masculino);
        rb_masculino.setSelected(true);
        rb_masculino.setText("Masculino");

        bg_sexo.add(rb_femenino);
        rb_femenino.setText("Femenino");

        cb_eCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solter@", "Casad@", "Viud@", "Divorsiad@" }));

        ff_fNacimiento.setColumns(7);
        ff_fNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        cb_operaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Texto", "Mostrar" }));

        bu_registrar.setText("Registrar");
        bu_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_registrarMouseClicked(evt);
            }
        });

        bu_modificar.setText("Modificar");
        bu_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_modificarMouseClicked(evt);
            }
        });

        bu_cancelar.setText("Cancelar");
        bu_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_cancelarMouseClicked(evt);
            }
        });

        bu_eliminar.setText("Eliminar");
        bu_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_eliminarMouseClicked(evt);
            }
        });

        ta_panel.setColumns(20);
        ta_panel.setRows(5);
        sp_panel.setViewportView(ta_panel);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(la_fNacimiento)
                    .addComponent(la_eCivil)
                    .addComponent(la_nombres)
                    .addComponent(la_apellidos)
                    .addComponent(la_dni)
                    .addComponent(la_sexo)
                    .addComponent(la_operaciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_eCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ff_fNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb_masculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_femenino))
                            .addComponent(tf_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bu_ejecutar)
                            .addComponent(bu_eliminar)
                            .addComponent(bu_registrar)
                            .addComponent(bu_modificar)
                            .addComponent(bu_cancelar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(la_dni)
                            .addComponent(tf_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu_registrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(la_apellidos)
                            .addComponent(tf_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu_modificar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(la_nombres)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bu_cancelar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(la_sexo)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rb_masculino)
                                .addComponent(rb_femenino)
                                .addComponent(bu_eliminar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(la_eCivil)
                            .addComponent(cb_eCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(la_fNacimiento)
                            .addComponent(ff_fNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(la_operaciones)
                            .addComponent(cb_operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu_ejecutar))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(sp_panel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bu_ejecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_ejecutarMouseClicked
        //...escoger la opcion
        int op= cb_operaciones.getSelectedIndex();
        switch(op){
            case 0: ta_panel.setText("Texto: "+aP.toString()); break;
            case 1: mostrar(); break;
        }
    }//GEN-LAST:event_bu_ejecutarMouseClicked

    private void bu_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_registrarMouseClicked
        //... recuperar datos
        String dni= tf_dni.getText(), apellidos= tf_apellidos.getText(), nombres= tf_nombres.getText();
        int sexo= (rb_masculino.isSelected()?1:0), eCivil= cb_eCivil.getSelectedIndex();
        String fn= ff_fNacimiento.getText();
        int dia= Integer.parseInt(fn.substring(0, 2)), mes= Integer.parseInt(fn.substring(3, 5)),
                anio= Integer.parseInt(fn.substring(6));
        //... validar datos
        if(aP.mFnacimiento(dia, mes, anio) && aP.validaPersona(dni, apellidos, nombres)){
            aP.mDNI(dni); aP.mApellidos(apellidos); aP.mNombres(nombres);
            aP.mSexo(sexo); aP.mEcivil(eCivil);
            JOptionPane.showMessageDialog(null, "Persona registrada...");
            limpiar();
        }else{ JOptionPane.showMessageDialog(null, "Datos incompletos..."); }
    }//GEN-LAST:event_bu_registrarMouseClicked

    private void bu_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_modificarMouseClicked
        //... recuperar datos
        String dni= tf_dni.getText(), apellidos= tf_apellidos.getText(), nombres= tf_nombres.getText();
        int sexo= (rb_masculino.isSelected()?1:0), eCivil= cb_eCivil.getSelectedIndex();
        String fn= ff_fNacimiento.getText();
        int dia= Integer.parseInt(fn.substring(0, 2)), mes= Integer.parseInt(fn.substring(3, 5)),
                anio= Integer.parseInt(fn.substring(6));
        //... validar datos
        if(aP.mFnacimiento(dia, mes, anio) && aP.validaPersona(dni, apellidos, nombres)){
            if(dni.equals(aP.sDNI())){
                aP.mDNI(dni); aP.mApellidos(apellidos); aP.mNombres(nombres);
                aP.mSexo(sexo); aP.mEcivil(eCivil);
                JOptionPane.showMessageDialog(null, "Persona modificada...");
                limpiar();
            }else{ JOptionPane.showMessageDialog(null, "Persona no registrada..."); }
        }else{ JOptionPane.showMessageDialog(null, "Datos incompletos..."); }
    }//GEN-LAST:event_bu_modificarMouseClicked

    private void bu_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_cancelarMouseClicked
        //... limpiar ventanas
        limpiar();
    }//GEN-LAST:event_bu_cancelarMouseClicked

    private void bu_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_eliminarMouseClicked
        //... selecciono el dni
        String dni= tf_dni.getText();
        if(dni.equals(aP.sDNI())){
                aP.mDNI(""); aP.mApellidos(""); aP.mNombres("");
                aP.mSexo(0); aP.mEcivil(0);
                aP.mFnacimiento(1, 1, 1000);
                JOptionPane.showMessageDialog(null, "Persona eliminada...");
                limpiar();
            }else{ JOptionPane.showMessageDialog(null, "Persona no registrada..."); }
    }//GEN-LAST:event_bu_eliminarMouseClicked

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
                new appPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_sexo;
    private javax.swing.JButton bu_cancelar;
    private javax.swing.JButton bu_ejecutar;
    private javax.swing.JButton bu_eliminar;
    private javax.swing.JButton bu_modificar;
    private javax.swing.JButton bu_registrar;
    private javax.swing.JComboBox<String> cb_eCivil;
    private javax.swing.JComboBox<String> cb_operaciones;
    private javax.swing.JFormattedTextField ff_fNacimiento;
    private javax.swing.JLabel la_apellidos;
    private javax.swing.JLabel la_dni;
    private javax.swing.JLabel la_eCivil;
    private javax.swing.JLabel la_fNacimiento;
    private javax.swing.JLabel la_nombres;
    private javax.swing.JLabel la_operaciones;
    private javax.swing.JLabel la_sexo;
    private javax.swing.JRadioButton rb_femenino;
    private javax.swing.JRadioButton rb_masculino;
    private javax.swing.JScrollPane sp_panel;
    private javax.swing.JTextArea ta_panel;
    private javax.swing.JTextField tf_apellidos;
    private javax.swing.JTextField tf_dni;
    private javax.swing.JTextField tf_nombres;
    // End of variables declaration//GEN-END:variables
}
