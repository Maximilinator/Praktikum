package SwingGUI;

import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;

public class ScrollPaneGUI extends JFrame {

	private static final long serialVersionUID = 1L;

	public ScrollPaneGUI() {
		super ("ScrollPane-Anwendung");
		
		addWindowListener (new LocalWindowAdapter());
		JMenuBar mBar = new JMenuBar();
		JMenu mFile = new JMenu("Datei (D)");
		JMenuItem cmdQuit = new JMenuItem("Beenden (B)");
		
		mFile.setMnemonic('D');
		cmdQuit.setMnemonic('B');
		cmdQuit.setToolTipText("Beendet das Programm");
		cmdQuit.addActionListener(new Anwendung());
		
		mBar.add(mFile);
		mFile.add(cmdQuit);
		setJMenuBar(mBar);

		JScrollPane scrollPane;
		scrollPane = new JScrollPane();
		Icon image = new ImageIcon("./gifs/17.gif");
		JLabel label = new JLabel(image);
		scrollPane.getViewport().add(label);

		JTextArea textarea = new JTextArea();
		scrollPane.getViewport().add (textarea);
		
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());
		topPanel.add(scrollPane, BorderLayout.NORTH);
		getContentPane().add(topPanel);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main (String[] args) {
		new ScrollPaneGUI();
	}
}

class LocalWindowAdapter extends WindowAdapter {
	public void windowClosing (WindowEvent wEvent) {
		System.exit(0);
	}
}

class Anwendung implements ActionListener {
	public void actionPerformed (ActionEvent aEvent) {
		String cmd = aEvent.getActionCommand();
		
		if (cmd == "Beenden (B)")
			System.exit(0);
	}
}