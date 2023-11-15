

import java.util.Scanner;

public class Rpattern  {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		String n = sc.next();
		int l=n.length();
		for (int i = 0; i <l ; i++) {
            for (int j = 0; j < l; j++) {
                
                if (i == j) {
                    System.out.print(n.charAt(i));
                }
               
                else if (i + j == l - 1) {
                    System.out.print(n.charAt(j));
                }
              
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	
		sc.close();
		
		
	 }
}
	


		
	



	 
		
	
	

