/*
 * Final is a reserved keyword in Java to restrict the user and
 * it can be applied to member variables, methods, class and 
 * local variables. Final variables are often declared 
 * with the static keyword in Java and are treated as constants.
 * 
 */
public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final int x = 10; //final means the variable cannot be changed
	}

}

class D1
{
	
	int a;
	int b;
	
	void m1()
	{
		
		System.out.println("m1 of D1");
	}
}

class C22 extends D1
{
	
	void m1()
	{
		
	}
}
