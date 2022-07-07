package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{
	
	//ATTRIBUTES
	private Color color;
	//private int moveCount;

	//CONSTRUCTOR
		public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	//METHODS
	
	public Color getColor() {
		return color;
	}

	/*public int getMoveCount() {
		return moveCount;
	}

	public void setMoveCount(int moveCount) {
		this.moveCount = moveCount;
	}*/
		
}
