class Student{
	final int regNum;
	String name;
	Student(int regNum, String name){
			this.regNum = regNum;
			this.name = name;
	}
	Student(int regNum){
		this.regNum = regNum;
	}
	void details(){
		System.out.println("Registration number: "+regNum);
		System.out.println("Name: "+name);
	}
}
class University{
	public static void main(String[] args) {
		Student st1 = new Student(101,"Rohit");
		st1.details();
		Student st2 = new Student(102);
		st2.name = "Mohit";
		st2.details();

	}
}