package VideoGame;

public abstract class VideoGame {
	
	// This is Stage 02 of the Java Assignment.
	// This class is the abstract class that the other Classes extend to.
	
	// These are the class attributes 
	protected String VideoGameTitle;
	protected String Publisher;
	protected int Price;
	protected VideoGamePublisher VGP;
	
	// Primary Constructor.
	VideoGame() {
		VideoGameTitle = null;
		Publisher = null;
		Price = 0;
		VGP = null;
	}
	
	// Secondary Constructor.
	VideoGame(String vGT, String vPub, int vPrice, VideoGamePublisher vGP) {
		VideoGameTitle = vGT;
		Publisher = vPub;
		Price = vPrice;
		VGP = vGP;
	}

	// Getter and Setter methods for the class.
	public String getVideoGameTitle() {
		return VideoGameTitle;
	}

	public void setVideoGameTitle(String videoGameTitle) {
		VideoGameTitle = videoGameTitle;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}
	
	public VideoGamePublisher getVGP() {
		return VGP;
	}
	
	public void setVGP(VideoGamePublisher vGP) {
		this.VGP = vGP;
	}

	
	// toString method for the class goes here.
	@Override
	public String toString() {
		return "\n Video Game Title:" +VideoGameTitle+
				"\n Video Game Publisher:" +Publisher+
				"\n Video Game Price:" +Price;
	}
	
	// End of VideoGame class.

}
