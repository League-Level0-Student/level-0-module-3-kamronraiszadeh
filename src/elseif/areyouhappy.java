package elseif;

import javax.swing.JOptionPane;

public class areyouhappy {
public static void main(String[] args) {
	String answer= JOptionPane.showInputDialog("Are you happy?");
	
	if (answer.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null,"Keep doing what you are doing");
		
	}
	
	else if (answer.equalsIgnoreCase("no")) {
	answer=	JOptionPane.showInputDialog("Do you want to be happy?");
		if (answer.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null,"Keep doing what you are doing");
		}
		else if (answer.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null,"Change something");
		}
	}
}
}
