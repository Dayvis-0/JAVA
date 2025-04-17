package Constantes;

public class Main {
    public static void main(String[] args) {
        Persona per1 = new Persona("Dayvis", "Atao");
        
        per1.mostrarDatos();
        
        per1.setApellido("Flores");
        per1.getApellido();
        
        per1.mostrarDatos();
    }
}