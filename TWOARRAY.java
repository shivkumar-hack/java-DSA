import java.util.*;
public class TWOARRAY {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] number = new int[rows][cols ];
        // outer loop for rows
        for (int i=0 ; i< rows; i++){
            // outer loops for column
            for (int j =0 ; j<cols;j++){
                number[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        
        //outer loops for column
        for (int i=1 ; i < rows; i++){
            // outer loops for column
            for (int j =1  ; j<cols ;j++){
                if( number[i][j]==x){
             System.out.println(" x found at location : " +i +" " +j +" ");
                }
            }
            System.out.println();

    }
    
}
}

