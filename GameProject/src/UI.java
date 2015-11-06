import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class UI implements KeyListener{
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		
		for (String x: GameUpdater.keysHeld){
			System.out.println(x);
		}
		System.out.println("pressed");
		String key = KeyEvent.getKeyText(arg0.getKeyCode());
		key=key.toLowerCase();
		if (key.equals("w")|| key.equals("a") || key.equals("s") || key.equals("d") &&! GameUpdater.keysHeld.contains(key)) 
		{
			GameUpdater.keysHeld.add(KeyEvent.getKeyText(arg0.getKeyCode()).toLowerCase());
		}
		System.out.println(GameUpdater.keysHeld.size());

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		for (String x: GameUpdater.keysHeld){
			System.out.println(x);
		}
		GameUpdater.keysHeld.remove(KeyEvent.getKeyText(arg0.getKeyCode()).toLowerCase());
		System.out.println("Released " + KeyEvent.getKeyText(arg0.getKeyCode()).toLowerCase());
	
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

