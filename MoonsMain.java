package hk222su_assign3;

public class MoonsMain {
public static void main(String[] args) {
		//Create the two moons of Mars
		Moon deimos = new Moon("Deimos", 12.4);
		Moon phobos = new Moon("Phobos", 22.5);
		//Create Mars
		Planets mars = new Planets("Mars", 0, 0, 0, 0);
		//Add them moons to Mars
		mars.addMoon(phobos);
		mars.addMoon(deimos);
		
		
		System.out.println(mars.getName() + " has the moons: ") ;
		//Here I use a loop to get the name attribute from each moon object in my array and print it
		for(int i=0; i < mars.getMoon().length;i++) {
		System.out.println("  " + mars.getMoon()[i].getName());
		}
			
		}
	}


