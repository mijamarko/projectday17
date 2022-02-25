import domain.Person;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person.Builder("Marko", "219063468743186", 15).lastName("Mijajlovic").build();
		p1.sayHello();
	}

}
