
import java.util.ArrayList;

public class cArbolPractica {
    //... atributos
    private Object aRaiz;
    private cArbolPractica aPhijo, aShermano;
    //... constructor
    protected cArbolPractica(){ aRaiz= null; aPhijo= null; aShermano= null; }
    protected cArbolPractica(Object pRaiz){ aRaiz= pRaiz; aPhijo= null; aShermano= null; }
    //... modificadores
    public void mRaiz(Object pRaiz){ aRaiz= pRaiz; }
    public void mPhijo(cArbolPractica pPhijo){ aPhijo= pPhijo; }
    public void mShermano(cArbolPractica pShermano){ aShermano= pShermano; }
    //... selectores
    public Object sRaiz(){ return aRaiz; }
    public cArbolPractica sPhijo(){ return aPhijo; }
    public cArbolPractica sShermano(){ return aShermano; }
    //... metodos basicos
    public boolean estaVacio(){ return (aRaiz==null); }
    public cArbolPractica subArbol(Object pRaiz){
        cArbolPractica rta= null;
        if(!estaVacio()){
            if(aRaiz.equals(pRaiz)){ rta= this; }
            else{
                if(aPhijo != null){ rta= aPhijo.subArbol(pRaiz); }
                if(rta == null && aShermano != null){
                    rta= aShermano.subArbol(pRaiz);
                }
            }
        }
        return rta;
    }
    private boolean agregarHermano(Object pRaiz){
        boolean rta= false;
        if(aShermano == null){ aShermano= new cArbolPractica(pRaiz); rta= true; }
        else{ rta= aShermano.agregarHermano(pRaiz); }
        return rta;
    }
    private boolean agregarHijo(Object pRaiz){
        boolean rta= false;
        if(aPhijo == null){ aPhijo= new cArbolPractica(pRaiz); rta= true; }
        else{ rta= aPhijo.agregarHermano(pRaiz);}
        return rta;
    }
    public boolean agregar(cArbolPractica pPadre, Object pHijo){
        boolean rta= false;
        if(pPadre == null && estaVacio()){ aRaiz= pHijo; rta= true; }
        else{
            if(pPadre != null){ rta= pPadre.agregarHijo(pHijo); }
        }
        return rta;
    }
    public String recorreArbol(){
        String rta= "";
        if(!estaVacio()){
            rta= aRaiz+"";
            if(aPhijo != null){ rta= rta+" "+aPhijo.recorreArbol(); }
            if(aShermano != null){ rta= rta+" "+aShermano.recorreArbol(); }
        }return rta;
    }
    //... otros metodos
    public int nodos(){
        int rta= 0;
        if(!estaVacio()){
            rta= 1;
            if(aPhijo != null){ rta= rta+aPhijo.nodos(); }
            if(aShermano != null){ rta= rta+aShermano.nodos(); }
        }return rta;
    }
    public boolean esHijo(Object pRaiz){
        boolean rta= false;
        if(!estaVacio()){
            if(aRaiz.equals(pRaiz)){
                if(aPhijo == null){ rta= true; }
            }else{
                if(aPhijo != null){ rta= aPhijo.esHijo(pRaiz); }
                if(!rta && aShermano != null){ rta= aShermano.esHijo(pRaiz);}
            }
        }return rta;
    }
    public boolean esHijo2(Object pRaiz){
        boolean rta= false;
        if(!estaVacio()){
            if(aRaiz.equals(pRaiz) && aPhijo == null){ rta= true; }
            if(!rta && aPhijo != null){ rta= aPhijo.esHijo(pRaiz); }
            if(!rta && aShermano != null){ rta= aShermano.esHijo(pRaiz);}
        }return rta;
    }
    public boolean esPadre(Object pRaiz){
        boolean rta= false;
        if(!estaVacio()){
            if(aRaiz.equals(pRaiz)){
                if(aPhijo != null){ rta = true; }
            }else{
                if(aPhijo != null){ rta= aPhijo.esPadre(pRaiz); }
                if(!rta && aShermano != null){ rta= aShermano.esPadre(pRaiz);}
            }
        }return rta;
    }
    private String hermanoPreO(){
        String rta= "";
        if(aShermano != null){
            rta= aShermano.preOrden();
            rta= rta+aShermano.hermanoPreO();
        }return rta;
    }
    public String preOrden(){
        String rta= "";
        if(!estaVacio()){
            rta= aRaiz+" ";//... primero muestro la raiz
            if(aPhijo != null){
                rta= rta+aPhijo.preOrden();//... muestro en pre orden el primer hijo
                rta= rta+aPhijo.hermanoPreO();//... muestro los hermanos del primer hijo en pre orden
            }
        }return rta;
    }
    public Object padre(Object pRaiz){
        Object rta= null;
        //... hacerlo en casita
        return rta;
    }
    private String hermanoInO(){
        String rta= "";
        if(aShermano != null){
            rta= aShermano.inOrden();
            rta= rta+aShermano.hermanoInO();
        }return rta;
    }
    public String inOrden(){
        String rta= "";
        if(!estaVacio()){
            if(aPhijo != null){ rta= aPhijo.inOrden();}
            rta= rta+" "+aRaiz;//... medio muestro la raiz
            if(aPhijo != null){ rta= rta+aPhijo.hermanoInO(); }
        }return rta;
    }
    private String hermanoPosO(){
        String rta= "";
        if(aShermano != null){
            rta= aShermano.posOrden();
            rta= rta+aShermano.hermanoPosO();
        }return rta;
    }
    public String posOrden(){
        String rta= "";
        if(!estaVacio()){
            if(aPhijo != null){
                rta= aPhijo.posOrden();
                rta= rta+aPhijo.hermanoPosO();
            }
            rta= rta+" "+aRaiz;//... ultimo muestro la raiz
        }return rta;
    }
    public int padres(){
        int rta= 0;
        if(!estaVacio()){
            if(aPhijo != null){ rta= 1+aPhijo.padres(); }
            if(aShermano != null){ rta= rta+aShermano.padres(); }
        }return rta;
    }
    public int hijos(){
        int rta= 0;
        if(!estaVacio()){
            if(aPhijo == null){ rta= 1; }
            if(aPhijo != null){ rta= aPhijo.hijos(); }
            if(aShermano != null){ rta= rta+aShermano.hijos(); }
        }return rta;
    }
    public boolean existe(Object pRaiz){
        boolean rta= false;
        if(!estaVacio()){
            if(aRaiz.equals(pRaiz)){ rta= true; }
            else{
                if(aPhijo != null){ rta= aPhijo.existe(pRaiz); }
                if(!rta && aShermano != null){ rta= aShermano.existe(pRaiz); }
            }
        }return rta;
    }
    private int alturaHermano(){
        int rta= 0, alt1= 0, alt2= 0;
        if(aShermano != null){
            alt1= aShermano.altura();
            alt2= aShermano.alturaHermano();
            rta= (alt1>alt2?alt1:alt2);
        }
        return rta;
    }
    public int altura(){
        int rta= 0, alt1= 0, alt2= 0;
        if(!estaVacio()){
            if(aPhijo != null){
                alt1= 1+aPhijo.altura();
                alt2= 1+aPhijo.alturaHermano();
                rta= (alt1>alt2?alt1:alt2);
            }
        }return rta;
    }
    public int nivel(Object pRaiz, int pNivel){
        int rta= -1;
        if(!estaVacio()){
            if(aRaiz.equals(pRaiz)){ rta= pNivel; }
            else{
                if(aPhijo != null){ rta= aPhijo.nivel(pRaiz, pNivel+1); }
                if(rta == -1 && aShermano != null){ rta= aShermano.nivel(pRaiz, pNivel); }
            }
        }return rta;
    }
    public String recorrePadre(){
        String rta= "";
        if(!estaVacio()){
            if(aPhijo != null){ rta= aRaiz+" "+aPhijo.recorrePadre(); }
            if(aShermano != null){ rta= rta+aShermano.recorrePadre(); }
        }return rta;
    }
    public String recorreHijo(){
        String rta= "";
        if(!estaVacio()){
            if(aPhijo == null){ rta= aRaiz+" "; }
            else{ rta= aPhijo.recorreHijo(); }
            if(aShermano != null){ rta= rta+aShermano.recorreHijo(); }
        }return rta;
    }
    public String mayor(){
        String rta= "", aux= "";
        if(!estaVacio()){
            rta= aRaiz+"";
            if(aPhijo != null){ aux= aPhijo.mayor(); }
            if(aux.compareTo(rta)>0){ rta= aux; }
            if(aShermano != null){ aux= aShermano.mayor(); }
            if(aux.compareTo(rta)>0){ rta= aux; }
        }return rta;
    }
    
