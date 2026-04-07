class Member{
	String name;
	void chat(){
		System.out.println(name+" texting on groupe");
	}
}
class Admin extends Member{
	void addUser(){
		System.out.println(name+ " is now admin and can add another user");
	}
}
class WhatsAppGroup{
	public static void main(String[] args) {
		Member mem = new Admin();//up casting to access general 
		mem.name = "Harsh";
		mem.chat();

		Admin ad = (Admin) mem;
		ad.chat();
		ad.addUser();
	}
}