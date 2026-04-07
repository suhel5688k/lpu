class OperatorDemo{
	public static void main(String[] args) {
		int i = 0;//1--> 0--> 1
		int j = 0;//1--> 2 --> 1
		 i = i++ + j++;
		//i =    0   + 0 = 0
		 j = i++ + j++;
	// j =   0   + 1 = 1
		System.out.println(i);// 1
		System.out.println(j);// 1
	}
}