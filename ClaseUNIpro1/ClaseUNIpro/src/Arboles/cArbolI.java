package Arboles;
import java.util.Stack;

public class cArbolI {
    //... atributos
    cNodoA aRaiz;
    //..constructor
    protected cArbolI() { aRaiz = null; }
    //...modificador
    public void mRaiz(cNodoA pRaiz) { aRaiz = pRaiz; }
    //...selector
    public cNodoA sRaiz(){ return aRaiz; }
    //.. metodo basicos
    public boolean estaVacio() { return (aRaiz == null); }
    public cNodoA nodo(Object pRaiz){ 
        cNodoA rta = null;
        
        if(!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            boolean encontrado = false;
            cNodoA dir = null;
            while(!encontrado && !pila.isEmpty()) {
                dir = pila.pop();
                
                if(dir.sElemento().equals(pRaiz)) {
                    rta = dir;
                    break;
                }
                else {
                    if(dir.sPhijo() != null) { pila.push(dir.sPhijo()); }
                    if(dir.sShermano() != null) { pila.push(dir.sShermano()); }
                }
            }
        }
        return rta;
    }
    
    public boolean agregar(Object pPadre, Object pHijo) {
        boolean rta = false;
        cNodoA dir = nodo(pPadre);
        if (estaVacio()) { aRaiz = new cNodoA(pHijo); rta = true; } 
        else {
            if (dir != null) {
                if (dir.sPhijo() == null) {
                    dir.mPhijo(new cNodoA(pHijo));
                    rta = true;
                } else {
                    dir = dir.sPhijo();
                    while (dir.sShermano() != null) {
                        dir = dir.sShermano();
                    }
                    dir.mShermano(new cNodoA(pHijo));
                    rta = true;
                }
            }
        }
        return rta;
    }
    
    public boolean esPadre(Object pRaiz) {
        boolean rta = false;
        if(!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir = null;
            while(!rta && !pila.isEmpty()) {
                dir = pila.pop();
                if(dir.sElemento().equals(pRaiz)) {
                    if(dir.sPhijo() != null) { rta = true; }
                }
                else {
                    if(dir.sPhijo() != null) { pila.push(dir.sPhijo()); }
                    if(dir.sShermano() != null) { pila.push(dir.sShermano()); }
                }
            }
        }
        return rta;
    }
    
    public boolean esHijo(Object pRaiz) {
        boolean rta = false;
        if(!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir = null;
            while(!rta && !pila.isEmpty()) {    
                dir = pila.pop();
                if(dir.sElemento().equals(pRaiz)) {
                    if(dir.sPhijo() == null) { rta = true; }
                }
                else {
                    if (dir.sPhijo() != null) { pila.push(dir.sPhijo()); }
                    if(dir.sShermano() != null) { pila.push(dir.sShermano()); }
                }
            }
        }
        return rta;
    }
 
    public String recorrerNodos() {
        String rta = "";
        if (!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir = null;
            while (!pila.isEmpty()) {
                dir = pila.pop();
                rta = rta + " " + dir.sElemento();  // Esto ahora usa toString() de cNodoA
                if (dir.sPhijo() != null) { pila.push(dir.sPhijo()); }
                if (dir.sShermano() != null) { pila.push(dir.sShermano()); }
            }
        }
        return rta;  // Elimina espacio al final
    }
    
    public int nodos() {
        int rta = 0;
        if(!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir = null;
            while(!pila.isEmpty()){
                dir = pila.pop();
                rta = rta + 1;
                if(dir.sPhijo() != null) { pila.push(dir.sPhijo()); }
                if(dir.sShermano()!= null) { pila.push(dir.sShermano()); }
            }
        }
        return rta;
    }
    public int padres() {
        int rta = 0;
        if(!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir = null;
            while(!pila.isEmpty()) {
                dir = pila.pop();
                if(dir.sPhijo() != null) { rta = rta + 1; }
                if(dir.sPhijo() != null) { pila.push(dir.sPhijo()); }
                if(dir.sShermano() != null) { pila.push(dir.sShermano()); } 
            }
        }
        return rta;
    }
    public int hijos() {
        int rta = 0;
        if(!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir = null;
            while(!pila.isEmpty()) {
                dir = pila.pop();
                if(dir.sPhijo() == null) { rta = rta + 1; } 
                if(dir.sPhijo() != null) { pila.push(dir.sPhijo()); } 
                if(dir.sShermano() != null) { pila.push(dir.sShermano()); } 
            }
        }
        return rta;
    }
    
