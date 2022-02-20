
public class Mod extends Motion {
	private static String MOTION_NAME = "Moderated Caucus";
	private final double speakTime;
	private final double totalTime;
	private final String delegate;
	
	
	public Mod(String country, double timeInMinutes, double speakTimeInSecs) {
		super(country, timeInMinutes, "Moderated Caucus", 1);
		this.delegate = country;
		this.totalTime = timeInMinutes;
		this.speakTime = speakTimeInSecs;
	}
	
	public Mod(double timeInMinutes, double speakTimeInSecs) {
		this("The_Chair", timeInMinutes, speakTimeInSecs);
	}
	
	public String toString() {
		return "Motion: " + MOTION_NAME +
				"\nDuration: " + totalTime + " minutes" +
				"\nSpeaking_Time: " + speakTime + " seconds" +
				"\nSuggestor: " + delegate;
	}
	
	public int compareTo(Motion other) {
		int compScore = super.compareTo(other);
		if (compScore != 0) return compScore;
		
		int diff = (int) (this.speakTime - ((Mod)other).speakTime);
		return -1 * diff;
	}

}
