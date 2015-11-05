import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class UI implements KeyListener{
	ArrayList<String> keysHeld = new ArrayList<String>();
	@Override
	public void keyPressed(KeyEvent arg0) {
		//System.out.println("pressed");
		String key = KeyEvent.getKeyText(arg0.getKeyCode());
		key=key.toLowerCase();
		if (key.equals("w")|| key.equals("a") || key.equals("s") || key.equals("d")) 
		{
			GameUpdater.keysHeld.add(KeyEvent.getKeyText(arg0.getKeyCode()).toLowerCase());
		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		keysHeld.remove(KeyEvent.getKeyText(arg0.getKeyCode()));
		//System.out.println("Released");
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		//System.out.println("keyTyped");
	}
	
	public void display(KeyEvent arg0) {
		char c = arg0.getKeyChar();
		System.out.println(c);
	}
}

