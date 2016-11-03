package VideoGame;
import java.util.*;
import javax.swing.JOptionPane;

public class UserInterface {
	
	//String vGT;
	public void begin() {
		// Create the VideoGame ArrayList to store the data while the program is running.
		ArrayList<VideoGame> VideoGames = new ArrayList<VideoGame>();
		
		// Display the menu and process Doom & NeedForSpeed data.
		boolean finished = false;
		while(!finished) { // This is a loop allows the program to continue until the user chooses to exit program.
			int selection  = showMenu();
			switch (selection) {
			case 1: // add a new violent video game.
				VideoGames.add((addDoom()));
				break;
			
			case 2: // add a new racing video game.
				VideoGames.add((addNeedForSpeed()));
				break;
				
			case 3: // Display the VideoGame data.
				JOptionPane.showMessageDialog(null, "Displaying all the video game information....", "Video Game list", JOptionPane.PLAIN_MESSAGE);
				for (int i = 0; i < VideoGames.size(); i++) {
					JOptionPane.showMessageDialog(null, VideoGames.get(i), "Video Games details", JOptionPane.PLAIN_MESSAGE);
				}
				JOptionPane.showMessageDialog(null, "There are "+VideoGames.size()+" record(s) in the list", "Total records", JOptionPane.PLAIN_MESSAGE);
				break;
				
			case 4: finished = true; // The boolean variable 'finished'/'completed' is used to manipulate the loop.
									JOptionPane.showMessageDialog(null, "*** PROGRAM TERMINATED***\n" + 
									"** THANK YOU FOR USING THE PROGRAM ***");
						break;
				default:
					JOptionPane.showMessageDialog(null, "\n **INVALID SELECTION **\n", "ERROR", JOptionPane.ERROR_MESSAGE);
			} // End of switch method
		} // End of while loop
	} // End of begin method.

	
	public int showMenu() {
		int selection = 0;
		String stringSelection = JOptionPane.showInputDialog(
				"******* MENU *******\n\n" +
				"1. Add a new Violent Video Game\n" +
				"2. Add a new Racing Video Game\n" +
				"3. Display all Details\n" +
				"4. TERMINATE PROGRAM\n\n" +
				"Type the number of your selection, and click OK: ");
		selection = Integer.parseInt(stringSelection.trim());
		return selection;
	} // End of showMenu method.
	
