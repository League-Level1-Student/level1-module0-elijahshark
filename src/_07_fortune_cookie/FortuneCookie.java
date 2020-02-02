package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneCookie implements ActionListener {
	   public void showButton() {
	     System.out.println("Button clicked");
	   JFrame frame = new JFrame(); 
	   frame.setVisible(true);
	   JButton button = new JButton();
	   frame.add(button);
	   frame.pack();
	   button.addActionListener(this);
	   
	   
	   
	   
	   
	   
	   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
	System.out.println(rand);
	if(rand == 0) {
	System.out.println("Some one in your life will come to comfort you at the worst time");
	}
	if(rand == 1) {
	System.out.println("A beautiful, smart, and loving person will be coming into your life");	
	}
	if(rand == 2) {
	System.out.println("Advice is like kissing. It costs nothing and is a pleasant thing to do");	
	}
	if(rand == 3) {
	System.out.println("An agreeable romance might begin to take on the appearance");
	}
	if(rand == 4) {
	System.out.println("It is better to be an optimist and proven a fool than to be a pessimist and be proven right");
	}
	
	
	}
}
