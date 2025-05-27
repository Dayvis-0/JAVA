package Arboles;

public  class cNodoA {
    //... atributos
    private Object aElemento;
    private cNodoA aPhijo, aShermano;
    //... constructor
    protected cNodoA() { aElemento = null; aPhijo = null; aShermano = null;}
    protected cNodoA(Object pElemento) { aElemento = pElemento; aPhijo = null; aShermano = null;}
    //...modificadores
    public void mElemento(Object pElemento) { aElemento = pElemento; }
    public void mPhijo(cNodoA pPhijo) { aElemento = pPhijo; }
    public void mShermano(cNodoA pShermano) { aElemento = pShermano; }
    //... selectores
    public Object sElemento() {return aElemento; }
    public cNodoA sPhijo() {return aPhijo; }
    public cNodoA sShermano() {return aShermano; }
}