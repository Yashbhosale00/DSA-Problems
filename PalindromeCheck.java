public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "civic";
        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed)) {
            System.out.println(str + " is a palidrome.");
            
        }else{
            System.out.println(str + " is not a palindrome.");
        }
    }
    
}
