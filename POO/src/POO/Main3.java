package POO;

import javax.swing.JOptionPane;

public class Main3 {
    
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Primer nummero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Primer nummero: "));
        
        Operacion3 op1 = new Operacion3(n1, n2);
        
        int resu1 = op1.sumar();
        int resu2 = op1.restar();

        System.out.println("La suma es: " + resu1 + "\nLa resta es: " + resu2);
    }
    
}
