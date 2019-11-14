package coreJavaExample;


public class ComparisonTest{
	public static void main(String[] args) {
		
		SingletonDesignPattern obj1 = SingletonDesignPattern.getInstance();
		SingletonDesignPattern obj2 = SingletonDesignPattern.getInstance();
		
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2));
	}

}


