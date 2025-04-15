package javateoria;

import java.util.Scanner;

public class ArraysUnidimensionales {

    public static void main(String[] args) {
        
        int n0 [] = new int[5];
        int[] n1 = {1,2,3}; // Declaracion y asignacion de un array
        int[] n2;
        Scanner tecla = new Scanner(System.in);
        
        n2 = new int[]{1,2,3,4,5};
        
        System.out.println("Numero en la posion 1: " + n1[0] + "\nNumero en la posicion 3: " + n2[2]);
        
        System.out.println("Pedir con un for");
        for (int i=0; i<n0.length; i++) {
            System.out.println("Numero["+ i +"]: ");
            n0[i] = tecla.nextInt();
        }
        
        System.out.println("Mostrar con un for");
        for (int i=0; i<n0.length; i++) {
            System.out.println("Numero en [" + i +"]: " + n0[i]);
        }
        
    }
    
}