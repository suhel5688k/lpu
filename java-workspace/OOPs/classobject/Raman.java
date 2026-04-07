class Girl{
	String name;
	long phone;
	int age;
	String address;
	void details(){
		System.out.println("Girl Name: "+name);
		System.out.println("Girl phone number: "+phone);
		System.out.println("Girl age: "+age);
		System.out.println("Girl address: "+address);
	}
}

class Royal{//called class
	static long getPhoneNumber(){//called method
		System.out.println("Royal says Hi bhai hai mere uski number");
		return 7898765430L;
	}
	static String getName(){//called method
		System.out.println("Royal is sharing name");
		return "Anita";
	}
	static long[] getNumbers(){
		System.out.println("Royal sharing numbers...");
		long[] numbers = {9876543210l,8876543210l,7776543210l};
		return numbers;
	}
	static Girl getGirlObject(){
		System.out.println("Royal sharing Girls details as an object");
		Girl g = new Girl();
		g.name="Anita";
		g.phone=9876543210l;
		g.address="New Delhi";
		g.age=23;
		return g;
	} 

	//method argument, 
	static void storeName(String name){
		System.out.println("Received name: "+name+" storing it into database");
	}

}
class Raman{//caller class 
	public static void main(String[] args) {//caller method
		long phone = Royal.getPhoneNumber();
		System.out.println("Raman says, Ha bhai mil gaya number: "+phone);
		String name = Royal.getName();
		System.out.println("Raman got the name: "+name);
		long[] phoneNumbers = Royal.getNumbers();
		System.out.println("Raman got all the numbers....");
		for(long number: phoneNumbers){
			System.out.println(number);
		}
		Girl girl=Royal.getGirlObject();
		girl.details();
	}
}