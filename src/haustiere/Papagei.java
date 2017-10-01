package haustiere;

public class Papagei extends Haustier {

	@Override
	public String toString() {
		return "n Papagei namens " + getName();
	}

	@Override
	public String tierlaut() {
		return "Hallo, wie geht's dir?";
	}

}
