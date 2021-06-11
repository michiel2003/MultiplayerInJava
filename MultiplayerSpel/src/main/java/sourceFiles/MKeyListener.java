package sourceFiles;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

class MKeyListener extends KeyAdapter{
	
	Ufo ufo;
	JPanel panel;
	
	public MKeyListener(Ufo ufo, JPanel panel) {
		this.ufo =ufo;
		this.panel = panel;
	}
	@Override
	public void keyPressed(KeyEvent event) {
		System.out.println(event.getKeyCode());
		if (event.getExtendedKeyCode() == 37) {
			ufo.rotation +=1;
			System.out.println(ufo.rotation);
			panel.repaint();
		}
	}
}
