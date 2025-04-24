package QuintoCrearPanel;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JFrame {
    public Panel () {
        setSize(500, 500);
        setTitle("Panel");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        iniciarComponente();
    }
    
    private void iniciarComponente() {
        JPanel panel = new JPanel();
        
        panel.setBackground(Color.GRAY);
        this.getContentPane().add(panel);
    }
}