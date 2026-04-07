class SortingArray{
	public static void main(String[] args) {
		int[] arr = {30,20,40,60,90};
		System.out.println("====before sort=====");
		for(int e: arr){
			System.out.println(e);
		}
		for (int i=0; i<arr.length ;i++ ) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr [j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("====after sort=====");
		for(int e: arr){
			System.out.println(e);
		}
	}
}