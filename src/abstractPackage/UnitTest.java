package abstractPackage;

abstract class Unit {
	int x, y;

	public Unit(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	abstract void move();

	void stop() {
		System.out.println(x + ", " + y + "에서 멈춥니다.");
	}
}

class Marine extends Unit{
	public Marine(int x, int y) {
		super(x, y);
	}

	void move() {
		System.out.println("Marine 좌표 : "+x+", "+y);
		this.x+=10;
		this.y+=10;
	}
}

class Tank extends Unit{
	public Tank(int x, int y) {
		super(x, y);
	}

	void move() {
		System.out.println("Tank 좌표 : "+x+", "+y);
		this.x+=5;
		this.y+=5;
	}
}

class Plane extends Unit{
	public Plane(int x, int y) {
		super(x, y);
	}

	void move() {
		System.out.println("Plane 좌표 : "+x+", "+y);
		this.x+=20;
		this.y+=20;
	}
}

public class UnitTest {
	public static void main(String[] args) {
		Unit[] group = new Unit[4];
		group[0] = new Marine(0, 0);
		group[1] = new Tank(10, 10);
		group[2] = new Marine(20, 20);
		group[3] = new Plane(30, 30);

		for (int i = 0; i < group.length; i++) {
			group[i].move();
			group[i].stop();
		}
	}
}
