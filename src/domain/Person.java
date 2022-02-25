package domain;

import java.util.Objects;

import interfaces.Talks;

public class Person implements Talks{
	
	private String firstName;
	private String lastName;
	private final String jmbg;
	private int age;
	
		public static class Builder {
		private String firstName;
		private String lastName = "";
		private final String jmbg;
		private int age;
		
		public Builder(String firstName, String jmbg, int age) {
			super();
			this.firstName = firstName;
			this.jmbg = jmbg;
			this.age = age;
		}
		
		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public Person build() {
			return new Person(this);
		}
		
	}
		
		private Person(Builder builder) {
			this.firstName = builder.firstName;
			this.lastName = builder.lastName;
			this.jmbg = builder.jmbg;
			this.age = builder.age;
		}

		@Override
		public void sayHello() {
			System.out.println(this.toString());
			
		}

		@Override
		public int hashCode() {
			return Objects.hash(age, firstName, jmbg, lastName);
		}

		@Override
		public boolean equals(Object obj) {
			if(!(obj instanceof Person) || obj == null) return false;
			Person other = (Person) obj;
			return age == other.age && Objects.equals(firstName, other.firstName) && Objects.equals(jmbg, other.jmbg)
					&& Objects.equals(lastName, other.lastName);
		}

		@Override
		public String toString() {
			return String.format("Hello, I am %s %s, and I am %d years old", firstName, lastName, age);
		}

}
