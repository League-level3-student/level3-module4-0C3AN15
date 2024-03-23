package _03_Hangman;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Hangman implements KeyListener {
	
	String numb = JOptionPane.showInputDialog("Number:");
	int num = Integer.parseInt(numb);
	Stack<String> game = new Stack<String>();
	String[] guesses;
	String visual = "";
	
	Random rand = new Random();
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	JTextField field = new JTextField();
	int lives = 3;
	String word;
	int wordLength;
	
	void main() {
		
	frame.setVisible(true);
	frame.add(label);
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
		guesses[i] = "_";
	}
	visual = "_"; //hhhhhhhh
	label.setText(visual);
	
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
		if(word.contains(key)) {
			System.out.println(key);
			
			
		}
		
		
		
	}
}