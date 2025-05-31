public class cFecha {
    //... atributo
    private int aDia, aMes, aAnio;
    //... constructores
    protected cFecha(){ aDia= 1; aMes= 1; aAnio= 1000; }
    //... modificador
    public void mDia(int pDia){ aDia= pDia; }
    public void mMes(int pMes){ aMes= pMes; }
    public void mAnio(int pAnio){ aAnio= pAnio; }
    //... selector
    public int sDia(){ return aDia; }
    public int sMes(){ return aMes; }
    public int sAnio(){ return aAnio; }
    //... otros metodos
    private int numeroDias(int pMes, int pAnio){
        int rta= 0;
        if (pMes==1 || pMes==3 || pMes==5 || pMes==7 || pMes==8 || pMes==10 || pMes==12)
            rta= 31;
        else if(pMes==4 || pMes==6 || pMes==9 || pMes==11)
            rta= 30;
        else if (pAnio % 4 == 0)
            rta= 29;
        else
            rta= 28;
        return rta;
    }
    public boolean validaFecha(int pDia, int pMes, int pAnio){
        boolean rta= true;
        if(pAnio<1000 || pAnio>9999){ rta= false;}
        else if(pMes<1 || pMes>12){ rta= false;}
        else if(pDia<1 || pDia>numeroDias(pMes, pAnio))
            rta= false;
        return rta;
    }
    //... primitivos
    @Override
    public String toString(){ return aDia+" "+aMes+" "+aAnio; }
    public boolean equals(cFecha pFecha){
        return toString().equals(pFecha.toString());
    }
}