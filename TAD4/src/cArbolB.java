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
    public String mostrar(){
        String aux= "";
        if(!estaVacio()){
            aux= aRaiz+" ";
            if(aSubArbolIzq != null){ aux= aux+aSubArbolIzq.mostrar(); }
            if(aSubArbolDer != null){ aux= aux+aSubArbolDer.mostrar(); }
        }
        return aux;
    }
}