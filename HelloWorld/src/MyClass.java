class Person {
	String name;
	int age;
	
	//Classes can contin
	
	//Data
	//Subroutines/Methods
	
	void speak() {
		System.out.println("My name is " + name + " and I'm " + age + " years old.");
	}
	
	void sayHello() {
		System.out.println("Hi there!");
	}
}


public class MyClass {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.name = "Glen Close";
		person1.age = 22;
		person1.speak();
		person1.sayHello();
		
		Person person2 = new Person();
		person2.age = 45;
		person2.name = "Glenn Hysen";
		person2.speak();

	}

}
