package evaluation;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Fibonacci number: ");
	int n = sc.nextInt();
	int temp;
	
	int[] arr= new int[n];
  int start =0,end=1;
  int i=0;
	while(n>0) { 
		arr[i]=start;
		i++;
		temp = start+end;
		start=end;
		end=temp;
		n--;	
	}
	for (int j = arr.length-1; j>=0; j--) {
		System.out.print(arr[j]+" ");
	}
	
}
}
