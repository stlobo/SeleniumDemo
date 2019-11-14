package coreJavaExample;



public class GeometricFigures extends DrawGeometricFigures implements PolygonShape, CircleShape {

	public static void main(String[] args) {
		
		GeometricFigures testDrawObj = new GeometricFigures();
		testDrawObj.draw();
		testDrawObj.getStationary();
		testDrawObj.circle();
		testDrawObj.semicircle();
		testDrawObj.rectangle();
		testDrawObj.square();
		testDrawObj.paralelogram();
		testDrawObj.hexagon();
		testDrawObj.getMedium();
	}


	
	@Override
	public void rectangle() {
		
		System.out.println("Interface rectangle");
	}

	@Override
	public void square() {

		System.out.println("Interface square");
		
	}

	@Override
	public void hexagon() {
		
		System.out.println("Interface hexagon");
	}

	@Override
	public void paralelogram() {
		System.out.println("Interface paralelogram");
		
	}


	@Override
	public void circle() {
		System.out.println("Interface Circle");
		
	}


	@Override
	public void semicircle() {
		
		System.out.println("Interface Semicircle");
	}


	@Override
	void draw() {
		System.out.println("Abstract Draw");
		
	}
	
	public void getMedium()
	{
		System.out.println("Child Paper");
	}

}
