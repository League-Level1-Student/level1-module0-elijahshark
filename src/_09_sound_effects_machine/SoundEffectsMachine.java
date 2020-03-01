package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
public void showButton() {
  frame.setVisible(true);
frame.add(panel);
panel.add(button);
panel.add(button1);
panel.add(button2);
panel.add(button3);
frame.pack();
button.addActionListener(this);
button1.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);










}
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
if(button == e.getSource())	{
playSound("shrek.mp3");
}
if(button1 == e.getSource())	{
	playSound("mine.mp3");
}
if(button2 == e.getSource())	{
	playSound("sponge.mp3");
}
if(button3 == e.getSource())	{
	playSound("coconut.mp4");
}

}
}
