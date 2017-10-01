package geometrie2D;

public class Punkt {
	
	public final double x;
	public final double y;
	
	public Punkt(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + "/" + y + ")";
	}

	public Punkt addiere(Punkt p) {
		return new Punkt(x + p.x, y + p.y);
	}
	
}
