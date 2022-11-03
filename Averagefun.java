import java.util.Scanner;
//Enter 3 numbers from the user & make a function to print their average.

public class Averagefun {
    public static float calculateAverage(int a, int b , int c){
        float avg= (a+b+c)/3;
        System.out.println(" avg of 3 number : "+avg);
        return avg; 

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        calculateAverage(a, b, c);
        


        
    }
    
}
