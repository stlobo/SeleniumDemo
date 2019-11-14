package coreJavaExample;

import java.util.ArrayList;

public class EnhancedForEx {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Fisrt");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		
		for(String s:list){
			System.out.println(s);
			
		}
	}

}
