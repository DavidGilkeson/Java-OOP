/*
 * 
 * Static Variables and Static members
 * 
 * Static members only belong to the class and 
 * are not part of the object, When the object is created in memory
 * the static members will not be a part of it
 * They are stored separately and shared by all the objects
 * 
 */
public class StaticMemebers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		C11 obj1 = new C11();
		C11 obj2 = new C11();
		C11 obj3 = new C11();
		C11 obj4 = new C11();
		
		System.out.println("Count is : " + C11.count);
		
	}

}

class C11
{
	
	static int count = 0;
	
	/* 
	 * A constructor in Java is a special method that is used to initialize objects.
	 * The constructor is called when an object of a class is created.
	 */
	C11()
	{
		count++; //implementing 
		
	}
}
