package TresVentanaPosicion;
import javax.swing.JFrame;

public class Ventana extends JFrame {
    
    public Ventana () {
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Ventana 3");
        //setLocation(100,200);
        /*setBounds - establecer limitees | Engloba tanto a setSize y setLocation
        Mueve y cambia de tamaño el componente
        */
        //setBounds(500,500,100,200); 
        /*setLocationRelativeTo . establece ubicaion relativa a 
        Establece la ubicacion de la ventana con respecto al componente especificado
        Si el componente es nulo la ventana se coloca en el centro de la pantallade destino
        Si el componente no es nulo, pero no se muestra, la ventana se coloca en el centro de la pantalla
        */
        setLocationRelativeTo(null);
    }
}   