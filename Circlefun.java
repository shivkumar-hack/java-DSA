 import java.util.*;
 public class Circlefun {
    public static float circumfranceOfCircle(int  r){
         float num = 22/7;
         float k;
         k = 2*num*r;
         System.out.println(k);
        return k;
    }
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int   r  = sc.nextInt();
        circumfranceOfCircle(r);

     }

    
}
