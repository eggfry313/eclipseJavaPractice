package interfacePackage;

public interface Controllable {
	
	int VERSION = 14;
	
	void turnOn();
	void turnOff();
	
	default void repair(){
		System.out.println("장비를 수리한다.");
	}
	
	static void reset() {
		System.out.println("장비를 초기화한다.");
	}
	
	private void show(String s) {
		System.out.println(s);
	}
}
