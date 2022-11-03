import java.util.*;
//print name and take input to the user
public class Function {
    public static void printMyName(String name){
        System.out.println(name);
        return ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();
        printMyName(name);
    }
}
    

