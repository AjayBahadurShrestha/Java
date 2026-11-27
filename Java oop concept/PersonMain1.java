class Person{
	String name;
	int age, id;
	
	Person(String name, int age, int id){
		this.name= name;
		this.age= age;
		this.id= id;
	}
	
	public void display(){
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Id: "+this.id);
	}

}

class PersonMain1{
	public static void main(String...args){
		Person p1 = new Person("Roshan", 23, 102);
		p1.display();
		Person p2 = new Person("Niraj", 27, 103);
		p2.display();
	}
}