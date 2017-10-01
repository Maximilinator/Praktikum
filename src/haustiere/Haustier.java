package haustiere;

public abstract class Haustier {
	private String name;
	private String charakter;

	public abstract String tierlaut();

	public String getName() {
		return name;
	}
	
	public String getCharakter() {
		return charakter;
	}
	
	public void setCharakter(String charakter) {
		this.charakter = charakter;
	}

	public void setName(String name) {
		this.name = name;
	}
}
