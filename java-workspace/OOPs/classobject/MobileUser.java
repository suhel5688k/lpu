class Charger{
	String type;
	Charger(String type){
		this.type = type;
	}
	void charging(){
		System.out.println("Charging with "+type);
	}
}
class Mobile{
	final String imei;
	Mobile(String imei){
		this.imei = imei;
	}
	int percentage;
	Charger ch;
	void makeCall(){
		System.out.println("making call with with mobile imei number "+imei);
	}
	void plugCharger(){
		if (percentage<=20) {
			ch.charging();
		}else{
			System.out.println("you can use your mobile");
		}
	}

}
class MobileUser{
	public static void main(String[] args) {
		Charger chg =  new Charger("Type C");
		Mobile m = new Mobile("HJSFHSKFHSDH982496234962");
		m.percentage = 10;
		m.ch = chg;
		m.makeCall();

		m.plugCharger();

	}
}