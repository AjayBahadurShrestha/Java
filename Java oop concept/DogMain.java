class Dog{
	String name="Galaxy destroyer", color;
	int age, leg=4, ear;
	
	public void eat(){  //eat is our method
		System.out.println("Dog is eating..");
	} 
	public void sleep(){  //sleep is our method
		System.out.println("Dog is sleeping..");
	} 
	public void bark(){  //bark is our method
		System.out.println("Dog is barking..");
	} 
}
class DogMain{
	public static void main(String... args){
		Dog d1 /*object initialization*/ = new Dog(); //object creation
		d1.name="Sheru";
		d1.color="Green";
		System.out.println(d1.name);
		System.out.println(d1.color);
		System.out.println(d1.leg);
		d1.sleep();
	}
	
}