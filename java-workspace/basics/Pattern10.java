class Pattern10{
	public static void main(String[] args) {
		int row = 5;
		int spc = 2;
		int str = 1;
		int num = 1;
		for(int i=1;i<=row;i++){
			int printNum=num;
			for(int j=1;j<=spc;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=str;j++){
				System.out.print(printNum+" ");
				if (j<=str/2) {
					printNum--;
				}else{
					printNum++;
				}
			}n
			System.out.println();
			if (i<=row/2) {
				str+=2;
				spc--;
				num++;
			} else{
				str-=2;
				spc++;
				num--;
			}
		}
	}

}