package familie;

import java.util.ArrayList;
import java.util.Scanner;

import oop.adressbuch.Adresse;
import oop.adressbuch.Person;

public class FamilienRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Person> familie = new ArrayList<Person>(10);

		System.out.println("Bitte geben Sie eine Adresse ein:");
		Adresse adresse = readAdresse(sc);

		System.out.println("Wer wohnt unter dieser Adresse?");
		do {
			Person person = readPerson(sc);
			person.setAdresse(adresse);
			familie.add(person);
			System.out.print("Wohnen dort noch weitere Personen? ");
		} while (!"Nein".equalsIgnoreCase(sc.nextLine()));

		sc.close();

		printAdressListe(familie);

		adresse.setStrasse("Siemensstraﬂe");

		printAdressListe(familie);
	}

	private static void printAdressListe(ArrayList<Person> familie) {
		for (int j = 0; j < familie.size(); j++) {
			System.out.println("----------Adressbuch----------");
			System.out.println(familie.get(j));
		}
	}

	private static Adresse readAdresse(Scanner sc) {
		System.out.print("Straﬂe: ");
		String strasse = sc.nextLine();
		System.out.print("Hausnummer: ");
		String hausnummer = sc.nextLine();
		System.out.print("Postleitzahl: ");
		String postleitzahl = sc.nextLine();
		System.out.print("Ort: ");
		String ort = sc.nextLine();
		Adresse adresse = new Adresse(ort, strasse, postleitzahl, hausnummer);

		return adresse;
	}

	private static Person readPerson(Scanner sc) {
		System.out.print("Name: ");
		String name = sc.nextLine();
		Person person = new Person();
		person.setName(name);

		return person;
	}
}
