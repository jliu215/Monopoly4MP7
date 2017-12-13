
public class CommunityChestChance extends Card{

	private int boardNumber;
	private String name;
	
	public CommunityChestChance(int boardspace, String name) {
		
		this.boardNumber = boardspace;
		this.name = name;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getBoardSpace() {
		return this.boardNumber;
	}
}
