package day3;

import javax.swing.JOptionPane;

public class Quiz_Game {
	public static void main(String[] a){
		int correct = 0;
		int wrong = 0;
		
		JOptionPane.showMessageDialog(null, "Welcome to the Quiz Game where we quiz you!");
		String ans1 = JOptionPane.showInputDialog("What is the name of this camp?");
		String ans2 = JOptionPane.showInputDialog("What is the name of code I am using to make this game?");
		String ans3 = JOptionPane.showInputDialog("Is Java cool and fun?");
		String ans4 = JOptionPane.showInputDialog("Is this a question?");
		String ans5 = JOptionPane.showInputDialog("Do you think you got all the questions right?");
		
		if(ans1.equalsIgnoreCase("The League of Amazing Programmers")){
			correct++;
		}
		else{
			wrong++;
		}
		if(ans2.equalsIgnoreCase("Java")){
			correct++;
		}
		else{
			wrong++;
		}
		if(ans3.equalsIgnoreCase("Yes")){
			correct++;
		}
		else{
			wrong++;
		}
		if(ans4.equalsIgnoreCase("Yes")){
			correct++;
		}
		else{
			wrong++;
		}
		if(ans5.equalsIgnoreCase("Yes")){
			correct++;
		}
		else{
			wrong++;
		}
		
		if(correct==5){
			JOptionPane.showMessageDialog(null, "Congrats you got a perfect score!");
		}
		else{
			JOptionPane.showMessageDialog(null, "You got " + correct + " correct and " + wrong + " wrong!");
		}
		
	}

}
