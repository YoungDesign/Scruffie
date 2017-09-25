/**
 * @author Youngdesign & Williamsapplicatie
 * @version 1.0.0
 * @License Opensource
 */

package menu;											


import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;


public class Menu extends BasicGameState {

	private static  boolean spelIsGestart;
	private static String spelerNaam;
	private int spelerScore
	
	
	
	
	private Image goudenFrame;

	
	@Override
	public void init(GameContainer gc , StateBasedGame sbg)throws SlickException {
		// goudenframe in menu
		goudenFrame = new Image("afbeeldingen/menu/goudenframe.png");
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)throws SlickException {
		goudenFrame.draw(0,0);
		
			
		}
																																										
	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)throws SlickException {

	}
	
	
	public void saveGame(){
		// als het spel wordt verlaten wordt het automatisch opgeslagen
		//als het spel wordt beeindigd dan wordt het automatisch opgeslagen
	
	}
	

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

}
