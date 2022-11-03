public class Pic {


public class Solution {

    public static void main(String[] args) {
        //  String name = "madam";
     StringBuilder sb = new StringBuilder("yash");
     for (int i=0;i<sb.length()/2;i++){
         int front = i;
         int back = sb.length()-i-1;
         
         char num = sb.charAt(front);
         char sum = sb.charAt(back);
         
          sb.setCharAt(num,sum);
          sb.setCharAt(sum,num);
         
         
     }   
      
     }
         
    }
  }





    
}
