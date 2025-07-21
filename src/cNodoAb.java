public class cNodoAb {
    //... atributos
    private Object aRaiz;
    private cNodoAb aSubArbolIzq, aSubArbolDer;
    //... constructor
    protected cNodoAb(){ aRaiz= null; aSubArbolIzq= null; aSubArbolDer= null; }
    protected cNodoAb(Object pRaiz){ aRaiz= pRaiz; aSubArbolIzq= null; aSubArbolDer= null; }
    //... modificador
    public void mRaiz(Object pRaiz){ aRaiz= pRaiz; }
    public void mSubArbolIzq(cNodoAb pSubArbolIzq){ aSubArbolIzq= pSubArbolIzq; }
    public void mSubArbolDer(cNodoAb pSubArbolDer){ aSubArbolDer= pSubArbolDer; }
    //... selector
    public Object sRaiz(){ return aRaiz; }
    public cNodoAb sSubArbolIzq(){ return aSubArbolIzq; }
    public cNodoAb sSubArbolDer(){ return aSubArbolDer; }
}