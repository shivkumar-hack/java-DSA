public class Armstrongnum {
    public static void main(String[] args){
        int num = 153;
        int count = 0;
        int sum=0;
        
        while (num!=0){
            int rem = num%10;//modulo gives remainder
            sum += Math.pow(rem,3);
            num /=10;//divide gives quotient

        }
        if ( num==sum){
            System.out.println("print armstrong");
        }
        
        }
    }
    

