
public class ThisReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj1 = new Test(); //New object created
		obj1.m1(10, 20);
		obj1.m2(); //There is only one copy of the methods, it is stored separately.
		
		//Inside the methods only the variables are stored.
		
		Test obj2 = new Test(); //New object created
		obj2.m1(30, 40);
		obj2.m2();
	}

}
/*Objects in Java are always stored on the heap.  
Inside the object only the variables are stored and not the methods. 
The methods are never stored inside the object.
They are stored separately.
There is only one copy of the methods which will be shared by all the objects.

Every non static method has a THIS reference associated to it.
  */


class Test
{
	
	int a;
	int b;
	
	void m1(int v1, int v2)
	{
		
		this.a = v1; //Every non static method has a THIS reference associated to it. It is automatically done in Java
		b = v2; // This memory address of obj1 will be loaded into the this reference variable.
	}
	
	void m2()
	
	{
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
