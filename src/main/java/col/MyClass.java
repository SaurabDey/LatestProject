package col;

public class MyClass {
	
	private int x=30;
	private static int y= 40;

	class InsideClass//---------------Inner Class because it is non static
	{

		public void method()
		{
			System.out.println("Inner Class 1");
			System.out.println("Nonstatic variable "+x);
			System.out.println("Static variable "+y);
		}
		
//		public static void staticMethod()----- Static methods are not allowed inside non static inner classes
//		{
//			System.out.println("Inner Class 1");
//		}
	}
	
	static class NestedInnerClass//---------------Nested Class because it is static
	{

		public void method()
		{
			System.out.println("Non-Static method of Nested Class");
			//System.out.println("Nonstatic variable "+x);//----Cannot access nonstatic variable inside Nested classes
			System.out.println("Static variable "+y);
		}
		public static void staticMethod()//----- Static methods are allowed inside Nested classes
		{
			System.out.println("Static method of Nested  Class");
			//System.out.println("Nonstatic variable "+x);----Cannot access nonstatic variable inside Nested classes
			System.out.println("Static variable "+y);
		}
	}
	
	public void method2()
	{
		System.out.println("Simple Nonstatic method");
	}
	
	public static void method3()
	{
		System.out.println("Simple Static method");
	}
	public static void main(String[] args) {
		
		MyClass ref= new MyClass();
		ref.method2();

		MyClass.InsideClass obj= ref.new InsideClass();
		obj.method();
		
		System.out.println("-------Static-----------------");
		MyClass.method3();
		
		
		MyClass.NestedInnerClass.staticMethod();
		
		MyClass.NestedInnerClass noOBJ= new MyClass.NestedInnerClass();
		noOBJ.method();
	}

}
