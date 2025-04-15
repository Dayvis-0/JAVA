package javateoria;       

public class Funciones {
    
    // Se pone solo static porque no lo llamaremos desde otro
    static void saluda(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }
    
    // Suma de dos numeros
    static int suma(int a, int b) {
        var resu = a + b;
        
        return resu;
    }
    
    // Funcion recursiva
    static int sumaRecu(int n) {
        if (n == 0) {
            return 0;
        }
        else {
            return n + sumaRecu(n-1);
        }
    }
    
    public static void main(String[] args) {

        int a = 100, b=2003;
        var resu_suma = suma(a,b);
        var resu_suma_recu = sumaRecu(5);
        
        saluda("Hola desde Java");
        
        System.out.println("La suma de " + a + " y " + b + " es: " + resu_suma);
        System.out.println("La suma acumulativa recursividad es: " + resu_suma_recu);
        
    }
    
}