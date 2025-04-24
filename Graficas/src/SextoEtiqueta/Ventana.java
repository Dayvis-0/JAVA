package SextoEtiqueta;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Ventana extends JFrame{
    public Ventana () {
        setSize(500, 500);
        setTitle("Ventana con etiqueta");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        iniciarComponentes();
    }
    
    private void iniciarComponentes() {
        JPanel panel = new JPanel();
        
        /* setLayout(method) - establecer diseño
        Establecer el diseño del panel
        Cuando es null se desactiva el diseño
        */
        panel.setLayout(null);
        /* getContentPane() - obtener el panel del contenido
        Devuelve el objeto contetPane de este marco
        */
        this.getContentPane().add(panel); // Agregar el panel a la ventana
        
        JLabel eti = new JLabel();
        eti.setText("Hola mundo"); // Establecer el texto de la etiqueta
        eti.setBounds(200, 200, 100, 100);
        
        panel.add(eti);
    }
}