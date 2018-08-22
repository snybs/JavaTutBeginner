class Person {
	
	public int age = 0;
	public String name = "Hen Doe";
	public Gender gender;
	public int id;
	public static int count = 1;
	
	enum Gender {
		MALE, FEMALE, HEN;
	}
	
	public Person() {
		gender = Gender.HEN;
		id = count;
		count++;		
	}
	
	public Person(Gender gender) {
		this.gender = gender;
	}
	
	public Person(Gender gender, int age) {
		this.gender = gender;
		this.age = age;
	}
	
	public Person(Gender gender, int age, String name) {
		this.gender = gender;
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
}

public class App2 {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Jonas";
		person1.age = 39;
		System.out.println("Name: " + person1.name + ", Age: " + person1.age + ", Gender: " + person1.gender + ", Social security number: " + person1.id);

		Person person2 = new Person(Person.Gender.MALE);
		person2.name = "Anders";
		person2.age = 40;
		System.out.println("Name: " + person2.name + ", Age: " + person2.age + ", Gender: " + person2.gender);

		Person person3 = new Person(Person.Gender.MALE);
		person3.age = 32;
		person3.name = "Per";
		System.out.println("Name: " + person3.name + ", Age: " + person3.age + ", Gender: " + person3.gender);

		Person person4 = new Person();
		System.out.println("Name: " + person4.name + ", Age: " + person4.age + ", Gender: " + person4.gender);
		
	}

}
