package javateoria;

import java.util.Scanner;

public class CondicionalIf {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        System.out.println("Numero: ");
        numero = teclado.nextInt();
        
        if (numero > 18) {
            System.out.println("El numero es mayor a 18");
        }
        
    }
    
}