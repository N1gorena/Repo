package gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class RoseLock extends JPanel {
	private Image background;
	public RoseLock(String imagePath){
		this.background = new ImageIcon("images/"+ imagePath).getImage();
		Dimension size = new Dimension(this.background.getWidth(null), this.background.getHeight(null));
		this.setPreferredSize(size);
		this.setMinimumSize(size);
		this.setMaximumSize(size);
		this.setSize(size);
		this.setLayout(null);
	}
	
	
	public void paintComponent(Graphics g){
		g.drawImage(background, 0, 0, null);
	}
}
