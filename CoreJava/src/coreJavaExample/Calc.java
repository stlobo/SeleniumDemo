package coreJavaExample;

import java.util.Scanner;

public class Calc {

	public int sub(int num1, int num2)
	{
		return num1-num2;
	}
	public int add(int num1, int num2)
	{
		return num1+num2;
	}
	public int div(int num1, int num2)
	{
		return num1/num2;
	}
	public int mul(int num1, int num2)
	{
		return num1*num2;
	}
	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in);
		Calc clObj = new Calc();
		System.out.println("Enter non zero interger\n");
		int num1 = myObj.nextInt();
		System.out.println("Enter non zero and interger greater than previous\n");
		int num2 = myObj.nextInt();
		System.out.println("\n Sum:" +clObj.add(num1, num2));
		System.out.println("\n Sub:" +clObj.sub(num1, num2));
		System.out.println("\n Sum:" +clObj.mul(num1, num2));
		System.out.println("\n Sum:" +clObj.div(num1, num2));
		
		
	}

}
