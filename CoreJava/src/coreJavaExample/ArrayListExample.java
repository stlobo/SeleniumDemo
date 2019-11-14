package coreJavaExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList inputList = new ArrayList();
		
		//adding different data values in list
		
		inputList.add(10);
		inputList.add("String");
		inputList.add("c");
		inputList.add(10.88);
		inputList.add(101.88);
		inputList.add(null);
		inputList.add("TRUE");
		
		System.out.println("For Loop\n");
		for(Object obj:inputList){
		System.out.print("\t"+obj);} //printing different data values in list
		
		
		inputList.remove(4);//removing values in list
		
		System.out.println("\nForEach Loop");
		for(int j=0;j<inputList.size();j++){
		System.out.print("\t"+inputList.get(j));} //printing element from list using index
		
		List <Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(40);
		
		int var = intList.get(0);//only when <Integer> type casting is done on Arraylist
		Object ob1 = inputList.get(0);//no type casting is done on Arraylist
		int var1 = (Integer) inputList.get(0);//no type casting is done on Arraylist
		
		System.out.println("\nIterator While Loop");
		Iterator itr = intList.iterator();
		while(itr.hasNext()){
		System.out.print("\t"+itr.next());} //printing values in list using iterator 
		}
}
