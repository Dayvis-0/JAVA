package EjerRaiz1;

/*Escriba, compile y ejecute un programa que dado un número 
ingresado por teclado retorne su raíz cuadrada (emplee la función sqrt) y el cuadrado 
(emplee la función pow). Se debe mostrar el número y los resultados de los cálculos 
efectuados. */

public class RaizCuadrada {
    private float anumero;
    
    protected RaizCuadrada () { anumero = 0; }
    
    // modificadores
    public void mNumero (int pNumero) {anumero = pNumero; }
    // selector 
    public float sNumero () {return anumero; }
    // metodo para raiz 
    public float Raiz() { 
        
        float retu = (float) Math.sqrt(anumero);
        
        return retu;
    }
}