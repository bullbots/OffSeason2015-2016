import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JPanel;
import javax.swing.Timer;
import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;


/**
 * @author Tyler, Zach
 *
 */
@SuppressWarnings("serial")
public class GamePanel extends JPanel 
{
	Timer time;
	private boolean oneTimeSetup=false;
	
	/**
	 * Constructor for the main game panel.
	 */
	public GamePanel()
	{
		this.setPreferredSize(new Dimension(800,600));
		time=new Timer(1000, new UpdateGame());
		time.start();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		GameDataHolder gameUpdater = new GameDataHolder();
		java.util.ListIterator<MapBlock> itr;
		if(gameUpdater.isFirstStartUp()){
			itr = gameUpdater.getFreshMap().listIterator();
		}else{
			itr = gameUpdater.getMapLinked().listIterator();
		}
		System.out.println("paintComponent Called");
		System.out.println("paintComponent list size: "+gameUpdater.getMapLinked().size());
		while(itr.hasNext()){
			MapBlock curr= itr.next();
			Point tmpPoint = curr.getMapLocation();
			g.setColor(Color.BLACK);
			g.fill3DRect(tmpPoint.x, tmpPoint.y, curr.getLength(), curr.getWidth(), true);
		}
	}
//	private class UpdateGame implements ActionListener{
//
//		public void actionPerformed(ActionEvent e) {
//			System.out.println("Action invoked");
//			mapLinked.clear();
//			repaint();
//			System.out.println("Action Completed");
//		}
//
//	}	
}
