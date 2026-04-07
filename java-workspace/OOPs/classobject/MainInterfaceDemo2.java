interface Demo2{
	public abstract void m();
	void m2();
}
class Demo2Impl implements Demo2{
	public void m(){
		System.out.println("m() implemented by Demo2Impl");
	}
	public void m2(){
		System.out.println("m2() implemented by Demo2Impl");
	}
}
class MainInterfaceDemo2{
	public static void main(String[] args) {
		Demo2 d = new Demo2Impl();
		d.m();
		d.m2();
	}
}