public class Assignop {
    //bit manipulation for get bit
    public static void main(String[] args) {
        int n=7;//0110
        int pos = 4;
        int bitMask = 2<<pos;
        if ((bitMask & n)==0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }
        
    }
    
}
