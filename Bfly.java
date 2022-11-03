public class Bfly {
    public static void main(String[] args){
        
        int n=5;
        //upper half
        for (int i=1;i<=n;i++){
            //first half
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }// spaces
            int spaces = 2*(n-i);
            for (int j=1;j<=spaces; j++){
                System.out.print(" ");
            }
            //2nd half
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         //lower half
         for (int i=n;i>=1;i--){
             //first half
            for (int j=1;j<=i;j++){
                 System.out.print("*");
             }// spaces
             int spaces = 2*(n-1);
             for (int j=1;j<=spaces; j++){
                 System.out.print(" ");
             }
             //2nd half
             for (int j=1; i<=i;j++){
                 System.out.print("*");
            }
               System.out.println();
        }
    }
}

