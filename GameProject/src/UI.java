import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class UI implements KeyListener{
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		String key = KeyEvent.getKeyText(arg0.getKeyCode());
		key=key.toLowerCase();
		System.out.println(key);
		switch(key){
		case "w":
			if(!GameUpdater.keysHeld.contains("w")){
				GameUpdater.keysHeld.add("w");
			}
			break;
		case "a":
			if(!GameUpdater.keysHeld.contains("a")){
				GameUpdater.keysHeld.add("a");
			}
			break;
		case "s":
			if(!GameUpdater.keysHeld.contains("s")){
				GameUpdater.keysHeld.add("s");
			}
			break;
		case "d":
			if(!GameUpdater.keysHeld.contains("d")){
				GameUpdater.keysHeld.add("d");
			}
			break;
		case "i":
			if(!GameUpdater.keysHeld.contains("i")){
				GameUpdater.keysHeld.add("i");
			}
			break;
		case "j":
			if(!GameUpdater.keysHeld.contains("j")){
				GameUpdater.keysHeld.add("j");
			}
			break;
		case "k":
			if(!GameUpdater.keysHeld.contains("k")){
				GameUpdater.keysHeld.add("k");
			}
			break;
		case "l":
			if(!GameUpdater.keysHeld.contains("l")){
				GameUpdater.keysHeld.add("l");
			}
			break;
		}
		

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		GameUpdater.keysHeld.remove(KeyEvent.getKeyText(arg0.getKeyCode()).toLowerCase());	
}

	@Override
	public void keyTyped(KeyEvent arg0) {

	}
}

