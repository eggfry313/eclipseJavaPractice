package interfaceHomework;

public class Tank extends GroundUnit implements Repairable{
	public Tank() {
		super(150);
	}
	
	public String toSring() {
		return "Tank";
	}
}
