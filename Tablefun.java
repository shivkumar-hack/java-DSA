import java.util.Scanner;

public class Tablefun {
    //Make a function to print the table of a given number n.
    public static int calculateMyTable(int n){
        
        for (int i=1;i<=10;i++){
        System.out.println(n*i);
        }
        return n;
        }
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        calculateMyTable(n);
    }
    
}
