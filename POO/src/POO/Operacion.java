package POO;

import javax.swing.JOptionPane;

public class Operacion {
    int num1;
    int num2;
    int suma;
    int resta;
    
    public void leerNumeros() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo numero: "));
    }
    
    public void sumar() {
        suma = num1 + num2;
    }
    
    public void restar() {
        resta = num1 - num2;
    }
    
    public void mostResu() {
        System.out.println("La suma es: " + suma + "\nLa resta es: " + resta);
    }
    
}