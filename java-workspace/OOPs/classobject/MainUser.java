//=================Interface layer===============
interface PaymentGateway{
	void pay(int amount);
}
//=========Object creation layer==============
class Gateway {
	static PaymentGateway modeOfPayment(String type){
		if (type.equals("UPI")) {
			return new UPI();
		}else if(type.equals("NetBanking")){
			return new NetBanking();
		}else{
			return null;
		}
	}
}
//================Implementation layer=======================
class UPI implements PaymentGateway{
	public void pay(int amount){
		System.out.println("Payment mode is UPI");
	}
}
class NetBanking implements PaymentGateway{
	public void pay(int amount){
		System.out.println("Payment mode is NetBanking");
	}
}
//============User utilize interface layer=============
class MainUser{
	public static void main(String[] args) {
		PaymentGateway pg = Gateway.modeOfPayment("Udhar chalega");
		pg.pay(100);
	}
}