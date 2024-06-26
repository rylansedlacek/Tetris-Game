package main;
import javax.swing.JFrame;

public class Main {
	public static void main (String[] args) {
		
		JFrame window = new JFrame("Tetris Game");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		
		GamePanel thePanel = new GamePanel();
		window.add(thePanel);
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true); //see the window now
		thePanel.launchGame();
	}
}
