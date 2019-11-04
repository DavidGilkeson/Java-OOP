/*
 * Public: This means it is visible in the same Package.
 * Visible means an object can be created from that class.
 * 
 * If there is no access modifier, the default is set and it is only accessible from inside the same package.
 * 
 */
public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class A1
{
	
	protected int a;
	int b;
	
	void m1()
	{
		
		
	}
}
//protected: This means that it will be visible in its own package and in the child class
class A2 extends A1
{
	
	
}