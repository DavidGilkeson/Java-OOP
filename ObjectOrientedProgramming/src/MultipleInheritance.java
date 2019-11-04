
public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Employee
{
	
	void employeeBehaviour();
}

interface Human
{
	void humanBehaviour();
	
	
}

class Programmer implements Employee, Human
{

	@Override
	public void humanBehaviour() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void employeeBehaviour() {
		// TODO Auto-generated method stub
		
	}
	
	
}
