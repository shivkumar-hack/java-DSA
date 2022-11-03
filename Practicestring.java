public class Practicestring {
    public static void main(String[] args){
           StringBuilder sb = new StringBuilder("helloworld");

            for (int i=0;i<sb.length()/2;i++){
                int front = i;
                int back = sb.length()-i-1;

                char frontChar = sb.charAt(front);
                char backChar  = sb.charAt(back);

                sb.setCharAt(front, backChar);
                sb.setCharAt(back, frontChar);
                
                System.out.println(sb);

            }

        
        // StringBuilder rev = new StringBuilder("hello");
        // StringBuilder sb = new StringBuilder("hello");
        
          //  reverse a string using  loop with string builder
        // for (int i=0;i<sb.length()/2;i++){
        //     int front = i;
        //     int back = sb.length()-i-1;

        //     char frontChar = sb.charAt(front);
        //     char backChar = sb.charAt(back);

        //     sb.setCharAt(front, backChar);
        //     sb.setCharAt(back, frontChar);

        //     System.out.println(sb);
        // }
        // reverse a string using string builder
        // rev.charAt(0);
        // System.out.println(rev);

        // rev.delete(0,1);
        // System.out.println(rev);

        // rev.setCharAt(0, 'o');
        // rev.setCharAt(3, 'e');
        // rev.insert(4,'h');
        // System.out.println(rev);
    }
    
}
