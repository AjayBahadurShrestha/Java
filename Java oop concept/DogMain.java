class Dog{
	String name = "Anhilator", color = "Golden";
	int age, leg = 4, ear = 3;
	static String tail = "Yes"; // tail is static variable
	
	public void eat(){ //eat is our method
		System.out.println("Dog is eating.");
	}
	
	public void sleep(){
		System.out.println("Dog is sleeping.");
	}
	
	public void bark(){
		System.out.println("Dog is Barking.");
	}

}
class DogMain{
	public static void main(String... args){
		Dog d1 /*Object Initialization*/ = new Dog(); // Object Creation
		d1.name = "Destroyer";
		System.out.println("The name of the dog is " + d1.name);
		System.out.println("It has " + d1.leg + " legs");
		System.out.println("Its color is " + d1.color);
		System.out.println("Its has " + d1.ear + " ears");
		d1.bark();
		System.out.println("Does a dog have tail? -> " + d1.tail);
		System.out.println("Does a dog have tail? -> " + Dog.tail);
	}
}