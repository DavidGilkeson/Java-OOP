
public class ReferenceCastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = (Student) getStudent();
		s.getName();
		
	}
	
	
	static Object getStudent() //Can return any type of object
	{
		
		Student s = new Student (111, "abc");
		return s;
	}

}

class Student
{
	
	int rollno;
	String name;
	
	Student(int r, String n){
		
		rollno = r;
		name = n;
		
	}
	
	int getRollNo()
	{
		
		return rollno;
	}
	
	String getName()
	{
		System.out.println("Name");
		name = "John";
		System.out.println(name);
		return name;
	}
}
