package geometrie;

public abstract class Form {

	String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract double umfang();

	public abstract double flaecheninhalt();
}
