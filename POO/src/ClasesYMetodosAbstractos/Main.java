package ClasesYMetodosAbstractos;

public class Main {
    public static void main(String[] args) {
        Planta pla1 = new Planta();
        AnimalCarnivoro anica1 = new AnimalCarnivoro();
        AnimalHervivoro anihe1 = new AnimalHervivoro();
        
        pla1.alimentarse();
        anica1.alimentarse();
        anihe1.alimentarse();
    }
}