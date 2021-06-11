package sourceFiles;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class Frame extends JPanel {
	
	public Ufo ufo = new Ufo(); 
	
	@Override
	public void paintComponent(Graphics g) {
        Triangle_Shape triangleShape = new Triangle_Shape(new Point2D.Double(50, 0),
                new Point2D.Double(100, 100), new Point2D.Double(0, 100));
        Graphics2D g2d = (Graphics2D) g.create();
        double rotationRequired = Math.toRadians (ufo.rotation);
        AffineTransform tx = AffineTransform.getRotateInstance(rotationRequired, ufo.x, ufo.y);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
//        g2d.drawImage(ufo.image, ufo.x, ufo.y, null);
     // Drawing the rotated image at the required drawing locations
        g2d.drawImage(op.filter((BufferedImage)ufo.image, null), ufo.x, ufo.y, null);
    }
	
	
	
    public static void main (String [] args){
    	JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        frame.setSize(500, 500);
        Frame panel = new Frame();
        frame.addKeyListener(new MKeyListener(panel.ufo, panel));
       frame.add(panel);
        frame.setVisible(true);
    }
}

