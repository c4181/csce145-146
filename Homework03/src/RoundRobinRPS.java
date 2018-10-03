/*
 * Written by Christopher Moyer
 */

public class RoundRobinRPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenCircularLinkedList<Player> playerList = new GenCircularLinkedList<Player>();
		
		for(int i=0;i<10;i++)
		{
			Player player = new Player("Player "+i);
			playerList.insert(player);
		}
		
		Player startingPlayer = playerList.getDataAtCurrent();
		Player competingPlayer = playerList.getDataAtCurrent();
		do {
			do {
				playerList.goToNext();
				competingPlayer.compete(competingPlayer, playerList.getDataAtCurrent());
			} 	while(playerList.getDataAtNext()!=competingPlayer);
		
		playerList.goToNext();
		playerList.goToNext();
		competingPlayer = playerList.getDataAtCurrent();
		}while(playerList.getDataAtCurrent()!=startingPlayer);
		
		System.out.println("The tournament is over. Here are the results!");
		playerList.showList();
	}

}
