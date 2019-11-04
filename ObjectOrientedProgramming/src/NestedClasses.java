
public class NestedClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 	This is the syntax of creating an object of an inner class
		
			Outer.Inner inner = new Outer().new Inner(); 
		
			inner.m1();
		*/
		//Static Syntax
		
		Outer.Inner inner = new Outer.Inner(); 
		
		inner.m1();
		
	}

}
//A class which is nested inside another class
class Outer
{
	
	
	static class Inner
	{
		
		void m1()
		{
			
			System.out.println("m1 of Inner class");
		}
	}
}
