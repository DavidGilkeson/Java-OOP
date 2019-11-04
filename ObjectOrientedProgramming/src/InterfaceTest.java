/*
 * An Interface is a specification that specifies a behavior 
 * which our class must implement 
 * 
 */
public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface I1
{
	
	void m1();
	void m2();
	
}

//implements is the keyword for implementing an interface
//You have to provide an implementation

/*
 * To achieve security - hide certain details 
 * and only show the important details of an object (interface).
 */

class Employeee implements I1 
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
	
}
