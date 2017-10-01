package haustiere;

public class Hund extends Haustier {

	@Override
	public String toString() {
		return "n Hund namens " + getName();
	}

	@Override
	public String tierlaut() {
		return "Wau Wau!";
	}
}
