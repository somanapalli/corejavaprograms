
public class Test9 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Test9 obj = new Test9();
		Test9 obj1 = new Test9();
		
		
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		
		System.out.println(obj.toString());
		System.out.println(obj.getClass());
		
		System.out.println(obj.equals(obj1));
		
		
	}

}
