public class RecursionPhone {
    // print keypad combination
    public static String[] keypad = {",","abc","def","jkl","mno","pqrs","tu","vwx","yz"};
    public static void PrintCombination (String str, int idx, String combination){
        if (idx == str.length()){
            System.out.print(combination+" ");
            return;
        }
        char currentchar = str.charAt(idx);
        String mapping = keypad[currentchar - '0'];
        for (int i=0;i< mapping.length();i++){
              PrintCombination(str, idx+1, combination+ mapping.charAt(i));
        }

    }
    public static void main(String[] args) {
        String str = "23";
        PrintCombination(str, 0, "");
    }
    
}
// output
// dj
// dk
// dl
// ej
// ek
// el
// fj
// fk
// fl
