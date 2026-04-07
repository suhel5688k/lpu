class DecisionMakingSt{
	public static void main(String[] args) {
		System.out.println("Welcome to ICICI ATM");
		int pin = 1234;
		int apin = 1234;
		if (pin==apin) {
			System.out.println("You are allow for transaction");
			int amount = 500;
			int balance = 1000;
			if (amount<=balance) {
				System.out.println(amount+" withdraw success");
			}else{
				System.out.println("chal bhak ja");
			}
		}else{
			System.out.println("invalid pin");
		}
		System.out.println("Thank you visit again");
	}
}