    public ArrayList<Object> obtenerNodo() {
        ArrayList<Object> lista = new ArrayList<>();
        obtenerNodosRec(this, lista);
        
        return lista;
    }
    
    public void obtenerNodosRec(cArbolPractica nodo, ArrayList<Object> lista) {
        if(nodo != null && !nodo.estaVacio()) {
            lista.add(nodo.sRaiz());
            obtenerNodosRec(nodo.sPhijo(), lista);
            obtenerNodosRec(nodo.sShermano(), lista);
        }
    }
    
    public ArrayList<Object> obtenerNodos1() {
        ArrayList<Object> lista = new ArrayList<>();
        obtenerNodosRec1(lista);
        return lista;
    }
    
    public void obtenerNodosRec1(ArrayList<Object> lista) {
        if(!estaVacio()) {
            lista.add(aRaiz);
            if(aPhijo != null) { aPhijo.obtenerNodosRec1(lista); }
            if(aShermano != null) { aShermano.obtenerNodosRec1(lista); }
        }
    }
    
    public char[] nodosOrdenados(int inicio, int siguiente) {
        String elementos = recorreArbol();
        char[] arbolOrd =  new char[elementos.length()];
        
        
        return arbolOrd;
    }
    
    public char[] nodosChar() {
        char[] nodos = new char[nodos()];
        int[] indice = {0};
        
        llenarListaChar(nodos, indice);
        
        return nodos;
    }
    
