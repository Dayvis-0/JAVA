public class appFecha extends javax.swing.JFrame {
    //... atributos
    private cFecha aF;
    
    public appFecha() {
        initComponents();
        //... construir clase
        aF = new cFecha();
    }   
    
    private void mostrar(){
        String rta= "Fecha: ";
        rta= rta+"\nDi­a: "+aF.sDia();
        rta= rta+"\nMes: "+aF.sMes();
        rta= rta+"\nAño: "+aF.sAnio();
        ta_panel.setText(rta);
    }
    
    public void limpiarDatos() {
        tf_dia.setText(""); tf_mes.setText(""); tf_anio.setText("");
        
        cb_operacion.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        la_dia = new javax.swing.JLabel();
        la_mes = new javax.swing.JLabel();
        la_anio = new javax.swing.JLabel();
        la_operacion = new javax.swing.JLabel();
        tf_dia = new javax.swing.JTextField();
        tf_mes = new javax.swing.JTextField();
        tf_anio = new javax.swing.JTextField();
        cb_operacion = new javax.swing.JComboBox<>();
        bu_agregar = new javax.swing.JButton();
        bu_cancelar = new javax.swing.JButton();
        bu_eliminar = new javax.swing.JButton();
        bu_ejecutar = new javax.swing.JButton();
        sp_panel = new javax.swing.JScrollPane();
        ta_panel = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fecha");

        la_dia.setText("Día:");

        la_mes.setText("Mes:");

        la_anio.setText("Año:");

        la_operacion.setText("Operaciones:");

        tf_dia.setColumns(5);
        tf_dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_diaActionPerformed(evt);
            }
        });

        tf_mes.setColumns(5);

        tf_anio.setColumns(5);

        cb_operacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar", "Validar" }));

        bu_agregar.setText("Agregar");
        bu_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_agregarMouseClicked(evt);
            }
        });
        bu_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu_agregarActionPerformed(evt);
            }
        });

        bu_cancelar.setText("Cancelar");
        bu_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_cancelarMouseClicked(evt);
            }
        });
        bu_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu_cancelarActionPerformed(evt);
            }
        });

        bu_eliminar.setText("Eliminar");
        bu_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_eliminarMouseClicked(evt);
            }
        });
        bu_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu_eliminarActionPerformed(evt);
            }
        });

        bu_ejecutar.setText("Ejecutar");
        bu_ejecutar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_ejecutarMouseClicked(evt);
            }
        });
        bu_ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu_ejecutarActionPerformed(evt);
            }
        });

        ta_panel.setColumns(20);
        ta_panel.setRows(5);
        sp_panel.setViewportView(ta_panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(la_mes)
                            .addComponent(la_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(la_anio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_dia, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(tf_mes)
                            .addComponent(tf_anio)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(la_operacion)
                        .addGap(18, 18, 18)
                        .addComponent(cb_operacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bu_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(bu_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bu_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bu_ejecutar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(sp_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(la_dia)
                            .addComponent(tf_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(la_mes)
                            .addComponent(tf_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(la_anio)
                            .addComponent(tf_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(la_operacion)
                            .addComponent(cb_operacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sp_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bu_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bu_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bu_eliminar)
                                .addGap(21, 21, 21)
                                .addComponent(bu_ejecutar)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bu_ejecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_ejecutarMouseClicked
        //... escoger la opcion seleccionada
        int opc= cb_operacion.getSelectedIndex();
        switch (opc) {
            case 0: mostrar(); break;
        }
    }//GEN-LAST:event_bu_ejecutarMouseClicked

    private void bu_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bu_cancelarActionPerformed

    private void tf_diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_diaActionPerformed

    private void bu_ejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu_ejecutarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bu_ejecutarActionPerformed

    private void bu_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu_agregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bu_agregarActionPerformed

    private void bu_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_agregarMouseClicked
        // TODO add your handling code here:
        int dia, mes, anio;
        
        dia = Integer.parseInt(tf_dia.getText());
        mes = Integer.parseInt(tf_mes.getText());
        anio = Integer.parseInt(tf_anio.getText());
        
        aF.mDia(dia);
        aF.mMes(mes);
        aF.mAnio(anio);
        
        limpiarDatos();
    }//GEN-LAST:event_bu_agregarMouseClicked

    private void bu_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bu_eliminarActionPerformed

    private void bu_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_eliminarMouseClicked
        // TODO add your handling code here:
        
        limpiarDatos();
        ta_panel.setText("");
        
        aF.mAnio(0);
        aF.mMes(0);
        aF.mDia(0);
    }//GEN-LAST:event_bu_eliminarMouseClicked

    private void bu_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_cancelarMouseClicked
        // TODO add your handling code here:
        
        limpiarDatos();
    }//GEN-LAST:event_bu_cancelarMouseClicked

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
            java.util.logging.Logger.getLogger(appFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                appFecha fe= new appFecha();
                
                fe.setVisible(true);
                fe.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bu_agregar;
    private javax.swing.JButton bu_cancelar;
    private javax.swing.JButton bu_ejecutar;
    private javax.swing.JButton bu_eliminar;
    private javax.swing.JComboBox<String> cb_operacion;
    private javax.swing.JLabel la_anio;
    private javax.swing.JLabel la_dia;
    private javax.swing.JLabel la_mes;
    private javax.swing.JLabel la_operacion;
    private javax.swing.JScrollPane sp_panel;
    private javax.swing.JTextArea ta_panel;
    private javax.swing.JTextField tf_anio;
    private javax.swing.JTextField tf_dia;
    private javax.swing.JTextField tf_mes;
    // End of variables declaration//GEN-END:variables
}
