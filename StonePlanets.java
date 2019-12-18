package hk222su_assign3;

public class StonePlanets {
	public static void main(String[] args) {
		//I create the three moons belonging to the Stone Planets
		Moon deimos = new Moon("Deimos", 12.4);
		Moon phobos = new Moon("Phobos", 12.4);
		Moon moon = new Moon("The Moon", 3474.2);
		
		
		//Create the Stone Planets
		Planets mercury = new Planets("Mercury", 1, 0, 0.47, 0.31);
		Planets venus = new Planets("Venus", 2, 0, 0.72, 0.72);
		Planets earth = new Planets("Earth", 3, 1, 1, 0.99);
		Planets mars = new Planets("Mars", 4, 2, 1.666, 1.382);
		
		//Create an array holding planet objects (the four planets)
		Planets[] planets = new Planets[4]; 
		planets [0] = mercury;
		planets [1] = venus;
		planets [2] = earth;
		planets [3] = mars;
		
		//add the moons to its belonging planet
		earth.addMoon(moon);		
		mars.addMoon(phobos);
		mars.addMoon(deimos);
		
		
		
		for(int i=0; i<planets.length; i++) {
			System.out.println("Planet " + planets[i].getName() + " has aphelion " + planets[i].getAphelion() + " AU, perihelion " + planets[i].getPerihelion() + " AU and " + planets[i].getNoOfMoons() + " moons." );
			if (planets[i].getNoOfMoons()>0) {
				for(int j=0; j<planets[i].getMoon().length;j++ ) {
				System.out.println("    " + planets[i].getMoon()[j].getName());	
				}
			}
		}
		
		
	}
}
