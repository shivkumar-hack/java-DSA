public class Palindromenumber {
    public static void main(String[] args){
        int num = 121;
        int original=num;
        int sum = 0;
        int rem;
        while(num!=0){
            rem= num%10; //modulo gives remainder
            sum= sum*10+rem;
            num= num/10;// divide gives quotient
        }
        if(sum==original){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    
}
