package coreJavaExample;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set <String> set = new HashSet<String>();
		set.add("New");
		set.add("Old");
		set.add("Waste");
		set.add("New");
		set.add("Test");
		set.add("Demo");
		set.add("Automation");
		
		System.out.println(set);
		System.out.println("\nForEach Loop\n");
		
		for(String var:set){
			System.out.println(var);}
		
		Iterator<String> itr = set.iterator();
		
		System.out.println("\nIterator Loop\n");
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
		
		System.out.println("\nRetrieve One element\n");
		
		Iterator<String> itr1 = set.iterator();
		while(itr1.hasNext()){
			
			String chk = itr1.next();
			if(chk.equals("Demo")){
				System.out.println(chk);}
				}
	}
}


