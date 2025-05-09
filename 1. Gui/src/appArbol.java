public class appArbol extends javax.swing.JFrame {
    private cArbol a1;
    
    public appArbol() {
        initComponents();
        
        a1 = new cArbol();
    }
    
    public int contarNodos(cArbol pA1) {
        if (pA1 == null) { return 0; }
        else {
            return 1 + contarNodos(pA1.sSHermano()) + contarNodos(pA1.sSHijo());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        la_padre = new javax.swing.JLabel();
        la_hijo = new javax.swing.JLabel();
        tf_padre = new javax.swing.JTextField();
        tf_hijo = new javax.swing.JTextField();
        bu_agregar = new javax.swing.JButton();
        la_operacion = new javax.swing.JLabel();
        cb_operaciones = new javax.swing.JComboBox<>();
        bu_ejecutar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_rta = new javax.swing.JTextArea();
        bu_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        la_padre.setText("Padre:");

        la_hijo.setText("Hijo:");

        bu_agregar.setText("Agregar");
        bu_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_agregarMouseClicked(evt);
            }
        });

        la_operacion.setText("Operacion:");

        cb_operaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Esta vacio", "SubArbol", "Recorrer nodos", "Contar nodos 1", "Contar nodos 2" }));

        bu_ejecutar.setText("Ejecutar");
        bu_ejecutar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_ejecutarMouseClicked(evt);
            }
        });

        ta_rta.setColumns(20);
        ta_rta.setRows(5);
        jScrollPane1.setViewportView(ta_rta);

        bu_eliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(la_operacion, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(la_hijo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(tf_hijo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(la_padre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_padre, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bu_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bu_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bu_ejecutar, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(la_padre)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_padre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bu_agregar)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(la_hijo)
                                .addComponent(tf_hijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bu_eliminar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(la_operacion)
                            .addComponent(cb_operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu_ejecutar))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bu_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_agregarMouseClicked
        // TODO add your handling code here:
        boolean rta = a1.agregar(a1.subArbol(tf_padre.getText()), tf_hijo.getText());
        
        ta_rta.setText("insertado: " + rta);
    }//GEN-LAST:event_bu_agregarMouseClicked

    private void bu_ejecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_ejecutarMouseClicked
        // TODO add your handling code here:
        int posi = cb_operaciones.getSelectedIndex();
        
        switch (posi) {
            case 0: ta_rta.setText("Esta vacio: " + a1.isEmpty()); break;
            case 1: ta_rta.setText("Sub arbol: " + a1.subArbol(tf_hijo.getText())); break;
            case 2: ta_rta.setText("Elementos: " + a1.recorrerArbol()); break;
            case 3: ta_rta.setText("Total nodos: " + a1.contarNodos());
            case 4: ta_rta.setText("Total nodos: " + contarNodos(a1));
        } 
    }//GEN-LAST:event_bu_ejecutarMouseClicked

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
            java.util.logging.Logger.getLogger(appArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                appArbol ap1 = new appArbol();
                
                ap1.setVisible(true);
                ap1.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bu_agregar;
    private javax.swing.JButton bu_ejecutar;
    private javax.swing.JButton bu_eliminar;
    private javax.swing.JComboBox<String> cb_operaciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel la_hijo;
    private javax.swing.JLabel la_operacion;
    private javax.swing.JLabel la_padre;
    private javax.swing.JTextArea ta_rta;
    private javax.swing.JTextField tf_hijo;
    private javax.swing.JTextField tf_padre;
    // End of variables declaration//GEN-END:variables
}
