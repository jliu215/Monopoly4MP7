import java.util.ArrayList;

import java.util.Scanner;

public class Monopoly {
	
	static Scanner scanner = new Scanner(System.in);

	static PropertyCard MedditeraneanAvenue = new PropertyCard(60, 30, 2, 10, 30, 90, 160, 250, "Mediterranean Avenue",
			1, 50, 1, "Brown");
	static PropertyCard BalticAvenue = new PropertyCard(60, 30, 4, 20, 60, 180, 320, 450, "Baltic Avenue", 3, 50, 1,
			"Brown");

	static PropertyCard ConnecticutAvenue = new PropertyCard(100, 50, 6, 30, 90, 270, 400, 550, "Connecticut Avenue", 6,
			50, 2, "Light Blue");
	static PropertyCard VermontAvenue = new PropertyCard(100, 50, 6, 30, 90, 270, 400, 550, "Vermont Avenue", 8, 50, 2,
			"Light Blue");
	static PropertyCard OrientalAvenue = new PropertyCard(120, 60, 8, 40, 100, 300, 450, 600, "Oriental Avenue", 9, 50,
			2, "Light Blue");

	static PropertyCard StCharlesPlace = new PropertyCard(140, 70, 10, 50, 150, 450, 625, 750, "St. Charles Place", 11,
			100, 3, "Purple");
	static PropertyCard StatesAvenue = new PropertyCard(140, 70, 10, 50, 150, 450, 625, 750, "States Avenue", 13, 100,
			3, "Purple");
	static PropertyCard VirginiaAvenue = new PropertyCard(160, 80, 12, 60, 180, 500, 700, 900, "Virginia Avenue", 14,
			100, 3, "Purple");
	static PropertyCard StJamesPlace = new PropertyCard(180, 90, 14, 70, 200, 550, 750, 950, "St. James Place", 16, 100,
			4, "Orange");
	static PropertyCard TennesseeAvenue = new PropertyCard(180, 90, 14, 70, 200, 550, 750, 950, "Tennessee Avenue", 18,
			100, 4, "Orange");
	static PropertyCard NewYorkAvenue = new PropertyCard(200, 100, 16, 80, 220, 600, 800, 1000, "New York Avenue", 19,
			100, 4, "Orange");

	static PropertyCard KentuckyAvenue = new PropertyCard(220, 110, 18, 90, 250, 700, 875, 1050, "Kentucky Avenue", 21,
			150, 5, "Red");
	static PropertyCard IndianaAvenue = new PropertyCard(220, 110, 18, 90, 250, 700, 875, 1050, "Indiana Avenue", 23,
			150, 5, "Red");
	static PropertyCard IllinoisAvenue = new PropertyCard(240, 120, 20, 100, 300, 750, 925, 1100, "Illinois Avenue", 24,
			150, 5, "Red");

	static PropertyCard AtlanticAvenue = new PropertyCard(260, 130, 22, 110, 330, 800, 975, 1150, "Atlantic Avenue", 26,
			150, 6, "Yellow");
	static PropertyCard VentnorAvenue = new PropertyCard(260, 130, 22, 110, 330, 800, 975, 1150, "Ventnor Avenue", 27,
			150, 6, "Yellow");
	static PropertyCard MarvinGardens = new PropertyCard(280, 140, 24, 120, 360, 850, 1025, 1200, "Marvin Gardens", 29,
			150, 6, "Yellow");

	static PropertyCard PacificAvenue = new PropertyCard(300, 150, 26, 130, 390, 900, 1100, 1275, "Pacific Avenue", 31,
			200, 7, "Green");
	static PropertyCard NorthCarolinaAvenue = new PropertyCard(300, 150, 26, 130, 390, 900, 1100, 1275,
			"North Carolina Avenue", 32, 200, 7, "Green");
	static PropertyCard PennsylvaniaAvenue = new PropertyCard(320, 160, 28, 150, 450, 1000, 1200, 1400,
			"Pennsylvania Avenue", 34, 200, 7, "Green");

	static PropertyCard ParkPlace = new PropertyCard(350, 175, 35, 175, 500, 1100, 1300, 1500, "Park Place", 37, 200, 8,
			"Blue");
	static PropertyCard Boardwalk = new PropertyCard(400, 200, 50, 200, 600, 1400, 1700, 2000, "Boardwalk", 39, 200, 8,
			"Blue");


	static PropertyCard ReadingRailroad = new PropertyCard(200, 100, 25,25, 50,100,200,0, "Reading Railroad", 5,0,0,null);
	static PropertyCard PennsylvaniaRailroad = new PropertyCard(200, 100,25,25,50,100,200,0, "Pennsylvania Railroad", 15,0,0,null);
	static PropertyCard BORailroad = new PropertyCard(200, 100, 25,25,50,100,200,0, "B & O Railroad", 25,0,0,null);
	static PropertyCard ShortLineRailroad = new PropertyCard(200, 100, 25,25,50,100,200,0, "Short Line Railroad", 35,0,0,null);

	static PenaltyBonusSpace Go = new PenaltyBonusSpace(0, 200, "Go");
	static PenaltyBonusSpace FreeParking = new PenaltyBonusSpace(20, 100, "Free Parking");
	static PenaltyBonusSpace LuxuryTax = new PenaltyBonusSpace(38, -75, "Luxury Tax");
	static PenaltyBonusSpace IncomeTax = new PenaltyBonusSpace(4, -200, "Income Tax");
	static PenaltyBonusSpace GoToJail = new PenaltyBonusSpace(30, -50, "Go to Jail");
	static PenaltyBonusSpace Jail = new PenaltyBonusSpace(10, 0, "Jail, just visiting!");

