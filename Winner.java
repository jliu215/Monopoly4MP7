
public class Winner extends Player{
public void winner(Player player) {
	if (player.playerAccount < 0) {
		player.end = true;
		System.out.println("The winner is " + player);
}
}
}

