package SwingGUI;

import javax.swing.*;
import java.awt.event.*;

public class SwingGUI2 extends JFrame {
	
	public SwingGUI2() {
		super("Eine Anwendung");
		
		addWindowListener(new MyWindowAdapter());
		
		setSize(300,300);
		System.out.println(Thread.currentThread().getName() +": Vor setVisible true");
		setVisible(true);
		System.out.println(Thread.currentThread().getName() +": Nach setVisible true");
	}
	
	public static void main (String[] args) {
		new SwingGUI2();
	}
}

class MyWindowAdapter extends WindowAdapter {
	
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println(Thread.currentThread().getName() +": Window Activated");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println(Thread.currentThread().getName() +": Window Deactivated");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println(Thread.currentThread().getName() +": Window Deiconified");
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		System.out.println(Thread.currentThread().getName() +": Window GainedFocus");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println(Thread.currentThread().getName() +": Window Iconified");
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		System.out.println(Thread.currentThread().getName() +": Window LostFocus");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println(Thread.currentThread().getName() +": Window Opened");
	}

	@Override
	public void windowStateChanged(WindowEvent e) {
		System.out.println(Thread.currentThread().getName() +": Window StateChanged");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println(Thread.currentThread().getName() +": Fenster wurde geschlossen!");
	}

	public void windowClosing (WindowEvent e) {
		System.out.println(Thread.currentThread().getName() +": Fenster wird geschlossen!");
		System.exit(0);
	}
}