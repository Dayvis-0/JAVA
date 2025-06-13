
import com.sun.source.tree.CatchTree;
import com.sun.source.tree.ClassTree;
import com.sun.source.tree.CompilationUnitTree;
import com.sun.source.tree.MethodTree;
import com.sun.source.tree.Scope;
import com.sun.source.tree.Tree;
import com.sun.source.util.SourcePositions;
import com.sun.source.util.TreePath;
import com.sun.source.util.Trees;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.ErrorType;
import javax.lang.model.type.TypeMirror;
import javax.tools.Diagnostic;

public class cArbolB {
    //... atributos
    private Object aRaiz;
    private cArbolB aSubArbolIzq, aSubArbolDer;
    //... constructor
    protected cArbolB(){
        aRaiz= null;
        aSubArbolIzq= null; aSubArbolDer= null;
    }
    //... modificadores
    public void mRaiz(Object pRaiz){ aRaiz= pRaiz; }
    public void mSubArbolIzq(cArbolB pSubArbolIzq){ aSubArbolIzq= pSubArbolIzq; }
    public void mSubArbolDer(cArbolB pSubArbolDer){ aSubArbolDer= pSubArbolDer; }
    //... selectores
    public Object sRaiz(){ return aRaiz; }
    public cArbolB sSubArbolIzq(){ return aSubArbolIzq; }
    public cArbolB sSubArbolDer(){ return aSubArbolDer; }
    //... metodos basicos
    public boolean estaVacio(){ return (aRaiz==null); }
    public boolean agregar(Object pRaiz){
        boolean rta= false;
        if(estaVacio()){ aRaiz= pRaiz; rta= true; }
        else{
            if(pRaiz.toString().compareTo(aRaiz.toString())<=0){
                if(aSubArbolIzq == null){ aSubArbolIzq= new cArbolB(); }
                rta= aSubArbolIzq.agregar(pRaiz);
            }else{
                if(aSubArbolDer == null){ aSubArbolDer= new cArbolB(); }
                rta= aSubArbolDer.agregar(pRaiz);
            }
        }return rta;
    }
    public String preOrden(){
        String rta= "";
        if(!estaVacio()){
            rta= aRaiz+" ";
            if(aSubArbolIzq != null){ rta= rta+aSubArbolIzq.preOrden(); }
            if(aSubArbolDer != null){ rta= rta+aSubArbolDer.preOrden(); }
        }return rta;
    }
    //... otros metodos
    public cArbolB maximo(){
        cArbolB rta= null;
        if(!estaVacio()){
            if(aSubArbolDer == null){ rta= this; }
            else{ rta= aSubArbolDer.maximo(); }
        }return rta;
    }
    public cArbolB minimo(){ cArbolB rta= null; return rta; }
    private void limpiar(){
        if(!estaVacio()){
            if(aSubArbolIzq != null){
                if(aSubArbolIzq.sRaiz() == null){ aSubArbolIzq= null; }
                else{ aSubArbolIzq.limpiar(); }
            }
            if(aSubArbolDer != null){
                if(aSubArbolDer.sRaiz() == null){ aSubArbolDer= null; }
                else{ aSubArbolDer.limpiar(); }
            }
        }
    }
    public boolean eliminar(Object pRaiz){
        boolean rta= false;
        if(!estaVacio()){
            if(pRaiz.equals(aRaiz)){
                rta= true;
                if(aSubArbolIzq == null && aSubArbolDer == null){ aRaiz= null; }
                else if(aSubArbolIzq != null && aSubArbolDer != null){
                    cArbolB dir= aSubArbolIzq.maximo();
                    aRaiz= dir.sRaiz();
                    aSubArbolIzq.eliminar(aRaiz);
                }else if(aSubArbolIzq != null){
                    aRaiz= aSubArbolIzq.sRaiz();
                    aSubArbolDer= aSubArbolIzq.sSubArbolDer();
                    aSubArbolIzq= aSubArbolIzq.sSubArbolIzq();
                }else{
                    aRaiz= aSubArbolDer.sRaiz();
                    aSubArbolIzq= aSubArbolDer.sSubArbolIzq();
                    aSubArbolDer= aSubArbolDer.sSubArbolDer();
                }
            }else{
                if(pRaiz.toString().compareTo(aRaiz.toString())<0){
                    if(aSubArbolIzq != null){ rta= aSubArbolIzq.eliminar(pRaiz); }
                }else{
                    if(aSubArbolDer != null){ rta= aSubArbolDer.eliminar(pRaiz); }
                }
            }
        }
        if(rta){ limpiar(); }
        return rta;
    }
    public cArbolB arbol(Object pRaiz){
        cArbolB rta= null;
        if(!estaVacio()){
            if(pRaiz.equals(aRaiz)){ rta= this; }
            else{
                if(pRaiz.toString().compareTo(aRaiz.toString())<0){
                    if(aSubArbolIzq != null){ rta= aSubArbolIzq.arbol(pRaiz);}
                }else{
                    if(aSubArbolDer != null){ rta= aSubArbolDer.arbol(pRaiz); }
                }
            }
        }return rta;
    }
}
