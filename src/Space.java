/**
 * Simple class that represents a row and a column, with simple getters and setters for both
 * @author Osvaldo
 */

public class Space {
	private int row, col;
	
	/**
	 * The constructor that will set up the object to store a row and column
	 * 
	 * @param row
	 * @param col
	 */

	public Space(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public static void main(String[] args) {
	Space one = new Space(3,4);
	Space two = new Space(1,6);
	two.setRow(two.getRow()+1);
	two.setCol(two.getCol()-1);
	System.out.println("one r: " + one.getRow() + ", c: " + one.getCol());
	System.out.println("two r: " + two.getRow() + ", c: " + two.getCol());

	}
}
