package prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Primzahl {

	public static void main(String[] args) {
		System.out.println("----------Primzahlen----------");

		int rc = 0;
		while (true) {

			int a = eingabe(rc);

			if (rc == 0) {
				boolean isPrime = true;
				for (int j = 2; j < a; j++) {
					if (a % j == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					System.out.println(a + " ist eine Primzahl!");
				} else {
					System.out.println(a + " ist keine Primzahl!");
				}
				System.out.println("Ende!");
			}
		}
	}

	private static int eingabe(int returnCode) {
		InputStream i = System.in;
		BufferedReader r;
		int zahl = 0;

		r = new BufferedReader(new InputStreamReader(i));

		try {
			String eingabe = r.readLine();
			if ("Exit".equalsIgnoreCase(eingabe)) {
				returnCode = 1;
			}
			zahl = Integer.parseInt(eingabe);
		} catch (IOException e) {
			System.out.println("IOException-Fehler aufgetreten!");
			returnCode = -1;
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException-Fehler aufgetreten!");
			returnCode = -2;
		}
		returnCode = 0;
		return zahl;
	}
}
