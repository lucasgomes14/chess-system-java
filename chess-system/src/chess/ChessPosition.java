package chess;

import boardgame.Position;

public class ChessPosition {
	
	//ATTRIBUTES
	private char column;
	private int row;
	
	//CONSTRUCTOR
	public ChessPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiation ChessPosition. Valir values are from a1 to h8. ");
		}
		
		this.column = column;
		this.row = row;
	}
	
	//METHODS	
	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), position.getRow() - 8);
	}
	
	//TOSTRING
	@Override
	public String toString() {
		return "" + column + row;
	}
}
