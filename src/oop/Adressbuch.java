package oop;

import java.util.Scanner;

public class Adressbuch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Person[] personen = new Person[10];
		byte i = 0;
		
		do {
			personen[i] = readPerson(sc);
			i++;
			System.out.print("Möchtest Du noch weitere Personen eingeben? ");
		} while (!"Nein".equalsIgnoreCase(sc.nextLine()));

		for (int j = 0; j < i; j++) {
			System.out.println("----------Steckbrief----------");
			System.out.println(personen[j]);
		}

		sc.close();
	}

	private static Person readPerson(Scanner sc) {

		System.out.print("Name: ");
		String name = sc.nextLine();
		Person person = new Person();
		person.setName(name);

		System.out.print("Geschlecht: ");
		String geschlecht = sc.nextLine();
		person.setGeschlecht(geschlecht);
		
		while (true) {
			try {
				System.out.print("Geburtsjahr: ");
				String geburtsjahr = sc.nextLine();
				person.setGeburtsjahr(Integer.parseInt(geburtsjahr));
				break;			
			} catch(NumberFormatException e) {
				System.out.println("Du hast kein Jahr angegeben!!!! :^(");
			}
		}

		System.out.print("Hobbies: ");
		String hobby = sc.nextLine();
		person.setHobby(hobby);

		System.out.print("Wohnort: ");
		String wohnort = sc.nextLine();
		person.setWohnort(wohnort);

		return person;

	}
}

class Person {

	private String name;
	private String geschlecht;
	private int geburtsjahr;
	private String hobby;
	private String wohnort;

	@Override
	public String toString() {

		return "Name: " + getName() + "\n" + "Geschlecht: " + getGeschlecht() + "\n" + "Geburtsjahr: "
				+ getGeburtsjahr() + "\n" + "Wohnort: " + getWohnort() + "\n" + "Hobbies: " + getHobby() + "\n";
	}

	public int getGeburtsjahr() {
		return geburtsjahr;
	}

	public void setGeburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}

	public String getWohnort() {
		return wohnort;
	}

	public void setWohnort(String wohnort) {
		this.wohnort = wohnort;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}

	public void setName(String neuerName) {
		name = neuerName;
	}

	public String getName() {
		return name;
	}
}
