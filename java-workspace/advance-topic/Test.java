class MyArrayList{
	int[] arr =new int[3];
	int index = 0;
	void add(int num){
		if(arr.length==index){
			System.out.println("array is full, creating new array");
			int[] newArr = new int[arr.length*2];
			for(int i=0;i<arr.length; i++){
				newArr[i]=arr[i];
			}
			System.out.println(num+" added at "+index);
			newArr[index++]=num;
			arr=newArr;
		}else{
			System.out.println(num+" added at "+index);
			arr[index++]=num;
		}
	}
	int get(int i){
		return arr[i];
	}
}
class Test{
	public static void main(String[] args) {
		MyArrayList ma = new MyArrayList();
		ma.add(10);
		ma.add(20);
		ma.add(30);
		ma.add(40);
	}
}