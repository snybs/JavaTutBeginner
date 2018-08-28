/*
 * https://www.youtube.com/watch?v=lB0k6HuVgs8&t=14s
 */

import javax.swing.SwingUtilities;

public class Game  {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Hangman().setVisible(true);;
			}
		}
				
		);
		
		/*
		
		JFrame frame = new JFrame();
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.black);
		frame.getContentPane().add(panel);
		
		JButton button = new JButton("This is a button");
		panel.add(button);
		
		JTextField textfield = new JTextField();
		textfield.setPreferredSize(new Dimension(200,15));
		panel.add(textfield);
		
		JButton button2 = new JButton("This is a very long button that we need to add on another row beneath the other button");
		panel.add(button2);
		
		//setting frame size from AWT
		frame.setSize(new Dimension(500, 400));
		//set the start position
		frame.setLocationRelativeTo(null);
		//set a default close action
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set a title
		frame.setTitle("Hangman");
		frame.setVisible(true);
		
		*/
		
		
		
		

	}

}
