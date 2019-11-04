
public class ClassesAndObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog obj1 = new Dog(); //Syntax of creating an object
		//Reference type is obj1 and is pointing to object which is created in memory!
		//Default constructor invoked
		
		//obj1.bark(); //This is how we invoke any method of the object
		//obj1.walk();
		
		//class is like a blueprint of an object
		
		//Data will be represented in form of variables
		//Behavior will be represented in form of methods
		
		//obj1 is only visible inside the method
		
		
		
		
	}

}
// The main purpose of a constructor is initializing objects

//You can only call a constructor from another constructor using the this()
//This() has to be the first statement of the constructor

class Dog
{
	
	String breed;
	String color;
	int weight;
	
	Dog()
	{
		this("doggy", "blue");
		System.out.println("Default constructor invoked");
	}
	
	Dog(String breed, String color)
	{
		this("doggy", "blue", 23);
		System.out.println("constructor with 2 parameters invoked");
		System.out.println("breed = " + breed);
		System.out.println("color = " + color);
		
	}
	
	
	Dog(String breed, String color, int weight)
	{
		System.out.println("constructor with 3 parameters invoked");
		System.out.println("breed = " + breed);
		System.out.println("color = " + color);
		System.out.println("weight = "+ weight);
	}
	
}
