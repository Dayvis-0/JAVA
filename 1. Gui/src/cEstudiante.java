public class cEstudiante extends cPersona {
    private String aCodigo, aSIngreso;
    private int aEProfesional;
    private String aCorreoI;
    
    protected cEstudiante () {
        super();
        aCodigo = "";
        aSIngreso = "";
        aEProfesional = -1;
        aCorreoI = "";
    }
    
    public void mCodigo (String pCodigo) { aCodigo = pCodigo; }
    public void mSIngreso (String pSIngreso) { aSIngreso = pSIngreso; }
    public void mEProfesional (int pEProfesional) { aEProfesional = pEProfesional; }
    public void mCorreoI (String pCorreoI) { aCorreoI = pCorreoI; }
    
    public String sCodigo () { return aCodigo; }
    public String sSIngreso () { return aSIngreso; }
    public int sEscuelaProfesional () { return aEProfesional; }
    public String sCodigoInstitucional () { return aCodigo; }
    
    public String toString() {
        return super.toString() + " " + aCodigo + " " + aSIngreso + " " + aEProfesional + " " + aCorreoI;
    }
}