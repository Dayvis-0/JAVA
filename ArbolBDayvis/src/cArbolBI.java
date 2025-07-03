import java.util.Stack;

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
    public cNodoAB buscar(Object pElemento) {
        cNodoAB rta = null;
        if(!estaVacio()) {
            boolean hayNodo = true;
            while(hayNodo) {
                if(pElemento.toString().compareTo(rta.sElemento().toString()) <= 0) {
                    if(rta.sSubArbolIzq() != null) { rta = rta.sSubArbolIzq(); }
                    else { hayNodo = false; }
                } else {
                    if(rta.sSubArbolDer() != null) { rta = rta.sSubArbolDer(); }
                    else { hayNodo = false; }
                }
            }
        } return rta;
    }
    public boolean agregar(Object pElemento) { 
        boolean rta = false;
        if(estaVacio()) { aRaiz = new cNodoAB(pElemento); rta = true; }
        else {
            cNodoAB dir = buscar(pElemento);
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
            pila.push(aRaiz);
            cNodoAB dir = null;
            while(!pila.isEmpty()) {
                dir = pila.pop();
                rta = rta + dir.sElemento() + " ";
                if(dir.sSubArbolIzq()!= null) { pila.push(dir.sSubArbolIzq()); }
                if(dir.sSubArbolDer()!= null) { pila.push(dir.sSubArbolDer()); }
            }
        }return rta;
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
                        dir.mSubArbolDer(dir.sSubArbolDer().sSubArbolIzq());
                        dir.mSubArbolIzq(dir.sSubArbolDer().sSubArbolDer());
                    }
                }
            }
        }
        if(rta) { limpiar(); }
        return rta;
     }
}