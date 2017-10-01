package haustiere;

public class Katze extends Haustier {

	@Override
	public String toString() {
		return " Katze namens " + getName();
	}

	@Override
	public String tierlaut() {

		return "Miau!";
	}
}