	static CommunityChestChance Chance1 = new CommunityChestChance(7, "Chance");
	static CommunityChestChance Chance2 = new CommunityChestChance(22, "Chance");
	static CommunityChestChance Chance3 = new CommunityChestChance(36, "Chance");
	static CommunityChestChance CommunityChest1 = new CommunityChestChance(2, "Community Chest");
	static CommunityChestChance CommunityChest2 = new CommunityChestChance(17, "Community Chest");
	static CommunityChestChance CommunityChest3 = new CommunityChestChance(33, "Community Chest");

	public static ArrayList<Card> bankProperties = new ArrayList<Card>();

	public static ArrayList<Card> gameBoard = new ArrayList<Card>();

	public static String returnType(int position) {

		if (position == 1 || position == 3 || position == 5 || position == 6 || position == 8 || position == 9
				|| position == 11 || position == 12 || position == 13 || position == 14 || position == 15
				|| position == 16 || position == 18 || position == 19 || position == 21 || position == 23
				|| position == 24 || position == 25 || position == 26 || position == 27 || position == 28
				|| position == 29 || position == 31 || position == 32 || position == 34 || position == 35
				|| position == 37 || position == 39) {

			return "Property";

		} else if (position == 30) {
			return "GoToJail";
		} else if (position == 0 || position == 4 || position == 38 || position == 20 || position == 10) {
			return "BonusOrPenalty";
		} else if (position == 7 || position == 22 || position == 36) {
			return "Chance";
		} else if (position == 2 || position == 17 || position == 33) {
			return "CommunityChest";
		}
		return "";
	}
	
	
	private static int rollNumb;
	private static int utilityValue;
	public static void rollingOption1(Player p){
		Dice rolling = new Dice();
		int rollNumb;
		rollNumb = rolling.rollDie(p, rolling);
		p.dice1 = rolling.dice1;
		p.dice2 = rolling.dice2;
		rollNumb = p.dice1 + p.dice2;
			Monopoly.rollNumb = rollNumb;
			Monopoly.utilityValue = rollNumb*5;
		}
	static PropertyCard ElectricCompany = new PropertyCard(150, 75,utilityValue, utilityValue, utilityValue*2,0,0,0, "Electric Company", 12,0,0,null);
	static PropertyCard WaterWorks = new PropertyCard(150, 75,utilityValue, utilityValue,utilityValue*2,0,0,0, "Water Works", 28,0,0,null);
	
	
	public static void playerPosition(Player p1, Player p2) {
		p1.position = p1.playerPosition(p1, Monopoly.rollNumb); 
		System.out.println(p1.playerName + " is at position " + p1.position);
		landOnSpace(p1, p2, p1.position);
	}



