public class cArbolB {
    //... atributos
    private Object aRaiz;
    private cArbolB aSubArbolIzq, aSubArbolDer;
    //... constructores
    protected cArbolB(){
        aRaiz= null; aSubArbolIzq= null; aSubArbolDer= null;
    }
    protected cArbolB(Object pRaiz){
        aRaiz= pRaiz; aSubArbolIzq= null; aSubArbolDer= null;
    }
    protected cArbolB(Object pRaiz, cArbolB pSubArbolIzq, cArbolB pSubArbolDer){
        aRaiz= pRaiz;
        aSubArbolIzq= pSubArbolIzq; aSubArbolDer= pSubArbolDer;
    }
    //... modificadores
    public void mRaiz(Object pRaiz){ aRaiz= pRaiz; }
    public void mSubArbolIzq(cArbolB pSubArbolIzq){ aSubArbolIzq= pSubArbolIzq; }
    public void mSubArbolDer(cArbolB pSubArbolDer){ aSubArbolDer= pSubArbolDer; }
    //... selectores
    public Object sRaiz(){ return aRaiz; }
    public cArbolB sSubArbolIzq(){ return aSubArbolIzq; }
    public cArbolB sSubArbolDer(){ return aSubArbolDer; }
    //... metodos primitivos
    public boolean estaVacio(){ return (aRaiz==null); }
    public void agregar(Object pRaiz){
        if(estaVacio()){ aRaiz= pRaiz; }
        else{
            if(pRaiz.toString().compareTo(aRaiz.toString())<=0){
                if(aSubArbolIzq == null){ aSubArbolIzq= new cArbolB(); }
                aSubArbolIzq.agregar(pRaiz);
            }else{
                if(aSubArbolDer == null){ aSubArbolDer= new cArbolB(); }
                aSubArbolDer.agregar(pRaiz);
            }
        }
    }
    public String preOrden(){
        String aux= "";
        if(!estaVacio()){
            aux= aRaiz+" ";
            if(aSubArbolIzq != null){ aux= aux+aSubArbolIzq.preOrden(); }
            if(aSubArbolDer != null){ aux= aux+aSubArbolDer.preOrden(); }
        }
        return aux;
    }
    //... otros metodos metodos
    public cArbolB antecesor(Object pRaiz){
        cArbolB aux= null;
        if(!estaVacio()){
            if(pRaiz.toString().compareTo(aRaiz.toString())<=0){
                if(aSubArbolIzq != null){
                     if(aSubArbolIzq.sRaiz().equals(pRaiz)){ aux= this; }
                     else{ aux= aSubArbolIzq.antecesor(pRaiz); }
                }
            }else{
                if(aSubArbolDer != null){
                    if(aSubArbolDer.sRaiz().equals(pRaiz)){ aux= this; }
                    else{ aux= aSubArbolDer.antecesor(pRaiz); }
                }
            }
        }
        return aux;
    }
    public boolean esHoja(Object pRaiz){
    }
    public int altura(){}
    public int nivel(Object pRaiz){}
}