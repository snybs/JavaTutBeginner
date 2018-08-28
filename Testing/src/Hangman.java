/*
 * todo:
 * 1. actionlistener for text field
 */

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Hangman extends JFrame {
	
	private JButton buttonStart,buttonReset;
	private JLabel guessTheWord;
	private JTextField guessedLetter;
	
	private int minLetter = 4;
	
	public Hangman() {
		createUI();
		
		
		//set a default close action
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set a title
		setTitle("Hangman");
		//setting frame size from AWT
		setSize(new Dimension(500, 400));
		setResizable(false);
		
		//control size so that it depends on the number of sub components with pack.
		//pack();
		
		//set the start position
		setLocationRelativeTo(null);

	}
	
	private void createUI() {
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		guessTheWord = new JLabel();
		guessTheWord.setPreferredSize(new Dimension(200,30));
		guessTheWord.setText("Gissa ordet");
		panel.add(guessTheWord);
		
		buttonStart = new JButton();
		buttonStart.setText("Start");
		panel.add(buttonStart);
		
		buttonReset = new JButton();
		buttonReset.setText("Reset");
		panel.add(buttonReset);
		
		guessedLetter = new JTextField(1);
		//guessedLetter.setBounds(250, 250, 30, 30);
		panel.add(guessedLetter);
		
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
