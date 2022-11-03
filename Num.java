import java.util.*;
public class Num {
	public static void main(String[] args) 
	{
		
		 Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
        int oddsum = 0;	
		
		for( int i = 2; i <= number ; i++)
		{
			if(i % 2 ==0)
			{
				//oddSum = oddSum + i; 
			}
		}
		System.out.println("oddSum");
		 sc.close();
	}
}
    

