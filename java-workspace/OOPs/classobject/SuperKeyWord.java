class A{
	int i = 10;

}
class B extends A{
	int i = 20;
	void m(){
		System.out.println(super.i);
		System.out.println(i);
	}
}
class SuperKeyWord{
	public static void main(String[] args) {
		B b = new B();
		B b2 = new B();
		System.out.println(b.hashCode());
		System.out.println(b2.hashCode());
		b.m();
	}
}