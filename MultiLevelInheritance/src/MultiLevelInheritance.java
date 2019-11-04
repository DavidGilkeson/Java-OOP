
/*
 * Java only supports multilevel inheritance and not multiple inheritance like C++
 */

public class MultiLevelInheritance {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			C3 obj1 = new C3();
			
			obj1.m1();
			obj1.m2();
			obj1.m3();
			
			obj1.printAll();
			
			

		}

	}

	class C1
	{
		
		int a = 10;
		int b = 20;


		void m1()
		{
			System.out.println("m1 method of C1");
		}

		
	}

	class C2 extends C1
	{
		
		int c = 30;
		int d = 40;



		void m2()
		{
			System.out.println("m2 method of C2");
		}

	
	}
	
	class C3 extends C2
	{
		
		int e = 50;
		int f = 60;



		void m3()
		{
			System.out.println("m3 method of C3");
		}
		
		void printAll()
		{
			
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
			System.out.println("d = " + d);
			System.out.println("e = " + e);
			System.out.println("f = " + f);
			
			
		}
	
	}



