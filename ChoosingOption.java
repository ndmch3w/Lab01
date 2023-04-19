package lab_01;

import javax.swing.JOptionPane;

public class ChoosingOption {
	public static void main(String[] args) {
	    String[] buttons = {"I do", "I don't", "Cancel"};
	    int option = JOptionPane.showOptionDialog(null, "Do you want to change to first class ticket ?",
	    		"Confirmation", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[1]);
		JOptionPane.showMessageDialog(null, "You have chosen: " + 
	    		(option == JOptionPane.YES_OPTION?"I do":"I don't"));
		System.exit(0);
	}
}
