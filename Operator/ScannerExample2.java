import java.util.Scanner;

class ScannerExample2{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Your Name: ");
		String name = sc.nextLine();
		

		
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		}
}