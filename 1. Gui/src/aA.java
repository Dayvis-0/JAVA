import java.util.Scanner;

public class aA {
    
    static boolean valiDNI1(String pDNI) {
        if (pDNI.length() == 8){
            try {
                for (int i=0; i<pDNI.length(); i++) {
                    int numero = Integer.parseInt(pDNI.substring(i, i+1));
                }
                return true;
            }
            catch (NumberFormatException e) {
                return false;
            }
        } 
        return false;
    }
    
    static boolean valiDNI2 (String pDNI) {
        if (pDNI.length() != 8){
            return false;
        }
        
        for (int i=0; i<pDNI.length(); i++) {
            char c = pDNI.charAt(i);
            if ( c < '0' || c > '9'){
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String dni;
        
        System.out.println("DNI: ");
        dni = sc1.nextLine();
        
        if (valiDNI2(dni)) {
            System.out.println("DNI valido");
        }
        else {
            System.out.println("DNI invalido");
        }
    }
} 