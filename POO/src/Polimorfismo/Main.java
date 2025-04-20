package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Vehiculo misVehiculos[] = new Vehiculo[4];
        
        misVehiculos[0] = new Vehiculo("GHSA", "Ferrari", "A12");
        misVehiculos[1] = new VehiculoTurismo("12SA", "Audi", "F3", 4);
        misVehiculos[2] = new VehiculoDeportivo("42SD", "Toyota", "SA", 50);
        misVehiculos[3] = new VehiculoFurgoneta("JDA", "Toyota", "PO1", 200);
        
        for (Vehiculo vehiculos:misVehiculos) {
            vehiculos.mostrarDatos();
            System.out.println("");
        }
    }
}