package ArbolIterativo;

public class appArbolI extends javax.swing.JFrame {

    cArbolI arbi1;

    public appArbolI() {
        initComponents();
        arbi1 = new cArbolI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_padre = new javax.swing.JTextField();
        tf_hijo = new javax.swing.JTextField();
        bu_agregar = new javax.swing.JButton();
        bu_modificar = new javax.swing.JButton();
        bu_eliminar = new javax.swing.JButton();
        cb_operaciones = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_rta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Padre:");

        jLabel2.setText("Hijo:");

        bu_agregar.setText("Agregar");
        bu_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_agregarMouseClicked(evt);
            }
        });

        bu_modificar.setText("Modificar");

        bu_eliminar.setText("Eliminar");

        cb_operaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vacio?", "Nodo", "Padre?", "HIjo?", "Elementos", "Nodos", "Preorden", "InOrden", "PosOrden", "Padres", "Hijos", "Existe", "Recorrer Padres", "Altura", "Nodo Menos Hijo", "Nodo Mas Hijos", "Recorrer Hijos", "Recorrer Hermanos", "Recorrer Hijos Unicos" }));

        jButton4.setText("Ejecutar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
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
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_padre, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_hijo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(cb_operaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(bu_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(bu_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bu_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tf_padre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(tf_hijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bu_modificar)
                                    .addComponent(bu_agregar)
                                    .addComponent(bu_eliminar))))
                        .addGap(18, 18, 18)
                        .addComponent(cb_operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bu_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_agregarMouseClicked
        // TODO add your handling code here:
        boolean rta = arbi1.agregar(tf_padre.getText(), tf_hijo.getText());
        if(rta){ ta_rta.setText("Elemento insertado"); }
        else{ ta_rta.setText("Elemento no insertado"); }
    }//GEN-LAST:event_bu_agregarMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        int opc = cb_operaciones.getSelectedIndex();
        switch (opc) {
            case 0: ta_rta.setText("Esta vacio? " + arbi1.estaVacio()); break;
            case 1: ta_rta.setText("Nodo: " + arbi1.nodo(tf_hijo.getText())); break;
            case 2: ta_rta.setText("Es padre? " + arbi1.esPadre(tf_hijo.getText())); break;
            case 3: ta_rta.setText("Es hijo? " + arbi1.esHijo(tf_hijo.getText())); break;
            case 4: ta_rta.setText("Elementos:  " + arbi1.recorrerNodos()); break;
            case 5: ta_rta.setText("Total nodos:  " + arbi1.nodos()); break;
            case 6: ta_rta.setText("Pre-orden:  " + arbi1.preOrden()); break;
            case 7: ta_rta.setText("In-orden:  " + arbi1.preOrden()); break;
            case 8: ta_rta.setText("Pos-orden:  " + arbi1.preOrden()); break;
            case 9: ta_rta.setText("Padres:  " + arbi1.padres()); break;
            case 10: ta_rta.setText("Hijos:  " + arbi1.hijos()); break;
            case 11: ta_rta.setText("Existe:  " + arbi1.existe(tf_hijo.getText())); break;
            case 12: ta_rta.setText("Recorrer padres:  " + arbi1.recorrerPadres()); break;
            case 13: ta_rta.setText("Altura:  " + arbi1.altura()); break;
            case 14: ta_rta.setText("Nodo menos hijos:  " + arbi1.nodoMenosHijos()); break;
            case 15: ta_rta.setText("Nodo mas hijos:  " + arbi1.nodoMasHijos()); break;
            case 16: ta_rta.setText("Recorrer hijos:  " + arbi1.recorrerHijos()); break;
            case 17: ta_rta.setText("Recorrer hermanos:  " + arbi1.recorreHermanos()); break;
            case 18: ta_rta.setText("Recorrer hijos unicos:  " + arbi1.recorreHijoUnico()); break;
        }
    }//GEN-LAST:event_jButton4MouseClicked


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
            java.util.logging.Logger.getLogger(appArbolI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appArbolI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appArbolI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appArbolI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                appArbolI ar1 = new appArbolI();
                
                ar1.setVisible(true);
                ar1.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bu_agregar;
    private javax.swing.JButton bu_eliminar;
    private javax.swing.JButton bu_modificar;
    private javax.swing.JComboBox<String> cb_operaciones;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta_rta;
    private javax.swing.JTextField tf_hijo;
    private javax.swing.JTextField tf_padre;
    // End of variables declaration//GEN-END:variables
}