    public void llenarListaChar(char[] nodos, int[] indice) {
        if(!estaVacio()){
            String valor = String.valueOf(aRaiz);
            if(!valor.isEmpty()) {
                nodos[indice[0]] = valor.charAt(0);
                indice[0]++;
            }
            
            if(aPhijo != null) { aPhijo.llenarListaChar(nodos, indice);}
            if(aShermano != null) { aShermano.llenarListaChar(nodos, indice);}
        }
    }
    
    private int primerosHijos() {
        int rta = 0;
        if(!estaVacio()) {
            if(aPhijo != null) { rta = 1 + aPhijo.primerosHijos(); }   
            if(aShermano != null) { rta = rta + aShermano.primerosHijos(); }
        }
        return rta;
    }
    
    private int ultimosHijos() {
        int rta = 0;
        if(!estaVacio()) {
            if(aPhijo != null && aPhijo.sShermano() == null) { rta = 1; }
            if(aPhijo != null) { rta = rta + aPhijo.ultimosHijos(); }
            if(aShermano != null) { rta = rta + aShermano.ultimosHijos(); }
        }
        return rta;
    }
    
    public boolean esEqui() {
        return (primerosHijos() == ultimosHijos());
    }
    
    public static void main(String[] args) {
        cArbolPractica arb1 = new cArbolPractica();
        
        arb1.agregar(null, "a");
        arb1.agregar(arb1.subArbol("a"), "b");
        arb1.agregar(arb1.subArbol("b"), "c");
        arb1.agregar(arb1.subArbol("c"), "d");

        
        System.out.println("Arbol: " + arb1.recorreArbol());
        if(arb1.esEqui()){
            System.out.println("Si");
        }
        else{
            System.out.println("No");
        }
        
    }
}