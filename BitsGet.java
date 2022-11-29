public class BitsGet {
    public static void main(String[] args) {
        int n = 5;//0101
        int pos = 2;
        int Bitsmarks = 1<<pos;
        if ((Bitsmarks & n)== 0){
            System.out.println(" bits was zero:"+""+ Bitsmarks);
        }else{
            System.out.println("bit was one:"+""+ Bitsmarks);
        }
    }
    
}
