package snake;
import java.awt.BorderLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class snake extends JFrame {
	
	static JLabel scoreBar = new JLabel();
	
	public static void score() {
		
		int newScore = 5;
		scoreBar.setText(String.valueOf(newScore));
		
	}
	
	public snake() {
		
		setVisible(true);
		setSize(500, 500);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Snake");
		setLocationRelativeTo(null);
		
		add(scoreBar, BorderLayout.SOUTH);
		
	}
	
	public static void main(String[] args) {
		
		new snake();
		score();
		
	}

}
