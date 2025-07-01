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
    public boolean estaVacio() { return (aRaiz == null);}
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
        if(!estaVacio()) { aRaiz = new cNodoAB(pElemento); rta = true; }
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
}