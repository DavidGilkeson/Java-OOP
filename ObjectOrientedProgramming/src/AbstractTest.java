/*
 * An abstract class is a class that only exists for the purpose of inheritance and polymorphism!
 * It is basically used for reusability 
 * 
 */
public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dog obj1 = new Dog();
		//if the method is declared abstract, then it wont be allowed to create an object
		Catt obj1 = new Catt();
		obj1.walk();
		obj1.makeNoise();
	}

}

abstract class Animal //Cannot create an object of an abstract class
{
	//Generic behaviors of the animals
	void walk()
	{
		
		System.out.println("Walks");
	}
	
	abstract void makeNoise(); //When the method is declared abstract,
								// it means its going to have a sub class specific implementation for the method
	
}

abstract class Dog extends Animal
{
	// if you declare the method abstract, then the class must also be declared abstract
	abstract void makeNoise();

}

class Catt extends Dog
{

	@Override
	void makeNoise() {
		System.out.println("Meow");
		// TODO Auto-generated method stub
		
	}
	
	
}