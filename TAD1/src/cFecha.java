public class cFecha {
    //... atributo
    private int aDia, aMes, aAnio;
    //... constructos
    protected cFecha() {
        aDia = 0;
        aMes = 0;
        aAnio = 0;
    }
    //... modificador
    public void mDia(int pDia) { aDia = pDia; }
    public void mMes(int pMes) { aMes = pMes; }
    public void mAnio(int pAnio) { aAnio = pAnio; }
    //... selector
    public int sDia() { return aDia; }
    public int sMes() { return aMes; }
    public int sAnio() { return aAnio; }
    //... otros metodos
    public int numeroDias() {
        int rta = 0;
        if (aMes == 1 || aMes == 3 || aMes == 5 || aMes == 7 || aMes == 8 || aMes == 10 || aMes == 12) {
            rta = 31;
        } else if (aMes == 4 || aMes == 6 || aMes == 9 || aMes == 11) {
            rta = 30;
        } else if (aAnio % 4 == 0) {
            rta = 29;
        } else {
            rta = 28;
        }
        return rta;
    }
    public boolean validaFecha() {
        boolean rta = true;
        if (aAnio < 1000 || aAnio > 9999) {
            rta = false;
        } else if (aMes < 1 || aMes > 12) {
            rta = false;
        } else if (aDia < 1 || aDia > numeroDias()) {
            rta = false;
        }
        return rta;
    }
    //... primitivos
    public String toString() {
        return aDia + " " + aMes + " " + aAnio;
    }
}
