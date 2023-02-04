 import java.util.*;
 public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        int input;
        do {
            if(marks>=90 && marks<=100){
                System.out.println("this is good");
            }else if (marks>=60 && marks<=89){
                System.out.println(" this is also good");
            }else if(marks>=0 && marks<=59){
                System.out.println("this is good as well");
            }else{
                System.out.println("invalid");
            }
            System.out.println("want to continue (yes(1) or no(0))");
             input = sc.nextInt();
        }while(input==1);
    }
 }
        
        
        

       
    
        
    
    

