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
	
	private Image goudenFrame;

	
	@Override
	public void init(GameContainer gc , StateBasedGame sbg)throws SlickException {
		goudenFrame = new Image("afbeeldingen/menu/goudenframe.png");
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)throws SlickException {
			
		goudenFrame.draw(0,0);
			
		}
																																										
	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)throws SlickException {
		// TODO Auto-generated method stub

	}
	
	
	// Made By:  YoungDesigns & Williamsapplicatie 2017 © copyright

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

}
