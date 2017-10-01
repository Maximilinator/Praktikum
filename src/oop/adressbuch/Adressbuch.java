package oop.adressbuch;

import java.util.ArrayList;
import java.util.Scanner;

public class Adressbuch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Person> personen = new ArrayList<Person>(10);

		do {
			personen.add(readPerson(sc));
			System.out.print("Möchtest Du noch weitere Personen eingeben? ");
		} while (!"Nein".equalsIgnoreCase(sc.nextLine()));

		for (int j = 0; j < personen.size(); j++) {
			System.out.println("----------Steckbrief----------");
			System.out.println(personen.get(j));
		}

		sc.close();

	}
	
	private static Adresse readAdresse(Scanner sc) {
		String strasse = sc.nextLine();
		String hausnummer = sc.nextLine();
		String postleitzahl = sc.nextLine();
		String ort = sc.nextLine();
		Adresse adresse = new Adresse(ort, strasse, postleitzahl, hausnummer);
		
		return adresse;
	}
	
	private static Person readPerson(Scanner sc) {
		System.out.print("Name: ");
		String name = sc.nextLine();
		Person person = new Person();
		person.setName(name);

		System.out.println("Adresse: ");
		Adresse adresse = readAdresse(sc);
		person.setAdresse(adresse);

		return person;
	}
}

