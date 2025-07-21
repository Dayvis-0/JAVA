public class appArbolBi extends javax.swing.JFrame {
    //... reclarar atributos
    private cArbolBi aAb;
    public appArbolBi() {
        initComponents();
        //... construir arbol
        aAb= new cArbolBi();
    }
    private void limpiar(){ tf_raiz.setText("");}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        la_raiz = new javax.swing.JLabel();
        tf_raiz = new javax.swing.JTextField();
        bu_agregar = new javax.swing.JButton();
        bu_eliminar = new javax.swing.JButton();
        bu_ejecutar = new javax.swing.JButton();
        sp_rta = new javax.swing.JScrollPane();
        ta_rta = new javax.swing.JTextArea();
        la_metodo = new javax.swing.JLabel();
        cb_metodo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arbol binario iterativo");

        la_raiz.setText("Raiz:");

        tf_raiz.setColumns(5);

        bu_agregar.setText("Agregar");
        bu_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_agregarMouseClicked(evt);
            }
        });

        bu_eliminar.setText("Eliminar");
        bu_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_eliminarMouseClicked(evt);
            }
        });

        bu_ejecutar.setText("Ejecutar");
        bu_ejecutar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_ejecutarMouseClicked(evt);
            }
        });

        ta_rta.setColumns(20);
        ta_rta.setRows(5);
        sp_rta.setViewportView(ta_rta);

        la_metodo.setText("Métodos:");

        cb_metodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Esta vacio", "Pre-orden", "In-orden", "Pos-orden", "Arbol", "Existe", "Máximo", "Minimo", "Contar nodos", "Contar padres", "Contar hijos", "Es padre", "Es hijo", "Padre (falta hacer)", "Recorre padres", "Recorre hijos", "Recorre niveles", "Altura", "Nivel" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(la_raiz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_raiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bu_eliminar)
                            .addComponent(bu_agregar)
                            .addComponent(bu_ejecutar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp_rta, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(la_metodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_metodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(la_raiz)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_raiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bu_agregar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bu_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bu_ejecutar)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_metodo)
                    .addComponent(cb_metodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bu_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_agregarMouseClicked
        //... leer datos
        String raiz= tf_raiz.getText();
        //... procesar datos
        if(aAb.agregar(raiz)){ta_rta.setText("Elemento insertado...");
            limpiar();
        }else{ ta_rta.setText("Elemento no insertado..."); }
    }//GEN-LAST:event_bu_agregarMouseClicked

    private void bu_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_eliminarMouseClicked
        /*if(aAb.eliminar(tf_raiz.getText())){ ta_rta.setText("Elemento eliminado...");}
        else{ ta_rta.setText("Elemento no eliminado...");}*/
    }//GEN-LAST:event_bu_eliminarMouseClicked

    private void bu_ejecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_ejecutarMouseClicked
        //... leer datos
        int opc= cb_metodo.getSelectedIndex();
        switch (opc) {
            case 0: ta_rta.setText("Esta vacio: "+aAb.estaVacio()); break;
            case 1: ta_rta.setText("Pre orden: "+aAb.preOrden()); break;
            case 2: ta_rta.setText("In orden: "+aAb.inOrden()); break;
            case 3: ta_rta.setText("Pos orden: "+aAb.posOrden()); break;
            case 4: ta_rta.setText("Arbol: "+aAb.arbol(tf_raiz.getText())); break;
            case 5: ta_rta.setText("Existe: "+aAb.existe(tf_raiz.getText())); break;
            case 6: cNodoAb dir= aAb.maximo(); ta_rta.setText("Máximo: "+(dir!=null?dir.sRaiz():"---")); break;
            case 7: dir= aAb.minimo(); ta_rta.setText("Minimo: "+(dir!=null?dir.sRaiz():"---")); break;
            case 8: ta_rta.setText("Total nodos: "+aAb.nodos()); break;
            case 9: ta_rta.setText("Padres: "+aAb.padres()); break;
            case 10: ta_rta.setText("Hijos: "+aAb.hijos()); break;
            case 11: ta_rta.setText("Es padre: "+aAb.esPadre(tf_raiz.getText())); break;
            case 12: ta_rta.setText("Es hijo: "+aAb.esHijo(tf_raiz.getText())); break;
            case 13: dir= aAb.padre(tf_raiz.getText()); ta_rta.setText("Padre: "+(dir!=null?dir.sRaiz():"---")); break;
            case 14: ta_rta.setText("Padres: "+aAb.recorrePadre()); break;
            case 15: ta_rta.setText("Hijos: "+aAb.recorreHijo()); break;
            case 16: ta_rta.setText("Niveles: "+aAb.recorreNiveles()); break;
            /*
            
            case 14: ta_rta.setText("Altura: "+aA.altura()); break;
            case 15: ta_rta.setText("Nivel: "+aA.nivel(tf_hijo.getText(), 0)); break;
            */
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
            java.util.logging.Logger.getLogger(appArbolBi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appArbolBi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appArbolBi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appArbolBi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new appArbolBi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bu_agregar;
    private javax.swing.JButton bu_ejecutar;
    private javax.swing.JButton bu_eliminar;
    private javax.swing.JComboBox<String> cb_metodo;
    private javax.swing.JLabel la_metodo;
    private javax.swing.JLabel la_raiz;
    private javax.swing.JScrollPane sp_rta;
    private javax.swing.JTextArea ta_rta;
    private javax.swing.JTextField tf_raiz;
    // End of variables declaration//GEN-END:variables
}
