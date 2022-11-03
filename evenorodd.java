import java.util.*;
//Make a function to check if a given number n is even or not.
public class Evenfun {
    public static int calculateNum(int n){
        if (n%2==0){
            System.out.println("nuber is even");

        }
        else{
            System.out.println("number is odd");
        }
        return(n);
    }
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculateNum(n);
     }
    }




