package coreJavaExample;
class Animal1
{
    Animal1 myType()
    {
        System.out.println("Animal");
        return new Animal1();
    }
}

class Dog1 extends Animal1
{
    Dog1 myType()     //Legal override after Java5 onward
    {
        System.out.println("Dog");
        return new Dog1();
    }
}
public class CovariantEx {

	public static void main(String[] args) {
		
		Animal1 anm = new Dog1();
		
		anm.myType();

	}

}
