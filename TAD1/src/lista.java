public class lista extends javax.swing.JFrame {
    //... atributo
    private cLista aL;
    public lista() {
        initComponents();
        aL= new cLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        la_elemento = new javax.swing.JLabel();
        tf_elemento = new javax.swing.JTextField();
        la_posicion = new javax.swing.JLabel();
        tf_posicion = new javax.swing.JTextField();
        bu_insertar = new javax.swing.JButton();
        bu_eliminar = new javax.swing.JButton();
        la_operacion = new javax.swing.JLabel();
        cb_operacion = new javax.swing.JComboBox<>();
        bu_ejecutar = new javax.swing.JButton();
        la_respuesta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        la_elemento.setText("Elemento:");

        tf_elemento.setColumns(5);

        la_posicion.setText("Posicion:");

        tf_posicion.setColumns(5);

        bu_insertar.setText("Insertar");
        bu_insertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_insertarMouseClicked(evt);
            }
        });

        bu_eliminar.setText("Eliminar");
        bu_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_eliminarMouseClicked(evt);
            }
        });

        la_operacion.setText("Operacion:");

        cb_operacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Esta vacio", "Iesimo", "Longitud", "Posicion", "Mostrar", "Mostrar invertido", "Mostrar duplicado", "Insertar último", "Insertar primero", "Insertar ordenado", "Máximo" }));

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
                        .addComponent(tf_elemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bu_insertar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(la_posicion)
                        .addGap(18, 18, 18)
                        .addComponent(tf_posicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bu_eliminar))
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
                    .addComponent(tf_elemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bu_insertar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_posicion)
                    .addComponent(tf_posicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bu_eliminar))
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

    private void bu_ejecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_ejecutarMouseClicked
        int posicion= cb_operacion.getSelectedIndex();
        switch (posicion) {
            case 0: la_respuesta.setText("Esta vacio: "+aL.estaVacia()); break;
            case 1: la_respuesta.setText("Elemento: "+aL.iesimo(Integer.parseInt(tf_posicion.getText()))); break;
            case 2: la_respuesta.setText("Longitud: "+aL.longitud()); break;
            case 3: la_respuesta.setText("Posicion: "+aL.posicion(tf_elemento.getText())); break;
            case 4: la_respuesta.setText("Mostrar: "+aL.mostrar()); break;
            case 5: la_respuesta.setText("Mostrar invertido: "+aL.mostrarI()); break;
            case 6: la_respuesta.setText("Respuesta: "+aL.mostrarDuplicado()); break;
            case 7: aL.insertarUltimo(tf_elemento.getText());la_respuesta.setText("Respuesta: Elemento insertado..."); break;
            case 8: aL.insertarPrimero(tf_elemento.getText()); la_respuesta.setText("Respuesta: Elemento insertado..."); break;
            case 9: aL.insertaOrdenado(tf_elemento.getText()); la_respuesta.setText("Respuesta: Elemento insertado..."); break;
            case 10: la_respuesta.setText("Máximo: "+aL.maximo("")); break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_bu_ejecutarMouseClicked

    private void bu_insertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_insertarMouseClicked
        aL.insertar(tf_elemento.getText(), Integer.parseInt(tf_posicion.getText()));
        limpiar();
    }//GEN-LAST:event_bu_insertarMouseClicked

    private void bu_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_eliminarMouseClicked
        aL.eliminar(Integer.parseInt(tf_posicion.getText()));
        limpiar();
    }//GEN-LAST:event_bu_eliminarMouseClicked

    private void limpiar(){
        tf_elemento.setText(""); tf_posicion.setText("");
        cb_operacion.setSelectedIndex(0);
        la_respuesta.setText("Respuesta:");
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
            java.util.logging.Logger.getLogger(lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bu_ejecutar;
    private javax.swing.JButton bu_eliminar;
    private javax.swing.JButton bu_insertar;
    private javax.swing.JComboBox<String> cb_operacion;
    private javax.swing.JLabel la_elemento;
    private javax.swing.JLabel la_operacion;
    private javax.swing.JLabel la_posicion;
    private javax.swing.JLabel la_respuesta;
    private javax.swing.JTextField tf_elemento;
    private javax.swing.JTextField tf_posicion;
    // End of variables declaration//GEN-END:variables
}
