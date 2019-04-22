package exercises;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class PentagonCrazy {

	private void makePrettyThings() {
		Robot Borg = new Robot ();

		Borg.penDown();
		Borg.setSpeed(10);
		Borg.turn(360/6);

		for (int j = 0; j < 666; j++) {
			Borg.move(j);
			Borg.turn(360/6 +1);
			Borg.setRandomPenColor();;

			
			//I prefer hexagons
		}


	}


	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}