package geometrie;

public class Quadrat extends Rechteck {

	public Quadrat(double a) {
		super(a, a);
	}

	@Override
	public String toString() {
		return "Form: Quadrat\n" + "Seite a = " + getSeiteA() + " cm\n" + "Flächeninhalt: " + flaecheninhalt()
				+ " cm^2\n" + "Umfang: " + umfang() + " cm\n";
	}
}
