package sourceFiles;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class MKeyListener extends KeyAdapter{
	@Override
	public void keyPressed(KeyEvent event) {
		System.out.println(event.getKeyCode());
	}
}
