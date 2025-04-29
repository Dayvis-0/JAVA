package Arbol;

public class cArbol {
    // Atributos
    private Object aRaiz;
    private cArbol aPHijo, aSHermano;
    // Constructor
    protected cArbol () { aRaiz = null; aPHijo = null; aSHermano = null; }
    protected cArbol (Object pRaiz) { aRaiz = pRaiz; aPHijo = null; aSHermano = null; }
    // MOdificadores
    public void mRaiz(Object pRaiz) {  aRaiz = pRaiz;}
    public void mPHijo(cArbol pPHijo) { aPHijo = pPHijo;}
    public void mSHermano(cArbol pPHermano) {  aPHijo = pPHermano;}
    // Selectores
    public Object sRaiz () {return aRaiz;}
    public Object sPHijo () {return aPHijo;}
    public Object sSHermano () {return aSHermano;}
    // Metodoss basicos
    public boolean estaVacio() {return aRaiz == null;}
    
    public cArbol subArbol(Object pRaiz) {
        cArbol rta = null;
        if (! estaVacio()) {
            if (aRaiz.equals(pRaiz)) { return rta = this; }
            if (rta == null && aPHijo != null) {
                rta = aPHijo.subArbol(pRaiz);
            }
            if (rta == null && aSHermano != null) {
                rta = aSHermano.subArbol(pRaiz);
            }
        }
        return rta;
    }
    
    public String recorrerNodo() {
        String rta = "";
        
        if (! estaVacio()) {
            rta = aRaiz + "";
            if (aPHijo != null) {
                rta = rta + aPHijo.recorrerNodo();
            }
            if (aSHermano != null) {
                rta = rta + aSHermano.recorrerNodo();
            }
        }
        return rta;
    }
}