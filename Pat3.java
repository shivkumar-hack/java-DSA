public class Pat3 {
    public static void main( String[] args){
        int n = 5;
        for (int i=1;i<=n;i++){
            for ( int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
        }
            
        }
    }


        // for (int i=0;i<=n;i++){
        //     for (int j=1;j<=i;j++){
        //         int num=i+j;
        //         if (num%2==0){
        //             System.out.print("1");
        //         }else{
        //             System.out.print("0");
        //         }
        //         System.out.println();
        //     }
        // }
    
    

