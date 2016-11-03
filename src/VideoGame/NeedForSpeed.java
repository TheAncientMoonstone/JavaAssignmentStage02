package VideoGame;

public class NeedForSpeed extends VideoGame {

	// This is stage 02 of the java assignment.
	// This to the VideoGame class.
	// This adds two attributes.
	
	// These are class attributes.
	protected boolean GameAwards;
	protected boolean DLCAvailable;
	
	// Primary Constructor.
	public NeedForSpeed() {
		super(null,null,0,null);
		GameAwards = false;
		DLCAvailable = false;
		
	}
	
	// Secondary Constructor.
	public NeedForSpeed(String vGT, String vPub, int vPrice, VideoGamePublisher vGP, boolean vVR, boolean vExp, boolean vGA, boolean vDLC) {
		super(vGT, vPub, vPrice, vGP);
		GameAwards = vGA;
		DLCAvailable = vDLC;
	
	}

	
	// Get and Set Methods.
	public boolean getGameAwards() {
		return GameAwards;
	}

	public void setGameAwards(boolean gameAwards) {
		GameAwards = gameAwards;
	}

	public boolean getDLCAvailable() {
		return DLCAvailable;
	}

	public void setDLCAvailable(boolean dLCAvailable) {
		DLCAvailable = dLCAvailable;
	}
	
	
	// toString method for the class.
	@Override
	public String toString() {
		
		return super.toString()+
				"\n Game Awards:" +GameAwards+
				"\n DLC Available:" +DLCAvailable;
	}
	
	// End of NeedForSpeed class.
	
}
