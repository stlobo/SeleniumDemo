package coreJavaExample;
class Animal{
void eat(){
	System.out.println("Eat...");
}
}
class Cat extends Animal {
 void cat(){
	 System.out.println("Cat...");
 }
}
class Dog extends Animal{
	void dog(){
		System.out.println("Dog...");
	}
}
public class HierarchicalEx {

	public static void main(String[] args) {
		
		Cat ct = new Cat();
		Dog dg = new Dog();
		
		ct.cat();
		ct.eat();
		dg.dog();
		dg.eat();

	}

}
