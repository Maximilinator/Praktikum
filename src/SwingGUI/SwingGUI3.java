package SwingGUI;

import javax.swing.*;

import SwingGUI.adressen.Anwendung;

import java.awt.event.*;
import java.net.*;

public class SwingGUI3 extends JFrame {
	
	public SwingGUI3() {
		super("Dritte Anwendung");
		
		addWindowListener(new MyWindowAdapter2());
		
		JMenuBar mBar2 = new JMenuBar();
		JMenu mFile = new JMenu("Datei (D)");
		JMenuItem cmdInfo2 = new JMenuItem("Info... (N)");
		JMenuItem cmdQuit2 = new JMenuItem("Beenden (B)");
		
		mFile.setMnemonic('D');
		cmdInfo2.setMnemonic('N');
		cmdQuit2.setMnemonic('B');
		
		cmdInfo2.setToolTipText("Zeigt Informationen an...");
		cmdQuit2.setToolTipText("Beendet das Programm");
		
		cmdInfo2.setIcon(new ImageIcon("./gifs/15.gif"));
		cmdQuit2.setIcon(new ImageIcon("./gifs/16.gif"));
		
		mBar2.add(mFile);
		mFile.add(cmdInfo2);
		mFile.addSeparator();
		mFile.add(cmdQuit2);
		setJMenuBar(mBar2);
		
		Anwendung3 appl3 = new Anwendung3();
		
		cmdQuit2.addActionListener(appl3);
		cmdInfo2.addActionListener(appl3);
		
		setSize(300, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingGUI3();
	}
}

class MyWindowAdapter2 extends WindowAdapter {
	public void windowClosing (WindowEvent e) {
		System.exit(0);
	}
}

class Anwendung2 implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		
		if (cmd == "Beenden (B)") {
			System.exit(0);
		}
		if (cmd == "Info... (N)") {
			JOptionPane.showMessageDialog(null, "Hallo");
		}
	}
}