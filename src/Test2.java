
public class Test2 {
	int x=100,y=200;
	public void sum() {
		System.out.println("sum is : " + (x+y));
	}
	
	public static void main(String[] args) {
		
		Test2 obj = new Test2();
		System.out.println("x value is : " + obj.x);
		System.out.println("y value is : " + obj.y);
		
		//calling the method using object name
		
		obj.sum();
	}

}
