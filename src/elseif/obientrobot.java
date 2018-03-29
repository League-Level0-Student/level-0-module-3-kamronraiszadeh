package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obientrobot {
	Robot rob=new Robot();
public static void main(String[] args) {
	String answer= JOptionPane.showInputDialog("What shape would you like me to draw?");
	obientrobot rob2=new obientrobot();
	if (answer.equalsIgnoreCase("square")) {
		rob2.drawSquare();
	}

	if (answer.equalsIgnoreCase("triagle")) {
		rob2.drawTriagle();
	}
	
	if (answer.equalsIgnoreCase("circle")) {
		rob2.drawCircle();
	}
	
}

void drawSquare() {
	rob.setSpeed(10);
	rob.setPenColor(0,255,0);
	rob.penDown();
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	
	}
void drawTriagle () {
	rob.penDown();
	rob.setPenColor(255,0,0);
	 rob.turn(120);
	 rob.move(100);
	 rob.turn(120);
	 rob.move(100);
	 rob.turn(120);
	 rob.move(100);
	
}
void drawCircle (){
	for (int i = 0; i < 360; i++) {
		rob.penDown();
		rob.setPenColor(0, 0, 255);
		rob.move(1);
		rob.turn(1);
	}
}
	
}
