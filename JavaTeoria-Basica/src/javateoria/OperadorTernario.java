package javateoria;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {
    
        // Programa que dependiendo del promedio de un alumno, nos diga si aprobo o no un materia
        
        /*Sintaxis
        variable = (condicion) ? valor_verdadero : valor_falso*/
        
        Scanner teclado = new Scanner(System.in);
        float nota1, nota2, nota3, prome;
        String salida;
        
        System.out.println("Nota 1: ");
        nota1 = teclado.nextFloat();
        System.out.println("Nota 2: ");
        nota2 = teclado.nextFloat();
        System.out.println("Nota 3: ");
        nota3 = teclado.nextFloat();
        
        prome = (nota1 + nota2 + nota3) / 3;
        
        salida = (prome > 10.5) ?  "Aprobo" : "Reprobo"; 
        
        System.out.println("El alumno " + salida);
        
    }
    
}