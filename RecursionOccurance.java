public class RecursionOccurance {
    public static int first =  -1;
    public static int last =  -1;
    public static void FindOcc(String str , int idx,String string){
        if (idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentchar  = str.charAt(idx);
        if (currentchar == string.charAt(0)){
            if (first == -1){
                first = idx;
            }
            else{
                last = idx;
        }
        }
        FindOcc(str, idx+1, string);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        FindOcc(str, 0, "a");
    }

    
}
