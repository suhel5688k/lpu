import java.util.*;
class User{
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
}
class LinkedHashSetDemo{
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(new User(101,"Rohit"));
		lhs.add(new User(102,"Aman"));
		lhs.add(new User(103,"Pankaj"));
		lhs.add(new User(104,"Rohit"));
		for(Object obj: lhs){
			System.out.println(obj);
		}
	}
}