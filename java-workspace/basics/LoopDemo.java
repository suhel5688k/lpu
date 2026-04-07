class LoopDemo{
	public static void main(String[] args) {
		//iteratin is fixed, best uses array iteration
		for (int i = 1; i<=3; i++) {
			System.out.println("for iteration "+i);
		}

		// iteration is not fixed, best uses collection iteration
		int j = 1;
		while(j<=3){ 
			System.out.println("while iteration "+j);
			j++;
		}


		int k = 1;
		do{
			System.out.println("do-while iteration "+k);
			k++;
		}while(k<=3);
	}
}