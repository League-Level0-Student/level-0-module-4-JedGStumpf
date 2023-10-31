package _01_double._2_test_scores;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class grades {

	public static void main(String[] args) {
		JFrame frame = new JFrame("");
		frame.setSize(0, 0);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		String prompt = "Enter your test score or type D for done.";
		boolean moreTests = true;
		String reportCard = "";
		int testTotal = 0;
		double finalGrade = 0.0;
		int tests = 0;
		while (moreTests) {
			String input = JOptionPane.showInputDialog(prompt);
			if (input.startsWith("D")) {
				moreTests = false;
			
			} else {
				double grade = Double.parseDouble(input);
				finalGrade += grade;
				reportCard += "   " + String.valueOf(grade) + "   ";
				testTotal += 1;
			
			
				
			} 
			
			
		}
		
		JOptionPane.showMessageDialog(null, "Final Grade: " + String.valueOf(finalGrade/testTotal) + reportCard);
		
	}

}
