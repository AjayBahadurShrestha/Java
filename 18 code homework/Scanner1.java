// average number


import java.util.Scanner;

public class Scanner1{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 1st number: ");
		int num1= sc.nextInt();
		
		System.out.println("Enter 2nd number: ");
		int num2= sc.nextInt();
		
		System.out.println("Enter 3rd number: ");
		int num3= sc.nextInt();
		
		System.out.println("The average of three numbers is " +((num1+num2+num3)/3));
		
	}
	
}