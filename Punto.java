package Proyecto1_TDP;

public class Punto {
	private int x;
	private int y;
	
	public Punto(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public String toString() {
		return "( "+x+" ; "+y+" )";
	}
}
