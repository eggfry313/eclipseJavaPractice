package interfaceHomework;

public class Dropship extends AirUnit implements Repairable{
	public Dropship() {
		super(125);
	}
	
	public String toSring() {
		return "Dropship";
	}
}
