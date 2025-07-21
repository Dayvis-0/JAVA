import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class cArbolBI {
    // atributo
    private cNodoAB aRaiz;
    // constructor
    protected cArbolBI() { aRaiz = null; }
    // modificador
    private void mRaiz(cNodoAB pRaiz) { aRaiz = pRaiz; }
    // selector
    public cNodoAB sRaiz() { return aRaiz; }
    // otros metodos
    public boolean estaVacio() { return (aRaiz == null); }
    public cNodoAB posicionar(Object pElemento) {
        cNodoAB rta = aRaiz;
        if(!estaVacio()) {
            boolean hayNodo = true;
            while(hayNodo) {
                if(pElemento.toString().compareTo(rta.sElemento().toString()) <= 0) {
                    if(rta.sSubArbolIzq() != null) {
                        rta = rta.sSubArbolIzq();
                    } else { hayNodo = false; }
                } else {
                    if(rta.sSubArbolDer() != null) {
                        rta = rta.sSubArbolDer();
                    } else { hayNodo = false; }
                }
            }
        } return rta;
    }
    public cNodoAB arbol(Object pElemento) {
        cNodoAB rta = null;
        if(!estaVacio()) {
            boolean encontrado = false;
            rta = aRaiz;
            while(!encontrado && rta != null) {
                if(pElemento.equals(rta.sElemento())) { encontrado = true;  }
                else {
                    if(pElemento.toString().compareTo(rta.sElemento().toString()) < 0) {
                        rta = rta.sSubArbolIzq();
                    } else {
                        rta = rta.sSubArbolDer();
                    }
                }
            }
        }
        return rta;
    }
    public boolean agregar(Object pElemento) { 
        boolean rta = false;
        if(estaVacio()) { aRaiz = new cNodoAB(pElemento); rta = true; }
        else {
            cNodoAB dir = posicionar(pElemento);
            if(pElemento.toString().compareTo(dir.sElemento().toString()) <= 0) {
                dir.mSubArbolIzq(new cNodoAB(pElemento));
                rta = true;
            } else {
                dir.mSubArbolDer(new cNodoAB(pElemento));
                rta = true;
            }
        } return rta;
    }
    public String preOrden() {
        String rta = "";
        if(!estaVacio()) {
            Stack<cNodoAB> pila = new Stack<>();
            cNodoAB dir = null;
            pila.push(aRaiz);
            while(!pila.isEmpty()) {
                dir = pila.pop();
                rta = rta + dir.sElemento() + " ";
                if(dir.sSubArbolDer()!= null) { pila.push(dir.sSubArbolDer()); }
                if(dir.sSubArbolIzq()!= null) { pila.push(dir.sSubArbolIzq()); }
            }
        }return rta;
    }
    public String inOrden() {
        String rta = "";
        if(!estaVacio()) {
            Stack<cNodoAB> pila = new Stack<>();
            cNodoAB dir = aRaiz;
            while(!pila.isEmpty()) {
                while(dir != null) {
                    pila.push(dir);
                    dir = dir.sSubArbolIzq();
                }
                dir = pila.pop();
                rta = rta + dir.sElemento() + " ";
                dir = dir.sSubArbolDer();
            }
        }return rta;
    }
    public String posOrden() {
        String rta = "";
        if (!estaVacio()) {
            Stack<cNodoAB> pila = new Stack<>();
            cNodoAB dir = aRaiz;
            cNodoAB dirultimo = null;

            while (!pila.isEmpty() || dir != null) {
                if (dir != null) {
                    pila.push(dir);
                    dir = dir.sSubArbolIzq();
                } else {
                    cNodoAB nodo = pila.peek();
                    if (nodo.sSubArbolDer() != null && nodo.sSubArbolDer() != dirultimo) {
                        dir = nodo.sSubArbolDer();
                    } else {
                        rta = rta + nodo.sElemento() + " ";
                        dirultimo = pila.pop();
                    }
                }
            }
        }
        return rta;
    }
    public cNodoAB maximo() {
        cNodoAB rta = null;
        if(!estaVacio()){
            rta = aRaiz;
            while(rta.sSubArbolDer() != null) { rta = rta.sSubArbolDer(); }
        }return rta;
    }
    public cNodoAB minimo() {
        cNodoAB rta = null;
        if(!estaVacio()){
            rta = aRaiz;
            while(rta.sSubArbolIzq()!= null) { rta = rta.sSubArbolIzq(); }
        }return rta;
    }
    public cNodoAB maximo(cNodoAB pMaximo) {
        cNodoAB rta = pMaximo;
        while(rta.sSubArbolDer() != null) { rta = rta.sSubArbolDer(); }
        return rta;
    }
    public void limpiar() {
        if(!estaVacio()) {
            Stack<cNodoAB> pila = new Stack<>();
            cNodoAB dir = null;
            pila.push(aRaiz);
            while(!pila.isEmpty()) {
                dir = pila.pop();
                if(dir.sSubArbolIzq() != null){
                    if(dir.sSubArbolIzq().sElemento() == null) {
                        if(dir.sSubArbolIzq().sSubArbolIzq() == null && dir.sSubArbolIzq().sSubArbolDer() == null) {
                            dir.mSubArbolIzq(null);
                        } else if(dir.sSubArbolIzq().sSubArbolIzq() != null) {
                            dir.sSubArbolIzq().mElemento(dir.sSubArbolIzq().sSubArbolIzq().sElemento());
                            dir.sSubArbolIzq().mSubArbolDer(dir.sSubArbolIzq().sSubArbolIzq().sSubArbolDer());
                            dir.sSubArbolIzq().mSubArbolIzq(dir.sSubArbolIzq().sSubArbolIzq().sSubArbolIzq());
                        } else if(dir.sSubArbolIzq().sSubArbolDer() != null) {
                            dir.sSubArbolIzq().mElemento(dir.sSubArbolIzq().sSubArbolDer().sElemento());
                            dir.sSubArbolIzq().mSubArbolIzq(dir.sSubArbolIzq().sSubArbolDer().sSubArbolIzq());
                            dir.sSubArbolIzq().mSubArbolDer(dir.sSubArbolIzq().sSubArbolDer().sSubArbolDer());
                        }
                    }
                }
                if(dir.sSubArbolDer() != null){
                    if(dir.sSubArbolDer().sElemento() == null) {
                        if(dir.sSubArbolDer().sSubArbolIzq() == null && dir.sSubArbolDer().sSubArbolDer() == null) {
                            dir.mSubArbolDer(null);
                        } else if(dir.sSubArbolDer().sSubArbolDer() != null) {
                            dir.sSubArbolDer().mElemento(dir.sSubArbolDer().sSubArbolDer().sElemento());
                            dir.sSubArbolDer().mSubArbolIzq(dir.sSubArbolDer().sSubArbolDer().sSubArbolIzq());
                            dir.sSubArbolDer().mSubArbolDer(dir.sSubArbolDer().sSubArbolDer().sSubArbolDer());
                        } else if(dir.sSubArbolDer().sSubArbolIzq() != null) {
                            dir.sSubArbolDer().mElemento(dir.sSubArbolDer().sSubArbolIzq().sElemento());
                            dir.sSubArbolDer().mSubArbolDer(dir.sSubArbolDer().sSubArbolIzq().sSubArbolDer());
                            dir.sSubArbolDer().mSubArbolIzq(dir.sSubArbolDer().sSubArbolIzq().sSubArbolIzq());
                        }
                    }
                }
                if(dir.sSubArbolIzq() != null) { pila.push(dir.sSubArbolIzq()); }
                if(dir.sSubArbolDer()!= null) { pila.push(dir.sSubArbolDer()); }
            }
        }
    }
    public boolean eliminar(Object pElemento){
        boolean rta = false;
        if(!estaVacio()) {
            cNodoAB max = null, dir = arbol(pElemento);
            if(dir != null) {
                rta = true;
                if(dir == aRaiz && dir.sSubArbolIzq() == null && dir.sSubArbolDer() == null) {
                    aRaiz = null;
                }
                else {
                    if(dir.sSubArbolIzq() == null && dir.sSubArbolDer() == null) { dir.mElemento(null); }
                    else if(dir.sSubArbolIzq() != null && dir.sSubArbolDer() != null) {
                        max = maximo(dir.sSubArbolIzq());
                        dir.mElemento(max.sElemento());
                        max.mElemento(null);
                    }
                    else if(dir.sSubArbolIzq() != null) {
                        dir.mElemento(dir.sSubArbolIzq().sSubArbolDer());
                        dir.mSubArbolDer(dir.sSubArbolIzq().sSubArbolDer());
                        dir.mSubArbolIzq(dir.sSubArbolIzq().sSubArbolIzq());
                    } else {
                        dir.mElemento(dir.sSubArbolDer().sElemento());
                        dir.mSubArbolIzq(dir.sSubArbolDer().sSubArbolIzq());
                        dir.mSubArbolDer(dir.sSubArbolDer().sSubArbolDer());
                    }
                }
            }
        }
        if(rta) { limpiar(); }
        return rta;
     }
    public boolean existe(Object pElemento) {
        boolean rta = false;
        if(!estaVacio()) {
            cNodoAB dir = aRaiz;
            while(dir != null && !rta){
                if(pElemento.equals(dir.sElemento())) { rta = true;}
                else {
                    if(pElemento.toString().compareTo(dir.sElemento().toString()) < 0) {
                        dir = dir.sSubArbolIzq();
                    } else { dir = dir.sSubArbolDer(); }
                }
            }
        } return rta;
    }
    public boolean esPadre(Object pElemento) {
        boolean rta = false;
        if(!estaVacio()) {
            cNodoAB dir = aRaiz;
            while(dir != null && !rta) {
                if(pElemento.equals(dir.sElemento())) {
                    if(dir.sSubArbolIzq() != null || dir.sSubArbolDer() != null) { rta = true; }
                    else { dir = null; }
                } else {
                    if(pElemento.toString().compareTo(dir.sElemento().toString()) < 0) {
                        dir = dir.sSubArbolIzq();
                    } else { dir = dir.sSubArbolDer(); }
                }
            }
        } return rta;
    }
    public boolean esHoja(Object pElemento) {
        boolean rta = false;
        if(!estaVacio()) {
            cNodoAB dir = aRaiz;
            while(dir != null && !rta) {
                if(pElemento.equals(dir.sElemento())) {
                    if(dir.sSubArbolIzq() ==  null && dir.sSubArbolDer() == null) { rta = true; }
                    else { dir = null; }
                } else {
                    if(pElemento.toString().compareTo(dir.sElemento().toString()) < 0) {
                        dir = dir.sSubArbolIzq();
                    } else { dir = dir.sSubArbolDer(); } 
                }
            }
        } return rta;
    }
    public cNodoAB padre(Object pELemento) {
        cNodoAB rta = null;
        if(!estaVacio()) {
            rta = aRaiz;
            boolean encontrado = false;
            while(rta != null && !encontrado) {
                if(pELemento.equals(rta.sElemento())) { rta = null; }
                else {
                    if(pELemento.toString().compareTo(rta.sElemento().toString()) < 0) {
                        if(rta.sSubArbolIzq() != null) {
                            if(pELemento.equals(rta.sSubArbolIzq().sElemento())) { encontrado = true; }
                            else { rta = rta.sSubArbolIzq(); }
                        } else{ rta = rta.sSubArbolIzq(); }
                    } else {
                        if(rta.sSubArbolDer() != null) {
                            if(pELemento.equals(rta.sSubArbolDer().sElemento())) { encontrado = true; }
                            else { rta = rta.sSubArbolDer(); }
                        }
                    }
                }
            }
        } return rta; 
    }
    public int nodos() {
        int rta = 0;
        if(!estaVacio()) {
            Stack<cNodoAB> pila = new Stack<>();
            cNodoAB dir = null;
            pila.push(aRaiz);
            while(!pila.isEmpty()) {
                dir = pila.pop();
                rta = rta + 1;
                if(dir.sSubArbolDer() != null) { pila.push(dir.sSubArbolDer()); }
                if(dir.sSubArbolIzq()!= null) { pila.push(dir.sSubArbolIzq()); }
            }
        } return rta;
    }
    public int padres(){
        int rta = 0;
        if(!estaVacio()){
            Stack<cNodoAB> pila = new Stack<>();
            cNodoAB dir = null;
            pila.push(aRaiz);
            while(!pila.isEmpty()){
                dir = pila.pop();
                if(dir.sSubArbolIzq() != null || dir.sSubArbolDer() != null) { rta = rta + 1; }
                if(dir.sSubArbolDer()!= null) { pila.push(dir.sSubArbolDer()); }
                if(dir.sSubArbolIzq() != null) { pila.push(dir.sSubArbolIzq()); }
            }
        }return rta;
    }
    public int hojas(){
        int rta = 0;
        if(!estaVacio()){
            Stack<cNodoAB> pila = new Stack<>();
            cNodoAB dir = null;
            pila.push(aRaiz);
            while(!pila.isEmpty()){
                dir = pila.pop();
                if(dir.sSubArbolIzq() == null && dir.sSubArbolDer() == null) { rta = rta + 1; }
                if(dir.sSubArbolDer()!= null) { pila.push(dir.sSubArbolDer()); }
                if(dir.sSubArbolIzq() != null) { pila.push(dir.sSubArbolIzq()); }
            }
        }return rta;
    }
    public int altura() {
        int rta = 0;
        if(!estaVacio()){
            Queue<cNodoAB> cola = new ArrayDeque<>();
            cola.add(aRaiz);
            cNodoAB dir = null;
            while(!cola.isEmpty()){
                int tamanio = cola.size();
                while(tamanio-- > 0) {
                    dir = cola.poll();
                    if(dir.sSubArbolIzq() != null) { cola.add(dir.sSubArbolIzq()); }
                    if(dir.sSubArbolDer()!= null) { cola.add(dir.sSubArbolDer()); }
                }
                rta = rta + 1;
            }
        }return rta;
    }
    public int nivel(Object pElemento) {
        int rta = 0;
        cNodoAB dir = aRaiz;
        boolean encontrado = false;
        if(!estaVacio()) {
            while(dir != null && !encontrado) {
                if(pElemento.equals(dir.sElemento())) { encontrado = false; }
                else {
                    if(dir.sSubArbolIzq() != null && pElemento.toString().compareTo(dir.sElemento().toString()) < 0){ 
                        dir = dir.sSubArbolIzq();
                        rta  = rta + 1;
                    }
                    else if(dir.sSubArbolDer() != null && pElemento.toString().compareTo(dir.sElemento().toString()) > 0){ 
                        dir = dir.sSubArbolDer();
                        rta  = rta + 1;
                    } else {
                        dir = null;
                    }
                }
            }
        } return (encontrado ? rta : -1);
    }
    public String recorrerHojas(){
        String rta = "";
        if(!estaVacio()){
            Stack<cNodoAB> pila = new Stack<>();
            cNodoAB dir = null;
            pila.push(aRaiz);
            while(!pila.isEmpty()){
                dir = pila.pop();
                if(dir.sSubArbolIzq() == null && dir.sSubArbolDer() == null) { rta = rta + dir.sElemento() + ""; }
                if(dir.sSubArbolDer()!= null) { pila.push(dir.sSubArbolDer()); }
                if(dir.sSubArbolIzq() != null) { pila.push(dir.sSubArbolIzq()); }
            }
        }return rta;
    }
    public String recorrerPadres(){
        String rta = " ";
        if(!estaVacio()){
            Stack<cNodoAB> pila = new Stack<>();
            cNodoAB dir = null;
            pila.push(aRaiz);
            while(!pila.isEmpty()){
                dir = pila.pop();
                if(dir.sSubArbolIzq() != null || dir.sSubArbolDer() != null) { rta = rta + dir.sElemento() + " "; }
                if(dir.sSubArbolDer() != null) { pila.push(dir.sSubArbolDer()); }
                if(dir.sSubArbolIzq() != null) { pila.push(dir.sSubArbolIzq()); }
            }
        }return rta;
    }
    public String recorrerNodos() {
        String rta = "";
        if(!estaVacio()) {
            Stack<cNodoAB> pila = new Stack<>();
            cNodoAB dir = null;
            pila.push(aRaiz);
            while(!pila.isEmpty()){
                dir = pila.pop();
                rta = rta + dir.sElemento() + " ";
                if(dir.sSubArbolDer() != null) { pila.push(dir.sSubArbolDer()); }
                if(dir.sSubArbolIzq()!= null) { pila.push(dir.sSubArbolIzq()); }
            }
        } return rta;
    }
    public String recorrerHijos(){
        String rta = "";
        if(!estaVacio()){
            Stack<cNodoAB> pila = new Stack<>();
            cNodoAB dir = null;
            pila.push(aRaiz);
            while(!pila.isEmpty()){
                dir = pila.pop();
                rta = rta + dir.sElemento() + " ";
            }
        } return rta;
    }
    public String suPadre(Object pElemento) {
        String rta = "";
        if (!estaVacio()) {
            cNodoAB actual = aRaiz;
            while (actual != null) {
                if (actual.sSubArbolIzq() != null && pElemento.equals(actual.sSubArbolIzq().sElemento())) {
                    rta = actual.sElemento().toString();
                    break;
                } else if (actual.sSubArbolDer() != null && pElemento.equals(actual.sSubArbolDer().sElemento())) {
                    rta = actual.sElemento().toString();
                    break;
                } else {
                    if (pElemento.toString().compareTo(actual.sElemento().toString()) < 0) {
                        actual = actual.sSubArbolIzq();
                    } else {
                        actual = actual.sSubArbolDer();
                    }
                }
            }
        }
        return rta.isEmpty() ? "No tiene padre o no existe" : rta;
    }
    public String recorreHermano(Object pElemento) {
        String rta = "";
        if (!estaVacio()) {
            Stack<cNodoAB> pila = new Stack<>();
            cNodoAB dir = null;
            pila.push(aRaiz);

            while (!pila.isEmpty()) {
                dir = pila.pop();

                if (dir.sSubArbolIzq() != null && pElemento.equals(dir.sSubArbolIzq().sElemento())) {
                    if (dir.sSubArbolDer() != null) {
                        rta = dir.sSubArbolDer().sElemento().toString();
                    }
                    break;
                }
                if (dir.sSubArbolDer() != null && pElemento.equals(dir.sSubArbolDer().sElemento())) {
                    if (dir.sSubArbolIzq() != null) {
                        rta = dir.sSubArbolIzq().sElemento().toString();
                    }
                    break;
                }

                if (dir.sSubArbolDer() != null) pila.push(dir.sSubArbolDer());
                if (dir.sSubArbolIzq() != null) pila.push(dir.sSubArbolIzq());
            }
        }
        return rta.isEmpty() ? "No tiene hermano" : rta;
    }
    public String recorreNivel(Object pElemento) {
        String rta = "";
        if (!estaVacio()) {
            int objetivo = nivel(pElemento); // usa tu método ya hecho
            if (objetivo != -1) {
                Stack<cNodoAB> actual = new Stack<>();
                Stack<cNodoAB> siguiente = new Stack<>();
                actual.push(aRaiz);
                int nivel = 0;

                while (!actual.isEmpty()) {
                    while (!actual.isEmpty()) {
                        cNodoAB nodo = actual.pop();
                        if (nivel == objetivo) {
                            rta += nodo.sElemento() + " ";
                        }
                        if (nodo.sSubArbolDer() != null) siguiente.push(nodo.sSubArbolDer());
                        if (nodo.sSubArbolIzq() != null) siguiente.push(nodo.sSubArbolIzq());
                    }
                    if (nivel == objetivo) break;
                    nivel++;
                    Stack<cNodoAB> temp = actual;
                    actual = siguiente;
                    siguiente = temp;
                }
            }
        }
        return rta.isEmpty() ? "Elemento no encontrado o sin nodos en ese nivel" : rta;
    }
    public String recorrePrimerHijo() {
        String rta = "";
        if (!estaVacio()) {
            Stack<cNodoAB> pila = new Stack<>();
            pila.push(aRaiz);
            while (!pila.isEmpty()) {
                cNodoAB nodo = pila.pop();
                if (nodo.sSubArbolIzq() != null || nodo.sSubArbolDer() != null) {
                    if (nodo.sSubArbolIzq() != null) {
                        rta += nodo.sSubArbolIzq().sElemento() + " ";
                    } else if (nodo.sSubArbolDer() != null) {
                        rta += nodo.sSubArbolDer().sElemento() + " ";
                    }
                }
                if (nodo.sSubArbolDer() != null) pila.push(nodo.sSubArbolDer());
                if (nodo.sSubArbolIzq() != null) pila.push(nodo.sSubArbolIzq());
            }
        }
        return rta.isEmpty() ? "No hay primeros hijos" : rta;
    }
    public String recorreHijoUnico() {
        String rta = "";
        if (!estaVacio()) {
            Stack<cNodoAB> pila = new Stack<>();
            pila.push(aRaiz);

            while (!pila.isEmpty()) {
                cNodoAB nodo = pila.pop();

                if ((nodo.sSubArbolIzq() != null && nodo.sSubArbolDer() == null)) {
                    rta += nodo.sSubArbolIzq().sElemento() + " ";
                } else if (nodo.sSubArbolIzq() == null && nodo.sSubArbolDer() != null) {
                    rta += nodo.sSubArbolDer().sElemento() + " ";
                }

                if (nodo.sSubArbolDer() != null) pila.push(nodo.sSubArbolDer());
                if (nodo.sSubArbolIzq() != null) pila.push(nodo.sSubArbolIzq());
            }
        }
        return rta.isEmpty() ? "No hay hijos únicos" : rta;
    }
    public String recorreUltimoHijo() {
        String rta = "";
        if (!estaVacio()) {
            Stack<cNodoAB> pila = new Stack<>();
            pila.push(aRaiz);

            while (!pila.isEmpty()) {
                cNodoAB nodo = pila.pop();

                if (nodo.sSubArbolIzq() != null || nodo.sSubArbolDer() != null) {
                    if (nodo.sSubArbolDer() != null) {
                        rta += nodo.sSubArbolDer().sElemento() + " ";
                    } else if (nodo.sSubArbolIzq() != null) {
                        rta += nodo.sSubArbolIzq().sElemento() + " ";
                    }
                }

                if (nodo.sSubArbolDer() != null) pila.push(nodo.sSubArbolDer());
                if (nodo.sSubArbolIzq() != null) pila.push(nodo.sSubArbolIzq());
            }
        }
        return rta.isEmpty() ? "No hay últimos hijos" : rta;
    }
    public String recorreSegundoHijo() {
        String rta = "";
        if (!estaVacio()) {
            Stack<cNodoAB> pila = new Stack<>();
            pila.push(aRaiz);

            while (!pila.isEmpty()) {
                cNodoAB nodo = pila.pop();

                if (nodo.sSubArbolDer() != null) {
                    rta += nodo.sSubArbolDer().sElemento() + " ";
                }

                if (nodo.sSubArbolDer() != null) pila.push(nodo.sSubArbolDer());
                if (nodo.sSubArbolIzq() != null) pila.push(nodo.sSubArbolIzq());
            }
        }
        return rta.isEmpty() ? "No hay segundos hijos" : rta;
    }
    public boolean sonHermano(Object pElemento) {
        boolean rta = false;
        if (!estaVacio()) {
            Stack<cNodoAB> pila = new Stack<>();
            pila.push(aRaiz);

            while (!pila.isEmpty() && !rta) {
                cNodoAB dir = pila.pop();

                if (dir.sSubArbolIzq() != null && dir.sSubArbolDer() != null) {
                    if (pElemento.equals(dir.sSubArbolIzq().sElemento()) || pElemento.equals(dir.sSubArbolDer().sElemento())) {
                        rta = true;
                    }
                }

                if (dir.sSubArbolDer() != null) pila.push(dir.sSubArbolDer());
                if (dir.sSubArbolIzq() != null) pila.push(dir.sSubArbolIzq());
            }
        }
        return rta;
    }
    public String primeroUltimo() {
        String rta = "";
        if (!estaVacio()) {
            cNodoAB min = minimo();
            cNodoAB max = maximo();
            rta = "Primero: " + min.sElemento() + " - Último: " + max.sElemento();
        }
        return rta.isEmpty() ? "Árbol vacío" : rta;
    }
}