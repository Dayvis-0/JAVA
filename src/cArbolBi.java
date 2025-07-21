import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
public class cArbolBi {
    //... atributo
    private cNodoAb aRaiz;
    //... constructor
    protected cArbolBi(){ aRaiz= null; }
    //... modificador
    public void mRaiz(cNodoAb pRaiz){ aRaiz= pRaiz; }
    //... selectores
    public cNodoAb sRaiz(){ return aRaiz; }
    //... metodos basicos
    public boolean estaVacio(){ return (aRaiz==null); }
    private cNodoAb posicionar(Object pRaiz){
        cNodoAb rta= aRaiz;
        if(!estaVacio()){
            boolean hayNodo= true;
            while(hayNodo){
                if(pRaiz.toString().compareTo(rta.sRaiz().toString())<=0){
                    if(rta.sSubArbolIzq() != null){ rta= rta.sSubArbolIzq(); }
                    else{ hayNodo= false; }
                }else{
                    if(rta.sSubArbolDer() != null){ rta= rta.sSubArbolDer(); }
                    else{ hayNodo= false; }
                }
            }
        }return rta;
    }
    public boolean agregar(Object pRaiz){
        boolean rta= false;
        if(estaVacio()){ aRaiz= new cNodoAb(pRaiz); rta= true; }
        else{
            cNodoAb dir= posicionar(pRaiz);
            if(pRaiz.toString().compareTo(dir.sRaiz().toString())<=0){
                dir.mSubArbolIzq(new cNodoAb(pRaiz)); rta= true;
            }else{ dir.mSubArbolDer(new cNodoAb(pRaiz)); rta= true; }
        }return rta;
    }
    public String preOrden(){
        String rta= "";
        if(!estaVacio()){
            Stack<cNodoAb> pila= new Stack<>();
            cNodoAb dir= null;
            pila.push(aRaiz);
            while(!pila.isEmpty()){
                dir= pila.pop();
                rta= rta+dir.sRaiz()+" ";
                if(dir.sSubArbolDer() != null){ pila.push(dir.sSubArbolDer()); }
                if(dir.sSubArbolIzq() != null){ pila.push(dir.sSubArbolIzq()); }
            }
        }return rta;
    }
    public String inOrden(){ String rta= ""; return rta; }
    public String posOrden(){ String rta= ""; return rta; }
    public cNodoAb arbol(Object pRaiz){
        cNodoAb rta= null;
        if(!estaVacio()){
            rta= aRaiz;
            boolean encontrado= false;
            while(rta != null && !encontrado){
                if(rta.sRaiz().equals(pRaiz)){ encontrado= true; }
                else{
                    if(pRaiz.toString().compareTo(rta.sRaiz().toString()) < 0){
                        rta= rta.sSubArbolIzq();
                    }else{ rta= rta.sSubArbolDer(); }
                }
            }
        }return rta;
    }
    public boolean existe(Object pRaiz){
        boolean rta= false;
        if(!estaVacio()){
            cNodoAb dir= aRaiz;
            while(dir != null && !rta){
                if(dir.sRaiz().equals(pRaiz)){ rta= true; }
                else{
                    if(pRaiz.toString().compareTo(dir.sRaiz().toString()) < 0){
                        dir= dir.sSubArbolIzq();
                    }else{ dir= dir.sSubArbolDer(); }
                }
            }
        }return rta;
    }
    public cNodoAb maximo(){
        cNodoAb rta= null;
        if(!estaVacio()){
            rta= aRaiz;
            while(rta.sSubArbolDer() != null){ rta= rta.sSubArbolDer(); }
        }return rta;
    }
    public cNodoAb minimo(){
        cNodoAb rta= null;
        if(!estaVacio()){
            rta= aRaiz;
            while(rta.sSubArbolIzq() != null){ rta= rta.sSubArbolIzq(); }
        }return rta;
    }
    public int nodos(){
        int rta= 0;
        if(!estaVacio()){
            Stack<cNodoAb> pila= new Stack<>();
            pila.push(aRaiz);
            cNodoAb dir= null;
            while(!pila.isEmpty()){
                dir= pila.pop();
                rta++;
                if(dir.sSubArbolIzq() != null){ pila.push(dir.sSubArbolIzq()); }
                if(dir.sSubArbolDer() != null){ pila.push(dir.sSubArbolDer()); }
            }
        }return rta;
    }
    public int padres(){
        int rta= 0;
        if(!estaVacio()){
            Stack<cNodoAb> pila= new Stack<>();
            pila.push(aRaiz);
            cNodoAb dir= null;
            while(!pila.isEmpty()){
                dir= pila.pop();
                if(dir.sSubArbolIzq() != null || dir.sSubArbolDer() != null){ rta++; };
                if(dir.sSubArbolIzq() != null){ pila.push(dir.sSubArbolIzq()); }
                if(dir.sSubArbolDer() != null){ pila.push(dir.sSubArbolDer()); }
            }
        }return rta;
    }
    public int hijos(){
        int rta= 0;
        if(!estaVacio()){
            Stack<cNodoAb> pila= new Stack<>();
            pila.push(aRaiz);
            cNodoAb dir= null;
            while(!pila.isEmpty()){
                dir= pila.pop();
                if(dir.sSubArbolIzq() == null || dir.sSubArbolDer() == null){ rta++; }
                else{
                    if(dir.sSubArbolIzq() != null){ pila.push(dir.sSubArbolIzq()); }
                    if(dir.sSubArbolDer() != null){ pila.push(dir.sSubArbolDer()); }
                }                
            }
        }return rta;
    }
    public boolean esPadre(Object pRaiz){
        boolean rta= false;
        if(!estaVacio()){
            cNodoAb dir= aRaiz;
            while(dir != null && !rta){
                if(dir.sRaiz().equals(pRaiz)){
                    if(dir.sSubArbolIzq() != null || dir.sSubArbolDer() != null){
                        rta= true;
                    }else{ dir= null; }
                }
                else{
                    if(pRaiz.toString().compareTo(dir.sRaiz().toString()) < 0){
                        dir= dir.sSubArbolIzq();
                    }else{ dir= dir.sSubArbolDer(); }
                }
            }
        }return rta;
    }
    public boolean esHijo(Object pRaiz){
        boolean rta= false;
        if(!estaVacio()){
            cNodoAb dir= aRaiz;
            while(dir != null && !rta){
                if(dir.sRaiz().equals(pRaiz)){
                    if(dir.sSubArbolIzq() == null && dir.sSubArbolDer() == null){
                        rta= true;
                    }else{ dir= null; }
                }
                else{
                    if(pRaiz.toString().compareTo(dir.sRaiz().toString()) < 0){
                        dir= dir.sSubArbolIzq();
                    }else{ dir= dir.sSubArbolDer(); }
                }
            }
        }return rta;
    }
    public cNodoAb padre(Object pRaiz){
        cNodoAb rta= null;
        return rta;
    }
    public String recorrePadre(){
        String rta= "";
        if(!estaVacio()){
            Stack<cNodoAb> pila= new Stack<>();
            cNodoAb dir= null;
            pila.push(aRaiz);
            while(!pila.isEmpty()){
                dir= pila.pop();
                if(dir.sSubArbolIzq() != null || dir.sSubArbolDer() != null){
                    rta= rta+" "+dir.sRaiz();
                }
                if(dir.sSubArbolDer() != null){ pila.push(dir.sSubArbolDer()); }
                if(dir.sSubArbolIzq() != null){ pila.push(dir.sSubArbolIzq()); }
            }
        }return rta;
    }
    public String recorreHijo(){
        String rta= "";
        if(!estaVacio()){
            Stack<cNodoAb> pila= new Stack<>();
            cNodoAb dir= null;
            pila.push(aRaiz);
            while(!pila.isEmpty()){
                dir= pila.pop();
                if(dir.sSubArbolIzq() == null && dir.sSubArbolDer() == null){
                    rta= rta+" "+dir.sRaiz();
                }
                if(dir.sSubArbolDer() != null){ pila.push(dir.sSubArbolDer()); }
                if(dir.sSubArbolIzq() != null){ pila.push(dir.sSubArbolIzq()); }
            }
        }return rta;
    }
    public String recorreNiveles(){
        String rta= "";
        if(!estaVacio()){
            //... crear una cola vacía y poner en cola el nodo raíz
            Queue<cNodoAb> cola= new ArrayDeque<>();
            cola.add(aRaiz);
            cNodoAb nodo= null;
            //... bucle hasta que la cola esté vacía
            while(!cola.isEmpty()){
                nodo= cola.poll();
                rta= rta+nodo.sRaiz()+" ";
                //... procesar cada nodo del nivel y ponerlos en cola (izquierdo y derecho no vacío)
                if(nodo.sSubArbolIzq() != null){ cola.add(nodo.sSubArbolIzq()); }
                if(nodo.sSubArbolDer() != null){ cola.add(nodo.sSubArbolDer()); }
            }
        }return rta;
    }
}