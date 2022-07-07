package boardgame;

public class Board {
	
	//ATTRIBUTES
	private int rows;
	private int columns;
	
	//ASSOCIATIONS
	private Piece[][] pieces;
	
	//CONSTRUCTOR

	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	//METHODS
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	
	
}
