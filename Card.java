
public class Card {
	
	private int boardNumber;
	private String propertyName;
	private int cost;
	private int defaultRent;
	private int houseRent1;
	private int houseRent2;
	private int houseRent3;
	private int houseRent4;
	private int hotelRent;
	private int houseCost;
	
	private int houseCount = 0;
	private int mortgageValue;
	private boolean isMortgaged;
	private String colorGroup;
	private int grouping;
	
public int getLocation() {
		
		return this.boardNumber;
		
	}

	public boolean isPropertyMortgaged() {
		
		if (isMortgaged) {
			return true;	
		}
		return false;
		
	}
	
	
	public int getType() {
		
		if (this.boardNumber == 1) {
		
		return (1);
		
		}
		
	
		
		
		return 0;
	}

	public String propertyName() {
		return this.propertyName;
	}
	
	
}
