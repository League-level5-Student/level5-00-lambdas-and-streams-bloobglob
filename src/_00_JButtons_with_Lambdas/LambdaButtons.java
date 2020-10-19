package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		addNumbers.addActionListener((a)->{
			String s1 = JOptionPane.showInputDialog("Please enter a number:");
			String s2 = JOptionPane.showInputDialog("Please enter another number: ");
			JOptionPane.showMessageDialog(null, "The sum of " + s1 + " and " + s2 + " is " + (Integer.parseInt(s1) + Integer.parseInt(s2)));
		});
		randNumber.addActionListener((a)->{
			String s3 = JOptionPane.showInputDialog("Please enter a number:");
			JOptionPane.showMessageDialog(null, "A random number from 1 to " + s3 + " is " + (new Random().nextInt(Integer.parseInt(s3)+1)));
		});
		String[] jokes = {"What’s the best thing about Switzerland? I don’t know, but the flag is a big plus.", "Why do we tell actors to "
				+ "break a leg? Because every play has a cast.", "Yesterday I saw a guy spill all his Scrabble letters on the road. I asked him, “What’s the word on the street?”"};
		tellAJoke.addActionListener((a)->{
			JOptionPane.showMessageDialog(null, jokes[new Random().nextInt(jokes.length)]);
		});
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
