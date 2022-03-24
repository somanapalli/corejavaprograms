
//child class cum execution logic class
public class Test8 extends Test7 {
	
	int x=200;
	
	
	public void display()
	{
		System.out.println("child class vairalbe value is:" + x);
		//call the super class variable
		System.out.println("parent class vairable value is: " +super.x);
	}
	public static void main(String[] args) {
		
		Test8 obj = new Test8();
		obj.display();
		
	}

}
