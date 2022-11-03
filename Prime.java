import java.util.*;

public class Prime {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = 5;
      boolean prime = true;
      int iter = 0;
           for (int i=2;i<=n;i++){
            iter++;
        if (n %i==0){
          prime =false;
          
          break;
        }

        System.out.println("took"+iter+"iter");
      }
      if(prime){
        System.out.println( "number is prime");
      }else{
        System.out.println(" number is not prime");
      }
    }
}