	public static void main(String[] args) {

		bankProperties.add(Boardwalk);
		bankProperties.add(ParkPlace);
		bankProperties.add(NorthCarolinaAvenue);
		bankProperties.add(PennsylvaniaAvenue);
		bankProperties.add(PacificAvenue);
		bankProperties.add(MarvinGardens);
		bankProperties.add(VentnorAvenue);
		bankProperties.add(AtlanticAvenue);
		bankProperties.add(IllinoisAvenue);
		bankProperties.add(IndianaAvenue);
		bankProperties.add(KentuckyAvenue);
		bankProperties.add(NewYorkAvenue);
		bankProperties.add(StJamesPlace);
		bankProperties.add(VirginiaAvenue);
		bankProperties.add(StatesAvenue);
		bankProperties.add(StCharlesPlace);
		bankProperties.add(OrientalAvenue);
		bankProperties.add(VermontAvenue);
		bankProperties.add(BalticAvenue);
		bankProperties.add(ConnecticutAvenue);
		bankProperties.add(MedditeraneanAvenue);
		bankProperties.add(TennesseeAvenue);
		bankProperties.add(ReadingRailroad);
		bankProperties.add(PennsylvaniaRailroad);
		bankProperties.add(ShortLineRailroad);
		bankProperties.add(BORailroad);
		bankProperties.add(ElectricCompany);
		bankProperties.add(WaterWorks);

		gameBoard.add(Go);
		gameBoard.add(BalticAvenue);
		gameBoard.add(CommunityChest1);
		gameBoard.add(MedditeraneanAvenue);
		gameBoard.add(IncomeTax);
		gameBoard.add(ReadingRailroad);
		gameBoard.add(OrientalAvenue);
		gameBoard.add(Chance1);
		gameBoard.add(VermontAvenue);
		gameBoard.add(ConnecticutAvenue);
		gameBoard.add(Jail);
		gameBoard.add(StCharlesPlace);
		gameBoard.add(ElectricCompany);
		gameBoard.add(StatesAvenue);
		gameBoard.add(VirginiaAvenue);
		gameBoard.add(PennsylvaniaRailroad);
		gameBoard.add(StJamesPlace);
		gameBoard.add(CommunityChest2);
		gameBoard.add(TennesseeAvenue);
		gameBoard.add(NewYorkAvenue);
		gameBoard.add(FreeParking);
		gameBoard.add(KentuckyAvenue);
		gameBoard.add(Chance2);
		gameBoard.add(IndianaAvenue);
		gameBoard.add(IllinoisAvenue);
		gameBoard.add(BORailroad);
		gameBoard.add(AtlanticAvenue);
		gameBoard.add(VentnorAvenue);
		gameBoard.add(WaterWorks);
		gameBoard.add(MarvinGardens);
		gameBoard.add(GoToJail);
		gameBoard.add(PacificAvenue);
		gameBoard.add(NorthCarolinaAvenue);
		gameBoard.add(CommunityChest3);
		gameBoard.add(PennsylvaniaAvenue);
		gameBoard.add(ShortLineRailroad);
		gameBoard.add(Chance3);
		gameBoard.add(ParkPlace);
		gameBoard.add(LuxuryTax);
		gameBoard.add(Boardwalk);

		
		

		Dice rolling = new Dice();
		Player player = new Player();
		Scanner scanner = new Scanner(System.in);

		Player firstPlayer = new Player();
		Player secondPlayer = new Player();
		Winner winner = new Winner();

		firstPlayer.playerName = player.getPlayer();
		secondPlayer.playerName = player.getPlayer();
		

		superLoop: while (true) {
			secondPlayer.doubleCount = 3; //Making sure doubleCount would be 3 for other player.
			System.out.println(firstPlayer.playerName + " has $ " + firstPlayer.playerAccount); 
																							
			System.out.println(firstPlayer.playerName + " 's turn, select the following options"); 
			
			while (true) {
				
				
				firstPlayer.monopolyCheck();
				secondPlayer.monopolyCheck();
				
				System.out.println("1. Roll the dice \n2. Manage properties"); 
				int option = scanner.nextInt();

				if (option == 1) {
					rollingOption1(firstPlayer);
				
					System.out.println(firstPlayer.playerName + " has rolled " + Monopoly.rollNumb + " with " + "dice1 = " + firstPlayer.dice1 + " dice2 = " + firstPlayer.dice2);
					if(firstPlayer.goJail()) {
						
						if (firstPlayer.getOutOfJailFree > 0) {
							System.out.println("You can use GET OUT OF JAIL FREE CARD to get out of jail;\n press 1 to use a card\n press any other number to skip");
							option = scanner.nextInt();
							if (option == 1) {
								System.out.println("You released from jail");
								firstPlayer.getOutOfJailFree --;
								firstPlayer.jailCounter = 0;
								playerPosition(firstPlayer,secondPlayer);
									break;
							}
						}
						
						firstPlayer.jailCounter--;
						System.out.println(firstPlayer.playerName +" is in jail for " + (3 - firstPlayer.jailCounter) + " round!");
						if(firstPlayer.dice1 == firstPlayer.dice2) {
							System.out.println("Rolled Double in jail");
							firstPlayer.jailCounter = 0;
							playerPosition(firstPlayer,secondPlayer);
							break;
						}
						
						if (firstPlayer.jailCounter == 0) {
							System.out.println(firstPlayer.playerName + " is released from jail");
							firstPlayer.playerAccount -= 50;
							System.out.println("You had paid $50");
						}
						break;
					}
					if (rolling.rollDouble(firstPlayer)) {
					
						if(rolling.tripleDouble(firstPlayer)) {
							firstPlayer.goJail();
							System.out.println(firstPlayer.playerName + " has rolled 3 times Double in a row and sent to jail\nTurn ends\n");
							break;
						}
						System.out.println(firstPlayer.playerName + " has rolled " + (3-firstPlayer.doubleCount) + " Double and you will need to roll again");
					} 
					playerPosition(firstPlayer,secondPlayer);
					if(firstPlayer.jailCounter == 3) {
						break;
					}

					winner.winner(firstPlayer);
					if (firstPlayer.end == true) {
						break superLoop;
					}
					if(firstPlayer.dice1 != firstPlayer.dice2)
					break;
					

					
				}

				if (option == 2) {

					System.out.println("1. List Properties \n2. Buy Houses/Hotels");
					option = (int) scanner.nextInt();

					if (option == 1) {

						System.out.println(firstPlayer.playerName + " Owns:");

						for (int i = 0; i < firstPlayer.playerProperties.size(); i++) {

							System.out.println(firstPlayer.playerProperties.get(i).getPropertyName());

						}

					}

					if (option == 2) {

						{

							while (true) {

								System.out.println("Where would you like to buy houses and hotels?");
								System.out.println("Type the number corresponding to the color group");
								System.out.println("-------------------------------------------------");
								System.out.println();

								for (int i = 0; i < firstPlayer.monopolyGroups.length; i++) {
									if (firstPlayer.monopolyGroups[i]) {
										System.out.println(i + ":  " + firstPlayer.monopolyColors[i]);

									}
								}
								System.out.println("Type 8 to return");

								option = (int) scanner.nextInt();

								if (option == 0 && firstPlayer.monopolyGroups[0] == true) {

									System.out.println("How many houses would you like to buy for your monopoly?\n"
											+ "Houses are $50 each, so it will be $100 to get one on both properties\n"
											+ "You can own up to five. You currently have "
											+ ((PropertyCard) Monopoly.gameBoard.get(1)).getHouseCount()
											+ " on each property in this monopoly.\n"
											+ "Type a number (0, 1, 2, 3, 4, 5)");

									option = (int) scanner.nextInt();

									if (option * 100 >= firstPlayer.playerAccount) {
										break;
									}

									if (option == 0) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(1)).getHouseCount() > 5) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(1)).getHouseCount() <= 5) {
										firstPlayer.playerAccount -= 100 * option;

										((PropertyCard) Monopoly.gameBoard.get(1)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(1)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(3)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(3)).getHouseCount() + option);
										System.out.println(option + " Houses built!");
										System.out.println("Money left: " + firstPlayer.playerAccount);

									}

									break;

								}

								if (option == 1 && firstPlayer.monopolyGroups[1] == true) {

									System.out.println("How many houses would you like to buy for your monopoly?\n"
											+ "Houses are $50 each, so it will be $150 to get one all three properties\n"
											+ "You can own up to five. You currently have "
											+ ((PropertyCard) Monopoly.gameBoard.get(6)).getHouseCount()
											+ " on each property in this monopoly.\n"
											+ "Type a number (0, 1, 2, 3, 4, 5)");

									option = (int) scanner.nextInt();

									if (option * 150 >= firstPlayer.playerAccount) {
										break;
									}

									if (option == 0) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(6)).getHouseCount() > 5) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(6)).getHouseCount() <= 5) {
										firstPlayer.playerAccount -= 150 * option;

										((PropertyCard) Monopoly.gameBoard.get(6)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(6)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(8)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(8)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(9)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(9)).getHouseCount() + option);
										System.out.println(option + " Houses built!");
										System.out.println("Money left: " + firstPlayer.playerAccount);

									}

									break;

								}

								if (option == 2 && firstPlayer.monopolyGroups[2] == true) {

									System.out.println("How many houses would you like to buy for your monopoly?\n"
											+ "Houses are $100 each, so it will be $300 to get one on all three properties\n"
											+ "You can own up to five. You currently have "
											+ ((PropertyCard) Monopoly.gameBoard.get(11)).getHouseCount()
											+ " on each property in this monopoly.\n"
											+ "Type a number (0, 1, 2, 3, 4, 5)");

									option = (int) scanner.nextInt();

									if (option * 300 >= firstPlayer.playerAccount) {
										break;
									}

									if (option == 0) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(11)).getHouseCount() > 5) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(11)).getHouseCount() <= 5) {
										firstPlayer.playerAccount -= 300 * option;

										((PropertyCard) Monopoly.gameBoard.get(11)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(11)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(13)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(13)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(14)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(14)).getHouseCount() + option);
										System.out.println(option + " Houses built!");
										System.out.println("Money left: " + firstPlayer.playerAccount);

									}

									break;

								}

								if (option == 3 && firstPlayer.monopolyGroups[3] == true) {

									System.out.println("How many houses would you like to buy for your monopoly?\n"
											+ "Houses are $100 each, so it will be $300 to get one on all three properties\n"
											+ "You can own up to five. You currently have "
											+ ((PropertyCard) Monopoly.gameBoard.get(16)).getHouseCount()
											+ " on each property in this monopoly.\n"
											+ "Type a number (0, 1, 2, 3, 4, 5)");

									option = (int) scanner.nextInt();

									if (option * 300 >= firstPlayer.playerAccount) {
										break;
									}

									if (option == 0) {
										break;
									}
									//((PropertyCard) Monopoly.gameBoard.get(1)).getHouseCount()
									if (option + ((PropertyCard) Monopoly.gameBoard.get(16)).getHouseCount() > 5) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(16)).getHouseCount() <= 5) {
										firstPlayer.playerAccount -= 300 * option;

										((PropertyCard) Monopoly.gameBoard.get(16)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(16)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(18)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(18)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(19)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(19)).getHouseCount() + option);
										System.out.println(option + " Houses built!");
										System.out.println("Money left: " + firstPlayer.playerAccount);

									}

									break;

								}

								if (option == 4 && firstPlayer.monopolyGroups[4] == true) {

									System.out.println("How many houses would you like to buy for your monopoly?\n"
											+ "Houses are $150 each, so it will be $450 to get one on all three properties\n"
											+ "You can own up to five. You currently have "
											+ ((PropertyCard) Monopoly.gameBoard.get(21)).getHouseCount()
											+ " on each property in this monopoly.\n"
											+ "Type a number (0, 1, 2, 3, 4, 5)");

									option = (int) scanner.nextInt();

									if (option * 450 >= firstPlayer.playerAccount) {
										break;
									}

									if (option == 0) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(21)).getHouseCount() > 5) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(21)).getHouseCount() <= 5) {
										firstPlayer.playerAccount -= 450 * option;

										((PropertyCard) Monopoly.gameBoard.get(21)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(21)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(23)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(23)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(24)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(24)).getHouseCount() + option);
										System.out.println(option + " Houses built!");
										System.out.println("Money left: " + firstPlayer.playerAccount);

									}

									break;

								}

								if (option == 5 && firstPlayer.monopolyGroups[5] == true) {

									System.out.println("How many houses would you like to buy for your monopoly?\n"
											+ "Houses are $150 each, so it will be $450 to get one on all three properties\n"
											+ "You can own up to five. You currently have "
											+ ((PropertyCard) Monopoly.gameBoard.get(26)).getHouseCount()
											+ " on each property in this monopoly.\n"
											+ "Type a number (0, 1, 2, 3, 4, 5)");

									option = (int) scanner.nextInt();

									if (option * 450 >= firstPlayer.playerAccount) {
										break;
									}

									if (option == 0) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(26)).getHouseCount() > 5) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(26)).getHouseCount() <= 5) {
										firstPlayer.playerAccount -= 450 * option;

										((PropertyCard) Monopoly.gameBoard.get(26)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(26)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(27)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(27)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(29)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(29)).getHouseCount() + option);
										System.out.println(option + " Houses built!");
										System.out.println("Money left: " + firstPlayer.playerAccount);

									}

									break;

								}

								if (option == 6 && firstPlayer.monopolyGroups[6] == true) {

									System.out.println("How many houses would you like to buy for your monopoly?\n"
											+ "Houses are $200 each, so it will be $600 to get one on all three properties\n"
											+ "You can own up to five. You currently have "
											+ ((PropertyCard) Monopoly.gameBoard.get(31)).getHouseCount()
											+ " on each property in this monopoly.\n"
											+ "Type a number (0, 1, 2, 3, 4, 5)");

									option = (int) scanner.nextInt();

									if (option * 600 >= firstPlayer.playerAccount) {
										break;
									}

									if (option == 0) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(31)).getHouseCount() > 5) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(31)).getHouseCount() <= 5) {
										firstPlayer.playerAccount -= 600 * option;

										((PropertyCard) Monopoly.gameBoard.get(31)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(31)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(32)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(32)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(34)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(34)).getHouseCount() + option);
										System.out.println(option + " Houses built!");
										System.out.println("Money left: " + firstPlayer.playerAccount);

									}

									break;

								}

								if (option == 7 && firstPlayer.monopolyGroups[7] == true) {

									System.out.println("How many houses would you like to buy for your monopoly?\n"
											+ "Houses are $200 each, so it will be $400 to get one on both properties\n"
											+ "You can own up to five. You currently have "
											+ ((PropertyCard) Monopoly.gameBoard.get(37)).getHouseCount()
											+ " on each property in this monopoly.\n"
											+ "Type a number (0, 1, 2, 3, 4, 5)");

									option = (int) scanner.nextInt();

									if (option * 400 >= firstPlayer.playerAccount) {
										break;
									}

									if (option == 0) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(37)).getHouseCount() > 5) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(37)).getHouseCount() <= 5) {
										firstPlayer.playerAccount -= 400 * option;

										((PropertyCard) Monopoly.gameBoard.get(37)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(37)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(39)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(39)).getHouseCount() + option);
										System.out.println(option + " Houses built!");
										System.out.println("Money left: " + firstPlayer.playerAccount);

									}

									break;

								}

								else if (option == 8) {

									break;

								}
							}
						}

					}

				}
			}
			System.out.println(firstPlayer.playerName + " 's ending balance is " + firstPlayer.playerAccount + "\n");
			
			System.out.println("---------------------------------- \n");
			
			firstPlayer.doubleCount = 3;
			
			
			
			
			
			
			
			
			
			
			
			
			
			System.out.println(secondPlayer.playerName + " " + secondPlayer.playerAccount);
			System.out.println(secondPlayer.playerName + " 's turn, select the following options");

			while (true) {
				
				
				System.out.println("1. Roll the dice \n2. Manage properties");
				int option = scanner.nextInt();

				if (option == 1) {

					rollingOption1(secondPlayer);
					
					System.out.println(secondPlayer.playerName + " has rolled " + Monopoly.rollNumb + " with " + "dice1 = " + secondPlayer.dice1 + " dice2 = " + secondPlayer.dice2);
					if(secondPlayer.goJail()) {
						if(secondPlayer.getOutOfJailFree > 0) {
							System.out.println("You can you GET OUT OF JAIL FREE CARD to get out of jail;\n Press 1 to use a card\n press any other number to skip");
							option = scanner.nextInt();
							if (option == 1) {
								System.out.println("You released from jail");
								secondPlayer.getOutOfJailFree --;
								firstPlayer.jailCounter = 0;
								playerPosition(secondPlayer,firstPlayer);
								break;
							}
						}
						secondPlayer.jailCounter--;
						System.out.println(secondPlayer.playerName + " is in jail for " + (3-secondPlayer.jailCounter)+ " round!" );
						if(secondPlayer.dice1 == secondPlayer.dice2) {
							System.out.println("Rolled Double in jail");
							secondPlayer.jailCounter = 0;
							playerPosition(secondPlayer,firstPlayer);
							break;
						}
						if(secondPlayer.jailCounter == 0) {
							System.out.println(secondPlayer.playerName + " is released from jail!");
							secondPlayer.playerAccount -= 50;
							System.out.println("You had paid $50");
						}
						break;
					}
					if (rolling.rollDouble(secondPlayer)) {
						
						if(rolling.tripleDouble(secondPlayer)) {
							
							secondPlayer.goJail();
							System.out.println(secondPlayer.playerName + " Rolled 3 times Double and sent to jail\nTurn ends\n");
							break;
						}
						System.out.println(secondPlayer.playerName +" has rolled " + (3-secondPlayer.doubleCount) + " times Double and you will need to roll again|");
					}

					playerPosition(secondPlayer, firstPlayer);
					if(secondPlayer.jailCounter == 3) {
						break;
					}
					
					winner.winner(secondPlayer);
					if(secondPlayer.end == true) {
						break superLoop;
					}
					if(secondPlayer.dice1 != secondPlayer.dice2)
					break;


					
				}
				if (option == 2) {

					System.out.println("1. List Properties \n2. Buy Houses/Hotels");
					option = (int) scanner.nextInt();

					if (option == 1) {

						System.out.println(secondPlayer.playerName + " Owns:");

						for (int i = 0; i < secondPlayer.playerProperties.size(); i++) {

							System.out.println(secondPlayer.playerProperties.get(i).getPropertyName());

						}

					}

					if (option == 2) {

						{

							while (true) {

								System.out.println("Where would you like to buy houses and hotels?");
								System.out.println("Type the number corresponding to the color group");
								System.out.println("-------------------------------------------------");
								System.out.println();

								for (int i = 0; i < secondPlayer.monopolyGroups.length; i++) {
									if (secondPlayer.monopolyGroups[i]) {
										System.out.println(i + ":  " + secondPlayer.monopolyColors[i]);

									}
								}
								System.out.println("Type 8 to return");

								option = (int) scanner.nextInt();

								if (option == 0 && secondPlayer.monopolyGroups[0] == true) {

									System.out.println("How many houses would you like to buy for your monopoly?\n"
											+ "Houses are $50 each, so it will be $100 to get one on both properties\n"
											+ "You can own up to five. You currently have "
											+ ((PropertyCard) Monopoly.gameBoard.get(1)).getHouseCount()
											+ " on each property in this monopoly.\n"
											+ "Type a number (0, 1, 2, 3, 4, 5)");

									option = (int) scanner.nextInt();

									if (option * 100 >= secondPlayer.playerAccount) {
										break;
									}

									if (option == 0) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(1)).getHouseCount() > 5) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(1)).getHouseCount() <= 5) {
										secondPlayer.playerAccount -= 100 * option;

										((PropertyCard) Monopoly.gameBoard.get(1)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(1)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(3)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(3)).getHouseCount() + option);
										System.out.println(option + " Houses built!");
										System.out.println("Money left: " + secondPlayer.playerAccount);

									}

									break;

								}

								if (option == 1 && secondPlayer.monopolyGroups[1] == true) {

									System.out.println("How many houses would you like to buy for your monopoly?\n"
											+ "Houses are $50 each, so it will be $150 to get one all three properties\n"
											+ "You can own up to five. You currently have "
											+ ((PropertyCard) Monopoly.gameBoard.get(6)).getHouseCount()
											+ " on each property in this monopoly.\n"
											+ "Type a number (0, 1, 2, 3, 4, 5)");

									option = (int) scanner.nextInt();

									if (option * 150 >= secondPlayer.playerAccount) {
										break;
									}

									if (option == 0) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(6)).getHouseCount() > 5) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(6)).getHouseCount() <= 5) {
										secondPlayer.playerAccount -= 150 * option;

										((PropertyCard) Monopoly.gameBoard.get(6)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(6)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(8)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(8)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(9)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(9)).getHouseCount() + option);
										System.out.println(option + " Houses built!");
										System.out.println("Money left: " + secondPlayer.playerAccount);

									}

									break;

								}

								if (option == 2 && secondPlayer.monopolyGroups[2] == true) {

									System.out.println("How many houses would you like to buy for your monopoly?\n"
											+ "Houses are $100 each, so it will be $300 to get one on all three properties\n"
											+ "You can own up to five. You currently have "
											+ ((PropertyCard) Monopoly.gameBoard.get(11)).getHouseCount()
											+ " on each property in this monopoly.\n"
											+ "Type a number (0, 1, 2, 3, 4, 5)");

									option = (int) scanner.nextInt();

									if (option * 300 >= secondPlayer.playerAccount) {
										break;
									}

									if (option == 0) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(11)).getHouseCount() > 5) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(11)).getHouseCount() <= 5) {
										secondPlayer.playerAccount -= 300 * option;

										((PropertyCard) Monopoly.gameBoard.get(11)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(11)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(13)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(13)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(14)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(14)).getHouseCount() + option);
										System.out.println(option + " Houses built!");
										System.out.println("Money left: " + secondPlayer.playerAccount);

									}

									break;

								}

								if (option == 3 && secondPlayer.monopolyGroups[3] == true) {

									System.out.println("How many houses would you like to buy for your monopoly?\n"
											+ "Houses are $100 each, so it will be $300 to get one on all three properties\n"
											+ "You can own up to five. You currently have "
											+ ((PropertyCard) Monopoly.gameBoard.get(16)).getHouseCount()
											+ " on each property in this monopoly.\n"
											+ "Type a number (0, 1, 2, 3, 4, 5)");

									option = (int) scanner.nextInt();

									if (option * 300 >= secondPlayer.playerAccount) {
										break;
									}

									if (option == 0) {
										break;
									}
									//((PropertyCard) Monopoly.gameBoard.get(1)).getHouseCount()
									if (option + ((PropertyCard) Monopoly.gameBoard.get(16)).getHouseCount() > 5) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(16)).getHouseCount() <= 5) {
										secondPlayer.playerAccount -= 300 * option;

										((PropertyCard) Monopoly.gameBoard.get(16)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(16)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(18)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(18)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(19)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(19)).getHouseCount() + option);
										System.out.println(option + " Houses built!");
										System.out.println("Money left: " + secondPlayer.playerAccount);

									}

									break;

								}

								if (option == 4 && secondPlayer.monopolyGroups[4] == true) {

									System.out.println("How many houses would you like to buy for your monopoly?\n"
											+ "Houses are $150 each, so it will be $450 to get one on all three properties\n"
											+ "You can own up to five. You currently have "
											+ ((PropertyCard) Monopoly.gameBoard.get(21)).getHouseCount()
											+ " on each property in this monopoly.\n"
											+ "Type a number (0, 1, 2, 3, 4, 5)");

									option = (int) scanner.nextInt();

									if (option * 450 >= secondPlayer.playerAccount) {
										break;
									}

									if (option == 0) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(21)).getHouseCount() > 5) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(21)).getHouseCount() <= 5) {
										secondPlayer.playerAccount -= 450 * option;

										((PropertyCard) Monopoly.gameBoard.get(21)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(21)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(23)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(23)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(24)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(24)).getHouseCount() + option);
										System.out.println(option + " Houses built!");
										System.out.println("Money left: " + secondPlayer.playerAccount);

									}

									break;

								}

								if (option == 5 && secondPlayer.monopolyGroups[5] == true) {

									System.out.println("How many houses would you like to buy for your monopoly?\n"
											+ "Houses are $150 each, so it will be $450 to get one on all three properties\n"
											+ "You can own up to five. You currently have "
											+ ((PropertyCard) Monopoly.gameBoard.get(26)).getHouseCount()
											+ " on each property in this monopoly.\n"
											+ "Type a number (0, 1, 2, 3, 4, 5)");

									option = (int) scanner.nextInt();

									if (option * 450 >= secondPlayer.playerAccount) {
										break;
									}

									if (option == 0) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(26)).getHouseCount() > 5) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(26)).getHouseCount() <= 5) {
										secondPlayer.playerAccount -= 450 * option;

										((PropertyCard) Monopoly.gameBoard.get(26)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(26)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(27)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(27)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(29)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(29)).getHouseCount() + option);
										System.out.println(option + " Houses built!");
										System.out.println("Money left: " + secondPlayer.playerAccount);

									}

									break;

								}

								if (option == 6 && secondPlayer.monopolyGroups[6] == true) {

									System.out.println("How many houses would you like to buy for your monopoly?\n"
											+ "Houses are $200 each, so it will be $600 to get one on all three properties\n"
											+ "You can own up to five. You currently have "
											+ ((PropertyCard) Monopoly.gameBoard.get(31)).getHouseCount()
											+ " on each property in this monopoly.\n"
											+ "Type a number (0, 1, 2, 3, 4, 5)");

									option = (int) scanner.nextInt();

									if (option * 600 >= secondPlayer.playerAccount) {
										break;
									}

									if (option == 0) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(31)).getHouseCount() > 5) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(31)).getHouseCount() <= 5) {
										secondPlayer.playerAccount -= 600 * option;

										((PropertyCard) Monopoly.gameBoard.get(31)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(31)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(32)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(32)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(34)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(34)).getHouseCount() + option);
										System.out.println(option + " Houses built!");
										System.out.println("Money left: " + secondPlayer.playerAccount);

									}

									break;

								}

								if (option == 7 && secondPlayer.monopolyGroups[7] == true) {

									System.out.println("How many houses would you like to buy for your monopoly?\n"
											+ "Houses are $200 each, so it will be $400 to get one on both properties\n"
											+ "You can own up to five. You currently have "
											+ ((PropertyCard) Monopoly.gameBoard.get(37)).getHouseCount()
											+ " on each property in this monopoly.\n"
											+ "Type a number (0, 1, 2, 3, 4, 5)");

									option = (int) scanner.nextInt();

									if (option * 400 >= secondPlayer.playerAccount) {
										break;
									}

									if (option == 0) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(37)).getHouseCount() > 5) {
										break;
									}

									if (option + ((PropertyCard) Monopoly.gameBoard.get(37)).getHouseCount() <= 5) {
										secondPlayer.playerAccount -= 400 * option;

										((PropertyCard) Monopoly.gameBoard.get(37)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(37)).getHouseCount() + option);
										((PropertyCard) Monopoly.gameBoard.get(39)).setHouseCount(
												((PropertyCard) Monopoly.gameBoard.get(39)).getHouseCount() + option);
										System.out.println(option + " Houses built!");
										System.out.println("Money left: " + secondPlayer.playerAccount);

									}

									break;

								}

								else if (option == 8) {

									break;

								}
							}
						}

						
					}

				}

			}
			
			System.out.println(secondPlayer.playerName + " 's ending balance is " + secondPlayer.playerAccount + "\n");

			System.out.println("---------------------------------- \n");

			}
		scanner.close();

	}

