package evaluation;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length:");
		int n = sc.nextInt();
		System.out.println("Enter the positive integer:");
		int l = sc.nextInt();
        int[] arr = new int[n];
        
    System.out.println("Enter the array :");
     for (int i = 0; i <n; i++){
        arr[i]=sc.nextInt();
     }
   
	for(int j =0;j<arr.length-1;j++) {
	for (int k = j+1; k<=arr.length-1; k++) {
			if((arr[j]+arr[k])%l==0) {
				System.out.println("["+arr[j]+","+arr[k]+"]");
			}
		}
	}
	}
}
