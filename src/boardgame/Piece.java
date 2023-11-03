package boardgame;

public class Piece {
	protected Position position; 
	private Board board; 
	
	public Piece(Board board) {
		this.board = board; 
		position = null; //java já deixa por padrão nulo se eu n colcoar
	}
	
	protected Board getBoard() {
		return board;
	}
}
