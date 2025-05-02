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
    public cArbolB arbol(Object pRaiz){
        cArbolB rta= null;
        if(!estaVacio()){
            if(aRaiz.toString().equals(pRaiz)){ rta= this; }
            else{
                if(pRaiz.toString().compareTo(aRaiz.toString())<0){
                    if(aSubArbolIzq != null){ rta= aSubArbolIzq.arbol(pRaiz);}
                }else{
                    if(aSubArbolDer != null){ rta= aSubArbolDer.arbol(pRaiz); }
                }
            }
        }
        return rta;
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
        boolean aux= false;
        if(!estaVacio()){
            if(pRaiz.equals(aRaiz)){
                aux= (aSubArbolIzq==null && aSubArbolDer==null);
            }else{
                if(pRaiz.toString().compareTo(aRaiz.toString())<=0){
                    if(aSubArbolIzq != null){ aux= aSubArbolIzq.esHoja(pRaiz); }
                }else{ if(aSubArbolDer != null){ aux= aSubArbolDer.esHoja(pRaiz); }}
            }
        }
        return aux;
    }
    public int altura(){
        int aI= 0, aD= 0;
        if(!estaVacio()){
            if(aSubArbolIzq != null){ aI= 1+aSubArbolIzq.altura(); }
            if(aSubArbolDer != null){ aD= 1+aSubArbolDer.altura(); }
        }
        return (aI>aD?aI:aD);
    }
    public String inOrden(){
        String rta= "";
        if(!estaVacio()){
            if(aSubArbolIzq != null){ rta= aSubArbolIzq.inOrden(); }
            rta= rta+" "+aRaiz.toString();
            if(aSubArbolDer != null){ rta= rta+aSubArbolDer.inOrden(); }
        }
        return rta;
    }
    public String posOrden(){
        String rta= "";
        if(!estaVacio()){
            if(aSubArbolIzq != null){ rta= aSubArbolIzq.inOrden(); }
            if(aSubArbolDer != null){ rta= rta+aSubArbolDer.inOrden(); }
            rta= rta+" "+aRaiz.toString();
        }
        return rta;
    }
    public int nodos(){
        int rta= 0;
        if(!estaVacio()){
            rta= 1;
            if(aSubArbolIzq != null){ rta= rta+aSubArbolIzq.nodos(); }
            if(aSubArbolDer != null){ rta= rta+aSubArbolDer.nodos(); }
        }
        return rta;
    }
    public int hojas(){
        int rta= 0;
        if(!estaVacio()){
            if(aSubArbolIzq == null && aSubArbolDer == null){ rta= 1; }
            if(aSubArbolIzq != null){ rta= rta+aSubArbolIzq.hojas(); }
            if(aSubArbolDer != null){ rta= rta+aSubArbolDer.hojas(); }
        }
        return rta;
    }
    private cArbolB maximo(){
        cArbolB rta= null;
        if(!estaVacio()){
            if(aSubArbolDer == null){ rta= this; }
            else{ rta= aSubArbolDer.maximo(); }
        }
        return rta;
    }
    private void limpiar(){
        if(!estaVacio()){
            if(aSubArbolIzq != null){
                if(aSubArbolIzq.sRaiz() == null){ aSubArbolIzq= null; }
                else{ aSubArbolIzq.limpiar(); }
            }
            if(aSubArbolDer != null){
                if(aSubArbolDer.sRaiz() == null){ aSubArbolDer= null; }
                else{ aSubArbolDer.limpiar(); }
            }
        }
    }
    public boolean eliminar(Object pRaiz){
        boolean rta= false;
        if(!estaVacio()){
            if(pRaiz.equals(aRaiz)){
                rta= true;
                if(aSubArbolIzq == null && aSubArbolDer == null){ aRaiz= null; }
                else{
                    if(aSubArbolIzq != null && aSubArbolDer != null){
                        cArbolB aux= aSubArbolIzq.maximo();
                        aRaiz= aux.sRaiz();
                        aSubArbolIzq.eliminar(aRaiz);
                    }else{
                        if(aSubArbolIzq != null){
                            aRaiz= aSubArbolIzq.sRaiz();
                            aSubArbolIzq= aSubArbolIzq.sSubArbolIzq();
                            aSubArbolDer= aSubArbolIzq.sSubArbolDer();
                        }
                        if(aSubArbolDer != null){
                            aRaiz= aSubArbolDer.sRaiz();
                            aSubArbolIzq= aSubArbolDer.sSubArbolIzq();
                            aSubArbolDer= aSubArbolDer.sSubArbolDer();
                        }
                    }
                }
            }else{
                if(aSubArbolIzq != null && pRaiz.toString().compareTo(aRaiz.toString()) < 0){
                    aSubArbolIzq.eliminar(pRaiz);
                }else if(aSubArbolDer != null){ aSubArbolDer.eliminar(pRaiz); }
            }
        }
        limpiar();
        return rta;
    }
}