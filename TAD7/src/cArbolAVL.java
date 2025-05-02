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
}