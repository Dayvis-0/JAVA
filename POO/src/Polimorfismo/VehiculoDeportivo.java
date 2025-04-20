package Polimorfismo;

public class VehiculoDeportivo extends Vehiculo {
    int cilandrada;
    
    public VehiculoDeportivo (String matricula, String marca, String modelo, int cilandrada) {
        super(matricula, marca, modelo);
        this.cilandrada = cilandrada;
    }
    
    public int getCilandrada() {
        return this.cilandrada;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("Matricula: " + this.matricula + "\nMarca: " + this.marca + 
                "\nModelo: " + this.modelo + "\nCilandrada: " + this.cilandrada);
    }
}