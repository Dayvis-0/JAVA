
import javax.swing.JOptionPane;

public class appFecha extends javax.swing.JFrame {
    //... atributos
    private cFecha aF;
    public appFecha() {
        initComponents();
        //... construir clase
        aF= new cFecha();
    } 
    private void mostrar(){
        String rta= "Fecha: ";
        rta= rta+"\nDí­a: "+aF.sDia();
        rta= rta+"\nMes: "+aF.sMes();
        rta= rta+"\nAño: "+aF.sAnio();
        ta_panel.setText(rta);
    }
    private void validar(){
        int dia= Integer.parseInt(tf_dia.getText());
        int mes= Integer.parseInt(tf_mes.getText());
        int anio= Integer.parseInt(tf_anio.getText());
        if(aF.validaFecha(dia, mes, anio)){
            JOptionPane.showMessageDialog(null, "Fecha correcta");
        }else{JOptionPane.showMessageDialog(null, "Fecha incorrecta");}
    }
    private void limpiar(){
        tf_dia.setText(""); tf_mes.setText(""); tf_anio.setText("");
        ta_panel.setText("");
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

        tf_mes.setColumns(5);

        tf_anio.setColumns(5);

        cb_operacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar", "Validar" }));

        bu_agregar.setText("Agregar");
        bu_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_agregarMouseClicked(evt);
            }
        });

        bu_cancelar.setText("Cancelar");
        bu_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu_cancelarMouseClicked(evt);
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

        ta_panel.setColumns(20);
        ta_panel.setRows(5);
        sp_panel.setViewportView(ta_panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(la_operacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_operacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bu_ejecutar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(la_dia)
                                .addGap(18, 18, 18)
                                .addComponent(tf_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bu_agregar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(la_mes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bu_cancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(la_anio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bu_eliminar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sp_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(la_dia)
                            .addComponent(tf_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu_agregar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(la_mes)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bu_cancelar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(la_anio)
                            .addComponent(tf_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu_eliminar)))
                    .addComponent(sp_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_operacion)
                    .addComponent(cb_operacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bu_ejecutar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bu_ejecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_ejecutarMouseClicked
        //... escoger la opcion seleccionada
        int opc= cb_operacion.getSelectedIndex();
        switch (opc) {
            case 0: mostrar(); break;
            case 1: validar(); break;
        }
    }//GEN-LAST:event_bu_ejecutarMouseClicked

    private void bu_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_agregarMouseClicked
        //... leer datos
        int dia= Integer.parseInt(tf_dia.getText());
        int mes= Integer.parseInt(tf_mes.getText());
        int anio= Integer.parseInt(tf_anio.getText());
        if(aF.validaFecha(dia, mes, anio)){
            aF.mDia(dia); aF.mMes(mes); aF.mAnio(anio);
            limpiar();
            mostrar();
            JOptionPane.showMessageDialog(null, "Fecha registrada...");
        }else{JOptionPane.showMessageDialog(null, "Fecha incorrecta");}
    }//GEN-LAST:event_bu_agregarMouseClicked

    private void bu_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_cancelarMouseClicked
        //... limpiar area de trabajo
        limpiar();
    }//GEN-LAST:event_bu_cancelarMouseClicked

    private void bu_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu_eliminarMouseClicked
        //...alertar
        int rta= JOptionPane.showConfirmDialog(null, "Sí o No", "Desea eliminar?",
            JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if(rta==0){
            aF.mDia(1); aF.mMes(1); aF.mAnio(1000);
            ta_panel.setText("Fecha registrada:\n"+aF.toString());
        }
    }//GEN-LAST:event_bu_eliminarMouseClicked

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
                appFecha af1= new appFecha();
                
                af1.setVisible(true);
                af1.setLocationRelativeTo(null);
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
