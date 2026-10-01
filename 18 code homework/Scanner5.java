/*
Write a Java program using Scanner that takes:

Principal amount
Rate of interest
Time in years

Then calculate the Simple Interest.*/

import java.util.Scanner;
class Scanner5{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Principle amount:  ");
		int a = sc.nextInt();
		System.out.println("Rate of interest: ");
		int b = sc.nextInt();
		System.out.println("Time in years: ");
		int c = sc.nextInt();
		
		System.out.println("Simple interest: "+((a*b*c)/100));

	}
}
