package Arbol;

public class cArbol {
    private Object aRaiz;
    private cArbol aPHijo, aSHermano;
    protected cArbol () { aRaiz = null; aPHijo = null; aSHermano = null; }
    protected cArbol (Object pRaiz) { aRaiz = pRaiz; aPHijo = null; aSHermano = null; }
    public void mRaiz(Object pRaiz) {  aRaiz = pRaiz;}
    public void mPHijo(cArbol pPHijo) { aPHijo = pPHijo;}
    public void mSHermano(cArbol pPHermano) {  aPHijo = pPHermano;}
    public Object sRaiz () {return aRaiz;}
    public Object sPHijo () {return aPHijo;}
    public Object sSHermano () {return aSHermano;}
}