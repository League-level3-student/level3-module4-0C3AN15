package _00_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class _02_TextUndoRedo implements KeyListener {
    /* 
     * Create a JFrame with a JPanel and a JLabel.
     * 
     * Every time a key is pressed, add that character to the JLabel. It should
     * look like a basic text editor.
     * 
     * Make it so that every time the BACKSPACE key is pressed, the last
     * character is erased from the JLabel.
     * 
     * Save that deleted character onto a Stack of Characters.
     * 
     * Choose a key to be the Undo key. Make it so that when that key is
     * pressed, the top Character is popped  off the Stack and added back to
     * the JLabel.
     */
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField field = new JTextField();
	
	public void text() {
		
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.add(panel);
		frame.add(label);
		label.add(field);
		label.addKeyListener(this);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		label.add(field, e.getKeyChar());
		if(e.) {
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

//lookinmyeyestellmeyourtaledoyouseetheroadthemaptomysoullooktellmethesignswheneverthesmokeclearoutofmyfaceamipictureperfectordoilookfriedallofthatgreenandyellowthatdripfromyoureyes
//istellintellyourdemiseiwenttomysidetopushbacktheceilingandpushbackmyfeelingsihadtodecideireplaythemnights vbucksonmeeverydayijusttwohundredpumpedanopptotheface igotthesebandsigot
//breadfinnacookupbigflawlessdiamondsbittheysitonmywristtheysaytheywontsignthatlilkidforsomecheeseitoldemjusteatemimalreadyrichthisbro kakageyokonomuneafureterukodokudashteka
//ikirenainarajiyuudanabakanayumeikimemienaisakiwoterashiteyukujiyunoashidetryeeyieeyiasekainohatewotomonimiyoujibunoashidetryiyiyiyiyyi idontbegivingnofortsidontknowifyoucaughton
//idontbegivingnofortsisaywhateveriwantidowhateveriwanticountupthismoneyforfunandimpoppingthesepercsjustforfunallofmytwizgotagunallofmytwizontherunallofmytwizcutemupandisleepin
//thedayonsomesun