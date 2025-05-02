public class cLista {
    //... atributos
    private Object aElemento;
    private cLista aSubLista;
    //... constructores
    protected cLista() {
        aElemento = null;
        aSubLista = null;
    }
    protected cLista(Object pElemento, cLista pSubLista) {
        aElemento = pElemento;
        aSubLista = pSubLista;
    }
    //... primitivos
    public boolean estaVacia() {
        return ((aElemento == null) && (aSubLista == null));
    }
    //... modificadores
    public void mElemento(Object pElemento) {
        aElemento = pElemento;
    }
    public void mSubLista(cLista pSubLista) {
        aSubLista = pSubLista;
    }
    //... selectores
    public Object sElemento() {
        return aElemento;
    }
    public cLista sSubLista() {
        return aSubLista;
    }
    //... metodos basicos
    public void insertar(Object pElemento, int pPosicion) {
        if (pPosicion == 1) {
            aSubLista = new cLista(aElemento, aSubLista);
            aElemento = pElemento;
        } else {
            aSubLista.insertar(pElemento, pPosicion - 1);
        }
    }
    public Object iesimo(int pPosicion) {
        if (pPosicion == 1) {
            return aElemento;
        } else {
            return aSubLista.iesimo(pPosicion - 1);
        }
    }
    public void eliminar(int pPosicion) {
        if (pPosicion == 1) {
            aElemento = aSubLista.sElemento();
            aSubLista = aSubLista.sSubLista();
        } else {
            aSubLista.eliminar(pPosicion - 1);
        }
    }
    public int longitud() {
        if (estaVacia()) {
            return 0;
        } else {
            return 1 + aSubLista.longitud();
        }
    }
    public int posicion(Object pElemento) {
        if (estaVacia()) {
            return 0;
        } else {
            if (aElemento.equals(pElemento)) {
                return 1;
            } else {
                int k = aSubLista.posicion(pElemento);
                return ((k > 0) ? 1 + k : 0);
            }
        }
    }
    //... mostrar lista
    public String mostrar(){
        String rta= "";
        if(!estaVacia()){
            rta= aElemento+" "+aSubLista.mostrar();
        }
        return rta;
    }
    //... otros metodos
    public String mostrarI(){
        String rta= "";
        if(!estaVacia()){
            rta= aSubLista.mostrarI()+" "+aElemento;
        }
        return rta;
    }
    public String mostrarDuplicado(){
        String elemento, rta= "";
        int pos= 0;
        if(!estaVacia()){
            elemento= aElemento.toString();
            pos= aSubLista.posicion(elemento);
            if(pos>0){ rta= elemento+" "+aSubLista.mostrarDuplicado(); }
            else{ rta= aSubLista.mostrarDuplicado(); }
        }
        return rta;
    }
    public void insertarUltimo(Object pElemento){
        if(estaVacia()){
            aSubLista= new cLista();
            aElemento= pElemento;
        }else{ aSubLista.insertarUltimo(pElemento); }
    }
    //... insertar primero
    public void insertarPrimero(Object pElemento){
        aSubLista= new cLista(aElemento, aSubLista);
        aElemento= pElemento;
    }
    public void insertaOrdenado(Object pElemento){
        if(estaVacia()){
            aSubLista= new cLista(); aElemento= pElemento;
        }else{
            if(pElemento.toString().compareTo(aElemento.toString())<0){
                aSubLista= new cLista(aElemento, aSubLista);
                aElemento= pElemento;
            }else{ aSubLista.insertaOrdenado(pElemento); }
        }
    }
    //... maximo elemento
    public Object maximo(Object pMax){
        if(estaVacia()){ return pMax; }
        else{
            if(pMax.toString().compareTo(aElemento.toString())<0){
                return aSubLista.maximo(aElemento);
            }else{
                return aSubLista.maximo(pMax);
            }
        }
    }
    public boolean ordenadoAsc(){
        boolean rta= true;
        if(!estaVacia()){
            if(!aSubLista.estaVacia()){
                if(aElemento.toString().compareTo(aSubLista.sElemento().toString())<0){
                    rta= aSubLista.ordenadoAsc();
                }else{ rta= false; }
            }
        }return rta;
    }
    public boolean ordenadoDes(){
        boolean rta= true;
        if(!estaVacia()){
            if(!aSubLista.estaVacia()){
                if(aElemento.toString().compareTo(aSubLista.sElemento().toString())>0){
                    rta= aSubLista.ordenadoAsc();
                }else{ rta= false; }
            }
        }return rta;
    }
    //... minimo elemento (tarea)
    //... invertir lista
    //... ordenar lista
    //... eliminar duplicados
    //... operaciones con listas
    
}