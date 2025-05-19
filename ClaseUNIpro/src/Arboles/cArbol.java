package Arboles;

public class cArbol {
    // Atributo 
    private Object aRaiz;
    private cArbol aHijo;
    private cArbol aHermano;
    // constructores
    public cArbol() {
        aRaiz = null;
        aHijo = null;
        aHermano = null;
    }
    public cArbol(Object pRaiz) {
        aRaiz = pRaiz;
        aHijo = null;
        aHermano = null;
    }
    // Modificadores
    public void mRaiz(Object pRaiz) { aRaiz = pRaiz; }
    public void mHijo(cArbol pHijo) { aHijo = pHijo; }
    public void mHermano(cArbol pHermano) { aHermano = pHermano; }
    // Metodos, busca si existe
    public cArbol buscarSubArbol(Object pRaiz) {
        cArbol subArbol = null;
        
        if (aRaiz != null) {
            if (aRaiz.equals(pRaiz)) {
                subArbol = this;
            }
            if (subArbol == null && aHijo != null) {
                subArbol = aHijo.buscarSubArbol(pRaiz);
            }
            if (subArbol == null && aHermano != null) {
                subArbol = aHermano.buscarSubArbol(pRaiz);
            }
        }
        return subArbol;
    }
    // Agregar hermano 
    public boolean agregarHermano(Object pHermano) {
        boolean respuesta = false;
        
        if (aHermano == null) {
            aHermano = new cArbol(pHermano);
            respuesta = true;
        }
        return respuesta;
    }
    // Agregar hijo
    public boolean agregarHijo(Object pHijo) {
        boolean respuesta = false;
        
        if (aHijo == null) {
            aHijo = new cArbol(pHijo);
            respuesta = true;
        }
        else {
            respuesta = agregarHermano(pHijo);
        }
        return respuesta;
    }
    // Agregar
    public boolean agregar(Object pPadre, Object pHijo) {
        boolean respuesta = false;
        
        if (aRaiz == null) {
            aRaiz = pHijo;
            respuesta = true;
        }
        else {
            cArbol subArbolEncotrado = null;
            subArbolEncotrado = buscarSubArbol(aRaiz);
            
            if (subArbolEncotrado != null) {
                respuesta = subArbolEncotrado.agregarHijo(pHijo);
            }
        }
        return respuesta;
    }
    // Retornar los datos del arbol en cadena
   public String imprimiNodos() {
       String cadenaDeNodos = "";
       
       if (aRaiz != null) {
           cadenaDeNodos = cadenaDeNodos + aRaiz;
       }
       
       if (aHijo != null) {
           cadenaDeNodos = cadenaDeNodos + " " + aHijo.imprimiNodos();
       }
       
       if (aHermano != null) {
            cadenaDeNodos = cadenaDeNodos + " " + aHermano.imprimiNodos();
       }
       return cadenaDeNodos;
   }
   
   public boolean modificar(Object pRaiz, Object pNvalor) {
        boolean rta = false;
        cArbol arbolEncontrado;
        
        arbolEncontrado = buscarSubArbol(pRaiz);
        
        if (arbolEncontrado != null) {
            arbolEncontrado.mRaiz(pNvalor);
        }
        return rta;
   }
   
    public static void main(String[] args) {
        cArbol arb1 = new cArbol();
        
        arb1.agregar(null, "1");
        arb1.agregar("1", "2");
        
        System.out.println(arb1.imprimiNodos());
        arb1.modificar("2", "20");
        System.out.println(arb1.imprimiNodos());
    }
}