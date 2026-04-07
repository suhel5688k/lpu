class ASuper{
	int i = 10;
	void m(){
		System.out.println("A super class i property: "+i);
	}
}
class BSub extends ASuper{
	int j = 20;
	void n(){
		System.out.println("BSub class j property: "+j);
	}
}

class MainAB{
	public static void main(String[] args) {
		ASuper asup	= new BSub();//implicit up casting
		// ASuper asup = (ASuper) new BSub();// explicit up casting
		System.out.println(asub.i);
		// System.out.println(asup.j);//no 
		asup.m();
		// asup.n();//no

	}
}