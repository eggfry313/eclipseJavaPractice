package interfacePackage;

public class TV implements Controllable{
	
	public void turnOn() {
		System.out.println("TV를 켠다.");
	}
	
	public void turnOff() {
		System.out.println("TV를 끈다.");
	}
	
	void versionPrint() {
		System.out.println(VERSION);
	}
}
