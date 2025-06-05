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
    public String recorreNodo(){
        String rta= "";
        if(!estaVacio()){
            Stack<cNodoA> pila= new Stack<>();
            pila.push(aRaiz);
            cNodoA dir= null;
            while(!pila.isEmpty()){
                dir= pila.pop();
                rta= rta+dir.sElemento()+" ";
                if(dir.sPhijo() != null){ pila.push(dir.sPhijo()); }
                if(dir.sShermano() != null){ pila.push(dir.sShermano()); }
            }
        }return rta;
    }
    public int nodos(){
        int rta= 0;
        if(!estaVacio()){
            Stack<cNodoA> pila= new Stack<>();
            pila.push(aRaiz);
            cNodoA dir= null;
            while(!pila.isEmpty()){
                dir= pila.pop();
                rta= rta+1;
                if(dir.sPhijo() != null){ pila.push(dir.sPhijo()); }
                if(dir.sShermano() != null){ pila.push(dir.sShermano()); }
            }
        }return rta;
    }
    public boolean esHijo(Object pHijo){
        boolean rta= false;
        if(!estaVacio()){
            Stack<cNodoA> pila= new Stack<>();
            pila.push(aRaiz);
            cNodoA dir= null;
            while(!rta && !pila.isEmpty()){
                dir= pila.pop();
                if(dir.sElemento().equals(pHijo)){
                     if(dir.sPhijo() == null){ rta= true; }
                }else{
                    if(dir.sPhijo() != null){ pila.push(dir.sPhijo()); }
                    if(dir.sShermano() != null){ pila.push(dir.sShermano()); }
                }
            }
        }return rta;
    }
    public boolean esPadre(Object pHijo){
        boolean rta= false;
        if(!estaVacio()){
            Stack<cNodoA> pila= new Stack<>();
            pila.push(aRaiz);
            cNodoA dir= null;
            while(!rta && !pila.isEmpty()){
                dir= pila.pop();
                if(dir.sElemento().equals(pHijo)){
                     if(dir.sPhijo() != null){ rta= true; }
                }else{
                    if(dir.sPhijo() != null){ pila.push(dir.sPhijo()); }
                    if(dir.sShermano() != null){ pila.push(dir.sShermano()); }
                }
            }
        }return rta;
    }
    public String preOrden(){
        String rta= "";
        if(!estaVacio()){
            Stack<cNodoA> pila= new Stack<>();
            pila.push(aRaiz);
            cNodoA dir= null;
            while(!pila.isEmpty()){
                dir= pila.pop();
                rta= rta+dir.sElemento()+" ";
                if(dir.sShermano() != null){ pila.push(dir.sShermano()); }
                if(dir.sPhijo() != null){ pila.push(dir.sPhijo()); }
            }
        }return rta;
    }
    public String posOrden(){ String rta= ""; return rta; }
    public cNodoA padre(Object pHijo){ cNodoA rta= null; return rta; }
    public int padres(){
        int rta= 0;
        if(!estaVacio()){
            Stack<cNodoA> pila= new Stack<>();
            pila.push(aRaiz);
            cNodoA dir= null;
            while(!pila.isEmpty()){
                dir= pila.pop();
                if(dir.sPhijo() != null){ rta= rta+1; }
                if(dir.sPhijo() != null){ pila.push(dir.sPhijo()); }
                if(dir.sShermano() != null){ pila.push(dir.sShermano()); }
            }
        }return rta;
    }
    public int hijos(){
        int rta= 0;
        if(!estaVacio()){
            Stack<cNodoA> pila= new Stack<>();
            pila.push(aRaiz);
            cNodoA dir= null;
            while(!pila.isEmpty()){
                dir= pila.pop();
                if(dir.sPhijo() == null){ rta= rta+1; }
                if(dir.sPhijo() != null){ pila.push(dir.sPhijo()); }
                if(dir.sShermano() != null){ pila.push(dir.sShermano()); }
            }
        }return rta;
    }
}