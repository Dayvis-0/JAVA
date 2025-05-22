import java.util.Stack;
public class cArbolI {
    //... atributo
    private cNodoA aRaiz;
    //... constructor
    protected cArbolI(){ aRaiz= null; }
    //... modificador
    public void mRaiz(cNodoA pRaiz){ aRaiz= pRaiz; }
    //... selector
    public cNodoA sRaiz(){ return aRaiz; }
    //... metodos basicos
    public boolean estaVacio(){ return (aRaiz == null); }
    public cNodoA nodo(Object pElemento){
        cNodoA rta= null;
        if(!estaVacio()){
            Stack<cNodoA> pila= new Stack<>();
            pila.push(aRaiz);
            cNodoA dir= null;
            while(!pila.isEmpty() && rta == null){
                dir= pila.pop();
                if(dir.sElemento().equals(pElemento)){ rta= dir; }
                else{
                    if(dir.sShermano() != null){ pila.push(dir.sShermano()); }
                    if(dir.sPhijo() != null){ pila.push(dir.sPhijo()); }
                }
            }
        }return rta;
    }
    public boolean agregar(Object pPadre, Object pHijo){
        boolean rta= false;
        cNodoA dir= nodo(pPadre);
        if(estaVacio() && dir == null){ aRaiz= new cNodoA(pHijo); rta= true;}
        else{
            if(dir != null){
                if(dir.sPhijo() == null){ dir.mPhijo(new cNodoA(pHijo)); rta= true;}
                else{dir= dir.sPhijo();
                    while(dir.sShermano() != null){ dir= dir.sShermano(); }
                    dir.mShermano(new cNodoA(pHijo));
                    rta= true;
                }
            }
        }return rta;
    }
}