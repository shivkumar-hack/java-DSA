import java.util.Scanner;
// Find the maximum & minimum number in an array of integers. 

public class Array5 {
    public static void main(String[] args){
          Scanner sc = new Scanner (System.in);
          int size = sc.nextInt();
          int number[] = new int[size];
           
          for (int i=0; i<size;i++){
            number[i] =  sc.nextInt();
          }
           int max  = Integer.MIN_VALUE;
           int min = Integer .MAX_VALUE; 
          for (int i=0 ; i<size; i++){
            if ( number[i]< min){
                min = number[i];
            }
            if (number[i]> max){
                max = number[i];
            }
            }
            System.out.println( " largest number is :"+max);
            System.out.println("smallest number is : "+min);
          }
    }
  

