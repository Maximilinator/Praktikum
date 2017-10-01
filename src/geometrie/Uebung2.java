package geometrie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Uebung2 {
	public static void main(String[] args) {

		ArrayList<Form> formen = new ArrayList<>(10);

		Scanner sc = new Scanner(System.in);

		String jaNein = "";
		while (!"Nein".equalsIgnoreCase(jaNein)) {
			String eingabeForm = eingabeMitPrompt(sc,
					"Welche Form möchten Sie erschaffen (Rechteck/Parallelogramm/Quadrat/Kreis/Dreieck)? --> ");
			switch (eingabeForm) {
			case "Rechteck":
				Rechteck rechteck = new Rechteck(Math.random() * 20, Math.random() * 20);
				System.out.println(rechteck);
				formen.add(rechteck);
				break;
			case "Parallelogramm":
				Parallelogramm parallelogramm = new Parallelogramm((Math.random() * 30), (Math.random() * 30),
						(int) (Math.random() * 180));
				System.out.println(parallelogramm);
				formen.add(parallelogramm);
				break;
			case "Quadrat":
				Quadrat quadrat = new Quadrat(Math.random() * 20);
				System.out.println(quadrat);
				formen.add(quadrat);
				break;
			case "Kreis":
				Kreis kreis = new Kreis(Math.random() * 10);
				System.out.println(kreis);
				formen.add(kreis);
				break;
			case "Dreieck":
				Dreieck dreieck = new Dreieck(Math.random() * 180, Math.random() * 10, Math.random() * 10);
				System.out.println(dreieck);
				formen.add(dreieck);
				break;
			default:
				System.out.println(
						"Sie müssen sich zwischen einem Rechteck, Quadrat, Kreis, Parallelogramm oder Dreieck entscheiden, alternativ prüfen Sie auf Rechtschreibfehler!");
			}

			jaNein = eingabeMitPrompt(sc, "Wollen Sie noch weitere Formen erstellen? --> ");

		}
		sc.close();

		System.out.println("-----------Iterator-----------");
		printFlaecheninhalt(formen);
		System.out.println("---------for-Schleife---------");
		printUmfang(formen);
	}

	/*
	 * private static void printInfo(ArrayList<Form> formen) { for (int i = 0; i <
	 * formen.size(); i++) { System.out.println("------Info------");
	 * System.out.println("--> " + formen.get(i) + ":"); System.out.println(": " +
	 * formen.get(i).() + " cm\n"); } }
	 */
	private static void printUmfang(ArrayList<Form> formen) {
		for (int i = 0; i < formen.size(); i++) {
			System.out.println("--> " + formen.get(i));
			// System.out.println("Umfang: " + formen.get(i).umfang() + " cm\n");
		}
	}

	private static void printFlaecheninhalt(ArrayList<Form> formen) {
		Iterator<Form> iter = formen.iterator();
		while (iter.hasNext()) {
			Form form = iter.next();
			System.out.println("--> " + form);

		}
	}

	private static String eingabeMitPrompt(Scanner sc, String frage) {
		System.out.print(frage);
		return sc.nextLine();
	}

	private static double doubleEingabeMitPrompt(Scanner sc, String frage) {
		System.out.print(frage);
		double result = sc.nextDouble();
		sc.nextLine();
		return result;
	}
}