public static void chance(Player p1, Player p2) {

	int n = (int) ((Math.random() * 10) + 1);

	if (n == 1) {

		System.out.println("You have received a Get Out of Jail Free Card!");
		p1.getOutOfJailFree++;
		System.out.println("You now have " + p1.getOutOfJailFree + "Get Out of Jail Free Cards!");
	}
	if (n == 2) {
		System.out.println("Advance to Illinois Avenue!");
		Monopoly.landOnSpace(p1, p2, 24);
	}
	if (n == 3) {
		System.out.println("Advance to Go!");
		Monopoly.landOnSpace(p1, p2, 0);
	}
	if (n == 4) {
		System.out.println("Go back three spaces!");
		Monopoly.landOnSpace(p1, p2, p1.position - 3);
	}
	if (n == 5) {
		System.out.println("Poor tax! Lose $15.");
		p1.playerAccount -= 15;
		System.out.println(p1.playerName + " now has $" + p1.playerAccount);
	}
	if (n == 6) {
		System.out.println("Take a ride on the reading! Advance to the reading railroad.");
		Monopoly.landOnSpace(p1, p2, 5);
	}
	if (n == 7) {
		System.out.println("Advance to St. Charles Place!");
		Monopoly.landOnSpace(p1, p2, 11);

	}
	if (n == 8) {
		System.out.println("Go to Jail!");
		Monopoly.landOnSpace(p1, p2, 30);
	}
	if (n == 9) {
		System.out.println("Bank pays you dividend of $50!");
		p1.playerAccount += 50;
		System.out.println(p1.playerName + " now has $" + p1.playerAccount);
	}
	if (n == 10) {
		System.out.println("Your building loan matures! Collect $100.");
		p1.playerAccount += 100;
		System.out.println(p1.playerName + " now has $" + p1.playerAccount);
	}
}

