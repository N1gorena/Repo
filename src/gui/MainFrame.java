package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	public static final Dimension screenDim = Toolkit.getDefaultToolkit().getScreenSize();
	private RoseLock lockScreen;
	
	public MainFrame(){
		this.setTitle("8-Bit Trombone");
		this.setAlwaysOnTop(true);
		this.setVisible(true);
		this.setPreferredSize(screenDim);
		this.lockScreen = new RoseLock("roseBackground.png");
		this.add(lockScreen, BorderLayout.CENTER);
		this.setSize(lockScreen.getSize());
		this.setLocation( ((screenDim.width/2) - this.getWidth()/2) , ((screenDim.height/2) - this.getHeight()/2) );
	}

}
