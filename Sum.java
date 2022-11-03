import javax.sound.sampled.SourceDataLine;

public class Sum {
    public static void main(String[] args){
        int n= 5;
        //int number= 1;
        for (int i=n; i>=1;i--){
            for (int j=1;j<=i;j++ ){
                System.out.print("*");
            }
            System.out.println(" ");
        }


        for (int i=1;i<=n; i++){
            //inner loop -> space print
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // inner loop print stars
            for (int j = 1; j <=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for ( int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++){
                System.out.print( j+" " );
            }
            System.out.println( );
        }
        
        
        
        for ( int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i+1;j++){
                System.out.print( j+" " );
            }
            System.out.println( );
        }

           int number =1;
        for ( int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++){
                System.out.print( number+" ");
                number++;
            }
            System.out.println( );
        }


        for ( int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++){
                int sum=i+j;
                if (sum%2==0){//even
                System.out.print( "1 ");
            }else {//odd
                System.out.print("0 ");
            }
            System.out.println( );
        }
    }
    } 
}