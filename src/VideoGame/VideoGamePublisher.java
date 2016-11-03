package VideoGame;

public class VideoGamePublisher {
	
	// This is Stage 02 of the Java Assignment.
	// This class is an instance to the VideoGame class.
	// That adds two extra attributes to the VideoGame class.
	
	// These are the class attributes.
	protected boolean Preorder;
	protected String ReleaseDate;
	
	// Primary constructor.
	public VideoGamePublisher(boolean p, String releaseDate) {
		Preorder = false;
		ReleaseDate = null;
		
	}


	//Getter and Setter methods for the class.
	public boolean isPreorder() {
		return Preorder;
	}

	public void setPreorder(boolean preorder) {
		Preorder = preorder;
	}

	public String getReleaseDate() {
		return ReleaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		ReleaseDate = releaseDate;
	}


	
	// toString method for the class.
	@Override
	public String toString() {
		return "VideoGamePublisher [Preorder=" + Preorder + ", ReleaseDate=" + ReleaseDate + "]";
	}
	

	// End of VideoGamePublisher.

}
