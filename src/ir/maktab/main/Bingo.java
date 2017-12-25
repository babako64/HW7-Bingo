package ir.maktab.main;

import java.util.Random;

import ir.maktab.card.Card;
import ir.maktab.player.Player;

public class Bingo {
	private Player[] players;
	/**
	 * Bingo constructor
	 * @param players
	 */
	public Bingo(Player[] players) {
		this.players = players;
	}
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		int [][] numbers1= {{10,30,45,66,82},{3,25,11,63,78},{22,4,13,46,90}};
		Card[] cards1 = new Card[1];
		cards1[0] = new Card(numbers1);
		int [][] numbers2= {{19,53,61,32,6},{11,44,56,73,81},{78,31,69,9,23}};
		Card[] cards2 = new Card[1];
		cards2[0] = new Card(numbers2);
		Player[] players = new Player[2];
		players[0] = new Player("player1",cards1);
		players[1] = new Player("player2",cards2);
		Bingo bingo = new Bingo(players);
		Random random = new Random();
		String winners="";
		while(winners.equals("")) {
			
			int number = random.nextInt(90)+1;
			winners = bingo.play(number);
		}
		System.out.println(winners);
	}
	/**
	 * Play bingo game
	 * @param number
	 * @return
	 */
	public String play(int number) {
		
		String winners="";
		
		for(int i=0;i<players.length;i++) {
			players[i].markNumber(number);
			if(players[i].isWinner()) {
				winners +=players[i].getName();
			}
		}
		return winners;
	}
}
