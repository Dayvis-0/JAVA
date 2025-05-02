public class cPersona {
    private String aDNI, aApe, aNom;
    private int aSexo, aECivil;
    private cFecha aFNacimiento;
    
    protected cPersona () { aDNI = ""; aApe = ""; aNom = ""; aSexo = 0; aECivil = 0; aFNacimiento = new cFecha();}
    
    public void mDNI(String pDNI) { aDNI = pDNI; }
    public void mApellidos(String pApe) { aApe = pApe; }
    public void mNombres(String pNom) { aNom = pNom; } 
    public void mSexo(int pSexo) { aSexo = pSexo; } 
    public void mECivil(int pECivil) { aECivil = pECivil; } 
    public void mFNacimiento(int pDia, int pMes, int pAnio) { 
        aFNacimiento.mDia(pDia);
        aFNacimiento.mMes(pMes);
        aFNacimiento.mAnio(pAnio);
    } 
    
    public String sDNI () { return aDNI; }
    public String sApellidos () { return aApe; }
    public String sNombres () { return aNom; }
    public int sSexo () { return aSexo; }
    public int sECivil () { return aECivil; }
    public cFecha sFNacimiento () { return aFNacimiento; }
    
    public String toString () {
        return aDNI + " " + aApe + " " + aNom + " " + aSexo + " " + aECivil + " " + aFNacimiento.toString();
    }
}