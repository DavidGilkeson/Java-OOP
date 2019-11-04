/* In Java the program will never run out of memory as it takes care of Garbage collection
 * 
 * We cannot predict when it is going to run!
 * 
 * Any object that is unreachable is eligible for Garbage collection
 * 
 * Any object that is reachable is NOT eligible for Garbage collection
 
 * 
 */

package objectlifecycle;

public class GarbageCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A object is said to be local when it has a local reference pointing to it
		 * and it is said not to be local when it has nothing pointed to it.
		 */
		Employee emp = new Employee(); //created in memory is now unreachable
		//emp = new Employee(); // new object created in memory
		emp = null; // Makes object unreachable
		
		System.gc(); //Run garbage collection
	}
	/*As soon as the method ends the contents will get
	 * destroyed and therefore is unreachable
	 */
}
/*
 * 
 * A composite object is an object which is internally present within
 * another class
 */
class Employee extends Object //Every class by default extends the Object class
{
	String name;
	Address addr; //Reference type
	
	protected void finalize()
	{
		System.out.println("Release Resources");
		
	}
}


class Address
{
	String street;
	String city;
	String state;
}