/*
 * 
 * 
 */
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 obj1 = new C1();

		obj1.m1(10,20);
		
		C1 obj2 = new C2();
		
		obj2.m1(30, 40);

		
	}

}

class C1
{
	
	void m1(int a, int b)
	{
		
		System.out.println("m1 of C1");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}
}
//The method m1 in C2 overrides the method m1 in C1 
class C2 extends C1
{
	
	void m1(int a, int b)
	{
		
		System.out.println("m1 of C2");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}
}
