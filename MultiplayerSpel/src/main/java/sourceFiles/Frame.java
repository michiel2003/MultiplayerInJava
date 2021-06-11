package sourceFiles;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Point2D;

import javax.swing.*;

public class Frame extends JPanel {
	public void paintComponent(Graphics g) {
        Triangle_Shape triangleShape = new Triangle_Shape(new Point2D.Double(50, 0),
                new Point2D.Double(100, 100), new Point2D.Double(0, 100));
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.draw(triangleShape);
    }
	
    public static void main (String [] args){
        JFrame frame = new JFrame("Draw Triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        frame.setSize(200, 200);

        Frame panel = new Frame();
        frame.add(panel);
        frame.addKeyListener(new MKeyListener());
        frame.setVisible(true);
    }
}