	public Doom addDoom() {
		//VideoGamePublisher VGP = new VideoGamePublisher(false, null);
		//Doom D = new Doom();
		
		String vGT = JOptionPane.showInputDialog(null,"\n What is the name of the video game? ").trim();
		String vPub = JOptionPane.showInputDialog(null, "What is "+ vGT +"'s publisher?").trim();
		int vPrice = 0;
		String eNum = "";
		int ivVR = JOptionPane.showConfirmDialog(null, "Is this game extremely violent?", "Rating", JOptionPane.YES_NO_OPTION);
		boolean vVR;
		if(ivVR == JOptionPane.YES_OPTION) {
			vVR = true;
		} else {
			vVR = false;
		}
		do {
			//String stringValidPrice = JOptionPane.showInputDialog(null, "What is the price of" +vGT+ "?");
			//double doublePrice = Double.parseDouble(stringValidPrice); // Allows for decimal input.
			eNum = JOptionPane.showInputDialog(null, "What is "+vGT+"'s price?");
			eNum = eNum.toString();
			vPrice = Integer.parseInt(eNum); // and allows for the input to be truncated as well!
			//JOptionPane.showMessageDialog (null, vPrice);
			if (vPrice <= 3 || vPrice > 300) {
				JOptionPane.showMessageDialog(null, "Error must have a price more than three dollars to make a profit", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		} while (vPrice <= 3 || vPrice > 300);
		
		boolean vExp;
		if(vPrice >= 50) {
			vExp = true;
		} else {
			vExp = false;
		}
		
		String eType = null;
		do { // Restrict the video game genre to demonstrate String validation.
			eType = JOptionPane.showInputDialog(null, "What is "+vGT+"'s genre? (Classic, Modern, AAA title, indie)?".trim());
			if (!eType.equals("Classic") && !eType.equals("Modern") && !eType.equals("AAA title") && !eType.equals("indie")) {
				JOptionPane.showMessageDialog(null, "\n** Invalid Selection *\n must be one of the specified genres", "ERROR", JOptionPane.ERROR_MESSAGE);
			} 
		} while (!eType.equals("Classic") && !eType.equals("Modern") && !eType.equals("AAA Title") && !eType.equals("indie") && !eType.equalsIgnoreCase("sim"));
		
		// String eNum = JOptionPane.showInputDialog(null, "What is "+vGT+"'s price?");
		double nYE;
		do { // make sure that that the actual price is greater than zero.
			String stringNYE = JOptionPane.showInputDialog(null, "What is the value of "+vGT+"?");
			nYE = (int) Double.parseDouble(stringNYE);
			if (nYE < 0) {
				JOptionPane.showMessageDialog(null, "\n** the game value must be zero or more **\n", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		} while (nYE < 0);
		String or = null;
		or = JOptionPane.showInputDialog(null, "Name of video game publisher?");
		int releaseDate = JOptionPane.showConfirmDialog(null, "Is this game being produced by "+or+" or not?", "Rating", JOptionPane.YES_NO_OPTION);
		boolean producedBy;
		if(releaseDate == JOptionPane.YES_OPTION) {
			producedBy = true;
		} else {
			producedBy = false;
		}
		
		VideoGamePublisher vGP = new VideoGamePublisher(false,null);
		
		Doom Dm = new Doom( vGT, vPub, vPrice, vGP, vVR , vExp, producedBy);
		
		JOptionPane.showMessageDialog(null, "Thanks - Game added to the list", "Game added", JOptionPane.PLAIN_MESSAGE);
		return Dm;
	}
	
	public NeedForSpeed addNeedForSpeed() {
		VideoGamePublisher VGP = new VideoGamePublisher(false,null);
		//NeedForSpeed N = new NeedForSpeed(null, null, 0, VGP, false,false, false, false);	
		String vGT = JOptionPane.showInputDialog(null,"\n What is the name of the video game? ").trim();
		String vPub = JOptionPane.showInputDialog(null, "What is "+ vGT +"'s publisher?").trim();
		int vPrice = 0;
		String eNum = "";// JOptionPane.showInputDialog(null, "What is "+ vGT +"'s price?");
		int ivvGA = JOptionPane.showConfirmDialog(null,"Did this game win any awards?", "AWARDS", JOptionPane.YES_NO_OPTION);
		boolean ivVGA;
		if(ivvGA == JOptionPane.YES_OPTION) {
			ivVGA = true;
		} else {
			ivVGA = false;
		}
		do {
			eNum = JOptionPane.showInputDialog(null, "What is "+ vGT +"'s price?");
			eNum = eNum.toString();
			vPrice = Integer.parseInt(eNum);
			// JOptionPane.showMessageDialog (null, vPrice);
			if (vPrice <= 3 || vPrice > 650) {
				JOptionPane.showMessageDialog (null, "Error must have a price more than three dollars to make a profit", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		} while (vPrice <= 3 || vPrice > 650);

		String eType = null;
		do { // restrict NeedForSpeed type to demonstrate String validation
			eType = JOptionPane.showInputDialog (null, "What is " + vGT + "'s  genre? (Classic, Modern, AAA title, indie)?".trim());
			if (!eType.equals ("Classic") && !eType.equals ("Modern") && !eType.equals ("AAA Title") &&!eType.equals ("indie") && !eType.equals ("Teacher")) {
				JOptionPane.showMessageDialog (null, "\n** Invalid Selection *\n must be one of the specified genres",
						"ERROR",
						JOptionPane.ERROR_MESSAGE);
			}
		} while (!eType.equals ("Classic") && !eType.equals ("Modern") && !eType.equals ("AAA title") &&!eType.equals ("indie") && !eType.equalsIgnoreCase("Teacher"));

		
	
		// String eNum = JOptionPane.showInputDialog(null, "What is "+ vGT +"'s price?");
		double nYE; 
		do { // make sure that that the actual price is greater than zero.
			String stringNYE = JOptionPane.showInputDialog(null, "What is the value of "+vGT+"?");
			nYE = Double.parseDouble(stringNYE);
			if (nYE < 0) {
				JOptionPane.showMessageDialog(null, "\n** the game value must be more than zero. **\n", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		} while (nYE < 0); 	
		//String or = null;
		// VGP = JOptionPane.showInputDialog(null, "Name of video game publisher?");
		//String  = JOptionPane.showInputDialog(null, ");
		int isDLCav = JOptionPane.showConfirmDialog(null, "Is DLC available for" +  vGT + "?", "Rating", JOptionPane.YES_NO_OPTION);
		boolean DLCav;
		if(isDLCav == JOptionPane.YES_OPTION) {
			DLCav = true;
		} else {
			DLCav = false;
		}
		
		VideoGamePublisher vGP = new VideoGamePublisher(false,null);
		
		NeedForSpeed N = new NeedForSpeed( vGT, vPub, vPrice, VGP, ivVGA, false, false, DLCav);
		
		JOptionPane.showMessageDialog(null, "Thanks - Game added to the list", "Game added", JOptionPane.PLAIN_MESSAGE);
		return N;
	}
}

