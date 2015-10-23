import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class UI implements KeyListener{

	@Override
	public void keyPressed(KeyEvent arg0) {
		System.out.println("pressed");
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Released");
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		System.out.println("typed");
		
	}
}

