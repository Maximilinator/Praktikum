package geometrie2D;

public class Uebung3 {

	public static void main(String[] args) {

		Punkt punkt1 = new Punkt(3.5, 4.5);
		Punkt punkt2 = new Punkt(2.5, 6.5);
		Punkt punkt3 = new Punkt(1.5, -1.5);
		Punkt punkt4 = new Punkt(2.0, 14.7);
		Punkt punkt5 = new Punkt(14.7, 2.0);
		
		Strecke strecke1 = new Strecke(punkt1, punkt2);
		Rechteck rechteck = new Rechteck(punkt5, punkt4);
				
		System.out.println(punkt1);
		System.out.println("Punkt 3:" + punkt3);
		System.out.println("Strecke Nr.1:" + strecke1);
		strecke1 = strecke1.verschieben(punkt3);
		System.out.println("neue Strecke Nr.1:" + strecke1);
		System.out.println("Flächeninhalt: " + rechteck.flaecheninhalt());
		System.out.println("Umfang: " + rechteck.umfang());
		System.out.println("Punkt 4: " + punkt4);
		System.out.println("Punkt 5: " + punkt5);
	}


}
