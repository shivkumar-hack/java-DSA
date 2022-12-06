public class RecursionRemoveDup {
    // remove duplicate in a string
    public static boolean[] map = new boolean[26];
    public static void removeduplicates(String str, int idx, String newstring){
        if ( idx == str.length()){
            System.out.println(newstring);
            return;
        }
        char CurrChar = str.charAt(idx);
        if ( map[CurrChar - 'a']== true){
            removeduplicates(str, idx+1, newstring);
        }else{
            newstring+= CurrChar;
            map[CurrChar - 'a'] = true;
            removeduplicates(str, idx+1, newstring);

        }

    }
    public static void main(String[] args) {
        String str = "abbccda";
        removeduplicates(str, 0, "");
    }
    
}
