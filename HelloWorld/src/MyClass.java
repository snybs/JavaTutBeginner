class Person {
	String name;
	int age;
	
	//Classes can contin
	
	//Data
	//Subroutines/Methods

	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
	
	void speak() {
		System.out.println("My name is " + name + " and I'm " + age + " years old.");
	}
	
	int calculateYearsToRetirement() {
		int years = 65 - age;
		return years;
	}
}


public class MyClass {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		
		person1.speak();
		person1.calculateYearsToRetirement();
		System.out.println(person1.getName() + " is " + person1.getAge() + " years old!");

	}

}
