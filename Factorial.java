import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of" + num + "is : " + factorial);
    }finally{
        sc.close();
    }
  }   
}