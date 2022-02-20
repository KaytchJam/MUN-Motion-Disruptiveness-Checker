
abstract class Motion implements Comparable<Motion> {
	final private double totalTime; // in minutes
	final private int disruptScore;
	final private String motionName;
	final private String delegate;
	
	public Motion(int time) {
		this("The Chair", time);
	}
	
	public Motion(String countryName, double timeInMin) {
		this(countryName, timeInMin, "Blank_Motion", 0);
	}
	
	// Base constructor for all motions
	protected Motion(String countryName, double timeInMin, String motionName, int disruptScore) {
		this.disruptScore = disruptScore;
		this.totalTime = timeInMin;
		this.delegate = countryName;
		this.motionName = motionName;
	}
	
	public String toString() {
		return "Motion: " + motionName +
				"\nDuration: " + totalTime + " minutes" +
				"\nSuggestor: " + delegate;
	}

	public int compareTo(Motion other) {
		if (other == null) {
			throw new NullPointerException("The other Motion cannot have type null.");
		}
		
		int diff = disruptScore - other.disruptScore;
		if (diff != 0) return diff;
		
		int timeDiff = (int) ((this.totalTime - other.totalTime) * 10);
		return timeDiff;
	}
	
	/*
	 * pre: none
	 * post: returns a string of the name of the country that suggested the motion
	 */
	public String getCountry() {
		return delegate;
	}
	
	public String getMotionType() {
		return motionName;
	}
	
}
