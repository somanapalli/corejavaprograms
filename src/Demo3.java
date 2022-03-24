//child class cum execuition logic class
public class Demo3 extends Demo2 {

	
	public void sum(int x, int y) { // changing the logic
		System.out.println("substraction is: " + (x - y));
        
	}

	public static void main(String[] args) {

		Demo2 obj;
		obj= new Demo3();
		
		obj.sum(3, 2);
	}

}
