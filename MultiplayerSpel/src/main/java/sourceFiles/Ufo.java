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
	
	public int x = 100;
    public int y = 100;
	
	public double rotation = 90;
	
	public Ufo() {
		try {
			image = ImageIO.read(new File("spaceship_sprite.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
