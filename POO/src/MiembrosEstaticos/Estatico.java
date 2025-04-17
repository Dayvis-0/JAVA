package MiembrosEstaticos;

public class Estatico {
    // Atributo estatico
    private static String frase = "Primera frase";
    
    // Metodo estico
    public static int sumar(int n1, int n2) {
        int suma = n1 + n2;
        return suma;
    }
    
    // Para atributos estaticos ya no es necesario instanciarlo
    // un atributo estatico ya no le pertenece a un objeto si no a una clase 
    public static void main(String[] args) {
        /*Estatico obj1 = new Estatico();
        Estatico obj2 = new Estatico();
        
        obj2.frase = "Segunda frase";
        
        System.out.println(obj1.frase + "\n" + obj2.frase);*/
        System.out.println("La frase es: " + Estatico.frase);
        
        System.out.println("\nLa suma es: " + Estatico.sumar(1,2));
    }
}