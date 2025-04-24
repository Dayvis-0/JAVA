package CuatroColor;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Ventana extends JFrame {
    public Ventana () {
        setSize(500, 500);
        setTitle("Ventana con color");
        setLocationRelativeTo(null);
        /* setMinimumSize(Dimension minimunSize) - establecer minimo tamaño
        Estable el tamaño minimo de esta ventana en un valor contante.
        */
        setMinimumSize(new Dimension(200, 200));
        /*getContentPane() - obtener panel del contenido
        Devuelve el objeto contentPane para este marco 
        setBackground(Color c) - establecer fondo
        Establece el color de fondo de este componente
        */
        this.getContentPane ().setBackground(Color.BLUE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}