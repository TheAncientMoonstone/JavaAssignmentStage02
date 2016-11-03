package VideoGame;

public class Doom extends VideoGame {
	
	// This is stage 02 of the java assignment.
	// This to the VideoGame class.
	// This adds two attributes.
	
	// These are the class attributes.
	protected boolean ViolenceRating;
	protected boolean Expensive;
	protected boolean producedBy;
	
	// Primary Constructor.
	public Doom() {
		super(null,null,0,null);
		ViolenceRating = false;
		Expensive = false;
	}
	
	// Secondary Constructor.
	public Doom(String vGT, String vPub, int vPrice, VideoGamePublisher vGP, boolean vVR, boolean vExp, boolean pB) {
		super(vGT, vPub, vPrice, vGP);
		ViolenceRating = vVR;
		Expensive = vExp;
		producedBy = pB;
	}

	// Set and Get methods.
	public boolean getViolenceRating() {
		return ViolenceRating;
	}

	public void setViolenceRating(boolean violenceRating) {
		ViolenceRating = violenceRating;
	}

	public boolean getExpensive() {
		return Expensive;
	}

	public void setExpensive(boolean expensive) {
		Expensive = expensive;
	}

	
	// toString for the class.
	@Override
	public String toString() {
				
		return  super.toString()+
				"\n Violence Rating:" +ViolenceRating+
				"\n Expensive:" +Expensive;
	}
	
	// End of Doom class.
}
