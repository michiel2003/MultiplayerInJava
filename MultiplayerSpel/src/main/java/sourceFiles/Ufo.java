package sourceFiles;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Ufo {
	
	
	public BufferedImage image;
	
	public double x = 100;
    public double y = 100;
	
	public double rotation = 0;
	
	public Ufo() {
		try {
			image = ImageIO.read(new File("spaceship_sprite.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void moveForward() {
		double cosinus = Math.cos(Math.toRadians(rotation-90));
		double sinus = Math.sin(Math.toRadians(rotation-90));
		double xplus = cosinus;
		x += xplus*4;
		double yplus = sinus;
		y += yplus*4;
	}

}
