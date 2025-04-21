public class cEstudiante extends cPersona{
    //... atributos
    private String aCodigo, aSingreso;
    private int aEprofesional;
    private String aCorreoI;
    //... metodo constructor
    protected cEstudiante() {
        super();
        aCodigo = "";
        aSingreso = "";
        aEprofesional = -1;
        aCorreoI = "";
    }
    //... metodos modificadores
    public void mCodigo(String pCodigo) { aCodigo = pCodigo; }
    public void mSingreso(String pSingreso) { aSingreso = pSingreso; }
    public void mEprofesional(int pEprofesional) { aEprofesional = pEprofesional; }
    public void mCorreoI(String pCorreoI) { aCorreoI = pCorreoI; }
    //... metodos selectores
    public String sCodigo() {return aCodigo; }
    public String sSingreso() { return aSingreso; }
    public int sEprofesional() { return aEprofesional; }
    public String sCorreoI() { return aCorreoI; }
    //... metodos primitivos
    public String toString(){
        return super.toString()+" "+aCodigo+" "+aSingreso+" "+aEprofesional+" "+aCorreoI;
    }
}