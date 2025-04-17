package SobrecargaMetodos;

public class Main {
    public static void main(String[] args) {
        Persona per1 = new Persona("Dayvis", "Atao");
        per1.correr();
        
        Persona per2 = new Persona("Hola");
        per2.correr(12);
    }
}