public class appArbolI extends javax.swing.JFrame {
    //... atributos
    private cArbolI aAi;
    public appArbolI() {
        initComponents();
        //... construir arbol
        aAi= new cArbolI();
        /*aAi.mRaiz(new cNodoA("a"));
        aAi.sRaiz().mPhijo(new cNodoA("b"));
        aAi.sRaiz().sPhijo().mShermano(new cNodoA("c"));*/
    }
    private void limpiar(){
        tf_padre.setText("");
        tf_hijo.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        la_padre = new javax.swing.JLabel();
        tf_padre = new javax.swing.JTextField();
        la_hijo = new javax.swing.JLabel();
        tf_hijo = new javax.swing.JTextField();
        la_metodo = new javax.swing.JLabel();
        cb_metodo = new javax.swing.JComboBox<>();
        bu_ejecutar = new javax.swing.JButton();
        bu_eliminar = new javax.swing.JButton();
        bu_agregar = new javax.swing.JButton();
        sp_rta = new javax.swing.JScrollPane();
        ta_rta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arbol Jerarquico Iterativo");

        la_padre.setText("Padre:");

        tf_padre.setColumns(5);

        la_hijo.setText("Hijo:");

        tf_hijo.setColumns(5);

        la_metodo.setText("Métodos:");

        cb_metodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Esta vacio", "Nodo", "Recorre nodos", "Contar nodos", "Es hijo", "Es padre", "Pre-orden", "In-orden (tarea)", "Pos-orden (tarea)", "Padre (tarea)", "Contar padres", "Contar hijos", "Existe", "Altura", "Nivel", "Recorre padres", "Recorre hijos", "Mayor" }));

        bu_ejecutar.setText("Ejecutar");
        bu_ejecutar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_ejecutarMouseClicked(evt);
            }
        });

        bu_eliminar.setText("Eliminar");

        bu_agregar.setText("Agregar");
        bu_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_agregarMouseClicked(evt);
            }
        });

        ta_rta.setColumns(20);
        ta_rta.setRows(5);
        sp_rta.setViewportView(ta_rta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(la_metodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_metodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(la_hijo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_hijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(la_padre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_padre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bu_agregar)
                    .addComponent(bu_eliminar)
                    .addComponent(bu_ejecutar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp_rta, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sp_rta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(la_padre)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_padre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bu_agregar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(la_hijo)
                            .addComponent(tf_hijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu_eliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(la_metodo)
                            .addComponent(cb_metodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu_ejecutar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bu_ejecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_ejecutarMouseClicked
        //... leer datos
        int opc= cb_metodo.getSelectedIndex();
        switch (opc) {
            case 0: ta_rta.setText("Esta vacio: "+aAi.estaVacio()); break;
            case 1: ta_rta.setText("Nodo: "+aAi.nodo(tf_hijo.getText())); break;
            case 2: ta_rta.setText("Elementos: "+aAi.recorreNodo());break;
            case 3: ta_rta.setText("Total nodos: "+aAi.nodos()); break;
            case 4: ta_rta.setText("Es hijo: "+aAi.esHijo(tf_hijo.getText())); break;
            case 5: ta_rta.setText("Es padre: "+aAi.esPadre(tf_hijo.getText())); break;
            case 6: ta_rta.setText("Pre orden: "+aAi.preOrden()); break;
            case 7: ta_rta.setText("In orden: "+aAi.inOrden()); break;
            case 8: ta_rta.setText("Pos orden: "+aAi.posOrden()); break;
            case 9: ta_rta.setText("Padre: "+aAi.padre(tf_hijo.getText())); break;
            case 10: ta_rta.setText("Padres: "+aAi.padres()); break;
            case 11: ta_rta.setText("Hijos: "+aAi.hijos()); break;
            /*case 13: ta_rta.setText("Existe: "+aA.existe(tf_hijo.getText())); break;
            case 14: ta_rta.setText("Altura: "+aA.altura()); break;
            case 15: ta_rta.setText("Nivel: "+aA.nivel(tf_hijo.getText(), 0)); break;
            case 16: ta_rta.setText("Padres: "+aA.recorrePadre()); break;
            case 17: ta_rta.setText("Hijos: "+aA.recorreHijo()); break;
            case 18: ta_rta.setText("Mayor: "+aA.mayor()); break;*/
        }
    }//GEN-LAST:event_bu_ejecutarMouseClicked

    private void bu_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_agregarMouseClicked
        //... leer datos
        String padre= tf_padre.getText(), hijo= tf_hijo.getText();
        //... procesar datos
        if(aAi.agregar(padre, hijo)){
            ta_rta.setText("Elemento insertado...");
            limpiar();
        }else{ta_rta.setText("Elemento no insertado...");}
    }//GEN-LAST:event_bu_agregarMouseClicked

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
            java.util.logging.Logger.getLogger(appArbolI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appArbolI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appArbolI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appArbolI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new appArbolI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bu_agregar;
    private javax.swing.JButton bu_ejecutar;
    private javax.swing.JButton bu_eliminar;
    private javax.swing.JComboBox<String> cb_metodo;
    private javax.swing.JLabel la_hijo;
    private javax.swing.JLabel la_metodo;
    private javax.swing.JLabel la_padre;
    private javax.swing.JScrollPane sp_rta;
    private javax.swing.JTextArea ta_rta;
    private javax.swing.JTextField tf_hijo;
    private javax.swing.JTextField tf_padre;
    // End of variables declaration//GEN-END:variables
}
