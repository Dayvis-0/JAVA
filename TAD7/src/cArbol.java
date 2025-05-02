public class cArbol {
    //... atributos
    private Object aRaiz;
    private cArbol aPhijo, aShermano;
    //... constructores
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
    //... metodos primitivos
    public boolean estaVacio(){ return (aRaiz==null); }
    public cArbol subArbol(Object pRaiz){
        cArbol aux= null;
        if(!estaVacio()){
            if(aRaiz.equals(pRaiz)){ return this; }
            else{
                if(aPhijo!=null){ aux= aPhijo.subArbol(pRaiz); }
                if(aux==null && aShermano!=null){ aux= aShermano.subArbol(pRaiz); }
            }
        }
        return aux;
    }
    private boolean agregarHermano(Object pRaiz){
        boolean aux= false;
        if(aShermano==null){ aShermano= new cArbol(pRaiz); aux= true; }
        else{ aux= aShermano.agregarHermano(pRaiz); }
        return aux;
    }
    private boolean agregarHijo(Object pRaiz){
        boolean aux= false;
        if(aPhijo==null){ aPhijo= new cArbol(pRaiz); aux= true; }
        else{ aux= aPhijo.agregarHermano(pRaiz); }
        return aux;
    }
    public boolean agregar(cArbol pArbolPadre, Object pRaiz){
        boolean aux= false;
        if(estaVacio() && pArbolPadre==null){ aRaiz= pRaiz; aux= true; }
        else{
            if(pArbolPadre != null && pArbolPadre==subArbol(pArbolPadre.sRaiz())){
                aux= pArbolPadre.agregarHijo(pRaiz);
            }
        }        
        return aux;
    }
    public String mostrar(){
        String rta= "";
        if(!estaVacio()){
            rta= aRaiz+" ";
            if(aPhijo!=null){ rta= rta+aPhijo.mostrar(); }
            if(aShermano!=null){ rta= rta+aShermano.mostrar(); }
        }
        return rta;    
    }
    //... otros metodos
    public boolean esHijo(Object pHijo){
        boolean rta= false;
        if(!estaVacio()){
            if(aRaiz.equals(pHijo)){
                if(aPhijo == null){ rta= true; }
            }else{
                if(aPhijo != null){ rta= aPhijo.esHijo(pHijo); }
                if(!rta && aShermano != null){ rta= aShermano.esHijo(pHijo); }
            }
        }
        return rta;
    }
    public boolean esPadre(Object pHijo){
        boolean rta= false;
        if(!estaVacio()){
            if(aRaiz.equals(pHijo)){
                if(aPhijo != null){ rta= true; }
            }else{
                if(aPhijo != null){ rta= aPhijo.esPadre(pHijo); }
                if(!rta && aShermano != null){ rta= aShermano.esPadre(pHijo); }
            }
        }
        return rta;
    }
    private boolean esHermano(Object pHijo){
        boolean rta= false;
        if(aShermano != null){
            if(aShermano.sRaiz().equals(pHijo)){ rta= true; }
            if(!rta && aShermano != null){ rta= aShermano.esHermano(pHijo); }
        }
        return rta;
    }
    public cArbol padre(Object pHijo){
        cArbol rta= null;
        if(!estaVacio()){
            if(aPhijo != null && aPhijo.sRaiz().equals(pHijo)){ rta= this; }
            if(rta == null && aPhijo != null && aPhijo.esHermano(pHijo)){ rta= this; }
            if(rta == null && aPhijo != null){ rta= aPhijo.padre(pHijo); }
            if(rta == null && aShermano != null){ rta= aShermano.padre(pHijo); }
        }
        return rta;
    }
    //... recorridos
    private String recorreHermanoPreO(){
        String rta= "";
        if(aShermano != null){
            rta= aShermano.preOrden();
            rta= rta+aShermano.recorreHermanoPreO();
        }
        return rta;
    }
    public String preOrden(){
        String rta= "";
        if(!estaVacio()){
            rta= aRaiz+" ";
            if(aPhijo != null){
                rta= rta+aPhijo.preOrden();
                rta= rta+aPhijo.recorreHermanoPreO();
            }
        }
        return rta;
    }
    private String recorreHermanoInO(){
        String rta= "";
        if(aShermano != null){
            rta= aShermano.inOrden();
            rta= rta+aShermano.recorreHermanoInO();
        }
        return rta;
    }
    public String inOrden(){
        String rta= "";
        if(!estaVacio()){
            if(aPhijo != null){ rta= aPhijo.inOrden(); }
            rta= rta+" "+aRaiz;
            if(aPhijo != null){ rta= rta+aPhijo.recorreHermanoInO(); }
        }
        return rta;
    }
    private String recorreHermanoPosO(){
        String rta= "";
        if(aShermano != null){
            rta= aShermano.posOrden();
            rta= rta+aShermano.recorreHermanoPosO();
        }
        return rta;
    }
    public String posOrden(){
        String rta= "";
        if(!estaVacio()){
            if(aPhijo != null){ 
                rta= aPhijo.posOrden();
                rta= rta+aPhijo.recorreHermanoPosO();
            }
            rta= rta+" "+aRaiz;
        }
        return rta;
    }
    private int alturaHermano(){
        int al1, al2, al= 0;
        if(aShermano != null){
            al1= aShermano.altura();
            al2= aShermano.alturaHermano();
            al= (al1>al2?al1:al2);
        }
        return al;
    }
    public int altura(){
        int al1, al2, al= 0;
        if(!estaVacio() && aPhijo != null){
            al1= 1+aPhijo.altura();
            al2= 1+aPhijo.alturaHermano();
            al= (al1>al2?al1:al2);
        }
        return al;
    }
}