package Polimorfismo;

public class VehiculoTurismo extends Vehiculo {
    int nPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int nPuertas) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }
    
    public int getnPuertas() {
        return this.nPuertas;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("Matricula: " + this.matricula + "\nMarca: " + this.marca + 
                "\nModelo: " + this.modelo + "\nNumero de puertas: " + this.nPuertas);
    }
}