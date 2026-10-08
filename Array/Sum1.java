// WAP to create an arrya and find the sum of array element

import java.util.Scanner;

class Sum1{
	public static void main(String args[]){
		int a[] = new int[3];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter array Elements to get sum of 3 numbers: ");
		
		for (int i=0;i<a.length;i++){
			 a[i]=sc.nextInt();
			
		}
		System.out.println();
		
		int sum=0;
		for (int b:a){
		sum=sum+b;
		}
		System.out.println("The sum is: "+sum);
	

			
		}
		
	
	

}