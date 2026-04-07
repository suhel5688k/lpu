class Engine{
	String ename;
	void start(){
		System.out.println(ename+" started...");
	}
}
class Car{
	String cname;
	Engine e;
	void move(){
		e.start();
		System.out.println(cname +"Car is moving");
	}
}

class Driver{
	public static void main(String[] args) {
		Engine eng = new Engine();
		eng.ename = "Turbo Engine";

		Car c = new Car();
		c.cname = "nano";
		c.e = eng;
		c.move();
	}
}