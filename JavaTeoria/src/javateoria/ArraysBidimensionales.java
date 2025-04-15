package javateoria;

import java.util.Scanner;

public class ArraysBidimensionales {

    public static void main(String[] args) {
        
        Scanner tecla = new Scanner(System.in);
        // Primera forma de declarar y asignar
        int[][] matriz = {
            {1,2},
            {3,4}
        };
        // Segunda forma de declarar
        int[][] matriz1;
        int matriz2[][] = new int[2][2];
        
        matriz1 = new int[][] {
            {12,123},
            {67,54}  
        };
        
        // Pedir con for
        for (int i=0; i<matriz2.length; i++) {
            for (int j=0; j<matriz2[i].length; j++) {
                System.out.println("Numero: ");
                matriz[i][j] = tecla.nextInt();
            }
        }
        
        //Mostrar con for
        for (int i=0; i<matriz1.length; i++){
            for (int j=0; j<matriz1[i].length; j++) {
                System.out.println("Numero en ["+i+"]["+j+"]: " + matriz1[i][j]);
            }
            System.out.println(" ");
        }
        
    }
    
}