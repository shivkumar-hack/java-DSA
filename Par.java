//import java.util.Scanner;
// RHOMBUS PATTERN
public class Par {
    public static void main(String[] args){
       // Scanner sc = new Scanner(System.in);
       int n=5;
        for (int i=1; i<=n;i++){
            for(int j=1;j<=n-i;j++){

            System.out.print(" ");
        }
        for (int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }

        // PYRAMID PATTERN


    for (int i=1;i<=n;i++){
        //spaces
        for ( int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    for (int i=1;i<=n;i++){
        //spaces
        for (int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        
        // PALINDROME PATTERN
 
       // first halff
        for (int j=i;j>=1;j--){
            System.out.print(j);
        }
        //second half
        for (int j=2;j<=i;j++){
            System.out.print(j);

        }
        System.out.println();
    }
      
      // DIAMOND PATTERN
      
      

      for (int i=1;i<=n;i++){
        // SPACES
        for (int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        
         for (int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    // lower half
        for (int i=5;i>=1;i--){
            // SPACES
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        
      }

              
    }
}

