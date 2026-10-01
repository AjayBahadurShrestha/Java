//Write a Java program using Scanner that takes three numbers from the user and finds:

//Their product
//Their sum
//Their difference

import java.util.Scanner;

class Scanner2{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter 1st number: ");
	int num1= sc.nextInt();
	
	System.out.println("Enter 2nd number: ");
	int num2= sc.nextInt();

	System.out.println("Enter 3rd number: ");
	int num3= sc.nextInt();
			
			
	System.out.println("The product of three numbers is "+(num1*num2*num3));
	System.out.println("The sum of three numbers is "+(num1+num2+num3));
	System.out.println("THe difference of three numbers is "+(num1-num2-num3));
	}
}