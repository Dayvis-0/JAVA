package javateoria;

import java.util.Scanner;

public class Operadores {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int nume1, nume2, suma;
        double divi;
        
        System.out.println("Numero 1: ");
        nume1 = teclado.nextInt();
        System.out.println("Numero 2: ");
        nume2 = teclado.nextInt();
        
        suma = nume1 + nume2;
        divi = nume1 / nume2;
        
        System.out.println("La suma es: " + suma + "\nLa division es: " + divi);
    }
    
}