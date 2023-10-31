package _02_boolean._3_game_over;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GameOver {
	
	public static void main(String[] args) {

		boolean gameOver = false;
		JFrame frame = new JFrame("");
		frame.setSize(0, 0);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		String prompt = "Would you like to keep playing?  y/n";
		
		// 1. Ask the user if the game is over and save their answer.
		
		// 2. If they answer "yes" change gameOver to true.
		
		// 3. Surround steps 1-2 in a while loop that runs as long as
		//    gameOver is false. Hint: Use the ! operator.
		
		// 4. Tell the user the game is over outside the while loop.
		while (gameOver == false) {
			String keepPlaying = JOptionPane.showInputDialog(prompt);
			if (keepPlaying.startsWith("n")) {
				gameOver = true;
			}
		}
	}

}