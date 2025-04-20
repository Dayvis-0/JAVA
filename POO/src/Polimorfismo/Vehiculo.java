package Polimorfismo;

public class Vehiculo {
    protected String matricula;
    protected String marca;
    protected String modelo;
    
    public Vehiculo (String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String getMatricula() {
        return this.matricula;
    }
    
    public String getMarca() {
        return this.marca;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void mostrarDatos() {
        System.out.println("Matricula: " + this.matricula + "\nMarca: " + this.marca + 
                "\nModelo: " + this.modelo);
    }
}