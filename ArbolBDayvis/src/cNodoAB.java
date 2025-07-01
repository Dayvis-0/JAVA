public class cNodoAB {
    //... atributos
    private Object aElemento;
    private cNodoAB aSubArbolIzq, aSubArbolDer;
    //... constructor
    protected cNodoAB(){ aElemento= null;
        aSubArbolIzq= null; aSubArbolDer= null;
    }
    protected cNodoAB(Object pElemento){ aElemento= pElemento;
        aSubArbolIzq= null; aSubArbolDer= null;
    }
    //... modificadores
    public void mElemento(Object pElemento){ aElemento= pElemento; }
    public void mSubArbolIzq(cNodoAB pSubArbolIzq){ aSubArbolIzq= pSubArbolIzq; }
    public void mSubArbolDer(cNodoAB pSubArbolDer){ aSubArbolDer= pSubArbolDer; }
    //... modificadores
    public Object sElemento(){ return aElemento; }
    public cNodoAB sSubArbolIzq(){ return aSubArbolIzq; }
    public cNodoAB sSubArbolDer(){ return aSubArbolDer; }
}