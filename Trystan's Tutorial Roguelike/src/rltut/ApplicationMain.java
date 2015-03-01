package rltut;

import javax.swing.JFrame;
import asciiPanel.AsciiPanel;
import java.awt.event.KeyEvent;
import java.awt.Event.KeyListener;
import rltut.screens.Screen;
import rltut.screens.StartScreen;

public class ApplicationMain extends JFrame {
	private static final long serialVersionUID = 1111111L;
	
	private AsciiPanel terminal;
	
	public ApplicationMain(){
		super();
		terminal = new AsciiPanel();
		terminal.write("rl tutorial", 1, 1);
		add(terminal);
		pack();
	}
	
	public static void main(String[] args) {
		ApplicationMain app = new ApplicationMain();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}