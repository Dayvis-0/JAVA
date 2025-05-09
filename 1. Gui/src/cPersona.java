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
    public boolean mFNacimiento(int pDia, int pMes, int pAnio) { 
        boolean rta = false;
        if (aFNacimiento.validaFecha(pDia, pMes, pAnio)) {
            aFNacimiento.mDia(pDia);
            aFNacimiento.mMes(pMes);
            aFNacimiento.mAnio(pAnio); 
            return true;
        }
        return rta;
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
    
    public boolean validarPersona(String pDNI, String pApellido, String pNombre) {
        boolean rta = true;
        if (pDNI.equals("") || pApellido.equals("") || pNombre.equals("")) {
            rta = false;
        }
        return rta;
    }
    
    public boolean validateDNI (String pDNI) {
        /*matches(String, ICharSequence) - coincide | Complila la expresion regular dada e intenta hacer coincidir la entrada especifica
        en ella devuelve true si coinciden, en caso contrario false | \\d{8} Las barras invertidas \ son caracteres de escape 
        \d es un metacaracter que representa cualquier digito numerico (0-9)
        {} cantidad exacta de las repeticiones del elemento anterior*/
        
        return pDNI.matches("\\d{8}");
    }
}