import java.util.*;
class VectorStackDemo{
	public static void main(String[] args) {
		Stack<String> v = new Stack();
		v.add("Ram");
		v.add("Rahim");
		v.add("Kiran");

		while(v.size()>0){
			System.out.println(v.pop());
		}
	}
}