public static void communityChest(Player p1, Player p2) {

	int n = (int) ((Math.random() * 10) + 1);

	if (n == 1 || n == 4) {

		System.out.println("You have received a Get Out of Jail Free Card!");
		p1.getOutOfJailFree++;
		System.out.println("You now have " + p1.getOutOfJailFree + " Get Out of Jail Free Cards!");
	}
	if (n == 2) {
		System.out.println("Advance to Boardwalk!");

		Monopoly.landOnSpace(p1, p2, 40);
	}
	if (n == 3) {
		System.out.println("Advance to Go!");
		Monopoly.landOnSpace(p1, p2, 0);
	}

	if (n == 5) {
		System.out.println("Life insurance matures. Collect $100!");
		p1.playerAccount += 100;
		System.out.println(p1.playerName + " now has $" + p1.playerAccount);
	}
	if (n == 6) {

		System.out.println("Won a beauty contest! Collect $10!");
		p1.playerAccount += 10;
		System.out.println(p1.playerName + " now has $" + p1.playerAccount);
	}
	if (n == 7) {
		System.out.println("Hospital fee, pay $100!");
		p1.playerAccount -= 100;
		System.out.println(p1.playerName + " now has $" + p1.playerAccount);

	}
	if (n == 8) {
		System.out.println("Go to Jail!");
		Monopoly.landOnSpace(p1, p2, 30);
	}
	if (n == 9) {
		System.out.println("Bank error in your favor, collect $200!");
		p1.playerAccount += 200;
		System.out.println(p1.playerName + " now has $" + p1.playerAccount);
	}
	if (n == 10) {
		System.out.println("Sale of stock! Collect $50");
		p1.playerAccount += 50;
		System.out.println(p1.playerName + " now has $" + p1.playerAccount);
	}
}

