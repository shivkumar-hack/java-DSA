import java.util.*;
// print the sum of first n natural number;

public class SumN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for (int i=1;i<=n; i++){
            sum=sum+i;
          //  System.out.println(sum);
        }
        System.out.println(sum);
    }
}
