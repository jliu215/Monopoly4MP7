
public class PenaltyBonusSpace extends Card {


	private int boardNumber;
	private int penaltyOrBonus;
	private String name;
	
	public PenaltyBonusSpace(int boardSpace, int penaltyOrBonus, String name) {
		
		this.boardNumber = boardSpace;
		this.penaltyOrBonus = penaltyOrBonus;
		this.name = name;
		
	}
	
	public int getLocation() {
		
		return this.boardNumber;
		
	}
	
	public String getName() {
		
		return this.name;
	}

	public int getPenaltyOrBonus() {
		
		return this.penaltyOrBonus;
		
	}

}
