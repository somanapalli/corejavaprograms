
public class Demo1 {
	
	public void sum(int x, int y)
	{
		System.out.println("integer sum is: " + (x+y));
	}
	
	public void sum(double x, double y)
	{
		System.out.println("double sum is: " + (x+y));
	}
	public static void main(String[] args) {
		//object declaration
		Demo1 obj;
		//object referncing
		obj= new Demo1();
		
		obj.sum(3.4,4.5);
		obj.sum(4, 5);
	}

}

