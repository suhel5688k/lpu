class LadderIf{
	public static void main(String[] args) {
		System.out.println("Welcome to Grade system");
		int mark = 67;
		if (mark>90 && mark<=100) {
			System.out.println("A++");
		} else if(mark>80 && mark<=90){
			System.out.println("A");
		} else if(mark>60 && mark<=80){
			System.out.println("B");
		} else if(mark>40 && mark<=60){
			System.out.println("C");
		} else {
			System.out.println("Failed");
		}
		System.out.println("Thank you");
	}
}