import java.util.Scanner;
// Make a function for product of two number

public class Prodfun {
    public static int calculatePro(int a ,int b){
       int pro = a*b;
      
       return pro;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
      
        System.out.println("product of two number : "  +calculatePro(a,b));
    }
    
}
// Make a function to check if a number is prime or not.
// Make a function to check if a given number n is even or not.
// Make a function to print the table of a given number n.
// Read about Recursion.


