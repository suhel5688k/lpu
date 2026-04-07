class Demo{
	public static void main(String[] args) {
		int[] arr = {3,4,1,5,6};
		int max = arr[0];
		int secmax = 0;
		for(int num: arr){
			if (num>max) {
				secmax=max;
				max=num;
			}else if(num>secmax && num==max){
				secmax=num;
			}
		}
		System.out.println(secmax);
	}
}