public class cArbolB {
    // atributos 
    private Object aRaiz;
    private cArbolB aSubArbolIzq, aSubArbolDer;
    // constructor
    protected cArbolB() {
        aRaiz = null;
        aSubArbolIzq = null; aSubArbolDer = null;
    }
    // modificadores 
    public void mRaiz(Object pRaiz) { aRaiz = pRaiz; }
    public void mSubArbolIzq(cArbolB pSubArbolIzq) { aSubArbolIzq = pSubArbolIzq; }
    public void mSubArbolDere(cArbolB pSubArbolDer) { aSubArbolDer = pSubArbolDer; }
    // selelectores
    public Object sRaiz() { return aRaiz; }
    public cArbolB sSubArbolIzq() { return aSubArbolIzq; }
    public cArbolB sSubArbolDer() { return aSubArbolDer; }
    // metodos basicos
    public boolean estaVacio() { return (aRaiz == null); }
    public boolean agregar(Object pRaiz){
        boolean rta = false;
        if(estaVacio() ) {aRaiz = pRaiz; rta = true; }
        else {
            if (pRaiz.toString().compareTo(aRaiz.toString()) <= 0) { 
                if(aSubArbolIzq == null) { aSubArbolIzq = new cArbolB(); }
                rta = aSubArbolIzq.agregar(pRaiz);
            } else {
                if(aSubArbolDer == null) { aSubArbolDer = new cArbolB(); }
                rta = aSubArbolDer.agregar(pRaiz);
            }
        }
        return rta;
    }
    public cArbolB maximo() {
        cArbolB rta = null;
        if(!estaVacio()) {
            if(aSubArbolDer == null) { rta = this; }
            else { rta = aSubArbolDer.maximo(); }
        } return rta;
    }
    public cArbolB minimo() {
        cArbolB rta = null;
        if(!estaVacio()) {
            if(aSubArbolIzq == null) { rta = this; }
            else { rta = aSubArbolIzq.minimo(); }
        } return rta;
    }
    private void limpiar() {
        if(!estaVacio()) {
            if(aSubArbolIzq != null) {
                if(aSubArbolIzq.sRaiz() == null) { aSubArbolIzq = null; }
                else {aSubArbolIzq.limpiar(); }
            }
            if(aSubArbolDer != null) {
                if(aSubArbolDer.sRaiz() == null) { aSubArbolDer = null; }
                else { aSubArbolDer.limpiar();}
            }
        }
    }
    public boolean eliminar(Object pRaiz) {
        boolean rta = false;
        if(!estaVacio()) {
            if(pRaiz.equals(aRaiz)) {
                rta = true; 
                if(aSubArbolIzq == null && aSubArbolDer == null) { 
                    aRaiz = null;
                } else if (aSubArbolIzq != null && aSubArbolDer != null) {
                    cArbolB dir = aSubArbolIzq.maximo();
                    aRaiz = dir.sRaiz();
                    aSubArbolIzq.eliminar(aRaiz);

                } else if (aSubArbolIzq != null) {
                    aRaiz = aSubArbolIzq.sRaiz(); 
                    aSubArbolDer = aSubArbolIzq.sSubArbolDer();
                    aSubArbolIzq = aSubArbolIzq.sSubArbolIzq();
                } else{
                    aRaiz = aSubArbolIzq.sRaiz();
                    aSubArbolIzq = aSubArbolDer.sSubArbolIzq();
                    aSubArbolDer = aSubArbolDer.sSubArbolDer();
                }
            } else {
                if(pRaiz.toString().compareTo(aRaiz.toString()) < 0){
                    if(aSubArbolIzq != null) {
                        rta = aSubArbolIzq.eliminar(pRaiz);
                    } else if(aSubArbolDer != null) {
                        rta = aSubArbolDer.eliminar(pRaiz);
                    }
                }
            }
            if(rta) {
                limpiar();
            }
        } return rta;
    }
    public String elementos() {
        String rta = "";
        if(!estaVacio()) {
            rta = aRaiz + " ";
            if(aSubArbolIzq != null) { rta = rta + aSubArbolIzq.elementos(); }
            if(aSubArbolDer != null) { rta = rta + aSubArbolDer.elementos(); }
        } return rta;
    }
    public cArbolB arbol(Object pRaiz){
        cArbolB rta = null;
        if(!estaVacio()) {
            if(pRaiz.equals(aRaiz)){
                rta = this;
            } else { 
                if(pRaiz.toString().compareTo(aRaiz.toString()) < 0) {
                    if(aSubArbolIzq != null) { rta = aSubArbolIzq.arbol(pRaiz); }
                }
                else if (aSubArbolDer != null) { rta = aSubArbolDer.arbol(pRaiz); }
            }
        } return rta;
    }
    public boolean existe(Object pRaiz) {
        boolean rta = false;
        if(!estaVacio()) {
            if(pRaiz.equals(aRaiz)){ rta = true; }
            else {
                if(pRaiz.toString().compareTo(aRaiz.toString()) < 0) {
                    if(aSubArbolIzq != null){ rta = aSubArbolIzq.existe(pRaiz); }
                }
                else {
                    if(aSubArbolDer != null){ rta = aSubArbolDer.existe(pRaiz); }
                }
            }
        } return rta;
    }
    public String preOrden() {
        String rta = "";
        if(!estaVacio()){
            rta = aRaiz + " ";
            if(aSubArbolIzq != null) { rta = rta + aSubArbolIzq.preOrden(); }
            if(aSubArbolDer != null) { rta = rta + aSubArbolDer.preOrden(); }
        } return rta;
    }  
    public String inOrden() {
        String rta = "";
        if(!estaVacio()){
            if(aSubArbolIzq != null) { rta = aSubArbolIzq.inOrden(); }
            rta = rta  + " " + aRaiz;
            if(aSubArbolDer != null) { rta = rta + aSubArbolDer.inOrden(); }
        } return rta;
    }  
    public String posOrden() {
        String rta = "";
        if(!estaVacio()){
            if(aSubArbolIzq != null) { rta = rta + aSubArbolIzq.posOrden(); }
            if(aSubArbolDer != null) { rta = rta + aSubArbolDer.posOrden(); }
            rta = rta + aRaiz + " ";
        } return rta;
    }  
    public boolean esPadre(Object pRaiz) {
        boolean rta = false;
        if(!estaVacio()) {
            if(aRaiz.equals(pRaiz)){
                if(aSubArbolIzq != null ||aSubArbolDer != null) {
                    rta = true;
                }
            } else {
                if(pRaiz.toString().compareTo(aRaiz.toString()) < 0) {
                    if(aSubArbolIzq != null) { rta = aSubArbolIzq.esPadre(pRaiz); }         
                }else if(!rta && aSubArbolDer != null ) { rta = aSubArbolDer.esPadre(pRaiz); }
            }
        } return rta;
    }
    public boolean esHoja(Object pRaiz) {
        boolean rta = false;
        if(!estaVacio()) {
            if(aRaiz.equals(pRaiz)){
                if(aSubArbolIzq == null && aSubArbolDer == null) { rta = true; }
            } else {
                if(aSubArbolIzq != null) { rta = aSubArbolIzq.esHoja(pRaiz); }
                if(!rta && aSubArbolDer != null) { rta = aSubArbolDer.esHoja(pRaiz); }
            }
        } return rta;
    }
    public int altura() {
        int altIzq = 0, altDer = 0;
        if(!estaVacio()) {
            if(aSubArbolIzq != null) { altIzq = 1 + aSubArbolIzq.altura(); }
            if(aSubArbolDer != null) { altDer = 1 + aSubArbolDer.altura(); }
        }return (altIzq > altDer ? altIzq : altDer);
    }
    public int nivel (Object pRaiz, int pNivel) {
        int rta = -1;
        if(!estaVacio()) {
            if(aRaiz.equals(pRaiz)) { rta = pNivel; }
            else {
                if(pRaiz.toString().compareTo(aRaiz.toString()) < 0) {
                    if(aSubArbolIzq != null) { rta = aSubArbolIzq.nivel(pRaiz, pNivel + 1); }
                } else {
                    if(aSubArbolDer != null) { rta = aSubArbolDer.nivel(pRaiz, pNivel + 1); }
                }    
            }
        } return rta;
    }
    public String recorrerPadre() {
        String rta = "";
        if(!estaVacio()) {
            if(aSubArbolIzq != null || aSubArbolDer != null) { rta = aRaiz + " "; }
            if(aSubArbolIzq != null) { rta = rta + aSubArbolIzq.recorrerPadre(); }
            if(aSubArbolDer != null) { rta = rta + aSubArbolDer.recorrerPadre(); }
        }
        return rta; 
    }
    public String recorrerHoja() {
        String rta = "";
        if(!estaVacio()) {
            if(aSubArbolIzq == null && aSubArbolDer == null) { rta = aRaiz + " "; }
            else {
                if(aSubArbolIzq != null) { rta = aSubArbolIzq.recorrerHoja(); }
                if(aSubArbolDer != null) { rta = aSubArbolDer.recorrerHoja(); }
            }
        } return rta; 
    }
    public int padres() {
        int rta = 0;
        if(!estaVacio()) {
            if(aSubArbolIzq != null || aSubArbolDer != null) { rta = 1; }
            if(aSubArbolIzq != null ) { rta = rta + aSubArbolIzq.padres(); }
            if(aSubArbolDer != null) { rta = rta + aSubArbolDer.padres(); }
        }return rta;
    }
    public int hojas() {
        int rta = 0;
        if(!estaVacio()) {
            if(aSubArbolIzq == null && aSubArbolDer == null) { rta = 1; }
            if(aSubArbolIzq != null ) { rta = rta + aSubArbolIzq.hojas(); }
            if(aSubArbolDer != null) { rta = rta + aSubArbolDer.hojas(); }
        }return rta;
    } 
}