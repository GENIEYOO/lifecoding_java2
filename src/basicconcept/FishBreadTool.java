package basicconcept;

public class FishBreadTool {
	private String name;
	private int flour;
	private int redbean;
	
	public FishBreadTool (String iname, int iflour, int iredbean) {
		name = iname;
		flour = iflour;
		redbean = iredbean;
		bake();
	}
	
	
public void bake() {
	System.out.println(name + "붕어빵이 만들어 졌습니다.");
}
}
