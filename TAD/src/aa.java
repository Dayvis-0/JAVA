public class aa {
    public static void main(String[] args) {
        String n = "1";
        
        if (n.matches(".*\\d.*")){
            System.out.println("tiene nnumeros");
        }
        else{
            System.out.println("No tiene numeros");
        }
    }
}