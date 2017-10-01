package oop.adressbuch;

import java.util.ArrayList;
import java.util.List;
import haustiere.Haustier;

public class Person {

	private String name;
	private Adresse adresse;

	public List<Haustier> haustiere = new ArrayList<>();

	@Override
	public String toString() {
		return "Name: " + getName() + "\n" + "Adresse: " + "\n" + getAdresse() + "\n";
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public void setName(String neuerName) {
		name = neuerName;
	}

	public String getName() {
		return name;
	}
}
