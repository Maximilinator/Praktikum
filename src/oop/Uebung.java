package oop;

public class Uebung {

	public static void main(String[] args) {
		Hund waldi = new Hund();

		waldi.hunderasse = "Dackel";
		waldi.name = "Waldi";

		System.out.println(waldi.hunderasse);
		System.out.println(waldi.geburtsjahr);
		System.out.println(waldi.name);
	}
}

class Hund {
	String hunderasse;
	int geburtsjahr;
	String name;
	
}











//	private String hunderasse;
//	private int geburtsjahr;
//	private String name;

//	public Hund(String rasse, int year) {
//		hunderasse = rasse;
//		geburtsjahr = year;
//	}
//
//	public void setName(String neuerName) {
//		name = neuerName;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public String getHunderasse() {
//		return hunderasse;
//	}
//
//	public int berechneAlter() {
//		return Calendar.getInstance().get(Calendar.YEAR) - geburtsjahr;
//	}
//}
