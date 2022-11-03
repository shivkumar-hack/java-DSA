import java.util.Scanner;
 // Q Make a Function Add Two Number Return sum and take input to the user

public class Addfun {
    public static int calculateSum(int a,int b){
       int sum= a+b;
        System.out.println("sum to number is :"+sum);
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc .nextInt();
         calculateSum(a,b);
       // System.out.println("sum to number is :"+sum);
       sc.close();
    }
    
}
