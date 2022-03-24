public class Test3 {

	
	int x,y;
	
	public void assign()
	{
		//initialization
		x=100;
		y=200;
	}
	
	public void display()
	{
		System.out.println("x value is : " + x);
		System.out.println("y value is : " + y);
		
		
	}
	public static void main(String[] args)
	{
		Test3 obj = new Test3();
		//explicit method invocation 
		obj.assign();
		obj.display();
	}
}
