package bishop;

public class TheBishop {
	int start;
	int end;
	int[] startCord;
	int[] endCord;
	
	public TheBishop(int start, int end) {
		this.startCord = new int[2];
		this.endCord = new int[2];
		updateCoordinates(start, end);
	}
	
	public void updatePosition(int start, int end) {
		updateCoordinates(start, end);
	}
	
	private void updateCoordinates(int start, int end) {
		this.start = start;
		this.end = end;
		startCord[0] = start / 8;
		startCord[1] = start % 8;
		endCord[0] = end / 8;
		endCord[1] = end % 8;
	}
	
	public int moves() {
		int moves = 0;
		if (this.start == this.end) {
			moves = 0;
		} else if (!isValid(this.startCord, this.endCord)) {
			moves = -1;
		} else if (isValid(this.startCord, this.endCord) && isOneMove(this.startCord, this.endCord)) {
			moves = 1;
		} else {
			moves = 2;
		}
		return moves;
	}
	
	public boolean isValid(int[] start, int[] end) {
		boolean startWhite;
		boolean endWhite;
		if ( (start[0] % 2 == 0) == (start[1] % 2 == 0) ) {
			startWhite = true;
		} else {
			startWhite = false;
		}
		
		if ( (end[0] % 2 == 0) == (end[1] % 2 == 0) ) {
			endWhite = true;
		} else {
			endWhite = false;
		}
		return startWhite == endWhite;
	}
	
	public boolean isOneMove (int[] start, int[] end) {
		boolean oneMove;
		if ((start[0] - start[1]) == (end[0] - end[1])) {
			oneMove = true;
		} else if ((start[0] + start[1]) == (end[0] + end[1])) {
			oneMove = true;
		} else {
			oneMove = false;
		}
		return oneMove;
	}
}
