
public class PropertyCard extends Card {

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
	private int penaltyOrBonus;
	private String name;
	public boolean thing = false;
	private String owner;
	private int rent;
	
	
	
	
	public PropertyCard(int cost, int mortgageValue, int defaultRent, 
			int houseRent1, int houseRent2, int houseRent3, 
			int houseRent4, int hotelRent, String propertyName, int boardNumber,
			int houseCost, int grouping, String colorGroup) {
		
		
		this.isMortgaged = false;
		this.mortgageValue = mortgageValue;
		this.defaultRent = defaultRent;
		this.houseRent1 = houseRent1;
		this.houseRent2 = houseRent2;
		this.houseRent3 = houseRent3;
		this.houseRent4 = houseRent4;
		this.hotelRent = hotelRent;
		this.houseCost = houseCost;
		this.boardNumber = boardNumber;
		this.propertyName = propertyName;
		this.cost = cost;
		this.grouping = grouping;
		this.colorGroup = colorGroup;
		this.rent = defaultRent;
		
	}

	public int getLocation() {
		
		return this.boardNumber;
		
	}

	public boolean isPropertyMortgaged() {
		
		if (isMortgaged) {
			return true;	
		}
		return false;
		
	}
	
	
	public String propertyName() {
		return this.propertyName;
		
	}
	
	public int grouping() {
		
		return this.grouping;
	}
	
	public int cost() {
		
		return this.cost;
	
	}
	
	public int getRent() {
		
		if (isMortgaged) {
			return 0;
		}
		
		if (houseCount == 0) {
			return defaultRent;
		} else if (houseCount == 1) {
			return houseRent1;
		} else if (houseCount == 2) {
			return houseRent2;
		} else if (houseCount == 3) {
			return houseRent3;
		} else if (houseCount == 4) {
			return houseRent4;
		} else {return hotelRent;}

		
	}
	public int houses() {
		
		return houseCount;
		
	}
	
	public int buildHouses() {
		
		if (this.houseCount < 5) {
		this.setHouseCount(this.getHouseCount() + 1);
		return houseCost;
		
		}
		return 0;
		
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public int getHouseCount() {
		return this.houseCount;
	}

	public void setHouseCount(int houseCount) {
		this.houseCount = houseCount;
	}

}
