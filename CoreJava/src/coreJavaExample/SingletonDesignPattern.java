package coreJavaExample;

	public class SingletonDesignPattern {
		
		private static  SingletonDesignPattern instance = new  SingletonDesignPattern();
		
		private  SingletonDesignPattern(){
			System.out.println("Object is created");}
		
		public static SingletonDesignPattern getInstance(){
			return instance;
			
		}

		
	}

