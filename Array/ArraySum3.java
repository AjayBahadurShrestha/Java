// WAP to create 3 array insert data in any 2 array and store the sum of these two array in third array
import java.util.Scanner;

class ArraySum3{
	public static void main(String args[]){
		int a[] = {1,2,3,4,5};
		int b[] = {2,4,6,8,10};
		int c[] = new int[5];
		

		for(int i=0; i<c.length; i++){
			c[i] = a[i]+b[i];
		}
		
		System.out.println("Array C Elements: ");
		for(int i=0; i<a.length; i++){
			System.out.println(c[i]);
		}
	}
}