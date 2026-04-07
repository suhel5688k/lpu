import java.util.*;
class User implements Comparable{
	int id;
	String name;
	User(int id, String name){
		this.id=id;
		this.name=name;
	}
	public int hashCode(){
		return id;
	}
	public boolean equals(Object obj){
		User user = (User) obj;
		return this.hashCode()==user.hashCode();
	}
	public String toString(){
		return name+" "+id;
	}
	public int compareTo(Object obj){
		User existing = (User) obj;// 101 rohit and this is current 100 aman
		return this.id-existing.id;
//              100 - 101 = - 1 swape
	}
}
class IdWiseDesc implements Comparator{
	public int compare(Object obj1, Object obj2){
		User current = (User) obj1;
		User existing = (User) obj2;
		return -(current.id-existing.id);
	}
}
class TreeSetDemo{
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet(new IdWiseDesc());
		ts.add(new User(101,"Rohit"));//existing
		ts.add(new User(100,"Aman"));//current
		
		for (Object obj: ts ) {
			User user = (User) obj;
			System.out.println(obj);
		}
	}
}