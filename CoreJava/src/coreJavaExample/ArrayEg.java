package coreJavaExample;

import java.util.Scanner;

public class ArrayEg {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int l1,l2, sum=0;
		
		System.out.println("Enter the 1D length of array\t");
		l1=scn.nextInt();
		
		System.out.println("Enter the 2D length of array\t");
		l2=scn.nextInt();
		
		int num[][] = new int [l1][l2];
		
		for(int i = 0;i<l1;i++){
			for(int j=0;j<l2;j++){
				System.out.println("Enter the element arr["+i+"]["+j+"]");
				num[i][j]=scn.nextInt();
			}
		}
			
			for(int x[] : num){
				for(int y : x){
					System.out.println("Value\t"+y);
					sum+=y;
				}
				}
			System.out.println("Value\t"+sum);	
		}
			
		

	}

