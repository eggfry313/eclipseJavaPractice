package interfaceHomework;

public class RepairableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		Marine marine = new Marine();
		
		System.err.println(tank.hp);
		System.out.println(dropship.hp);
		System.out.println(marine.hp);
		
		dropship.hp -= 25;
		tank.hp -= 20;
		System.out.println("수리 전 : "+tank.hp);
		System.out.println("수리 전 : "+dropship.hp);
		
		SCV scv = new SCV();
		scv.repair(tank);
		scv.repair(dropship);
		//scv.repair(marine);
		
		System.out.println("수리 후 : "+tank.hp);
		System.out.println("수리 후 : "+dropship.hp);
	}

}
