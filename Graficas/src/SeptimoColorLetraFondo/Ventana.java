package SeptimoColorLetraFondo;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {
    public Ventana () {
        setSize(500, 500);
        setTitle("Ventana con texto y fondo de color");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void iniciarComponentes() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        JLabel eti = new JLabel();
        eti.setText("Hola mundo");
        eti.setBounds(500, 500, 100, 100);
        eti.setForeground(Color.BLUE);
        eti.setOpaque(true);
        eti.setBackground(Color.WHITE);
        
        panel.add(eti);
    }
}