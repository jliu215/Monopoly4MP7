import java.util.ArrayList;
import java.util.Scanner;

public class Player {
String playerName;
int position = 0;
int playerAccount = 53320;
int numberOfProperty;
boolean[] rail = new boolean[4];
String winner;
boolean playerBroke = false;
boolean end = false;
Scanner scanner = new Scanner(System.in);
int dice1;
int dice2;
int doubleCount = 3;
int jailCounter;
int numRail;
int jailEndTurn;
ArrayList<PropertyCard> playerProperties = new ArrayList<PropertyCard>();
int getOutOfJailFree = 0;
boolean inJail = false;
boolean[] monopolyGroups = new boolean[8];
String[] monopolyColors = new String[] {"Brown", "Light Blue", "Violet", "Orange",
										"Red", "Yellow", "Green", "Blue"};

public String getPlayer() {
	System.out.println("Enter the player's name");
	String player = scanner.next();
	this.playerName = player;
	return playerName;
}
public void monopolyCheck() {
	
	if (playerProperties.contains(Monopoly.gameBoard.get(1))
			&& playerProperties.contains((Monopoly.gameBoard.get(3)))) {

		monopolyGroups[0] = true;

	}

	if (playerProperties.contains(Monopoly.gameBoard.get(6)) 
			&& playerProperties.contains((Monopoly.gameBoard.get(8))) && 
			playerProperties.contains(Monopoly.gameBoard.get(9))){
				
				monopolyGroups[1] = true;
				
			}
	
	if (playerProperties.contains(Monopoly.gameBoard.get(11)) 
			&& playerProperties.contains((Monopoly.gameBoard.get(13))) && 
			playerProperties.contains(Monopoly.gameBoard.get(14))){
				
				monopolyGroups[2] = true;
				
			}
	
	if (playerProperties.contains(Monopoly.gameBoard.get(16)) 
			&& playerProperties.contains((Monopoly.gameBoard.get(18))) && 
			playerProperties.contains(Monopoly.gameBoard.get(19))){
				
				monopolyGroups[3] = true;
				
			}
	
	if (playerProperties.contains(Monopoly.gameBoard.get(21)) 
			&& playerProperties.contains((Monopoly.gameBoard.get(23))) && 
			playerProperties.contains(Monopoly.gameBoard.get(24))){
				
				monopolyGroups[4] = true;
				
			}
	
	if (playerProperties.contains(Monopoly.gameBoard.get(26)) 
			&& playerProperties.contains((Monopoly.gameBoard.get(27))) && 
			playerProperties.contains(Monopoly.gameBoard.get(29))){
				
				monopolyGroups[5] = true;
				
			}
	
	if (playerProperties.contains(Monopoly.gameBoard.get(31)) 
			&& playerProperties.contains((Monopoly.gameBoard.get(32))) && 
			playerProperties.contains(Monopoly.gameBoard.get(34))){
				
				monopolyGroups[6] = true;
				
			}
	
	if (playerProperties.contains(Monopoly.gameBoard.get(37))
			&& playerProperties.contains((Monopoly.gameBoard.get(39)))) {

		monopolyGroups[7] = true;

	}
	
	
}



public int playerPosition(Player player, int amount) {
	this.position = position + amount;
	if (position > 39) {
		position = player.position - 40;
		playerAccount += 200;
		System.out.println("Go passed! Collect $200.");
	}
	return this.position;
}

public int playerAccount(Player player, int amount){
	this.playerAccount = playerAccount + amount;
	return this.playerAccount;
}

public boolean goJail () {
	if(jailCounter > 0) {
		position = 10;
		return true;
	} 
	return false;
}

}