    public String preOrden() {
        String rta = "";
        if(!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir = null;
            while(!pila.isEmpty()) {
                dir = pila.pop();
                rta = rta + dir.sElemento() + " ";
                if(dir.sShermano() != null) { pila.push(dir.sShermano());}
                if(dir.sPhijo()!= null) { pila.push(dir.sPhijo());}
            }
        }
        return rta;
    }
    public String postOrden() {
        String rta = "";
        if(!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            cNodoA dir = aRaiz;
            while(dir != null || !pila.isEmpty()) {
                while(dir != null) {
                    pila.push(dir);
                    dir = dir.sPhijo();                    
                }

                dir = pila.pop();
                rta = rta + " "+ dir.sElemento();
                dir = dir.sShermano();
            }
        }
        return rta;
    }
    
    public String inOrden1() {
        String rta = "";
        if (!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            cNodoA actual = aRaiz;
            boolean procesarHijo = true;

            while (actual != null || !pila.isEmpty()) {
                if (actual != null && procesarHijo) {
                    pila.push(actual);
                    actual = actual.sPhijo();
                } else {
                    actual = pila.pop();
                    rta += actual.sElemento() + " ";
                    actual = actual.sShermano();
                    procesarHijo = true;
                }
            }
        }
        return rta.trim();
    }
    
    public String inOrden() {
        String rta = "";
        if (!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            cNodoA actual = aRaiz;
            boolean descendiendo = true;

            while (!pila.isEmpty() || actual != null) {
                if (actual != null && descendiendo) {
                    pila.push(actual);
                    actual = actual.sPhijo();
                } else {
                    actual = pila.pop();
                    rta += actual.sElemento() + " ";
                    // ahora vamos a procesar sus hermanos
                    actual = actual.sShermano();
                    descendiendo = true;
                }
            }
        }
        return rta.trim();
    }
    public boolean existe(Object pRaiz) {
        boolean rta = false;
        if(!estaVacio()){
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir = null;
            while(!rta && !pila.isEmpty()){
                dir = pila.pop();
                if(dir.sElemento().equals(pRaiz)) { rta = true; }
                else {
                    if(dir.sPhijo() != null) { pila.push(dir.sPhijo()); }
                    if(dir.sShermano()!= null) { pila.push(dir.sShermano()); }
                }
            }
        }
        return rta;
    }
    public String recorrerPadres() {
        String rta = "";
        if(!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir = null;
            while(!pila.isEmpty()){
                dir = pila.pop();
                if(dir.sPhijo() != null) {
                    rta = rta + " " + dir.sElemento();
                    pila.push(dir.sPhijo());
                }
                if(dir.sShermano() != null) { pila.push(dir.sShermano()); }
            }
        }
        return rta;
    }
    public String recorrerHijos() {
        String rta = "";
        if(!estaVacio()) {
            
        }
        return rta;
    }
    public int altura() {
        int rta = 0;
        if(!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir = null;
            while(!pila.isEmpty()) {
                dir = pila.pop();
                if(dir.sPhijo() != null) { rta = rta + 1; pila.push(dir.sPhijo()); }
                if(dir.sShermano() != null) { pila.push(dir.sShermano()); }
            }
        }
        return rta;
    }
    public int nivel(Object pRaiz) {
        int nivel = 0, rta = -1;
        if(!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir = null;
            while(rta == -1 && !pila.isEmpty()){
                dir = pila.pop();
                if(dir.sPhijo()!= null) { pila.push(dir.sPhijo()); nivel = nivel + 1; }
                if(dir.sShermano()!= null) { pila.push(dir.sShermano()); }
            }
        }
        return rta;
    }
    public static void main(String[] args) {
        cArbolI arb1 = new cArbolI();
        
        arb1.agregar(null, "X");
        arb1.agregar("X", "Y");
        arb1.agregar("X", "Z");
        arb1.agregar("Z", "W");
        
        System.out.println("Arbol: " + arb1.recorrerNodos());
        System.out.println("PreOrden -> raiz - izquierdo - derecho: " + arb1.preOrden());
        System.out.println("InOrden-> izquierdo - raiz - derecho: " + arb1.inOrden());
        System.out.println("PostOrden-> izquierdo - derecho - raiz - : " + arb1.postOrden());
    }
}