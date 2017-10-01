package geometrie2D;

public class Rechteck extends Viereck implements Form {
	
	public Rechteck(Punkt ol, Punkt ur) {
		super(ol, new Punkt(ol.x, ur.y), ur, new Punkt(ur.x, ol.y));
	}

	@Override
	public double umfang() {
		return (a.y - b.y) + (d.y - c.y) + (d.x - a.x) + (b.x - c.x);
	}

	@Override
	public double flaecheninhalt() {
		return (a.y - b.y) * (c.x - b.x);
	}
}
