class Amitabh{
	
	void decision(){
		System.out.println("Anita Se shadi karogi");
	}
}
class Abhishek extends Amitabh{
	void decision(){
		System.out.println("Aishwarya Se shadi karna hai");
	}
}
class InheritanceDemo{
	public static void main(String[] args) {
		Abhishek ab = new Abhishek();
		ab.decision();
	}
}