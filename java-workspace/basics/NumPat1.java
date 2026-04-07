class NumPat1{
	public static void main(String[] args) {
		int row = 3;
		int str = 1;
		for (int i=1; i<=row ; i++ ) {
			int num = 1;
			for (int j=1; j<=str ; j++ ) {
				System.out.print(num++ +" ");
			}
			System.out.println();
			str++;
		}
	}
}