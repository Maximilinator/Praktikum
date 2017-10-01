package oop.adressbuch;

public class Adresse {

	private String ort;
	private String strasse;
	private String postleitzahl;
	private String hausnummer;

	public Adresse(String ort, String strasse, String postleitzahl, String hausnummer) {
		this.ort = ort;
		this.strasse = strasse;
		this.postleitzahl = postleitzahl;
		this.hausnummer = hausnummer;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getPostleitzahl() {
		return postleitzahl;
	}

	public void setPostleitzahl(String postleitzahl) {
		this.postleitzahl = postleitzahl;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String toString() {
		return strasse + " " + hausnummer + "\n" + postleitzahl + " " + ort + "\n";
	}
}
