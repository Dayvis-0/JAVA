package Constantes;

public class Persona {
    private final String nombre; // Usar final el atributo se pone como constante
    private String apellido;
    
    public Persona (String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre + "\nApellido: " + this.apellido);
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}