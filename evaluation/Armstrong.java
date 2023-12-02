package evaluation;

import java.util.Scanner;

public class Armstrong {
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter the number: ");
 		int n = sc.nextInt();    	
 	    int m = length(n);	
 		if(amstrong(n,m)) {
 			System.out.println("given number is amstrong");
 		}
 		else {
 			System.out.println("given number is not a amstrong");
 		}
	}
     
     public static int length(int n) {
    	    int count = 0;

    	    while (n != 0) {
    	        n /= 10;
    	        count++;
    	    }

    	    return count;
    	}


	public  static boolean amstrong(int n,int m) {
		int Number = n;
		int sum=0;
	
		while(n!=0) {
			int j= n%10;
			int result=1;
			 for (int i = 0; i < m; i++) {
			        result*= j;
			    }
			 sum+=result;
		    n=n/10;
			
		}
		return sum==Number;
	}
}
