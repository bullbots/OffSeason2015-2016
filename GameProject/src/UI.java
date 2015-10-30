import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class UI implements KeyListener{

	ArrayList<String> keysHeld = new ArrayList<String>();
	@Override
	public void keyPressed(KeyEvent arg0) {
		System.out.println("pressed");
		String key = KeyEvent.getKeyText(arg0.getKeyCode());
		if (key == "w" || key == "a" || key == "s" || key == "d") 
		{
				keysHeld.add(KeyEvent.getKeyText(arg0.getKeyCode()));
		}
		System.out.println(keysHeld);
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		keysHeld.remove(KeyEvent.getKeyText(arg0.getKeyCode()));
		System.out.println("Released");
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}
	
	public void display(KeyEvent arg0) {
		char c = arg0.getKeyChar();
		System.out.println(c);
	}
}

