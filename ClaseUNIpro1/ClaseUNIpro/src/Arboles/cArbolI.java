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
        cNodoA respuesta = null;
        
        if(!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            boolean encontrado = false;
            cNodoA dir = null;
            while(!encontrado && !pila.isEmpty()) {
                dir = pila.pop();
                
                if(dir.sElemento().equals(pRaiz)) {
                    respuesta = dir;
                    break;
                }
                else {
                    if(dir.sPhijo() != null) { pila.push(dir.sPhijo()); }
                    if(dir.sShermano() != null) { pila.push(dir.sShermano()); }
                }
            }
        }
        return respuesta;
    }
    
    public boolean agregar(Object pPadre, Object pHijo) {
        boolean respuesta = false;
        cNodoA dir = nodo(pPadre);
        if (estaVacio()) { aRaiz = new cNodoA(pHijo); respuesta = true; } 
        else {
            if (dir != null) {
                if (dir.sPhijo() == null) {
                    dir.mPhijo(new cNodoA(pHijo));
                    respuesta = true;
                } else {
                    dir = dir.sPhijo();
                    while (dir.sShermano() != null) {
                        dir = dir.sShermano();
                    }
                    dir.mShermano(new cNodoA(pHijo));
                    respuesta = true;
                }
            }
        }
        return respuesta;
    }
    
    public boolean esPadre(Object pRaiz) {
        boolean respuesta = false;
        if(!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir = null;
            while(!respuesta && !pila.isEmpty()) {
                dir = pila.pop();
                if(dir.sElemento().equals(pRaiz)) {
                    if(dir.sPhijo() != null) { respuesta = true; }
                }
                else {
                    if(dir.sPhijo() != null) { pila.push(dir.sPhijo()); }
                    if(dir.sShermano() != null) { pila.push(dir.sShermano()); }
                }
            }
        }
        return respuesta;
    }
    
    public boolean esHijo(Object pRaiz) {
        boolean respuesta = false;
        if(!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir = null;
            while(!respuesta && !pila.isEmpty()) {    
                dir = pila.pop();
                if(dir.sElemento().equals(pRaiz)) {
                    if(dir.sPhijo() == null) { respuesta = true; }
                }
                else {
                    if (dir.sPhijo() != null) { pila.push(dir.sPhijo()); }
                    if(dir.sShermano() != null) { pila.push(dir.sShermano()); }
                }
            }
        }
        return respuesta;
    }
 
    public String recorrerNodos() {
        String respuesta = "";
        if (!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir = null;
            while (!pila.isEmpty()) {
                dir = pila.pop();
                respuesta = respuesta + " " + dir.sElemento();  // Esto ahora usa toString() de cNodoA
                if (dir.sPhijo() != null) { pila.push(dir.sPhijo()); }
                if (dir.sShermano() != null) { pila.push(dir.sShermano()); }
            }
        }
        return respuesta;  // Elimina espacio al final
    }
    
    public int nodos() {
        int respuesta = 0;
        if(!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir = null;
            while(!pila.isEmpty()){
                dir = pila.pop();
                respuesta = respuesta + 1;
                if(dir.sPhijo() != null) { pila.push(dir.sPhijo()); }
                if(dir.sShermano()!= null) { pila.push(dir.sShermano()); }
            }
        }
        return respuesta;
    }
    public int padres() {
        int respuesta = 0;
        if(!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir = null;
            while(!pila.isEmpty()) {
                dir = pila.pop();
                if(dir.sPhijo() != null) { respuesta = respuesta + 1; }
                if(dir.sPhijo() != null) { pila.push(dir.sPhijo()); }
                if(dir.sShermano() != null) { pila.push(dir.sShermano()); } 
            }
        }
        return respuesta;
    }
    public int hijos() {
        int respuesta = 0;
        if(!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir = null;
            while(!pila.isEmpty()) {
                dir = pila.pop();
                if(dir.sPhijo() == null) { respuesta = respuesta + 1; } 
                if(dir.sPhijo() != null) { pila.push(dir.sPhijo()); } 
                if(dir.sShermano() != null) { pila.push(dir.sShermano()); } 
            }
        }
        return respuesta;
    }
    public boolean existe(Object pRaiz) {
        boolean respuesta = false;
        if(!estaVacio()){
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir = null;
            while(!respuesta && !pila.isEmpty()){
                dir = pila.pop();
                if(dir.sElemento().equals(pRaiz)) { respuesta = true; }
                else {
                    if(dir.sPhijo() != null) { pila.push(dir.sPhijo()); }
                    if(dir.sShermano()!= null) { pila.push(dir.sShermano()); }
                }
            }
        }
        return respuesta;
    }
    public String recorrerPadres() {
        String respuesta = "";
        if(!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir = null;
            while(!pila.isEmpty()){
                dir = pila.pop();
                if(dir.sPhijo() != null) {
                    respuesta = respuesta + " " + dir.sElemento();
                    pila.push(dir.sPhijo());
                }
                if(dir.sShermano() != null) { pila.push(dir.sShermano()); }
            }
        }
        return respuesta;
    }
    public int altura() {
        int respuesta = 0;
        if(!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir = null;
            while(!pila.isEmpty()) {
                dir = pila.pop();
                if(dir.sPhijo() != null) { respuesta = respuesta + 1; pila.push(dir.sPhijo()); }
                if(dir.sShermano() != null) { pila.push(dir.sShermano()); }
            }
        }
        return respuesta;
    }
    public int nivel(Object pRaiz) {
        int nivel = 0, respuesta = -1;
        if(!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir = null;
            while(respuesta == -1 && !pila.isEmpty()){
                dir = pila.pop();
                if(dir.sPhijo()!= null) { pila.push(dir.sPhijo()); nivel = nivel + 1; }
                if(dir.sShermano()!= null) { pila.push(dir.sShermano()); }
            }
        }
        return respuesta;
    }
    public Object nodoConMasHijos() {
        Object respuesta = null;
        if (!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir;
            int nodoMasHijos = -1;
            while (!pila.isEmpty()) {
                dir = pila.pop();
                int hijos = 0;
                cNodoA hijo = dir.sPhijo();
                while (hijo != null) {
                    hijos = hijos + 1;
                    hijo = hijo.sShermano();
                }
                if (hijos > nodoMasHijos) {
                    nodoMasHijos = hijos;
                    respuesta = dir.sElemento();
                }
                if (dir.sPhijo() != null) { pila.push(dir.sPhijo()); }
                if (dir.sShermano() != null) { pila.push(dir.sShermano()); }
            }
        }
        return respuesta;
    }
    public Object nodoConMenosHijos() {
        Object respuesta = null;
        if (!estaVacio()) {
            Stack<cNodoA> pila = new Stack<>();
            pila.push(aRaiz);
            cNodoA dir;
            int nodoMenosHijos = -1;
            while (!pila.isEmpty()) {
                dir = pila.pop();
                int hijos = 0;
                cNodoA hijo = dir.sPhijo();
                while (hijo != null) {
                    hijos = hijos + 1;
                    hijo = hijo.sShermano();
                }
                if(nodoMenosHijos == -1) {
                    nodoMenosHijos = hijos;
                    respuesta = dir.sElemento();
                }
                else {
                    if (hijos < nodoMenosHijos) {
                        nodoMenosHijos = hijos;
                        respuesta = dir.sElemento();
                    }
                }
                
                if (dir.sPhijo() != null) { pila.push(dir.sPhijo()); }
                if (dir.sShermano() != null) { pila.push(dir.sShermano()); }
            }
        }
        return respuesta;
    }
}