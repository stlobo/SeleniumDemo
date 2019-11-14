package coreJavaExample;

class TyreInterface implements Moveable,Rollable {

	public static void main(String[] args) {
		
		TyreInterface tyf = new TyreInterface();
		System.out.println("Attribute 1\t" +tyf.isMovable()+"\tAttribute 2\t"+tyf.isRollable());
		
	}

	@Override
	public boolean isRollable() {
		System.out.println("Rollable");
		return true;
	
	}

	@Override
	public boolean isMovable() {
		System.out.println("Movable");
		return true;
	}


	
}
