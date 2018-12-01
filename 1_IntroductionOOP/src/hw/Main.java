package hw;

public class Main {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person("GGG",2000);
		
		person1.input();
		person1.output();
		
		person2.input();
		person2.output();
		
		person3.input();
		person3.output();
		
		person4.input();
		person4.output();
		
		
		
		
		person5.output();
		
		person5.changeName("FFF");
		
		person5.output();
		
		

	}

}
