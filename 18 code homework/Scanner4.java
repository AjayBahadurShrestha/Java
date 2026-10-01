/*
Write a Java program using Scanner that takes three subject marks from the user:

English marks
Mathematics marks
Computer marks

Then calculate and display: Total marks Percentage Assume each subject is out of 100*/

import java.util.Scanner;
class Scanner4{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Marks of English: ");
		int a = sc.nextInt();
		System.out.println("Marks of Math: ");
		int b = sc.nextInt();
		System.out.println("Marks of Computer: ");
		int c = sc.nextInt();
		
		System.out.println("Total marks obtain is  "+(a+b+c));
		System.out.println("Total percentage obtain is "+(((a+b+c)/300.0)*100));
	}
}

