package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
String Img = ("https://i.pinimg.com/originals/61/2e/00/612e00711b7448b5d46ce6b4686a45a3.jpg");
		// 2. create a variable of type "Component" that will hold your image
Component Immg = createImage(Img);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
quizWindow.add(Immg);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String Que = JOptionPane.showInputDialog(null, "Who dis?????????");
		// 7. print "CORRECT" if the user gave the right answer
if(Que.equals("Goku")){
	JOptionPane.showMessageDialog(null, "CORRECTAMUNDO");
}
	// 8. print "INCORRECT" if the answer is wrong
else{
	JOptionPane.showMessageDialog(null, "YOUR TRASH");
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(Immg);
		// 10. find another image and create it (might take more than one line
		// of code)
String Img1 = ("https://i.pinimg.com/originals/98/02/72/980272e5300fe463b910a9794604ea53.jpg");
Component Img2 = createImage(Img1);
// 11. add the second image to the quiz window
quizWindow.add(Img2);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String Que2 = JOptionPane.showInputDialog("Now Who is this");
		// 14+ check answer, say if correct or incorrect, etc.
if(Que2.equals("Gohan")) {
JOptionPane.showMessageDialog(null, "YOU GOT IT");	
}	
else {	
	JOptionPane.showMessageDialog(null, "NOOOOOOOOOOOOOOO");
}
	}


	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
