public class Visitor {
	private int x;
	private int y;
	private char simbol = 'V';

	public Visitor (int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setPosition(int _x, int _y) {
		x = _x;
		y = _y;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public char getSimbol() {
		return simbol;
	}
}