public class RecursionReverse {
    // print a given string "abcd" in reverse
    static void PrintRev(String str , int idx){
        if (idx ==0){
            System.out.println(str.charAt(idx));
            return;

        }
        System.out.println(str.charAt(idx));
        PrintRev(str, idx-1);

    }
    public static void main(String[] args) {
        String str = "abcd";
        PrintRev(str, str.length()-1);

    }
    
}
