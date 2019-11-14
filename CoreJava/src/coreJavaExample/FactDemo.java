package coreJavaExample;

import java.util.Scanner;

public class FactDemo {
	
	public int Facto(int num)
	{
		/*int fact=1;
		for (int i=1;i<=num;i++)
		{
			fact*=i;	
		} */
		
		int fact=1,i=1;
		while(i<=num){
			fact*=i;
			i++;
		}
			return fact;	
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		FactDemo myFactObj = new FactDemo();
		System.out.println("Enter the number you want to factorize");
		int factNum = myObj.nextInt();
		System.out.println("\nFactorial of\t"+factNum+"\tis\t"+myFactObj.Facto(factNum));

	}

}
