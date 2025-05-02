public class cPersona {
    //... atributo
    private String aDNI, aAp, aNom;
    private int aSexo, aEcivil;
    private cFecha aFnacimiento;
    //... constructor
    protected cPersona() {
        aDNI = "";
        aAp = "";
        aNom = "";
        aSexo = 0;
        aEcivil = 0;
        aFnacimiento = new cFecha();
    }
    //... modificador
    public void mDNI(String pDNI) { aDNI = pDNI; }
    public void mApellidos(String pAp) { aAp = pAp; }
    public void mNombres(String pNom) { aNom = pNom; }
    public void mSexo(int pSexo) { aSexo = pSexo; }
    public void mEcivil(int pEcivil) { aEcivil = pEcivil; }
    public void mFnacimiento(int pDia, int pMes, int pAnio) {
        aFnacimiento.mDia(pDia);
        aFnacimiento.mMes(pMes);
        aFnacimiento.mAnio(pAnio);
    }
    //... selectores
    public String sDNI() { return aDNI; }
    public String sApellidos() { return aAp; }
    public String sNombres() { return aNom; }
    public int sSexo() { return aSexo; }
    public int sEcivil() { return aEcivil; }
    public cFecha sFnacimiento() { return aFnacimiento; }
    //... primitivos
    public String toString() {
        return aDNI + " " + aAp + " " + aNom + " " + aSexo + " " + aEcivil + " " + aFnacimiento.toString();
    }
}