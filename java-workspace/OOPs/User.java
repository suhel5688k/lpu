class User{
	private String username = "azam20104u";
	private String password = "azam4321";
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		if (password.length()>=8) {
			this.password = password;
		}else{
			System.out.println("password can't change, less than 8 character");
		}
	}
}

class SomeOneClass{
	public static void main(String[] args) {
		User us = new User();
		String name = us.getUsername();
		System.out.println(name);
		us.setUsername("amit1234u");
		System.out.println(us.getUsername());
		System.out.println(us.getPassword());
		us.setPassword("7654321");
		System.out.println(us.getPassword());
	}
}