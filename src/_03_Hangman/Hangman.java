package _03_Hangman;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Hangman implements KeyListener {
	
	String numb = JOptionPane.showInputDialog("Number:");
	int num = Integer.parseInt(numb);
	Stack<String> game = new Stack<String>();
	String[] guesses;
	String undscore = "";
	
	Random rand = new Random();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JLabel livesLabel = new JLabel();
	JFrame frame = new JFrame();
	//JTextField field = new JTextField();
	int lives = 3;
	String word;
	int wordLength;
	
	void main() {
		
	frame.setVisible(true);
	frame.add(panel);
	panel.add(label);
	panel.add(livesLabel);
	livesLabel.setText("Lives: " + lives);
	frame.setSize(500,500);
	frame.addKeyListener(this);
	//frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	for(int i=0;i<num;i++) {
		System.out.println(game.push(Utilities.readRandomLineFromFile("dictionary.txt")));
	}
	
	word = game.pop();
	wordLength = word.length();
	guesses = new String[wordLength];
	for(int i=0;i<wordLength;i++) {
		guesses[i] = "_ ";
		undscore = undscore + guesses[i];
	}
	
	label.setText(undscore);
	
	}
	
	void newWord() {
		word = game.pop();
		wordLength = word.length();
		guesses = new String[wordLength];
		for(int i=0;i<wordLength;i++) {
			guesses[i] = "_ ";
			undscore = undscore + guesses[i];
		}
		label.setText(undscore);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		char key2 = arg0.getKeyChar();
		String key = "" + key2;
		String temp = "";
		if(word.contains(key)) {
			for(int i=0;i<wordLength;i++) {
				if(word.charAt(i) == key2) {
					guesses[i] = key2 + " ";
				}
				temp = temp + guesses[i];
			}
			label.setText(temp);
		}
		else {
			lives--;
			livesLabel.setText("Lives: " + lives);
		}
		
		if(!(label.getText().contains("_"))) {
			newWord();
		}
		
		if(lives <= 0) {
			String yes = JOptionPane.showInputDialog("gg. play again y/n?");
			yes.toLowerCase();
			if(yes.equals("yes")) {
				for(int i=0;i<num;i++) {
					game.pop();
					System.out.println(game.push(Utilities.readRandomLineFromFile("dictionary.txt")));
				}
				
				newWord();
			}
			else {
				System.exit(0);
			}
			
		}
		
	}
}