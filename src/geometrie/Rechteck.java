package geometrie;

public class Rechteck extends Parallelogramm {

	public Rechteck(double a, double b) {
		super(a, b, 90);
	}

	@Override
	public String toString() {
		return "Form: Rechteck\n" + "Seite a = " + seiteA + " cm\n" + "Seite b = " + seiteB + " cm\n"
				+ "Flächeninhalt: " + flaecheninhalt() + " cm^2\n" + "Umfang: " + umfang() + " cm\n";
	}
}
