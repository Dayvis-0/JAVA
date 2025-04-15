package POO;

public class Operacion1 {
    int suma;
    int resta;
    
    public void sumar(int n1, int n2) {
        suma = n1 + n2;
    } 
    
    public void restar(int n1, int n2) {
        resta = n1 - n2;
    } 
    
    public void mostResu(){
        System.out.println("La suma es: " + suma  + "\nLa resta es: " + resta);
    }
    
}