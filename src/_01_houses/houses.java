package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	static Robot r2 = new Robot("batman");
	public static void main(String[] args) {
		
	r2.setSpeed(100);
	r2.miniaturize();
	r2.setX(50);
	r2.setY(500);
	r2.penDown();
	r2.setPenColor(1, 56, 145);
	for (int i = 0; i < 10; i++) {
		drawhouse();
	}
	
	
	
}
static void drawhouse() {
	r2.move(200);
	r2.turn(90);
	r2.move(40);
	r2.turn(90);
	r2.move(200);
	r2.setPenColor(3, 90, 27);
	r2.turn(-90);
	r2.move(20);
	r2.setRandomPenColor();
	r2.turn(-90);
}
}

