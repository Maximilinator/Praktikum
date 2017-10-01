package geometrie;

import static mathUtilities.MathUtilities.*;

public class Dreieck extends Form {

	private double seiteA;
	private double seiteB;
	private double alpha;

	private double wertX;
	private double hoehe;
	private double seiteC;

	public Dreieck(double alpha, double a, double b) {
		this.alpha = alpha;
		seiteA = a;
		seiteB = b;

		wertX = (alpha / 360) * Math.PI * 2;
		hoehe = Math.sin(wertX) * seiteA;
		seiteC = Math.sqrt(sqr(hoehe) + sqr(seiteB - Math.cos(wertX) * seiteA));
	}


	@Override
	public String toString() {
		return "Form: Dreieck\n" + "Winkel alpha = " + alpha + " grad\n" + "Seite a = " + seiteA + " cm\n"
				+ "Seite b = " + seiteB + " cm\n" + "Flächeninhalt: " + flaecheninhalt() + "\n" + "Umfang: " + umfang()
				+ "\n";
	}

	@Override
	public double umfang() {
		return seiteA + seiteB + seiteC;
	}

	@Override
	public double flaecheninhalt() {
		return (seiteB * hoehe) / 2;
	}
}
