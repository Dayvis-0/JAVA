package POO;

import javax.swing.JOptionPane;

public class Main2 {
    
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Primer nummero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Primer nummero: "));
        
        Operacion2 op1 = new Operacion2();
        
        int resu1 = op1.sumar(n1,n2);
        int resu2 = op1.restar(n1,n2);
        
        System.out.println("La suma es: " + resu1 + "\nLa resta es: " + resu2);
    }
    
}
