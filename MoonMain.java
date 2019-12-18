package hk222su_assign3;

public class MoonMain {
	public static void main(String[] args) {
		
		Moon deimos = new Moon("Deimos", 12.4);
		
		System.out.print("Mars's moon, " + deimos.getName() + " ,is the smalles in our galaxy, with the diameter of " + deimos.getDiameter() + " km.");
	}
}
