class Linga{
	static char c = 'A';
	Linga(char ch){
		System.out.println(c);
		c = ch;
	}
	{
		System.out.println(c);
		c = 'B';
	}
	static{
		System.out.println(c);
		c = 'C';
	}
	static char getC(){
		c = 'E';
		return c;
	}
}
class Dinga{
	public static void main(String[] args) {
		System.out.println(Linga.c);
		Linga.c='D';
	}
	static{
		System.out.println(Linga.getC());
	}
}