package interfaceHomework;

public class SCV extends GroundUnit implements Repairable{
	
	public SCV() {
		super(60);
	}
	
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hp != u.max_hp) {
				u.hp++;
			}
			System.out.println(r.toString()+"의 수리가 끝났습니다.");
		}
	}
}
