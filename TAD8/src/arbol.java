public class arbol extends javax.swing.JFrame {
    private cArbol a;
    public arbol() {
        initComponents();
        //... constructores
        a= new cArbol();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        la_elemento = new javax.swing.JLabel();
        la_posicion = new javax.swing.JLabel();
        tf_padre = new javax.swing.JTextField();
        tf_hijo = new javax.swing.JTextField();
        bu_agregar = new javax.swing.JButton();
        la_operacion = new javax.swing.JLabel();
        cb_operacion = new javax.swing.JComboBox<>();
        bu_ejecutar = new javax.swing.JButton();
        la_respuesta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        la_elemento.setText("Padre:");

        la_posicion.setText("Hijo:");

        tf_padre.setColumns(5);

        tf_hijo.setColumns(5);

        bu_agregar.setText("Agregar");
        bu_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_agregarMouseClicked(evt);
            }
        });

        la_operacion.setText("Operacion:");

        cb_operacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Esta vacio", "Sub Arbol", "Mostrar", "Es hijo", "Es padre", "Su padre", "Recorre pre-orden", "Recorreo in-orden", "Recorreo pos-orden", "Altura" }));

        bu_ejecutar.setText("Ejecutar");
        bu_ejecutar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_ejecutarMouseClicked(evt);
            }
        });

        la_respuesta.setText("Respuesta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(la_elemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_padre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bu_agregar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(la_posicion)
                        .addGap(18, 18, 18)
                        .addComponent(tf_hijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(la_operacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_operacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bu_ejecutar))
                    .addComponent(la_respuesta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_elemento)
                    .addComponent(tf_padre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bu_agregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_posicion)
                    .addComponent(tf_hijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_operacion)
                    .addComponent(cb_operacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bu_ejecutar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(la_respuesta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bu_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_agregarMouseClicked
        boolean rta = a.agregar(a.subArbol(tf_padre.getText()), tf_hijo.getText());
        limpiar();
        la_respuesta.setText("Insertado: "+rta);
    }//GEN-LAST:event_bu_agregarMouseClicked

    private void bu_ejecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_ejecutarMouseClicked
        int posicion= cb_operacion.getSelectedIndex();
        switch (posicion) {
            case 0: la_respuesta.setText("Esta vacio: "+a.estaVacio()); break;
            case 1: la_respuesta.setText("Direccion: "+a.subArbol(tf_hijo.getText())); break;
            case 2: la_respuesta.setText("Mostrar: "+a.mostrar()); break;
            case 3: la_respuesta.setText("Es hijo: "+a.esHijo(tf_hijo.getText())); break;
            case 4: la_respuesta.setText("Es padre: "+a.esPadre(tf_hijo.getText())); break;
            case 5: cArbol aux= a.padre(tf_hijo.getText());
            la_respuesta.setText("Su padre: "+(aux!=null?aux.sRaiz():null)); break;
            case 6: la_respuesta.setText("Pre orden: "+a.preOrden()); break;
            case 7: la_respuesta.setText("In orden: "+a.inOrden()); break;
            case 8: la_respuesta.setText("Pos orden: "+a.posOrden()); break;
            case 9: la_respuesta.setText("Altura: "+a.altura()); break;
            default:
            throw new AssertionError();
        }
    }//GEN-LAST:event_bu_ejecutarMouseClicked

    private void limpiar(){
        tf_padre.setText("");
        tf_hijo.setText("");
        la_respuesta.setText("Respuesta: ");
        cb_operacion.setSelectedIndex(0);
    }
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
            java.util.logging.Logger.getLogger(arbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(arbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(arbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(arbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new arbol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bu_agregar;
    private javax.swing.JButton bu_ejecutar;
    private javax.swing.JComboBox<String> cb_operacion;
    private javax.swing.JLabel la_elemento;
    private javax.swing.JLabel la_operacion;
    private javax.swing.JLabel la_posicion;
    private javax.swing.JLabel la_respuesta;
    private javax.swing.JTextField tf_hijo;
    private javax.swing.JTextField tf_padre;
    // End of variables declaration//GEN-END:variables
}
