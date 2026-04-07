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
		return name+" "id;
	}
}
class SetExample{
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new User(101,"Rohit"));
		hs.add(new User(101,"Rohit"));
		for(Object obj: hs){
			User st = (User) obj;
			System.out.println(st.id+" "+st.name);
		}
	}
}