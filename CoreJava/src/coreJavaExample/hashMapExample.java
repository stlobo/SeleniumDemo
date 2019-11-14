package coreJavaExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Book{
	int id;
	String name,author, publisher;
	
	public Book(int id,String name,String author,String publisher){
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;}
	}

public class hashMapExample {

	public static void main(String[] args) {

			Map<String,ArrayList<Book>> map = new HashMap <String,ArrayList<Book>>(); 
			
			ArrayList<Book> bookf = new ArrayList<Book>();
			Book bk1 = new Book(100,"Aesop Tales","Nirman","Kent");
			Book bk2 = new Book(101,"Famous Five","Enid Blyton","Knoff");
			
			ArrayList<Book> bookN = new ArrayList<Book>();
			Book bk3 = new Book(102,"NatGeo","Blyton","Terry");
			Book bk4 = new Book(103,"Discovery","Tell","Rellis");
			
			ArrayList<Book> bookg = new ArrayList<Book>();
			Book bk5 = new Book(104,"SmartWord","Gini","Lenn");
			Book bk6 = new Book(105,"Famous","Gini","Lenn");
			
			bookf.add(bk1);
			bookf.add(bk2);
			
			bookN.add(bk3);
			bookN.add(bk4);
			
			bookg.add(bk5);
			bookg.add(bk6);

			map.put("GK", bookg);
			map.put("Fictional", bookf);
			map.put("NonFictional", bookN);
			
			/*Set <String> var = map.keySet();
			for(String key: var)
			{
				System.out.println("Key\t"+key);
				
				for(Book bk: map.get(key)){
					
					System.out.println(bk.name);
					
				}}*/
				
				for(Map.Entry<String,ArrayList<Book>> jk:map.entrySet()){
					System.out.println("");
					System.out.println("Key\t"+jk.getKey());
					
					for(Book bk:jk.getValue()){
						
						System.out.println("");
						System.out.print(bk.id);
						System.out.print("\t"+bk.name);
						System.out.print("\t"+bk.author);
						System.out.print("\t"+bk.publisher);
						System.out.println("");
						}
					

			}

	}
}
