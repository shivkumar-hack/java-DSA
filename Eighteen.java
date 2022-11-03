public class Eighteen {
    public static void main(String[] args) {
        int n=5;
        int i,j,k;
        for(int i=5; i>=1;i++){
            for (int j=5-i;j>=1;j--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
