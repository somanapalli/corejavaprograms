//concrete class or implementation class or fully defined class
public  class Demo7 extends Demo6 {

	@Override
	public void sum() {
		System.out.println("iam from sum");

	}

	@Override
	public void sub() {
		System.out.println("iam from sub");

	}
	
	public Demo7()
	{
		super(4);
	}

	public static void main(String[] args) {
		// runtime polymorphism
		Demo6 obj = new Demo7();
		obj.sum();
		obj.sub();

	}

}
