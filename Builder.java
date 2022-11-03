 
public class Builder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        //set char at index
        //  sb.setCharAt(0, 'p');
        //  System.out.println(sb);

         // insert the char in place of 0 index 
          sb.insert(0,'s');
          System.out.println(sb);
          

          sb.insert(3,'a');
          System.out.println(sb);


          // delete the extra 'n'
          sb.delete(2,3);
          System.out.println(sb);

          // delete again 'n' and create tony- toy
          sb.delete(3,4);
          System.out.println(sb);

    }
    
}
