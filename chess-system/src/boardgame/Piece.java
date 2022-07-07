package boardgame;

public class Piece {
	
	//ATTRIBUTES
	protected Position position;
	
	//ASSOCIATIONS
	private Board board;	
	
	//CONSTRUCTOR
	public Piece(Board board) {
		position = null;
		this.board = board;
	}
	
	//METHODS
	protected Board getBoard() {
		return board;
	}
	

}
