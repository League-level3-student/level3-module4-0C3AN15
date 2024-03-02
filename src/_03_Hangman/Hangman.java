package _03_Hangman;

import java.util.Stack;

import javax.swing.JOptionPane;

public class Hangman {
	
	public static void main(String[] args) {
		
	String numb = JOptionPane.showInputDialog("Number:");
	int num = Integer.parseInt(numb);
	Stack<String> game = new Stack<String>();
	
	for(int i=0;i<num;i++) {
		System.out.println(game.push(Utilities.readRandomLineFromFile("dictionary.txt")));
	}
	
	}
}
