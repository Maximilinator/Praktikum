package SwingGUI.adressen;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SwingApp2 extends JFrame {

	private static final long serialVersionUID = 1L;

	public SwingApp2() {
		super("Erste Anwendung");

		addWindowListener(new LocalWindowAdapter());

		Anwendung appl = new Anwendung();

		JMenu menuData = new JMenu("Datei");
		JMenu menuGeometry = new JMenu("Geometrie");
		JMenu menuPets = new JMenu("Haustiere");

		JMenuBar mBar = new JMenuBar();
		
		mBar.add(menuData);
		menuData.add(createMenuItem("Anmelden", appl, null));
		menuData.addSeparator();
		menuData.add(createMenuItem("Info...", appl, null));
		menuData.addSeparator();
		menuData.add(createMenuItem("Beenden", appl, null));

		mBar.add(menuGeometry);
		menuGeometry.add(createMenuItem("Rechteck", appl, null));
		menuGeometry.addSeparator();
		menuGeometry.add(createMenuItem("Dreieck", appl, null));
		menuGeometry.addSeparator();
		menuGeometry.add(createMenuItem("Parallelogramm", appl, null));
		menuGeometry.addSeparator();
		menuGeometry.add(createMenuItem("Kreis", appl, null));
		setJMenuBar(mBar);

		mBar.add(menuPets);
		menuPets.add(createMenuItem("Haustiere", appl, "./gifs/11.gif"));

		setSize(500, 300);
		setVisible(true);
	}

	JMenuItem createMenuItem(String label, Anwendung appl, String path) {
		JMenuItem item = new JMenuItem(label);
		item.addActionListener(appl);
		item.setIcon(new ImageIcon(path));
		return item;
	}

}
