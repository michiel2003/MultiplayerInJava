package sourceFiles;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

class MKeyListener extends KeyAdapter{
	
	
	Ufo ufo;
	Frame panel;
	
	public MKeyListener(Ufo ufo, Frame panel) {
		this.ufo =ufo;
		this.panel = panel;
	}
	@Override
	public void keyPressed(KeyEvent event) {
		System.out.println(event.getExtendedKeyCode());
		if (event.getExtendedKeyCode() == 39) {
			ufo.rotation +=4;
//			System.out.println(ufo.rotation);
			panel.repaint();
		}
		if (event.getExtendedKeyCode() == 40) {
			ufo.moveForward();
			panel.repaint();
		}
		if (event.getExtendedKeyCode() == 90) {
			ufo.moveForward();
			panel.repaint();
		}
		if (event.getExtendedKeyCode() == 81) {
			ufo.rotation +=4;
//			System.out.println(ufo.rotation);
			panel.repaint();
		}
		if (event.getExtendedKeyCode() == 68) {
			ufo.rotation +=4;
//			System.out.println(ufo.rotation);
			panel.repaint();
		}
	}
}
