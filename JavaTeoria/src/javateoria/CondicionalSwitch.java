package javateoria;

import java.util.Scanner;

public class CondicionalSwitch {

    public static void main(String[] args) {
        
        int dia;
        String nombDia;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un numero del 1 al 7");
        dia = teclado.nextInt();
        
        switch (dia) {
            case 1: nombDia = "Lunes" ; break;
            case 2: nombDia = "Martes" ; break;
            case 3: nombDia = "Miercoles" ; break;
            case 4: nombDia = "Jueves" ; break;
            case 5: nombDia = "Viernes" ; break;
            case 6: nombDia = "Sabado" ; break;
            case 7: nombDia = "Domingo" ; break;
            default: nombDia = "Dia incorrecto";
        }
        
        System.out.println("El dia de la semana es: " + nombDia);
        
    }
    
}