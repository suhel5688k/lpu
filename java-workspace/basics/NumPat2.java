class NumPat2{
	public static void main(String[] args) {
		int row = 3;
		int str = 1;
		int space=2;
		int num=1;
		for(int i=1; i<=row; i++){
			for(int j=1; j<=space;j++){
				System.out.print(" ");
			}
			for(int k=1; k<=str;k++){
				System.out.print(num);
			}
			System.out.println();
			space--;
			str+=2;
			num++;
		}
	}
}
