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
    
    public boolean agregar1(Object pPadre,Object pHijo) {
        boolean rta = false;
        cNodoA dir = nodo(pPadre);
        
        if (estaVacio() && dir == null) {
            aRaiz = new cNodoA(pHijo); 
            rta = true;
        }else {
            if(dir != null) {
                if(dir.sPhijo() == null) { dir.mPhijo(new cNodoA(pHijo)); rta = true; }
                else {
                    dir = dir.sPhijo();
                    while(dir.sShermano() != null) { dir = dir.sShermano(); }
                    dir.mShermano(new cNodoA(pHijo));
                    rta = true;
                }
            }
        }
        return true;
    }
    
    public boolean agregar(Object pPadre, Object pHijo) {
        boolean rta = false;
        if (estaVacio()) {
            aRaiz = new cNodoA(pHijo);
            rta = true;
        } else {
            cNodoA dir = nodo(pPadre);
            if (dir != null) {
                if (dir.sPhijo() == null) {
                    dir.mPhijo(new cNodoA(pHijo));
                } else {
                    dir = dir.sPhijo();
                    while (dir.sShermano() != null) {
                        dir = dir.sShermano();
                    }
                    dir.mShermano(new cNodoA(pHijo));
                }
                rta = true;
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
                    if(dir.sPhijo() != null) {
                        rta = true;
                    }
                }
                else {
                    if(dir.sPhijo() != null) {
                        pila.push(dir.sPhijo());
                    }
                    if(dir.sShermano() != null) {
                        pila.push(dir.sShermano());
                    }
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
                    if(dir.sPhijo() == null) {
                        rta = true;
                    }
                }
                else {
                    if (dir.sPhijo() != null) {
                        pila.push(dir.sPhijo());
                    }
                    if(dir.sShermano() != null) {
                        pila.push(dir.sShermano());
                    }
                }
            }
        }
        return rta;
    }
    
    public String recorrerNodos1() {
        String rta = "";
        if(!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir = null;
            while(!pila.isEmpty()) {
                dir = pila.pop();
                rta = rta + " " + dir;
                if(dir.sPhijo() != null) {
                    pila.push(dir.sPhijo());
                }
                if(dir.sShermano() != null) {
                    pila.push(dir.sShermano());
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
                if (dir.sPhijo() != null) {
                    pila.push(dir.sPhijo());
                }
                if (dir.sShermano() != null) {
                    pila.push(dir.sShermano());
                }
            }
        }
        return rta.trim();  // Elimina espacio al final
    }
    
    public static void main(String[] args) {
            cArbolI arbol = new cArbolI();
            arbol.agregar(null, "A");       // Raíz
            arbol.agregar("A", "B");
            arbol.agregar("A", "C");
            arbol.agregar("B", "D");

            System.out.println("Nodos: " + arbol.recorrerNodos());
        }
}