public static void landOnSpace(Player p1, Player p2, int position) {

	p1.monopolyCheck();
	p2.monopolyCheck();

	if (Monopoly.returnType(position) == "Property") {
		System.out.println("You have landed on " + Monopoly.gameBoard.get(position).propertyName());

		if (!Monopoly.bankProperties.contains(Monopoly.gameBoard.get(position))) {

			if (p1.playerProperties.contains(Monopoly.gameBoard.get(position))) {
				System.out.println("Property is already owned!");
			} else {
				System.out.println("Property is owned by the other player! You must pay rent!");
				p1.playerAccount -= ((PropertyCard) Monopoly.gameBoard.get(position)).getRent();
				p2.playerAccount += ((PropertyCard) Monopoly.gameBoard.get(position)).getRent();
				System.out.println(p1.playerName + " has paid $"
						+ ((PropertyCard) Monopoly.gameBoard.get(position)).getRent() + " to " + p2.playerName);
			}
		}

		if (Monopoly.bankProperties.contains(Monopoly.gameBoard.get(position))) {

			System.out.println("Would you like to buy " + Monopoly.gameBoard.get(position).propertyName() + " for $"
					+ ((PropertyCard) Monopoly.gameBoard.get(position)).cost() + "? Y/N");
			String response = null;

			while (true) {

				response = scanner.next();

				if (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("N")) {
					break;
				}
			}

			if (response.equalsIgnoreCase("Y")
					&& p1.playerAccount < ((PropertyCard) Monopoly.gameBoard.get(position)).cost()) {
				System.out.println("Not enough money!");
			}

			if (response.equalsIgnoreCase("Y")
					&& p1.playerAccount >= ((PropertyCard) Monopoly.gameBoard.get(position)).cost()) {

				System.out.println("Property has been purchased!");
				p1.playerProperties.add((PropertyCard) Monopoly.gameBoard.get(position));
				Monopoly.bankProperties.remove(Monopoly.gameBoard.get(position));
				p1.playerAccount -= (((PropertyCard) Monopoly.gameBoard.get(position)).cost());
			}

		}

	}

	if (Monopoly.returnType(position) == "BonusOrPenalty") {
		System.out
				.println("You have landed on " + ((PenaltyBonusSpace) Monopoly.gameBoard.get(position)).getName());

		PenaltyBonusSpace space = (PenaltyBonusSpace) Monopoly.gameBoard.get(position);
		if (space.getPenaltyOrBonus() <= 0) {
			p1.playerAccount += space.getPenaltyOrBonus();
			System.out.println("Penalty! You have lost $" + Math.abs(space.getPenaltyOrBonus()));
		} else {
			p1.playerAccount += space.getPenaltyOrBonus();
			System.out.println("Bonus! You have gained $" + Math.abs(space.getPenaltyOrBonus()));
		}

	}

	if (Monopoly.returnType(position) == "Chance") {
		System.out.println("You have landed on chance! A random card will be drawn.");
		chance(p1, p2);
	}

	if (Monopoly.returnType(position) == "CommunityChest") {
		System.out.println("You have landed on chance! A random card will be drawn.");
		communityChest(p1, p2);
	}
	if (Monopoly.returnType(position) == "GoToJail") {
		System.out.println("You are in jail! Turn is over.");
		p1.jailCounter = 3;
		p1.goJail();
	}
	


}

	}
