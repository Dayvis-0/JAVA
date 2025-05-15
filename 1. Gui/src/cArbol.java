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
    
    private boolean addBrother(Object pRaiz) {
        boolean rta = false;
        if (aSHermano == null) {
            aSHermano = new cArbol(pRaiz);
            rta = true;
        }
        else {
            rta = aSHermano.addBrother(pRaiz);
        }
        return rta; 
    }   
    
    private boolean addSon(Object pRaiz) {
        boolean rta = false;
        
        if (aPHijo == null) {
            aPHijo = new cArbol(pRaiz);
            rta = true;
        }
        else {
            rta = aPHijo.addBrother(pRaiz);
            rta = true;
        }
        return rta;
    }
    
    public boolean add(cArbol pArbolPadre, Object pRaiz) {
        boolean rta = false;
        if (isEmpty() && pArbolPadre == null){
            aRaiz = pRaiz;
            rta = true;
        }
        else {
            if (pArbolPadre != null) {
                rta = pArbolPadre.addSon(pRaiz);
            }
        }
        return rta;
    }
    
    public String travelTree() {
        String rta = "";
        if (!isEmpty()) {
            rta = aRaiz + " ";
            if (aPHijo != null) { rta = rta + " " + aPHijo.travelTree(); }
            if (aSHermano != null) { rta = rta + " " + aSHermano.travelTree(); }
        }
        return rta;
    }
    
    public int countNodes() {
        int rta = 0;
        if (!isEmpty()) {
            rta = 1;
            if (aPHijo != null) { rta = rta + aPHijo.countNodes(); }
            if (aSHermano != null) { rta = rta + aSHermano.countNodes(); }
        }
        return rta;
    }
    
    public boolean delete(Object pEliminar) {
        if (isEmpty() || pEliminar == null) return false;
         
        if (aPHijo != null && aPHijo.sRaiz().equals(pEliminar)) {
            cArbol eliminado = aPHijo;
            cArbol hijos = eliminado.sSHijo();
            cArbol hermanos = eliminado.sSHermano();
            
            if (hijos != null) {
                cArbol temp = hijos;
                while (temp.sSHermano() != null) {
                    temp = temp.sSHermano();
                }
                temp.mSHermano(hermanos);
                aPHijo = hijos;
            }
            else {
                aPHijo = hermanos;
            }
            
            return true;
        }
        
        if (aSHermano != null && aSHermano.sRaiz().equals(aRaiz)) {
            cArbol eliminado = aSHermano;
            cArbol hijos = eliminado.sSHijo();
            cArbol hermanos = eliminado.sSHermano();
            
            if (hijos != null) {
                cArbol temp = hijos;
                while (temp.sSHermano() != null) {
                    temp = temp.sSHermano();
                }
                temp.mSHermano(hermanos);
                aSHermano = hijos;
            }
            else {
                aSHermano = hermanos;
            }
            
            return true;
        }
        
        boolean rta = false;
        if (aPHijo != null) {
            rta = aPHijo.delete(pEliminar);
        }
        if (!rta && aSHermano != null) {
            rta = aSHermano.delete(pEliminar);
        }
        
        return rta;
    } 
    
    public boolean isSon(Object pRaiz) {
        boolean rta = false;
        if (!isEmpty()) {
            if (aRaiz.equals(pRaiz) && aPHijo == null) { rta = true; }
            if (!rta && aPHijo != null) { rta = aPHijo.isSon(pRaiz); } 
            if (!rta && aSHermano != null) { rta = aSHermano.isSon(pRaiz); } 
        }
        return rta;
    }
    
    public boolean modify(Object pRaiz, Object pNValor) {
        boolean rta = false;
        cArbol arbolEncontrado;
        
        arbolEncontrado = subArbol(pRaiz);
        
        if (arbolEncontrado != null) {
            arbolEncontrado.mRaiz(pNValor);
            rta = true;
        }
        
        return rta;
    }
    
    public static void main(String[] args) {
        cArbol a1 = new cArbol();
        
        a1.add(a1.subArbol(1), "b");
        a1.add(a1.subArbol("b"), "c");
        a1.add(a1.subArbol("b"), "x");
        a1.add(a1.subArbol("b"), "y");
        a1.add(a1.subArbol("c"), "d");
        a1.add(a1.subArbol("c"), "e");
        a1.add(a1.subArbol("e"), "f");
        
        System.out.println("El arbol: " + a1.travelTree());
        if (a1.delete("c")) {
            System.out.println("Eliminado");
        }
        else {
            System.out.println("No eliminado");
        }
        System.out.println("El subarbol: " + a1.travelTree());
    }
}    