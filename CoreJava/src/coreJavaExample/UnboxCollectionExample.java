package coreJavaExample;

public class UnboxCollectionExample {

	public static void main(String[] args) {
		int i = 45;
		
		Integer in1 = new Integer(i);
		System.out.println("Integer Object\t"+in1);
		
		int un1 = in1.intValue();
		System.out.println("Int variable\t"+un1);
		
	}

}
