public class cLista {
    private Object aElement;
    private cLista aSubList;
    
    protected cLista () { aElement = null; aSubList = null; }
    protected cLista (Object pElement, cLista pSubList) {
        aElement = pElement;
        aSubList = pSubList;
    }
    
    public boolean isEmpty () {
        return ((aElement == null) && ( aSubList == null));
    }
    
    public void mElement (Object pElement) {
        aElement = pElement;
    }
    public void mSublista (cLista pSubList) {
        aSubList = pSubList;
    }
    
    public Object sElement() {
        return aElement;
    }
    public cLista sSubList() {
        return aSubList;
    }
    
    public void insert(Object pElement, int pPosicion) {
        if (pPosicion == 1) {
            aSubList = new cLista(aElement, aSubList);
            aElement = pElement;
        }
        else {
            aSubList.insert(pElement, pPosicion - 1);
        }
    }
    
    public Object iesimo (int pPosicion) {
        if (pPosicion == 1) {
            return aElement;
        }
        else {
            return aSubList.iesimo(pPosicion - 1);
        }
    }
    
    public void delete (int pPosicion) {
        if (pPosicion == 1) {
            aElement = aSubList.sElement();
            aSubList = aSubList.sSubList();
        }
        else {
            aSubList.delete(pPosicion - 1);
        }
    }
    
    public int length () {
        if (isEmpty()) {
            return 0;
        }
        else {
            return 1 + aSubList.length();
        }
    }
    
    public int position (Object pElement) {
        if (isEmpty()) {
            return 0;
        }
        else {
            if (aElement.equals(pElement)) {
                return 1;
            }
            else {
                int k = aSubList.position(pElement);
                return ((k > 0)) ? 1 + k: 0;
            }
        }
    }
    
    public String show () {
        String rta = "";
        
        if (!isEmpty()) {
            rta = aElement + " " + aSubList.show();
        }
        return rta;
    }
    
    public String showI () {
        String rta = "";
        if (!isEmpty()) {
            rta = aSubList.showI() + " " + aElement;
        }
        return rta;
    } 
    
    public String showDuplicate() {
        String elemento, rta = "";
        int pos = 0;
        
        if (!isEmpty()) {
            elemento = aElement.toString();
            if (pos > 0) {
                rta = elemento + " " + aSubList.showDuplicate();
            }
            else {
                rta = aSubList.showDuplicate();
            }
        }
        
        return rta;
    } 
    
    public void instertLast (Object pElement) {
        if (!isEmpty()) {
            aSubList = new cLista();
            aElement = pElement;
        }
        else {
            aSubList.instertLast(pElement);
        }
    }
    
    public void insertFirst (Object pElement) {
        aSubList = new cLista(aElement, aSubList);
        aElement = pElement;
    } 
    
    public void insertOrdering (Object pElement) {
        if (isEmpty()) {
            aSubList = new cLista(); 
            aElement = pElement;
        }
        else {
            if (pElement.toString().compareTo(aElement.toString()) < 0) {
                aSubList = new cLista(aElement, aSubList);
                aElement = pElement;
            }
            else {
                aSubList.insertOrdering(pElement);
            }
        }
    }
    
    public Object max(Object pMax) {
        if (isEmpty()) { return pMax; }
        else {
            if (pMax.toString().compareTo(aElement.toString()) < 0) {
                return aSubList.max(aElement);
            }
            else {
                return aSubList.max(pMax);
            }
        }
    }
}