package geometrie;

public class Kreis extends Form {

	private double radius;

	public Kreis(double r) {
		radius = r;
	}

	@Override
	public String toString() {
		return "Form: Kreis\n" + "Radius r = " + radius + " cm\n" + "Flächeninhalt: " + flaecheninhalt() + " cm^2\n"
				+ "Umfang: " + umfang() + " cm\n";
	}

	@Override
	public double umfang() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double flaecheninhalt() {
		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}
}
