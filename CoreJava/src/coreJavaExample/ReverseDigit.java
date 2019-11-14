package coreJavaExample;

import java.util.Scanner;

public class ReverseDigit {
	public int reverseCalc(int num)
	{
		int temp;
		
		do
		{
		temp = num%10;
		System.out.print(temp);
		num = num/10;
		}
		while(num != 0);
		
		return temp;
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		ReverseDigit myRevObj = new ReverseDigit();
		System.out.println("Enter the number to be reversed\n");
		int num = myObj.nextInt();
		myRevObj.reverseCalc(num);
		
		
		
	}

}
