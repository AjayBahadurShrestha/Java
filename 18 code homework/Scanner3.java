//Write a Java program using Scanner that takes three numbers from the user and finds:

//The largest number
//The smallest number

import java.util.Scanner;

class Scanner3{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 1st number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter 2nd number: ");
		int b = sc.nextInt();

		System.out.println("Enter 3rd number: ");
		int c = sc.nextInt();
		
		if ((a>b) && (a>c)){
			System.out.println("1st number is greater");
		}else if ((b>a) && (b>c)){
			System.out.println("2nd number is greater");
		}else{
			System.out.println("3rd number is greater");
		}
	}
}