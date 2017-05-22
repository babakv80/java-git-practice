public class Person {
	public static void main(String[] arg){
		System.out.println("I am a person");
	}
	
	public void callPackageMethod(){
		HelloWorld hw = new HelloWorld();
		hw.packageMethod();
		hw.printMessage("adfasdf");
	}
}