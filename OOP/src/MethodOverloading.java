/*
 * Method overloading is when we create multiple methods of the same name but different parameters
 * 
 */
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test obj1 = new Test();
		obj1.m1(10);
		obj1.m1(10.5);
		obj1.m1(1652,56);


	}

}

class Test
{
	
	void m1(int a)
	{
		System.out.println("Value = " + a);
		
	}
	
	void m1(double b)
	{
		System.out.println("Value = " + b);

	}
	
	void m1(int a, int b)
	{
		System.out.println("Value 1 = " + a);
		System.out.println("Value 2 = " + b);

		

	}
}
