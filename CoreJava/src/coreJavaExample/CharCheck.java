package coreJavaExample;


public class CharCheck {

	public static void main(String[] args) {
		
		char ip;
		try
		{
		System.out.println("Enter input as either Upper Case Character or Lower Case Character or digit or special Character Input. ");
		ip = (char) System.in.read() ;
		if((ip>='a') && (ip <='z')){
			System.out.println("Character is in Lower Case");
		}
			
		else if((ip>='A') && (ip <='Z')){
			System.out.println("Character is in Upper Case");
			
		}
		else if((ip>='1') && (ip <='9')){
			System.out.println("Character is Integer");
		}
		else{
			
			System.out.println("Character is a Special Character");
		}
		}
		catch(Exception e)
		{
			System.out.println("System encountered error");
		}
		
		
	}

}
