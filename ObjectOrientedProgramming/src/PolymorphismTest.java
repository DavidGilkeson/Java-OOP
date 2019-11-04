/*
 * 
 * Polymorphism means many forms
 * Anything that shows multiple behavior exhibits polymorphism.
 * in Java, there are 2 types of polymorphism: Static or compile time and dynamic or runtime
 * 
 * Static is achieved by using method overloading
 * 
 * Dynamic is achieved by using method overriding
 * 
 */
public class PolymorphismTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * In Java you can assign a child class object to a parent class reference 
		 */
		
		Animall a1 = new Dog1();
		Animall a2 = new Cat();
		Animall a3 = new Lion();
		
		
		a1.makesNoise();
		a2.makesNoise();
		a3.makesNoise();
		
		
	}

}


class Animall
{
	void makesNoise()
	{
		
		System.out.println("Make some noise");
	}
}
class Dog1 extends Animall
{
	void makesNoise()
	{
		
		System.out.println("Woof Woof ");
	}
	
}

class Cat extends Animall
{
	void makesNoise()
	{
		
		System.out.println("Meow ");
	}
	
}

class Lion extends Animall
{
	void makesNoise()
	{
		
		System.out.println("Roarrrrr ");
	}
	
}