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
	
	static String numb = JOptionPane.showInputDialog("Number:");
	static int num = Integer.parseInt(numb);
	static Stack<String> game = new Stack<String>();
	
	Random rand = new Random();
	static JLabel label = new JLabel();
	static JFrame frame = new JFrame();
	static JTextField field = new JTextField();
	int lives = 3;
	static String word;
	static int wordLength;
	
	public static void main(String[] args) {
		
	frame.setVisible(true);
	frame.add(label);
	frame.setSize(500,500);
	//frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	for(int i=0;i<num;i++) {
		System.out.println(game.push(Utilities.readRandomLineFromFile("dictionary.txt")));
	}
	
	word = game.pop();
	wordLength = word.length();
	label.setText(word);
	
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		String key = arg0.toString();
		if(word.contains(key)) {
			System.out.println(key);
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