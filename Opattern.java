public class Opattern {
    public static void main(String[] args){
        //outer loop for rows
        for (int i=1;i<=4;i++){
            //inner loop for column
            for (int j=1;j<=4;j++){
                System.out.print(" * ");
            }
           
            System.out.println( );
        
        }



           
        int n=4;
        int m=5;
         
          for (int i=1;i<=4;i++){
            for (int j=1;j<=5;j++){
                if (i==1|| j==1 || i==n||j==m){
                    System.out.print(" * ");
                }else
                {
                    System.out.print(" ");
                }

            } 
                System.out.println( );
            
          }
   
             
 
             for (int i=1;i<5;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(" * ");
                }
                System.out.println( );
             }

     

            for (int i=5;i>=1;i--){
                for (int j=1; j<=i;j++){
                    System.out.print(" * ");
                }
                System.out.println( );
            }



                
            for (int i=1;i<=5;i++){
                for (int j=1;j<5-i;j++){
                    System.out.print(" ");
                }
                  for (int j=1;j<=i;j++){
                    System.out.print("*");
                }
                 System.out.println( );
            }
        

             
               for (int i=1;i<=5;i++){
                for (int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
               }



               for (int i=1;i<=5;i++){
                for (int j=1;j<=n-i+1;j++){
                    System.out.print(j+" " );
                }
                System.out.println( );
               }



                for(int i=5;i>=1;i--){
                    for (int j=1;j<=5;j++){
                        System.out.print(i);
                    }
                    System.out.println( );
                }


    }
    
}
