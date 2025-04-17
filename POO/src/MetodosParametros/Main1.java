package MetodosParametros;

import javax.swing.JOptionPane;

public class Main1 {
    
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Primer nummero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Primer nummero: "));
        
        Operacion1 op1 = new Operacion1();
        
        op1.sumar(n1,n2);
        op1.restar(n1,n2);
        op1.mostResu();
    }
    
}
