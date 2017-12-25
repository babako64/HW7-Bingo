package ir.maktab.player;

import ir.maktab.card.Card;

public class Player {
	private String name;
	private Card[] cards;
	
	/**
	 * Player constructor
	 * @param name
	 * @param cards
	 */
	public Player(String name, Card[] cards ) {
		
		this.name = name;
		this.cards = cards;
	}
	/**
	 * Getter name
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setter name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Getter cards
	 * @return
	 */
	public Card[] getCards() {
		return cards;
	}
	/**
	 * Setter cards
	 * @param cards
	 */
	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	/**
	 * check for is it winner
	 * @return
	 */
	public boolean isWinner() {
		
		int markedNumbers=0;
		
		for(int i=0;i<cards.length;i++) {
			
			for(int x=0;x<cards[i].getNumbers().length;x++) {
				markedNumbers=0;
				for(int y=0;y<cards[i].getNumbers()[0].length;y++) {
					if(cards[i].isMarked(x, y)) {
						markedNumbers++;
					}
					
					if(markedNumbers==cards[i].getNumbers()[0].length) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
	/**
	 * check for number is marked for all cards
	 * 
	 * @param number
	 */
	public void markNumber(int number) {
		
		for(int i=0;i<cards.length;i++) {
			cards[i].markNumber(number);
		}
	}
}
