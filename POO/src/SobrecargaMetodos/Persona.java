package SobrecargaMetodos;

public class Persona {
    // Atributos
    String nombre;
    String apellido;
    String hola;
    
    public Persona (String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    // Sobrecarga de contructores
    public Persona (String hola) {
        this.hola = hola;
    }
    
    // Sobrecarga de metodos
    public void correr() {
        System.out.println("Soy " + nombre + " mi apellido es " + apellido + " y estoy corriendo una maraton");
    }
    
    public void correr(int km) {
        System.out.println("He recorrido " + km + " kilometros");
    }
}