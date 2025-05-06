public class cArbol {
    private Object aRaiz;
    private cArbol aPHijo, aSHermano;
    
    protected cArbol() {
        aRaiz = null;
        aPHijo = null;
        aSHermano = null;
    }
    protected cArbol(Object pRaiz) {
        aRaiz = pRaiz;
        aPHijo = null;
        aSHermano = null; 
    }
    
    public void mRaiz(Object pRaiz) { aRaiz = pRaiz; }
    public void mHijo(cArbol pPHijo) { aPHijo = pPHijo; }
    public void mSHermano(cArbol pSHermano) { aSHermano = pSHermano; }
    
    public Object sRaiz() { return aRaiz;}
    public cArbol sSHijo() { return aPHijo;}
    public cArbol sSHermano() { return aSHermano;}
    
    public boolean isEmpty() {return (aRaiz == null); }
    public cArbol subArbol(Object pRaiz) {
        cArbol rta = null;
        if (!isEmpty()) {
            if (aRaiz.equals(pRaiz)) { return this;}
            else {
                if (aPHijo != null) { rta = aPHijo.subArbol(pRaiz);} 
                if (rta == null && aSHermano != null) {
                    rta = aSHermano.subArbol(pRaiz);
                }
            }
        }
        return rta;
    }
    
    private boolean agregarHermano(Object pRaiz) {
        boolean rta = false;
        if (aSHermano == null) {
            aSHermano = new cArbol(pRaiz);
            rta = true;
        }
        else {
            rta = aSHermano.agregarHermano(pRaiz);
        }
        return rta; 
    }
    
    private boolean agregarHijo(Object pRaiz) {
        boolean rta = false;
        
        if (aPHijo == null) {
            aPHijo = new cArbol(pRaiz);
            rta = true;
        }
        else {
            rta = aPHijo.agregarHermano(pRaiz);
            rta = true;
        }
        return rta;
    }
    public boolean agregar(cArbol pArbolPadre, Object pRaiz) {
        boolean rta = false;
        if (isEmpty() && pArbolPadre == null){
            aRaiz = pRaiz;
            rta = true;
        }
        else {
            if (pArbolPadre != null) {
                rta = pArbolPadre.agregarHijo(pRaiz);
            }
        }
        return rta;
    }
    
    public String mostrar() {
        String rta = "";
        if (!isEmpty()) {
            rta = aRaiz + "";
            if (aPHijo != null) {rta = rta + " " + aPHijo.mostrar(); }
            if (aSHermano != null) {rta = rta + " " + aSHermano.mostrar();}
        }
        return rta;
    }
    
    public static void main(String[] args) {
        cArbol a1 = new cArbol(1);
        
        a1.agregar(a1.subArbol(1), "b");
        
        System.out.println("El subarbol: " + a1.mostrar());
    }
}    