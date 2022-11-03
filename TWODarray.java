import java.util.*;

public class TWODarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();
        int[][] number = new int[rows][column];
          int i;
          int j;
        for ( i=0;i<rows;i++){
            for ( j=0;j<column;j++);
            number[i][j]= sc.nextInt();
        }
         for ( i=0;i<rows;i++){
            for ( j=0;j<column;j++){
                System.out.println(number[i][j]+" ");
            }
         }
    }
}
    

