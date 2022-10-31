package interfacePackage;

public class ControllableDemo {
	public static void main(String[] args) {
		TV tv = new TV();
		Computer com = new Computer();
		
		System.out.println(Controllable.VERSION);
		tv.versionPrint();
		
		tv.turnOn();
		tv.turnOff();
		tv.repair();
		
		System.out.println();
		
		com.turnOn();
		com.turnOff();
		com.repair();
		
		System.out.println();
		
		Controllable.reset();
	}
}
