package Herencia;

public class Estudiante extends Persona {
    private int codigoEstudiante;
    private float notaFinal;

    public Estudiante(String nombre, String apellido, int codigoEstudiante, float notaFinal) {
        super(nombre, apellido);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre() + "\nApellido: " + getApellido() + 
                "\nCodigo de estudiante: " + this.codigoEstudiante + "\nNota final: " + this.notaFinal);
    }
}