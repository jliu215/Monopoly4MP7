public class Dice extends Player{
	public int getNumber1() {
		int rollNumber1 = (int) (Math.random()*6 + 1);
		return rollNumber1;
	}
	public int getNumber2() {
		int rollNumber2 = (int) (Math.random()*6 + 1);
		return rollNumber2;
	}
	
	
	public int rollDie (Player player, Dice dice) {
		super.dice1 = dice.getNumber1();
		super.dice2 = dice.getNumber2();
		int rollNumber = super.dice1 + super.dice2;
		return rollNumber;
	}
		public boolean rollDouble(Player player) {
			if (player.dice1 == player.dice2) {
				player.doubleCount --;
				if (player.doubleCount == 0) {
					player.jailCounter = 3;
					player.doubleCount = 3;
			}
				return true;
			} else {
				player.doubleCount = 3;
				return false;
			}
		}
		public boolean tripleDouble(Player player) {
			if (player.jailCounter == 3) {
				return true;
			}
			return false;
		}
}