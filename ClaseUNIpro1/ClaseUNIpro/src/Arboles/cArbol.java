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
    public boolean estaVacio() { return (aRaiz == null); }
    // Selectore
    public Object sRaiz() { return aRaiz; }
    public cArbol sHijo() { return aHijo; }
    public cArbol sHemano() { return aHermano; }
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
        cArbol subArbolEncotrado = null;
        
        if (aRaiz == null) {
            aRaiz = pHijo;
            respuesta = true;
        }
        else {
            subArbolEncotrado = buscarSubArbol(pPadre);
            
            if (subArbolEncotrado != null) {
                respuesta = subArbolEncotrado.agregarHijo(pHijo);
            }
        }
        return respuesta;
    }
    // Retornar los datos del arbol en cadena
   public String imprimiNodos() {
       String cadenaDeNodos = "";
       
       if (aRaiz != null) { cadenaDeNodos = cadenaDeNodos + aRaiz; }
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
        
        if (buscarSubArbol(pRaiz) != null) {
            buscarSubArbol(pRaiz).mRaiz(pNvalor);
        }
        return rta;
   }
   
    public boolean esHijo(Object pRaiz) {
        boolean rta = false;
        if(!estaVacio()) {
            if(aRaiz.equals(pRaiz)) { 
                if(aHijo == null) { rta = true; }
            }
            else{
                if(aHijo != null) { rta = aHijo.esHijo(pRaiz); }
                if(!rta && aHermano != null) { rta = aHermano.esHijo(pRaiz); }
            }
        }
        return rta;
    }
    
    public boolean esPadre(Object pRaiz) {
        boolean rta = false;
        
        if(!estaVacio()) {
            if(aRaiz.equals(pRaiz) && aHijo != null) { rta = true;}
            if(!rta && aHijo != null) { rta = aHijo.esPadre(pRaiz); }
            if(!rta && aHermano != null ) {rta = aHermano.esPadre(pRaiz); }
        }
        
        return rta;
    }
    
    public String hermanoPreO() {
        String rta = "";
        if(aHermano != null) {
            rta = aHermano.preOrden();
            rta = rta + aHermano.hermanoPreO();
        }
        return rta;
    }
    
    public String preOrden() {
        String rta = "";
        if(!estaVacio()) {
            rta = aRaiz + " ";
            if(aHijo != null) {
                rta = rta + aHijo.preOrden();
                rta = rta + aHijo.hermanoPreO();
            }
        }
        return rta;
    }
    
    public Object padre(Object pRaiz) {
        Object rta = null;
        
        return rta;
    }
    
    public String hermanoInO() {
        String rta = "";
        if(aHermano != null) {
            rta = aHermano.inOrden();
            rta = rta + aHermano.hermanoInO();
        }
        return rta;
    }
    
    public String inOrden() {
        String rta = "";
        if(!estaVacio()) {
            if (aHijo != null) { rta = aHijo.inOrden(); }
            rta = rta + " " + aRaiz;
            if(aHijo != null) { rta = rta + aHijo.hermanoInO(); }
        }
        return rta;
    }
    
    public String hermanoPosO() {
        String rta = "";
        if(aHermano != null) {
            rta = aHermano.posOrden();
            rta = rta + aHermano.hermanoPosO();
        }
        return rta;
    }
    
    public String posOrden() {
        String rta = "";
        if(!estaVacio()) {
            if(aHijo != null) {
                rta = aHijo.posOrden();
                rta = rta + aHijo.hermanoPosO();
            }
            rta = rta + " " + aRaiz;
        }
        return rta;
    }
    
    public int padres() {
        int rta = 0;
        if(!estaVacio()) {
            if(aHijo != null) { rta = 1 + aHijo.padres(); }
            if(aHermano != null) { rta = rta + aHermano.padres(); }
        }
        return rta;
    }
    
    public int hijos() {
        int rta = 0;
        if(!estaVacio()) {
            if(aHijo != null) { rta = 1; }
            if(aHijo != null) { rta = aHijo.hijos(); }
            if(aHermano != null) { rta = rta + aHermano.hijos(); }
        }
        return rta;
    }
    
    public boolean existe(Object pRaiz) {
        boolean rta = false;
        if(!estaVacio()) {
            if(aRaiz.equals(pRaiz)) { rta = true; }
            else {
                if(aHijo != null) { rta = aHijo.existe(pRaiz); } 
                if(!rta && aHermano != null) { rta = aHermano.existe(pRaiz); }
            }
        }
        return rta;
    }
    
    public cArbol buscarPadre(Object pHijo) {
        cArbol arbolPadre = null;
        if(aRaiz != null) {
            if(aHijo != null) {
                if(pHijo.equals(aHijo.sRaiz())) { arbolPadre = this; }
                else {
                    arbolPadre = aHijo.buscarPadre(pHijo);
                }
            }
            if(arbolPadre == null && aHermano != null) {
                if(pHijo.equals(aHermano.sRaiz())) {
                    arbolPadre = this;
                }
                else {
                    arbolPadre = aHermano.buscarPadre(pHijo);
                }
            }
        }
        return arbolPadre;
    }
    
    public boolean eliminar(Object pRaiz) {
        boolean respuesta = false;
        cArbol arbolEliminar;
        cArbol padreEncontrado;
        
        arbolEliminar = buscarSubArbol(pRaiz);
        if(arbolEliminar != null) {
            if(aRaiz.equals(arbolEliminar.sRaiz())){
                aRaiz = null;
                aHijo = null;
                aHermano = null;
            }
            else {
                padreEncontrado = buscarPadre(pRaiz);
                if(padreEncontrado != null) {
                    if(pRaiz.equals(padreEncontrado.sHijo().sRaiz())) {
                        padreEncontrado.mHijo(null);
                        padreEncontrado.mHijo(padreEncontrado.sHemano());
                        padreEncontrado.mHermano(null);
                        respuesta = true;
                    }
                    else {
                        padreEncontrado.mHermano(null);
                        respuesta = true;
                    }
                }
            }
        }
        return respuesta;
    }
   
    public int contarNodos() {
        int numeroDeNodos = 0;
        
        if (aRaiz != null) {
            numeroDeNodos = 1;
            if(aHijo != null) {
                numeroDeNodos = numeroDeNodos +aHijo.contarNodos();
            }
            if(aHermano != null) {
                numeroDeNodos = numeroDeNodos +aHermano.contarNodos();
            }
        }
        return numeroDeNodos;
    }
    
    public int altura() {
        int altura = 0;
        
        if(!estaVacio()) {
            int alturaHijo = 0;
            int alturaHermano = 0;
            
            if(aHijo != null) {
                alturaHijo = 1 + aHijo.altura();
            }
            if(aHermano != null) {
                alturaHermano = 1 + aHermano.altura();
            }
            
            altura = (alturaHijo > alturaHermano ? alturaHijo : alturaHermano);
        }
        return altura;
    }
    
    public int nivel(Object pHijo, int pNivel) {
        int nivel = 0;
        
        if (!estaVacio()) {
            if(aRaiz.equals(pHijo)) {
                nivel = pNivel;
            }
            if(nivel == 0 && aHijo != null) {
                nivel = aHijo.nivel(pHijo, pNivel + 1);
            }
            if(nivel == 0 && aHermano != null) {
                nivel = aHermano.nivel(pHijo, pNivel + 1);
            }
        }
        
        return nivel;
    }
    
    public String recorrerPadres() {
        String rta = "";
        
        if(!estaVacio()) {
            if(aHijo != null) { rta = aRaiz +" " + aHijo.recorrerPadres(); }
            if(aHermano != null) { rta = rta  + aHermano.recorrerPadres();}
        }
        return rta;
    }
    
    public String recorrerHijos() {
        String rta = "";
        if(!estaVacio()) {
            if(aHijo != null) { rta = aRaiz + " " + aHijo.recorrerHijos(); }
            if(aHermano != null) { rta = rta  + aHermano.recorrerHijos(); } 
        }
        return rta;
    }
    
    public String mayor() {
        String rta = "", aux = "";
        if(!estaVacio()) {
            rta = aRaiz + "";
            if(aHijo != null) { aux = aHijo.mayor(); }
            if(aux.compareTo(rta) > 0) { rta = aux; }
            if(aHijo != null) { aux = aHermano.mayor(); }
            if(aux.compareTo(rta) > 0) { rta = aux; }
        }
        
        return  rta;
    }
    
    public String recorrerNodos() {
        String rta = "";
        
        if(!estaVacio()) {
            rta = aRaiz + " ";
            if(aHijo != null) { rta = rta + aHijo.recorrerNodos(); }
            if(aHermano != null) { rta = rta + aHermano.recorrerNodos(); }
        }
        return rta;
    }
    
    public static void main(String[] args) {
        cArbol arb1 = new cArbol();
        
        arb1.agregar(null, "a");
        arb1.agregar("a", "y");
        arb1.agregar("a", "b");
        
        System.out.println("Arbol: " +arb1.recorrerNodos());
        arb1.modificar("b", "bb");
        System.out.println("Arbol: " + arb1.recorrerNodos());
        System.out.println("El padre de y es: " + arb1.buscarPadre("y").sRaiz());
        if (arb1.eliminar("bb")){
            System.out.println("Eliminado");        
        }
        System.out.println("Arbol: " + arb1.recorrerNodos());
        //System.out.println(arb1.imprimiNodos());
        //System.out.println("El numero de nodos es:  " + arb1.contarNodos());
        //if (arb1.eliminar("20")) {
        //    System.out.println("Eliminado ");
        //    System.out.println(arb1.imprimiNodos());
       // }
        
        //System.out.println("La altura del arbol es: " + arb1.altura());
        //System.out.println("El nivel del nodo 20: " + arb1.nivel("2", 0));
       // System.out.println("El mayor es: " + arb1.mayor());
    }
}