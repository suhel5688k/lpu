import java.util.*;
class GenericDemo{
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList();//Homogeneous type of collection
		al.add("Azam");
		//al.add(10);// compilation error if try to add
		al.add("Reza");
		al.add("Amir");

		for(String name: al){
			// String name = (String)obj// no need to perform downcast
			System.out.println(name.toUpperCase());
		}
	}
}