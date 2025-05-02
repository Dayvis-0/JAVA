public class cArbolAVL extends cArbolB{
    //... atributos
    private int aEquilibrio;
    //... constructores
    protected cArbolAVL(){ super(); aEquilibrio= 0; }
    protected cArbolAVL(Object pRaiz, cArbolB pSubArbolIzq, cArbolB pSubArbolDer){
        super(pRaiz, pSubArbolIzq, pSubArbolDer);
        aEquilibrio= 0;
    }
    //... modificadores
    //...selectores
    public int sEquilibrio(){ return aEquilibrio; }
    //... primitivos
    //... metodos primitivos
    public void rotSimpleIzquierda(){
        //... creando nodo auxiliar
        cArbolB aux= new cArbolAVL(sRaiz(), sSubArbolIzq().sSubArbolDer(), sSubArbolDer());
        //... levantando arbol izquierdo
        mRaiz(sSubArbolIzq().sRaiz());
        mSubArbolIzq(sSubArbolIzq().sSubArbolIzq());
        mSubArbolDer(aux);
    }
    public void rotSimpleDerecha(){
        //... creando nodo auxiliar
        cArbolB aux= new cArbolAVL(sRaiz(), sSubArbolIzq(), sSubArbolDer().sSubArbolIzq());
        //... levantando arbol derecho
        mRaiz(sSubArbolDer().sRaiz());
        mSubArbolDer(sSubArbolDer().sSubArbolDer());
        mSubArbolIzq(aux);
    }
    public void rotDobleID(){
        cArbolB aux= new cArbolAVL(sRaiz(), null, sSubArbolDer());
        mRaiz(sSubArbolIzq().sSubArbolDer().sRaiz());
        //... eliminando el nodo subido
        if(sSubArbolIzq().sSubArbolDer().sSubArbolIzq() == null && sSubArbolIzq().sSubArbolDer().sSubArbolDer() == null){
            sSubArbolIzq().mSubArbolDer(null);
        }else{
            if(sSubArbolIzq().sSubArbolDer().sSubArbolIzq() != null){
                sSubArbolIzq().mSubArbolDer(sSubArbolIzq().sSubArbolDer().sSubArbolIzq());
            }
            if(sSubArbolIzq().sSubArbolDer().sSubArbolDer()!= null){
                aux.mSubArbolIzq(sSubArbolIzq().sSubArbolDer().sSubArbolDer());
                sSubArbolIzq().mSubArbolDer(null);
            }
        }
        mSubArbolDer(aux);
    }
    public void rotDobleDI(){
        cArbolB aux= new cArbolAVL(sRaiz(), sSubArbolIzq(), null);
        mRaiz(sSubArbolDer().sSubArbolIzq().sRaiz());
        if(sSubArbolDer().sSubArbolIzq().sSubArbolIzq() == null && sSubArbolDer().sSubArbolIzq().sSubArbolDer() == null){
            sSubArbolDer().mSubArbolIzq(null);
        }else{
            if(sSubArbolDer().sSubArbolIzq().sSubArbolDer() != null){
                sSubArbolDer().mSubArbolIzq(sSubArbolDer().sSubArbolIzq().sSubArbolDer());
            }
            if(sSubArbolDer().sSubArbolIzq().sSubArbolIzq() != null){
                aux.mSubArbolDer(sSubArbolDer().sSubArbolIzq().sSubArbolIzq());
                sSubArbolDer().mSubArbolIzq(null);
            }
        }
        mSubArbolIzq(aux);
    }
    private void equilibrarNodos(){
        if(!estaVacio()){
            aEquilibrio= 0;
            if(sSubArbolDer() != null){ aEquilibrio= sSubArbolDer().nodos(); }
            if(sSubArbolIzq() != null){ aEquilibrio= aEquilibrio-sSubArbolIzq().nodos(); }
            //... actualizando demas sub nodos
            if(sSubArbolIzq() != null){ ((cArbolAVL)sSubArbolIzq()).equilibrarNodos(); }
            if(sSubArbolDer() != null){ ((cArbolAVL)sSubArbolDer()).equilibrarNodos(); }
        }
    }
    private void balancear(){
        int eI= 0, eD= 0;
        if(sSubArbolIzq() != null){ eI= 1+sSubArbolIzq().altura(); }
        if(sSubArbolDer() != null){ eD= 1+sSubArbolDer().altura(); }
        if(Math.abs(eD-eI)>1){
            if(eI > eD){ //... rotación izquierda
                if(((cArbolAVL)sSubArbolIzq()).sEquilibrio()<0){ rotSimpleIzquierda(); }
                else{ rotDobleID(); }
            }else{ //... rotacion derecha
                if(((cArbolAVL)sSubArbolDer()).sEquilibrio()>0){ rotSimpleDerecha(); }
                else{ rotDobleDI(); }
            }
            equilibrarNodos();
        }
    }
    public void agregar(Object pRaiz){
        if(estaVacio()){ mRaiz(pRaiz); }
        else{
            if(pRaiz.toString().compareTo(sRaiz().toString()) <= 0){
                if(sSubArbolIzq() == null){ mSubArbolIzq(new cArbolAVL()); }
                //... Agregar por hijo izquierdo
                ((cArbolAVL)sSubArbolIzq()).agregar(pRaiz);
                aEquilibrio--;
            }else{
                if(sSubArbolDer() == null){ mSubArbolDer(new cArbolAVL()); }
                //... Agregar por hijo derecho
                ((cArbolAVL)sSubArbolDer()).agregar(pRaiz);
                aEquilibrio++;
            }
        }
        if(Math.abs(aEquilibrio)>1){ balancear(); }
    }
    public boolean eliminar(Object pRaiz){
        boolean rta= false;
        if(!estaVacio()){
            if(pRaiz.equals(sRaiz())){
                rta= true;
                if(sSubArbolIzq() == null && sSubArbolDer() == null){ mRaiz(null); }
                else{
                    if(sSubArbolIzq() != null && sSubArbolDer() != null){
                        cArbolB aux= sSubArbolIzq().maximo();
                        mRaiz(aux.sRaiz());
                        ((cArbolAVL)sSubArbolIzq()).eliminar(sRaiz());
                    }else{
                        if(sSubArbolIzq() != null){
                            mRaiz(sSubArbolIzq().sRaiz());
                            mSubArbolIzq(sSubArbolIzq().sSubArbolIzq());
                            mSubArbolDer(sSubArbolIzq().sSubArbolDer());
                        }
                        if(sSubArbolDer() != null){
                            mRaiz(sSubArbolDer().sRaiz());
                            mSubArbolIzq(sSubArbolDer().sSubArbolIzq());
                            mSubArbolDer(sSubArbolDer().sSubArbolDer());
                        }
                    }
                }
            }else{
                if(sSubArbolIzq() != null && pRaiz.toString().compareTo(sRaiz().toString()) < 0){
                    ((cArbolAVL)sSubArbolIzq()).eliminar(pRaiz);
                }else if(sSubArbolDer() != null){ ((cArbolAVL)sSubArbolDer()).eliminar(pRaiz); }
            }
        }
        limpiar();
        balancear();
        return rta;
    }
}