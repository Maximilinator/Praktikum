package geometrie;

public class Parallelogramm extends Viereck {

	double wertX;
	double hoehe;

	public Parallelogramm(double a, double b, int x) {
		seiteA = a;
		seiteB = b;
		alpha = x;

		wertX = (alpha / 360) * Math.PI * 2;
		hoehe = Math.sin(wertX) * seiteA;
	}

	@Override
	public String toString() {
		return "Form: Parallelogramm\n" + "Seite a = " + seiteA + " cm\n" + "Seite b = " + seiteB + " cm\n"
				+ "Winkel alpha = " + alpha + " grad\n" + "Flächeninhalt: " + flaecheninhalt() + " cm^2\n" + "Umfang: "
				+ umfang() + " cm\n";
	}

	@Override
	public double umfang() {
		return 2 * (seiteA + seiteB);
	}

	@Override
	public double flaecheninhalt() {
		return seiteB * hoehe;
	}

}
