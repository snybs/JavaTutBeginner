import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Hangman extends JFrame {
	
	private JButton buttonStart,buttonReset;
	private JLabel guessTheWord;
	
	private int minLetter = 4;
	
	public Hangman() {
		createUI();		
		
	}
	
	private void createUI() {
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		guessTheWord = new JLabel();
		guessTheWord.setPreferredSize(new Dimension(200,30));
		panel.add(guessTheWord);
		
		buttonStart = new JButton();
	
		
	};
	
	public void drawLeftLeg() {
	}
	
	public void drawRightLeg() {
	}
	
	public void drawBody() {
	}
	
	public void drawLeftArm() {
	}
	
	public void drawRightArm() {
	}
	
	public void drawHead() {
	}
	
	public void drawBase() {
		
	}
	
	public void drawPole() {
		
	}
	
	public void drawPoleArm() {
		
	}
	
	public void drawRope() {
		
	}
	
	

}
