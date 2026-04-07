class Demo{
	static int i;
	int j;
	static {//
		System.out.println("Static block of Demo class executed");
		i=10;
	}
	{//
		System.out.println("Non-static block of Demo class executed");
		j=20;
	}
	Demo(){
		System.out.println("Demo class constructor executed");
	}
}
class MainDemo{
	static {
		System.out.println("MainDemo static block 1 executed");//
	}
	public static void main(String[] args) {
		System.out.println("Inside main() Demo.i: "+ Demo.i);//
		Demo d = new Demo();
		System.out.println("Inside main() d.j: "+ d.j);//
	}
	static{
		System.out.println("MainDemo static block 2 executed");//
	}
}