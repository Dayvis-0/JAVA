package Arboles;

public class appArbol extends javax.swing.JFrame {
    private String padre, hijo;
    private cArbol pArbol;
            
    public appArbol() {
        initComponents();
        
        hijo = "";
        padre = "";
        pArbol = new cArbol();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_rta = new javax.swing.JTextArea();
        tf_padre = new javax.swing.JTextField();
        tf_hijo = new javax.swing.JTextField();
        bu_agregar = new javax.swing.JButton();
        bu_modificar = new javax.swing.JButton();
        bu_aliminar = new javax.swing.JButton();
        cb_operaciones = new javax.swing.JComboBox<>();
        bu_ejecutar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese Padre:");

        jLabel2.setText("Ingrese Hijo:");

        ta_rta.setColumns(20);
        ta_rta.setRows(5);
        jScrollPane1.setViewportView(ta_rta);

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

        bu_aliminar.setText("Eliminar");
        bu_aliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_aliminarMouseClicked(evt);
            }
        });

        cb_operaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Altura", "Nivel", "Contar nodos", "Es hijo?", "Es padre?", "Pre-orden", "In-orden", "Pos-orden", "Contar padres", "Contar hijos", "Existe?", "Recorrer hijos", "Recorrer padres", "Mayor?", "Recorrer: ", "EsEqui?" }));

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
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bu_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(bu_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bu_aliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cb_operaciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(bu_ejecutar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_padre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_hijo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_padre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_hijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bu_agregar)
                        .addComponent(bu_modificar)
                        .addComponent(bu_aliminar)
                        .addComponent(cb_operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bu_ejecutar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bu_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_agregarMouseClicked
        // TODO add your handling code here:
        padre = tf_padre.getText();
        hijo = tf_hijo.getText();
        // 
        pArbol.agregar(padre, hijo);
        
        ta_rta.setText(pArbol.imprimiNodos());
    }//GEN-LAST:event_bu_agregarMouseClicked

    private void bu_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_modificarMouseClicked
        // TODO add your handling code here:
        
        String raizAmodificar = tf_padre.getText(); 
        String nuevoValor = tf_hijo.getText(); 
        
        pArbol.modificar(raizAmodificar, nuevoValor);
        
        ta_rta.setText(pArbol.imprimiNodos());
    }//GEN-LAST:event_bu_modificarMouseClicked

    private void bu_aliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_aliminarMouseClicked
        // TODO add your handling code here:
        String raizEliminar = tf_padre.getText();
        
        pArbol.eliminar(raizEliminar);
        
        ta_rta.setText(pArbol.imprimiNodos());
    }//GEN-LAST:event_bu_aliminarMouseClicked

    private void bu_ejecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_ejecutarMouseClicked
        // TODO add your handling code here:    
        int opci = cb_operaciones.getSelectedIndex();
        
        switch(opci) {
            case 0: ta_rta.setText("La altura es: " + pArbol.altura()); break;
            case 1: ta_rta.setText("La nivel es: " + pArbol.nivel(tf_padre.getText(), 0)); break;
            case 2: ta_rta.setText("El numero de nodos es: " + pArbol.contarNodos()); break;
            case 3: ta_rta.setText("Es hijo? " + pArbol.esHijo(tf_padre.getText())); break;
            case 4: ta_rta.setText("Es padre? " + pArbol.esPadre(tf_padre.getText())); break;
            case 5: ta_rta.setText("Pre-orden " + pArbol.preOrden()); break;
            case 6: ta_rta.setText("In-orden" + pArbol.inOrden()); break;
            case 7: ta_rta.setText("Pos-orden" + pArbol.posOrden()); break;
            case 8: ta_rta.setText("Contar padres: " + pArbol.padres()); break;
            case 9: ta_rta.setText("Contar hijos: " + pArbol.hijos()); break;
            case 10: ta_rta.setText("Existe: " + pArbol.existe(tf_padre.getText())); break;
            case 11: ta_rta.setText("Recorrer hijos" + pArbol.recorrerHijos()); break;
            case 12: ta_rta.setText("Recorrer padres" + pArbol.recorrerPadres()); break;
            case 13: ta_rta.setText("Mayor? " + pArbol.mayor()); break;
            case 14: ta_rta.setText("Recorrer: "+pArbol.recorrerNodos()); break;
            case 15: ta_rta.setText("Es Equi-Extremo: "+pArbol.esEquiExtremo()); break;
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
                appArbol arb1 = new appArbol();
                
                arb1.setVisible(true);
                arb1.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bu_agregar;
    private javax.swing.JButton bu_aliminar;
    private javax.swing.JButton bu_ejecutar;
    private javax.swing.JButton bu_modificar;
    private javax.swing.JComboBox<String> cb_operaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta_rta;
    private javax.swing.JTextField tf_hijo;
    private javax.swing.JTextField tf_padre;
    // End of variables declaration//GEN-END:variables
}
