import java.util.Scanner;
class ExceptionDemo{
	public static void main(String[] args) {
		System.out.println("Start...");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int i = sc.nextInt();
		System.out.println("Enter 2nd number");
		int j = sc.nextInt();
		try{
			int res = i/j;
			System.out.println("Result: "+res);
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		
		System.out.println("End...");
	}
}