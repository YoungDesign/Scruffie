/**
 * @author Youngdesign & Williamsapplicatie
 * @version 1.0.0
 * @License Opensource
 */
package scruffiebox;


import org.newdawn.*;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Mechanisme extends StateBasedGame {
	
	//Titel Scruffie searching for coints
	
	
	public static final String spelNaam = "Scruffie searching for Gold";
	public static final int Menu = 0;
	public static final int Level1 = 1;
	
	public Mechanisme(String naam) {
		super(naam);
		this.addState(new menu.Menu());
		this.addState(new levels.Level1());
	}
	
	public void initStatesList( GameContainer gc)throws SlickException{
		this.getState(Menu).init(gc,this);
		this.getState(Level1).init(gc,this);
		this.enterState(0);	
			}
	
	public static void main(String[] arg) throws SlickException{
		
		AppGameContainer appgc;
		try{
			
			appgc = new AppGameContainer(new Mechanisme(spelNaam));
			appgc.setDisplayMode(600,450,false);
			appgc.start();
			
		}catch(SlickException e){
			e.printStackTrace();
		}
		
	}
	
	
	
	
	

}
