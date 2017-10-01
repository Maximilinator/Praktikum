package SwingGUI.adressen;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class LocalWindowAdapter extends WindowAdapter {

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
	}
}
