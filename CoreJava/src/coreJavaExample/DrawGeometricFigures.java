package coreJavaExample;

abstract class DrawGeometricFigures  {
	

	
	abstract void draw();
	
	final void getStationary()
	{
		System.out.println("Final Stationary");
	}
	
	void getMedium()
	{
		System.out.println("Parent Paper");
	}
	
}
