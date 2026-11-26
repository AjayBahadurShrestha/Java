class Calculation{
	static public void wish(){
		System.out.println("Hello!, Good Morning... ");
	}
	static void sum(){
		int a=10, b=20;
		int s = a+b; // Local Variable
		System.out.println("Sum of numbers: " + s);
	}
	static public int average(int a, int b, int c){
		int A=(a+b+c)/3;
		return A;
	}
}
class CalculationMain2{
	public static void main(String... args){
		// Calculation c1 = new Calculation();
		Calculation.wish();
	    Calculation.sum();
		System.out.println("Average: " + Calculation.average(12,25,82));
	}
}