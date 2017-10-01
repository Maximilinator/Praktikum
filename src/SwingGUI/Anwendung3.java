package SwingGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Anwendung3 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent event) {
		String cmd = event.getActionCommand();
		
		switch(cmd) {
		case "Info... (N)":
			handleInfo();
			break;
		case "Beenden (B)":
			handleQuit();
		default:
			System.out.println(cmd + " ist ein unbekannter Befehl!");
		}
		
	}

	private void handleQuit() {
		int reply = JOptionPane.showConfirmDialog(null, "Willst du wirklich Schluss machen?", "Beenden?", JOptionPane.YES_NO_OPTION);
		if (reply == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	private void handleInfo() {
		JOptionPane.showMessageDialog(null, "Guten Tag!" + " - Ich bin Ihr drittes SWING Programm");
	}

}
