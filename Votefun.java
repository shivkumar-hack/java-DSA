import java.util.Scanner;
//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

public class Votefun {
    public static void inEligible(int age){
        if(age>18){
            System.out.println("eligible for vote");
        }else{
            System.out.println("not eligible for vote");
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        inEligible(age);
    }
    
}
