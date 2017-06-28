package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it");
		// Get the user to enter an adjective
		String ans1 = JOptionPane.showInputDialog("Enter a adjective");
		// Get the user to enter a type of liquid
		String ans2 = JOptionPane.showInputDialog("Enter a type of liquid");
		// Get the user to enter a body part
		String ans3 = JOptionPane.showInputDialog("Enter a body part");
		// Get the user to enter a verb
		String ans4 = JOptionPane.showInputDialog("Enter a verb");
		// Get the user to enter a place
		String ans5 = JOptionPane.showInputDialog("Enter a place");
		// Fit the user's words into this sentence, and save it in a String:
		 String sent = "Piranhas are more " + ans1 + " during the day, so cross the river at night. Piranhas are attracted to fresh " + ans2 + " and will most likely take a bite out of your " + ans3 + " if you " + ans4 + ". Whatever you do, if you have an open wound, try to find another way to get back to the " + ans5 + ". Good luck!";
		
		JOptionPane.showMessageDialog(null, sent);
		// Make a pop-up for the final story. You can use \n to go to the next line.
		

	}
}

