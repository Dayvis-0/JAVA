package javateoria;

public class BucleWhile {

    public static void main(String[] args) {
        
        int cont = 0;
        boolean band = true;
        
        /*while (cont < 10) {
            System.out.println("Numero N: " + cont);
            cont ++;
        }*/
        
        while (band) {
            if (cont == 10) {
                band = false;
            }
            System.out.println("Valor de bandera: " + band);
            cont ++;
        }
        
    }
    
}