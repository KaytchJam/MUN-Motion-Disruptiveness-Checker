import java.util.Arrays;

public class DisruptiveChecker {
	public static void main(String[] args) {
		Motion m1 = new Unmod("China", 15);
		System.out.println(m1 + "\n");
		Motion m2 = new Mod("Sudan",20, 30);
		System.out.println(m2 + "\n");
		compareMotions(m1, m2);
		
		m1 = new Mod("Belarus",15,1);
		compareMotions(m1, m2);
		
		Motion m3 = new Unmod("Bolivia",10);
		Motion m4 = new Mod("Trinidad", 5, 60);
		Motion m5 = new Unmod("Malaysia", 15);
		
		Motion[] motions = new Motion[] {m1, m2, m3, m4, m5};
		Arrays.sort(motions);
		
		System.out.println("\n\nMotions ranked from most to least disruptive.");
		for (int i = 0; i < motions.length; i++) {
			System.out.println(motions[i] + "\n");
		}
	}
	
	public static void compareMotions(Motion m1, Motion m2) {
		Motion disruptive = (m1.compareTo(m2) > 0) ? m1 : m2;
		System.out.println("The " + disruptive.getMotionType() 
		+ " suggested by " + disruptive.getCountry() + " is more disruptive.");
	}
}
