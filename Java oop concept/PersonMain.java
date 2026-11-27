class Person{
	String name;
	int age, id;
	Person(){
		name= "Tyson";
		age=21;
		id= 101;
	}
	
	Person(String n, int a, int i){
		name= n;
		age= a;
		id= i;
	}
	
	public void display(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Id: "+id);
	}

}

class PersonMain{
	public static void main(String...args){
		Person p1 = new Person("Roshan", 23, 102);
		p1.display();
		Person p2 = new Person();
		p2.display();
	}
}