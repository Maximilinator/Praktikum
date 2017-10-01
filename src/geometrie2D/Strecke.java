package geometrie2D;

import static mathUtilities.MathUtilities.*;

public class Strecke {
	
	public final Punkt punkt1;
	public final Punkt punkt2;

	public Strecke(Punkt punktA, Punkt punktB) {
		punkt1 = punktA;
		punkt2 = punktB;
	}
	
	public String toString() {
		return punkt1 + " <--> " + punkt2;
	}

	public double laenge() {
		return Math.sqrt(sqr(xDifferenz()) + sqr(yDifferenz()));
	}
	
	public Strecke verschieben(Punkt p) {
		return new Strecke(punkt1.addiere(p), punkt2.addiere(p));
	}

	private double yDifferenz() {
		return punkt1.y - punkt2.y;
	}

	private double xDifferenz() {
		return punkt1.x - punkt2.x;
	}
	
}

