import java.util.Scanner;
// find the factorial of a number

public class Factorialfun {
    public static void calFactorial( int n){
        if (n<0){
            System.out.println("invalid");
            return;
        }
        int factorial = 1;
            for (int i=n ; i>=1;i--){
                factorial = factorial * i;

            }
            System.out.println("factorial is :"+factorial);
    }
     

     public static void main(String[] args){
         Scanner sc = new Scanner (System.in);
         int n =  sc.nextInt();
         calFactorial(n);
     }
    

}
