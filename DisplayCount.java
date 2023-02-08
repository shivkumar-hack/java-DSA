import java.util.*;


public class DisplayCount {
    public static void main(String[] args) {
        
        int positive = 0;
        int negative = 0;
        int zero = 0;
        System.out.println("press 1 to contine & zero to stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(input==1){
            System.out.println("enter your number");
            int number = sc.nextInt();
            if( number>=0 ){
             positive++;
            }else if(number<=0){
                negative++;

            }else{
                zero++;
            }
            System.out.println("press 1 to contine & zero to stop");
             input = sc.nextInt();


        }
        System.out.println("Positives : "+ positive);
           System.out.println("Negatives : "+ negative);
           System.out.println("Zeros : "+ zero);
    }
}

  