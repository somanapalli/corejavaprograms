//implementation class for interface i1 
public class Demo8 implements i1{

	@Override
	public void sum(int x, int y) {
		System.out.println("sum: " + (x+y));

	}

	@Override
	public void sub(int x, int y) {
		System.out.println("sub: " + (x-y));
		
	}
	
	
	
	public static void main(String[] args) {
		
		//create the object 
		i1 obj = new Demo8();
		obj.sum(2,3);
		obj.sub(3, 2);
	}





}
