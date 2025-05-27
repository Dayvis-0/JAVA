package Arboles;

public class cArbolI {
    //... atributos
    cNodoA aRaiz;
    //..constructor
    protected cArbolI() { aRaiz = null; }
    //...modificador
    public void mRaiz(cNodoA pRaiz) { aRaiz = pRaiz; }
    //...selector
    public cNodoA sRaiz(){ return aRaiz; }
    //.. metodo basicos
    public boolean estaVacio() { return (aRaiz == null); }
}