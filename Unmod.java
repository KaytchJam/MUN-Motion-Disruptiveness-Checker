
public class Unmod extends Motion {

	public Unmod(String country, double time) {
		super(country, time, "Unmoderated_Caucus", 2);
	}
	
	public Unmod(double time) {
		this("The_Chair", time);
	}
}
