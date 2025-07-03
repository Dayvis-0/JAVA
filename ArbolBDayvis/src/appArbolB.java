public class appArbolB extends javax.swing.JFrame {
    private cArbolB arbb1;
    
    public appArbolB() {
        initComponents();
        arbb1 = new cArbolB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        la_nodo = new javax.swing.JLabel();
        tf_nodo = new javax.swing.JTextField();
        bu_agregar = new javax.swing.JButton();
        bu_limpiar = new javax.swing.JButton();
        bu_eliminar = new javax.swing.JButton();
        cb_opciones = new javax.swing.JComboBox<>();
        bu_ejecutar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_rta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        la_nodo.setText("Nodo:");

        bu_agregar.setText("Agregar");
        bu_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_agregarMouseClicked(evt);
            }
        });

        bu_limpiar.setText("Limpiar");
        bu_limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_limpiarMouseClicked(evt);
            }
        });

        bu_eliminar.setText("Eliminar");
        bu_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_eliminarMouseClicked(evt);
            }
        });

        cb_opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vacio?", "Maximo", "Minimo", "Arbol", "Pre-Orden", "In-Orden", "Pos-Orden", "Existe arbol?", "Es hoja?", "Es padre?", "Altura", "Nivel", "RecorrerPadre", "RecorrerHoja", "Padres", "Hojas", "Su padre String?", "Su padre Object?", "Maximo String", "Elementos" }));

        bu_ejecutar.setText("Ejecutar");
        bu_ejecutar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_ejecutarMouseClicked(evt);
            }
        });

        ta_rta.setColumns(20);
        ta_rta.setRows(5);
        jScrollPane1.setViewportView(ta_rta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(la_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(tf_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bu_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bu_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cb_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bu_ejecutar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bu_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(la_nodo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bu_agregar)
                    .addComponent(bu_limpiar)
                    .addComponent(bu_eliminar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bu_ejecutar)
                    .addComponent(cb_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bu_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_agregarMouseClicked
            // TODO add your handling code here:
        if (arbb1.agregar(tf_nodo.getText())) {
            ta_rta.setText("Elemento insertado");
        }
        else {
            ta_rta.setText("Elemento no insertado");
        }
    }//GEN-LAST:event_bu_agregarMouseClicked

    private void bu_ejecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_ejecutarMouseClicked
        // TODO add your handling code here:
        int opc = cb_opciones.getSelectedIndex();
        
        switch(opc) {
            case 0: ta_rta.setText("Vacio: " + arbb1.estaVacio());break;
            case 1: ta_rta.setText("Maximo: " + (arbb1.maximo() != null ? arbb1.maximo().sRaiz(): ""));break;
            case 2: ta_rta.setText("Minimo: " + (arbb1.minimo() != null ? arbb1.minimo().sRaiz(): ""));break;
            case 3: ta_rta.setText("Arbol: " + arbb1.arbol(tf_nodo.getText())); break;
            case 4: ta_rta.setText("Pre-Orden: " + arbb1.preOrden()); break;
            case 5: ta_rta.setText("In-Orden: " + arbb1.inOrden()); break;
            case 6: ta_rta.setText("Pos-Orden: " + arbb1.posOrden()); break;
            case 7: ta_rta.setText("Existe arbol: " + arbb1.existe(tf_nodo.getText())); break;
            case 8: ta_rta.setText("Es hoja?: " + arbb1.esHoja(tf_nodo.getText())); break;
            case 9: ta_rta.setText("Es padre?: " + arbb1.esPadre(tf_nodo.getText())); break;
            case 10: ta_rta.setText("Altura: " + arbb1.altura()); break;
            case 11: ta_rta.setText("Nivel: " + arbb1.nivel(tf_nodo.getText(), 0)); break;
            case 12: ta_rta.setText("Recorrer padres: " + arbb1.recorrerPadre()); break;
            case 13: ta_rta.setText("Recorrer hojas: " + arbb1.recorrerHoja()); break;
            case 14: ta_rta.setText("Padres: " + arbb1.padres()); break;
            case 15: ta_rta.setText("Hojas: " + arbb1.hojas()); break;
            case 16: ta_rta.setText("Su padre es String: " + arbb1.suPadre(tf_nodo.getText())); break;
            case 17: ta_rta.setText("Su padre es Object: " + arbb1.padre(tf_nodo.getText())); break;
            case 18: ta_rta.setText("Mayor: " + arbb1.maximoString()); break;
            case 19: ta_rta.setText("Elementos: " + arbb1.elementos()); break;
        }
    }//GEN-LAST:event_bu_ejecutarMouseClicked

    private void bu_limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_limpiarMouseClicked
        // TODO add your handling code here:
        tf_nodo.setText("");
        ta_rta.setText("");
    }//GEN-LAST:event_bu_limpiarMouseClicked

    private void bu_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_eliminarMouseClicked
        // TODO add your handling code here:
        arbb1.eliminar(tf_nodo.getText());
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
            java.util.logging.Logger.getLogger(appArbolB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appArbolB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appArbolB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appArbolB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                appArbolB arb1 = new appArbolB();
                
                arb1.setVisible(true);
                arb1.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bu_agregar;
    private javax.swing.JButton bu_ejecutar;
    private javax.swing.JButton bu_eliminar;
    private javax.swing.JButton bu_limpiar;
    private javax.swing.JComboBox<String> cb_opciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel la_nodo;
    private javax.swing.JTextArea ta_rta;
    private javax.swing.JTextField tf_nodo;
    // End of variables declaration//GEN-END:variables
}
