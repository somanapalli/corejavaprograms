//this is represnting current class object
public class Test5 {
	
	int x, y;
	
	public Test5(int x, int y)
	{
		this.x=x;
		this.y=y;
	}

	public void display()
	{
		System.out.println(this.x);
		System.out.println(this.y);
	}
	
	public static void main(String[] args) {
		
		Test5 obj = new Test5(100,200);
		obj.display();
	}
}
