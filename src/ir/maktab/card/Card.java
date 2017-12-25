package ir.maktab.card;

public class Card {
	private int[][] numbers;
	private int[][] tempNumbers= new int[3][5]; 
	
	/**
	 * Card Constructor
	 * @param numbers
	 */
	public Card(int[][] numbers ) {
		
		this.numbers = numbers;
	}
	
	public int getNumber(int row, int column) {
		
		return tempNumbers[row][column];
	}
	
	/**
	 * Check card for is it marked or No
	 * @param row
	 * @param column
	 * @return
	 */
	public boolean isMarked(int row, int column) {
		
		return tempNumbers[row][column]==-1?true:false;
	}
	
	/**
	 * Mark card if number exist
	 * @param number
	 */
	public void markNumber(int number) {
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[0].length;j++) {
				
				if(numbers[i][j]==number) {
					
					tempNumbers[i][j]= -1;
				}
				}
			}
	
	}
	
	public int[][] getNumbers(){
		
		return numbers;
	}
}
