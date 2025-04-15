package POO;
        
public class Persona {
    String  nombre;
    String apellido;
    
    void mostrarPersona() {
        System.out.println("Nombre: " + nombre + "\nApellido: " + apellido);
    }
    
    public static void main(String[] args) {
        System.out.println("\tCreacion de Clase y Objetos Persona");
        
        var ob1 = new Persona();
        var ob2 = new Persona();
        
        ob1.apellido = "Atao";
        ob1.nombre = "Dayvis";
        
        // Mostrar los datos del primer objeto
        ob1.mostrarPersona();

        // Mostrar los datos del primer objeto
        System.out.println("");
        ob2.apellido = "Adsa";
        ob2.nombre = "Dayvis";
        
        ob2.mostrarPersona();
        
    }
}