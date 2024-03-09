package _03_Hangman;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Stack;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Hangman implements KeyListener {
	
	String numb = JOptionPane.showInputDialog("Number:");
	int num = Integer.parseInt(numb);
	Stack<String> game = new Stack<String>();
	
	Random rand = new Random();
	JLabel label = new JLabel();
	int lives = 3;
	String word;
	int wordLong;
	
	public void main(String[] args) {
	
	for(int i=0;i<num;i++) {
		System.out.println(game.push(Utilities.readRandomLineFromFile("dictionary.txt")));
	}
	
	word = game.pop();
	wordLong = word.length();
	
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		String key = arg0.toString();
		if(word.contains(key)) {
			
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}