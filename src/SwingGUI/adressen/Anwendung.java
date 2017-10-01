package SwingGUI.adressen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import geometrie.Dreieck;
import geometrie.Form;
import geometrie.Kreis;
import geometrie.Parallelogramm;
import geometrie.Rechteck;
import haustiere.Haustier;
import haustiere.Hund;
import haustiere.Katze;
import haustiere.Papagei;
import oop.adressbuch.Person;

public class Anwendung implements ActionListener {

	ArrayList<Person> personen = new ArrayList<>(4);
	ArrayList<Haustier> alleHaustiere = new ArrayList<>(20);
	ArrayList<Form> formen = new ArrayList<>(10);

	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();

		switch (cmd) {
		case "Beenden":
			handleMenuOptionBeenden();
			break;
		case "Info...":
			handleMenuOptionInfo();
			break;
		case "Anmelden":
			handleMenuOptionAnmelden();
			break;
		case "Haustiere":
			handleMenuOptionHaustiere();
			break;
		case "Rechteck":
			handleMenuOptionRechteck();
			break;
		case "Dreieck":
			handleMenuOptionDreieck();
			break;
		case "Parallelogramm":
			handleMenuOptionParallelogramm();
			break;
		case "Kreis":
			handleMenuOptionKreis();
			break;
		}
	}

	private void handleMenuOptionKreis() {
		int reply = JOptionPane.YES_OPTION;
		while (reply == JOptionPane.YES_OPTION) {
			reply = JOptionPane.showConfirmDialog(null, "Wollen Sie einen Kreis erstellen?", null,
					JOptionPane.YES_NO_OPTION);
			if (reply == JOptionPane.NO_OPTION) {
				break;
			} 
			Kreis kreis = new Kreis(Math.random() * 10);
			formen.add(kreis);
			JOptionPane.showMessageDialog(null, kreis);
		}
	}

	private void handleMenuOptionParallelogramm() {
		int reply = JOptionPane.YES_OPTION;
		while (reply == JOptionPane.YES_OPTION) {
			reply = JOptionPane.showConfirmDialog(null, "Wollen Sie ein Parallelogramm erstellen?", null,
					JOptionPane.YES_NO_OPTION);
			if (reply == JOptionPane.NO_OPTION) {
				break;
			}
			Parallelogramm parallelogramm = new Parallelogramm((Math.random() * 30), (Math.random() * 30),
					(int) (Math.random() * 180));
			formen.add(parallelogramm);
			JOptionPane.showMessageDialog(null, parallelogramm);
		}
	}

	private void handleMenuOptionDreieck() {
		int reply = JOptionPane.YES_OPTION;
		while (reply == JOptionPane.YES_OPTION) {
			reply = JOptionPane.showConfirmDialog(null, "Wollen Sie ein Dreieck erstellen?", null,
					JOptionPane.YES_NO_OPTION);
			if (reply == JOptionPane.NO_OPTION) {
				break;
			}
			Dreieck dreieck = new Dreieck(Math.random() * 180, Math.random() * 10, Math.random() * 10);
			formen.add(dreieck);
			JOptionPane.showMessageDialog(null, dreieck);
		}
	}

	private void handleMenuOptionRechteck() {
		int reply = JOptionPane.YES_OPTION;
		while (reply == JOptionPane.YES_OPTION) {
			reply = JOptionPane.showConfirmDialog(null, "Wollen Sie ein Rechteck erstellen?", null,
					JOptionPane.YES_NO_OPTION);
			if (reply == JOptionPane.NO_OPTION) {
				break;
			}
			Rechteck rechteck = new Rechteck(Math.random() * 20, Math.random() * 20);
			formen.add(rechteck);
			JOptionPane.showMessageDialog(null, rechteck);
		}
	}

	private void handleMenuOptionHaustiere() {
		int reply = JOptionPane.showConfirmDialog(null, "Möchten Sie ein Haustier erstellen?", "Haustier",
				JOptionPane.YES_NO_OPTION);
		while (reply == JOptionPane.YES_OPTION) {
			Haustier tier = null;
			String prompt = "";
			String verb = "";
			String answer = JOptionPane.showInputDialog(null, "Welches Haustier möchten Sie erstellen? (Hund/Katze/Papagei)",
					"Hier Tier eingeben");
			if (null == answer) {
				break;
			}
			switch (answer) {
			case "Hund":
				tier = new Hund();
				prompt = "der Hund";
				verb = "macht ";
				break;
			case "Katze":
				tier = new Katze();
				prompt = "die Katze";
				verb = "macht ";
				break;
			case "Papagei":
				tier = new Papagei();
				prompt = "der Papagei";
				verb = "macht ";
				break;
			default:
				JOptionPane.showMessageDialog(null,
						"Sie müssen sich zwischen einem Hund, einer Katze und einem Papagei entscheiden!");
			}
			tier.setName(JOptionPane.showInputDialog(null, "Wie soll " + prompt + " heißen?"));
			tier.setCharakter(JOptionPane.showInputDialog(null, "Welchen Charakter hat ihr Haustier?"));
			JOptionPane.showMessageDialog(null,
					tier.getName() + " (" + tier.getCharakter() + ") " + verb + tier.tierlaut() + "\n");
		}
	}

	private void handleMenuOptionAnmelden() {
		JOptionPane.showMessageDialog(null, "Prank!!!" + " - Haha, reingefallen xD");
	}

	private void handleMenuOptionInfo() {
		JOptionPane.showMessageDialog(null, "Guten Tag!" + " - Ich bin Ihr erstes SWING Programm");
	}

	private void handleMenuOptionBeenden() {
		int reply = JOptionPane.showConfirmDialog(null, "Wirklich?!" + " - Willst du schon gehen??!",
				"Wirklich beenden?", JOptionPane.YES_NO_OPTION);
		if (reply == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Ich lass dich aber nicht gehen!", "NEIN", 0);
			JOptionPane.showMessageDialog(null, "Du bleibst hier!!", "NEEEEEIIIN", 0);
			JOptionPane.showMessageDialog(null, "Nagut, mir fällt nix mehr ein...", "Tschüss", 0);
			System.exit(0);
		}
	}
}
