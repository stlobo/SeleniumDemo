package coreJavaExample;

import java.util.Scanner;

public class VowelConsonantDet {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		char in, ch;
		try{
		do{
		System.out.println("Enter an Alphabet");
		in = scn.next().charAt(0);
		switch(in)
		{
		case 'a':
		case 'A':
			System.out.println("Vowel"); 
			break;
		case 'e' :
		case 'E' :
			System.out.println("Vowel"); 
			break;
		case 'i':
		case 'I':
			System.out.println("Vowel");
			break;
		case 'o':
		case 'O':
			System.out.println("Vowel");
			break;
		case 'u':
		case 'U':
			System.out.println("Vowel"); 
			break;
		default:
			System.out.println("Consonant");
			break;
			}
		 	System.out.println("Do you want to continue y/n") ;
		 	ch=scn.next().charAt(0);
		} 
			while(ch=='y' || ch=='Y');  
		}
	
		catch(Exception e)
		{
			System.out.println("Exception encountered");
		}
			
		}

}
