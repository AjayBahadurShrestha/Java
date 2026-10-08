// WAP to create 3 array insert data in any 2 array and store the sum of these two array in third array
import java.util.Scanner;

class ArraySum1{
	public static void main(String args[]){
		int a[] = new int[6];
		int b[] = new int[6];
		int c[] = new int[6];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array a Element: ");
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		System.out.println();
		
		System.out.println("Enter Array b Element: ");
		for(int i=0; i<b.length; i++){
			b[i] = sc.nextInt();
		}
		
		System.out.println();
		for(int i=0; i<c.length; i++){
			c[i] = a[i]+b[i];
		}
		
		System.out.println("Array C Elements: ");
		for(int i=0; i<c.length; i++){
			System.out.println(c[i]);
		}
	}
}