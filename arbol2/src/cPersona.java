public class cPersona {
    //... atributos
    private String aDNI, aApellidos, aNombres;
    private int aSexo, aEcivil;
    private cFecha aFnacimiento;
    //... constructores
    protected cPersona(){
        aDNI= ""; aApellidos= ""; aNombres= "";
        aSexo= 0; aEcivil= 0;
        aFnacimiento= new cFecha();
    }
    //... modificadores
    public void mDNI(String pDNI){ aDNI= pDNI; }
    public void mApellidos(String pApellidos){ aApellidos= pApellidos; }
    public void mNombres(String pNombres){ aNombres= pNombres; }
    public void mSexo(int pSexo){ aSexo= pSexo; }
    public void mEcivil(int pEcivil){ aEcivil= pEcivil; }
    public boolean mFnacimiento(int pDia, int pMes, int pAnio){
        boolean rta= false;
        if(aFnacimiento.validaFecha(pDia, pMes, pAnio)){
            aFnacimiento.mDia(pDia); aFnacimiento.mMes(pMes);
            aFnacimiento.mAnio(pAnio);
            rta= true;
        }return rta;
    }
    //... selectores
    public String sDNI(){ return aDNI; }
    public String sApellidos(){ return aApellidos; }
    public String sNombres(){ return aNombres; }
    public int sSexo(){ return aSexo; }
    public int sEcivil(){ return aEcivil; }
    public String sFnacimiento(){
        return aFnacimiento.sDia()+"/"+aFnacimiento.sMes()+"/"+
                aFnacimiento.sAnio();
    }
    //... otros metodos
    public boolean validaPersona(String pDNI, String pApellidos, String pNombres){
        boolean rta= true;
        if(pDNI.equals("") || pApellidos.equals("") || pNombres.equals("")){
            rta= false;
        }
        return rta;
    }
    //... metodos primitivos
    @Override
    public String toString(){
        return aDNI+" "+aApellidos+" "+aNombres+" "+aSexo+" "+aEcivil+" "+
                aFnacimiento.toString();
    }
    public boolean equals(cPersona pPersona){
        return toString().equals(pPersona.toString());
    }
}