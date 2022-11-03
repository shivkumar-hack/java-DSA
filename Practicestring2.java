public class Practicestring2 {
    // reverse string shiv = vihs
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("shiv");
         
        sb.setCharAt(0, 'v');
        sb.setCharAt(1, 'i');
        sb.setCharAt(2, 'h');
        sb.setCharAt(3, 's');
        System.out.println(sb.length());
    }
    
}
