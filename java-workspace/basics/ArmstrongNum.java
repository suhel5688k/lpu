class ArmstrongNum{
	public static void main(String[] args){
		int num = 153;
		int temp = num;
		int res = 0;
		while(temp > 0){
			int rem = temp%10;
			res = res + rem * rem* rem;
			temp = temp/10;
		}
		if(res == num){
			System.out.println(num + " is an armstrong number.");
		}else{
			System.out.println(num + " not an armstrong number");
		}
	}
}