import java.util.Scanner;

class array1{
	public static void main(String args[]){
		int a[] = new int[5];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter array Elements: ");
		for (int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
			
		}
		System.out.println();

		for (int i=0;i<a.length;i++){
			System.out.println(a[i]);

			
		}
		
	
	}

}