package interfacePackage;

public class Computer implements Controllable{
	
	public void turnOn() {
		System.out.println("컴퓨터를 켠다.");
	}
	
	public void turnOff() {
		System.out.println("컴퓨터를 끈다.");
	}
	
	void versionPrint() {
		System.out.println(VERSION);
	}
}
