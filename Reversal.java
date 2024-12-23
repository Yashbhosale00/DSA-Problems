public class Reversal {
    public static void main(String[] args) {
        String input = "Bhosale";
        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);

    }
    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();    
    }
}


