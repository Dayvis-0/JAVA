public class opListas extends javax.swing.JFrame {
    //... atributos
    private cLista aL1, aL2, aL;
    public opListas() {
        initComponents();
        //... constructores
        aL1= new cLista();
        aL2= new cLista();
        aL= null;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        la_elemento1 = new javax.swing.JLabel();
        tf_elemento1 = new javax.swing.JTextField();
        bu_insertar1 = new javax.swing.JButton();
        bu_eliminar1 = new javax.swing.JButton();
        tf_posicion1 = new javax.swing.JTextField();
        la_posicion1 = new javax.swing.JLabel();
        la_operacion1 = new javax.swing.JLabel();
        cb_operacion1 = new javax.swing.JComboBox<>();
        bu_ejecutar1 = new javax.swing.JButton();
        la_respuesta1 = new javax.swing.JLabel();
        la_elemento2 = new javax.swing.JLabel();
        tf_elemento2 = new javax.swing.JTextField();
        bu_insertar2 = new javax.swing.JButton();
        la_posicion2 = new javax.swing.JLabel();
        tf_posicion2 = new javax.swing.JTextField();
        bu_eliminar2 = new javax.swing.JButton();
        la_operacion2 = new javax.swing.JLabel();
        cb_operacion2 = new javax.swing.JComboBox<>();
        bu_ejecutar2 = new javax.swing.JButton();
        la_respuesta2 = new javax.swing.JLabel();
        la_operacionL = new javax.swing.JLabel();
        cb_operacionL = new javax.swing.JComboBox<>();
        bu_ejecutarL = new javax.swing.JButton();
        la_respuestaL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        la_elemento1.setText("Elemento:");

        tf_elemento1.setColumns(5);

        bu_insertar1.setText("Insertar");
        bu_insertar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_insertar1MouseClicked(evt);
            }
        });

        bu_eliminar1.setText("Eliminar");
        bu_eliminar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_eliminar1MouseClicked(evt);
            }
        });

        tf_posicion1.setColumns(5);

        la_posicion1.setText("Posicion:");

        la_operacion1.setText("Operacion:");

        cb_operacion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Esta vacio", "Iesimo", "Longitud", "Posicion", "Mostrar", "Mostrar invertido", "Mostrar duplicado", "Insertar último", "Insertar primero", "Insertar ordenado", "Máximo", "ordenado ascendente" }));

        bu_ejecutar1.setText("Ejecutar");
        bu_ejecutar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_ejecutar1MouseClicked(evt);
            }
        });

        la_respuesta1.setText("Respuesta:");

        la_elemento2.setText("Elemento:");

        tf_elemento2.setColumns(5);

        bu_insertar2.setText("Insertar");
        bu_insertar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_insertar2MouseClicked(evt);
            }
        });

        la_posicion2.setText("Posicion:");

        tf_posicion2.setColumns(5);

        bu_eliminar2.setText("Eliminar");
        bu_eliminar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_eliminar2MouseClicked(evt);
            }
        });

        la_operacion2.setText("Operacion:");

        cb_operacion2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Esta vacio", "Iesimo", "Longitud", "Posicion", "Mostrar", "Mostrar invertido", "Mostrar duplicado", "Insertar último", "Insertar primero", "Insertar ordenado", "Máximo", "ordenado ascendente" }));

        bu_ejecutar2.setText("Ejecutar");
        bu_ejecutar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_ejecutar2MouseClicked(evt);
            }
        });

        la_respuesta2.setText("Respuesta:");

        la_operacionL.setText("Operacion con listas:");

        cb_operacionL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar lista", "Concatenar lista", "Intersección lista", "Diferencia lista", "Union lista", "Diferencia simetica" }));

        bu_ejecutarL.setText("Ejecutar");
        bu_ejecutarL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_ejecutarLMouseClicked(evt);
            }
        });

        la_respuestaL.setText("Respuesta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(la_elemento1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_elemento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bu_insertar1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(la_posicion1)
                                .addGap(18, 18, 18)
                                .addComponent(tf_posicion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bu_eliminar1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(la_operacion1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_operacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bu_ejecutar1))
                            .addComponent(la_respuesta1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(la_elemento2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_elemento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bu_insertar2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(la_posicion2)
                                .addGap(18, 18, 18)
                                .addComponent(tf_posicion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bu_eliminar2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(la_operacion2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_operacion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bu_ejecutar2))
                            .addComponent(la_respuesta2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(la_operacionL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_operacionL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bu_ejecutarL))
                    .addComponent(la_respuestaL))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(la_elemento2)
                            .addComponent(tf_elemento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu_insertar2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(la_posicion2)
                            .addComponent(tf_posicion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu_eliminar2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(la_operacion2)
                            .addComponent(cb_operacion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu_ejecutar2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(la_respuesta2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(la_elemento1)
                            .addComponent(tf_elemento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu_insertar1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(la_posicion1)
                            .addComponent(tf_posicion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu_eliminar1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(la_operacion1)
                            .addComponent(cb_operacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu_ejecutar1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(la_respuesta1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_operacionL)
                    .addComponent(cb_operacionL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bu_ejecutarL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(la_respuestaL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bu_insertar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_insertar1MouseClicked
        aL1.insertar(tf_elemento1.getText(), Integer.parseInt(tf_posicion1.getText()));
        limpiar1();
    }//GEN-LAST:event_bu_insertar1MouseClicked
    private void limpiar1(){
        tf_elemento1.setText(""); tf_posicion1.setText("");
        cb_operacion1.setSelectedIndex(0);
        la_respuesta1.setText("Respuesta:");
    }
    private void bu_eliminar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_eliminar1MouseClicked
        aL1.eliminar(Integer.parseInt(tf_posicion1.getText()));
        limpiar1();
    }//GEN-LAST:event_bu_eliminar1MouseClicked

    private void bu_ejecutar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_ejecutar1MouseClicked
        int posicion= cb_operacion1.getSelectedIndex();
        switch (posicion) {
            case 0: la_respuesta1.setText("Esta vacio: "+aL1.estaVacia()); break;
            case 1: la_respuesta1.setText("Elemento: "+aL1.iesimo(Integer.parseInt(tf_posicion1.getText()))); break;
            case 2: la_respuesta1.setText("Longitud: "+aL1.longitud()); break;
            case 3: la_respuesta1.setText("Posicion: "+aL1.posicion(tf_elemento1.getText())); break;
            case 4: la_respuesta1.setText("Mostrar: "+aL1.mostrar()); break;
            case 5: la_respuesta1.setText("Mostrar invertido: "+aL1.mostrarI()); break;
            case 6: la_respuesta1.setText("Respuesta: "+aL1.mostrarDuplicado()); break;
            case 7: aL.insertarUltimo(tf_elemento1.getText());la_respuesta1.setText("Respuesta: Elemento insertado..."); break;
            case 8: aL.insertarPrimero(tf_elemento1.getText()); la_respuesta1.setText("Respuesta: Elemento insertado..."); break;
            case 9: aL.insertaOrdenado(tf_elemento1.getText()); la_respuesta1.setText("Respuesta: Elemento insertado..."); break;
            case 10: la_respuesta1.setText("Máximo: "+aL.maximo("")); break;
            case 11: la_respuesta1.setText("ordenado ascendete: "+aL.ordenadoAsc()); break;
            default:
            throw new AssertionError();
        }
    }//GEN-LAST:event_bu_ejecutar1MouseClicked

    private void bu_insertar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_insertar2MouseClicked
        aL2.insertar(tf_elemento2.getText(), Integer.parseInt(tf_posicion2.getText()));
        limpiar2();
    }//GEN-LAST:event_bu_insertar2MouseClicked
    private void limpiar2(){
        tf_elemento2.setText(""); tf_posicion2.setText("");
        cb_operacion2.setSelectedIndex(0);
        la_respuesta2.setText("Respuesta:");
    }
    private void bu_eliminar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_eliminar2MouseClicked
        aL2.eliminar(Integer.parseInt(tf_posicion2.getText()));
        limpiar2();
    }//GEN-LAST:event_bu_eliminar2MouseClicked

    private void bu_ejecutar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_ejecutar2MouseClicked
        int posicion= cb_operacion2.getSelectedIndex();
        switch (posicion) {
            case 0: la_respuesta2.setText("Esta vacio: "+aL2.estaVacia()); break;
            case 1: la_respuesta2.setText("Elemento: "+aL2.iesimo(Integer.parseInt(tf_posicion2.getText()))); break;
            case 2: la_respuesta2.setText("Longitud: "+aL2.longitud()); break;
            case 3: la_respuesta2.setText("Posicion: "+aL2.posicion(tf_elemento2.getText())); break;
            case 4: la_respuesta2.setText("Mostrar: "+aL2.mostrar()); break;
            case 5: la_respuesta2.setText("Mostrar invertido: "+aL2.mostrarI()); break;
            case 6: la_respuesta2.setText("Respuesta: "+aL2.mostrarDuplicado()); break;
            case 7: aL2.insertarUltimo(tf_elemento2.getText());la_respuesta2.setText("Respuesta: Elemento insertado..."); break;
            case 8: aL2.insertarPrimero(tf_elemento2.getText()); la_respuesta2.setText("Respuesta: Elemento insertado..."); break;
            case 9: aL2.insertaOrdenado(tf_elemento2.getText()); la_respuesta2.setText("Respuesta: Elemento insertado..."); break;
            case 10: la_respuesta2.setText("Máximo: "+aL2.maximo("")); break;
            case 11: la_respuesta2.setText("ordenado ascendete: "+aL2.ordenadoAsc()); break;
            default:
            throw new AssertionError();
        }
    }//GEN-LAST:event_bu_ejecutar2MouseClicked
 
    private void bu_ejecutarLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_ejecutarLMouseClicked
        int posicion= cb_operacionL.getSelectedIndex();
        switch (posicion) {
            case 0: la_respuestaL.setText("Mostrar: "+(aL!=null?aL.mostrar():aL)); break;
            case 1: la_respuestaL.setText("Lista concatenada..."); aL= concatenarLista(aL1, aL2, new cLista()); break;
            case 2: la_respuestaL.setText("Lista intersecada..."); aL= interseccionLista(aL1, aL2, new cLista()); break;
            case 3: la_respuestaL.setText("Lista diferenciada..."); aL= diferenciaLista(aL1, aL2, new cLista()); break;
            case 4: la_respuestaL.setText("Unión lista"); unionLista(aL1, aL2); break;
            case 5: la_respuestaL.setText("Diferencia simetrica lista"); diferenciaSlista(aL1, aL2); break;
            default:
            throw new AssertionError();
        }
    }//GEN-LAST:event_bu_ejecutarLMouseClicked
    public cLista concatenarLista(cLista pLista1, cLista pLista2, cLista pLista){
        if(!pLista2.estaVacia()){
            pLista.mSubLista(new cLista());
            pLista.mElemento(pLista2.sElemento());
            concatenarLista(pLista1, pLista2.sSubLista(), pLista.sSubLista());
        }
        if(!pLista1.estaVacia()){
            pLista.mSubLista(new cLista());
            pLista.mElemento(pLista1.sElemento());
            concatenarLista(pLista1.sSubLista(), pLista2, pLista.sSubLista());
        }
        return pLista;
    }
    public cLista interseccionLista(cLista pLista1, cLista pLista2, cLista pLista){
        String elemento= "";
        if(!pLista1.estaVacia()){
            elemento= pLista1.sElemento().toString();
            if(pLista2.posicion(elemento)>0){
                pLista.mSubLista(new cLista());
                pLista.mElemento(elemento);
                interseccionLista(pLista1.sSubLista(), pLista2, pLista.sSubLista());
            }else{ interseccionLista(pLista1.sSubLista(), pLista2, pLista);}
        }
        return pLista;
    }
    public cLista diferenciaLista(cLista pLista1, cLista pLista2, cLista pLista){
        String elemento= "";
        if(!pLista1.estaVacia()){
            elemento= pLista1.sElemento().toString();
            if(pLista2.posicion(elemento)>0){
                diferenciaLista(pLista1.sSubLista(), pLista2, pLista);
            }else{
                pLista.mSubLista(new cLista());
                pLista.mElemento(elemento);
                diferenciaLista(pLista1.sSubLista(), pLista2, pLista.sSubLista());
            }
        }
        return pLista;
    }
    public void unionLista(cLista pLista1, cLista pLista2){
        aL= concatenarLista(pLista1, diferenciaLista(pLista2, pLista1, new cLista()), new cLista());
    }
    public void diferenciaSlista(cLista pLista1, cLista pLista2){
        aL= concatenarLista(diferenciaLista(pLista1, pLista2, new cLista()),
                diferenciaLista(pLista2, pLista1, new cLista()), new cLista());
    }
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
            java.util.logging.Logger.getLogger(opListas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(opListas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(opListas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(opListas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new opListas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bu_ejecutar1;
    private javax.swing.JButton bu_ejecutar2;
    private javax.swing.JButton bu_ejecutarL;
    private javax.swing.JButton bu_eliminar1;
    private javax.swing.JButton bu_eliminar2;
    private javax.swing.JButton bu_insertar1;
    private javax.swing.JButton bu_insertar2;
    private javax.swing.JComboBox<String> cb_operacion1;
    private javax.swing.JComboBox<String> cb_operacion2;
    private javax.swing.JComboBox<String> cb_operacionL;
    private javax.swing.JLabel la_elemento1;
    private javax.swing.JLabel la_elemento2;
    private javax.swing.JLabel la_operacion1;
    private javax.swing.JLabel la_operacion2;
    private javax.swing.JLabel la_operacionL;
    private javax.swing.JLabel la_posicion1;
    private javax.swing.JLabel la_posicion2;
    private javax.swing.JLabel la_respuesta1;
    private javax.swing.JLabel la_respuesta2;
    private javax.swing.JLabel la_respuestaL;
    private javax.swing.JTextField tf_elemento1;
    private javax.swing.JTextField tf_elemento2;
    private javax.swing.JTextField tf_posicion1;
    private javax.swing.JTextField tf_posicion2;
    // End of variables declaration//GEN-END:variables
}
