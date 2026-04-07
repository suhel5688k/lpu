abstract class Demo{
   abstract void m();//abstract method
   void m2(){//concrete method
   	System.out.println("m2() concrete method");
   }
 }
 class DemoImpl extends Demo{
   void m(){
   	System.out.println("m() implemented by DemoImpl class");
   }
 }
 class MainAbstractDemo{
 	public static void main(String[] args) {
 		Demo d = new DemoImpl();
 		d.m2();
 		d.m();
 	}
 }