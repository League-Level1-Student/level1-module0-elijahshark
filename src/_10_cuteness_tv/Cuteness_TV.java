package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cuteness_TV implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton Ducks = new JButton();
	JButton Frog = new JButton();
	JButton FluffyUnicorns = new JButton();
	
	
	public void showbutton() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(Ducks);
		panel.add(Frog);
		panel.add(FluffyUnicorns);
		frame.pack();
		Ducks.addActionListener(this);
		Frog.addActionListener(this);
		FluffyUnicorns.addActionListener(this);




		







}
void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(FluffyUnicorns == e.getSource())	{
		System.out.println("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
		}
		if(Frog == e.getSource())	{
			System.out.println("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
		}
		if(Ducks == e.getSource())	{
			System.out.println("https://www.youtube.com/watch?v=MtN1YnoL46Q");
		}
}
}