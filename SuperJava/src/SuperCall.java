/*
 * 
 *  The child class constructor always calls the default constructor of the parent first.
 *  
 *  The super call is basically used to invoke a parent class constructor!
 *  That is the purpose of the super constructor
 */
public class SuperCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Child obj1 = new Child();
	}

}

class Parent
{
	
	Parent()
	{
		System.out.println("Default constructor of Parent");
		
	}
	
	Parent(int a, int b)
	{
		
		System.out.println("Constructor with 2 parameters of Parent");
		
	}
	
	Parent(int a, int b, int c)
	{
		System.out.println("Constructor with 3 parameters of Parent");
		
	}
}

class Child extends Parent
{
	
	Child()
	{
		super(10,30,7);
		System.out.println("Default constructor of Child");

	}
}


