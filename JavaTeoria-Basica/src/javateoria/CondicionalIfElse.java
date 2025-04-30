package javateoria;

import java.util.Scanner;

public class CondicionalIfElse {

    public static void main(String[] args) {
        
        int num;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Numero: ");
        num = teclado.nextInt();
        
        if (num == 18) {
            System.out.println("El numero es 18");
        }
        else {
            if (num > 18) {
                System.out.println("El numero es mayor a 18");
            }
            else {
                System.out.println("El numero es menor a 18");
            }           
        }

    }
    
}