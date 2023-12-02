package evaluation;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n =sc.nextInt();
		py(n);
	}
		public static void py(int n) {
	    for (int i = 1; i<=n; i++)    
	    {
	    	for (int cols =n-1; cols >=i; cols--)    
	        {
	            System.out.print(" ");
	        }
	    	
	    	for(int col1=1;col1<=i;col1++) {  
	    		
	    		System.out.print(col1);           
	    		
	    	}
	    	for (int j =i-1; j>=1;j--)
            {               
                System.out.print(j);            
            }
	    	
	        System.out.println();
	                               
    }
	
}
	
	
}
