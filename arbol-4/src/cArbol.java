    public class cArbol {
    //... atributos
    private Object aRaiz;
    private cArbol aPhijo, aShermano;
    //... constructor
    protected cArbol(){ aRaiz= null; aPhijo= null; aShermano= null; }
    protected cArbol(Object pRaiz){ aRaiz= pRaiz; aPhijo= null; aShermano= null; }
    //... modificadores
    public void mRaiz(Object pRaiz){ aRaiz= pRaiz; }
    public void mPhijo(cArbol pPhijo){ aPhijo= pPhijo; }
    public void mShermano(cArbol pShermano){ aShermano= pShermano; }
    //... selectores
    public Object sRaiz(){ return aRaiz; }
    public cArbol sPhijo(){ return aPhijo; }
    public cArbol sShermano(){ return aShermano; }
    //... metodos basicos
    public boolean estaVacio(){ return (aRaiz==null); }
    public cArbol subArbol(Object pRaiz){
        cArbol rta= null;
        if(!estaVacio()){
            if(aRaiz.equals(pRaiz)){ rta= this; }
            else{
                if(aPhijo != null){ rta= aPhijo.subArbol(pRaiz); }
                if(rta == null && aShermano != null){
                    rta= aShermano.subArbol(pRaiz);
                }
            }
        }
        return rta;
    }
    private boolean agregarHermano(Object pRaiz){
        boolean rta= false;
        if(aShermano == null){ aShermano= new cArbol(pRaiz); rta= true; }
        else{ rta= aShermano.agregarHermano(pRaiz); }
        return rta;
    }
    private boolean agregarHijo(Object pRaiz){
        boolean rta= false;
        if(aPhijo == null){ aPhijo= new cArbol(pRaiz); rta= true; }
        else{ rta= aPhijo.agregarHermano(pRaiz);}
        return rta;
    }
    public boolean agregar(cArbol pPadre, Object pHijo){
        boolean rta= false;
        if(pPadre == null && estaVacio()){ aRaiz= pHijo; rta= true; }
        else{
            if(pPadre != null){ rta= pPadre.agregarHijo(pHijo); }
        }
        return rta;
    }
    public String recorreArbol(){
        String rta= "";
        if(!estaVacio()){
            rta= aRaiz+"";
            if(aPhijo != null){ rta= rta+" "+aPhijo.recorreArbol(); }
            if(aShermano != null){ rta= rta+" "+aShermano.recorreArbol(); }
        }return rta;
    }
    //... otros metodos
    public int contarNodos(){
        int rta= 0;
        if(!estaVacio()){
            rta= 1;
            if(aPhijo != null){ rta= rta+aPhijo.contarNodos(); }
            if(aShermano != null){ rta= rta+aShermano.contarNodos(); }
        }return rta;
    }
    public boolean esHijo(Object pRaiz){
        boolean rta= false;
        if(!estaVacio()){
            if(aRaiz.equals(pRaiz)){
                if(aPhijo == null){ rta= true; }
            }else{
                if(aPhijo != null){ rta= aPhijo.esHijo(pRaiz); }
                if(!rta && aShermano != null){ rta= aShermano.esHijo(pRaiz);}
            }
        }return rta;
    }
    public boolean esHijo2(Object pRaiz){
        boolean rta= false;
        if(!estaVacio()){
            if(aRaiz.equals(pRaiz) && aPhijo == null){ rta= true; }
            if(!rta && aPhijo != null){ rta= aPhijo.esHijo(pRaiz); }
            if(!rta && aShermano != null){ rta= aShermano.esHijo(pRaiz);}
        }return rta;
    }
    public boolean esPadre(Object pRaiz){
        boolean rta= false;
        if(!estaVacio()){
            if(aRaiz.equals(pRaiz)){
                if(aPhijo != null){ rta= true; }
            }else{
                if(aPhijo != null){ rta= aPhijo.esHijo(pRaiz); }
                if(!rta && aShermano != null){ rta= aShermano.esHijo(pRaiz);}
            }
        }return rta;
    }
    public Object padre(Object pRaiz){
        Object rta= null;
        //... hacerlo en casita
        return rta;
    }
    private String hermanoPreO(){
        String rta= "";
        if(aShermano != null){
            rta= aShermano.preOrden();
            rta= rta+aShermano.hermanoPreO();
        }return rta;
    }
    public String preOrden(){
        String rta= "";
        if(!estaVacio()){
            rta= aRaiz+" ";//... primero muestro la raiz
            if(aPhijo != null){
                rta= rta+aPhijo.preOrden();//... muestro en pre orden el primer hijo
                rta= rta+aPhijo.hermanoPreO();//... muestro los hermanos del primer hijo en pre orden
            }
        }return rta;
    }
}