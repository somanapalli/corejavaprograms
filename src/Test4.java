public class Test4 {

	//default constructor
	public Test4()
	{
		
		System.out.println("iam from default constructor");
	}
	//parameterized constructor
	public Test4(int a, int b)
	{
		//call the current class default constructor
		this();
		System.out.println("iam from parameterize constructor");
	}
	
	public static void main(String[] args)
	{
		Test4 obj =new Test4(100,200);
		
		
	}
}
