package hk222su_assign3;

import java.util.ArrayList;


public class Planets {
	
	private String name = "Unknown planet";
	private int positionFromSun;
	private int noOfMoons;
	private double aphelion;
	private double perihelion;
	//Additional attribute for question3 - collect created Moon objects for a planet in this list	
	private ArrayList<Moon> moons = new ArrayList<Moon>();
	
	
	public Planets() {
	}
	
	public Planets(String theName, int position, int noMoons, double aphelionNo, double perihelionNo) {	
		setName(theName);
		setPositionFromSun(position);
		setNoOfMoons( noMoons);
		setAphelion(aphelionNo);
		setPerihelion( perihelionNo);
	}
	
	//the methods - setters are non returning (void) affect the attributes
	//getters are returning - return attribute value
	
	public String getName() {	
		return name;		
	}
	
	//Cast my string from main to this method to set that string as name attribute value
	public void setName(String theName) {
		if (theName.equals(""))
			name = "Unknown planet";
		else
			name = theName;
	}
	
	public int getPositionFromSun() {
		return positionFromSun;		
	}
	
	public void setPositionFromSun(int position) {
		if (position > 0 && position < 10)
			positionFromSun = position; 
		else
			positionFromSun = 0; 
	}
	
	public int getNoOfMoons() {
		 return noOfMoons;
	}
		
	public void setNoOfMoons(int noMoons) {
		if (noMoons >= 0 && noMoons <= 100)
			noOfMoons = noMoons; 
		else
			noOfMoons = 0;		
	}
	
	public double getAphelion() {
		return aphelion;		
	}

	
	public void setAphelion(double aphelionNo) {
		if(aphelionNo >= 0 && aphelionNo <= 50)
			aphelion = aphelionNo;
		else
			aphelion = 0;	
	}
	
	public double getPerihelion() {
		return perihelion;
		
	}
	
	public void setPerihelion(double perihelionNo) {
		if(perihelionNo >= 0 && perihelionNo <= 30)
			perihelion = perihelionNo;
		else
			perihelion = 0;
	}
	
	//For question 3 - method to add Moon objects, created in main, to the list of the planet object.
   public void addMoon(Moon moonName) {
	 moons.add(moonName);
   }
	
  //For question 3 - Create an array - that takes the size of my list, and fill it with the objects of my list, and returns the array. 
  public Moon[] getMoon() {
	
	  Moon[] nameMoon = new Moon[moons.size()];	
	  for(int i = 0; i < nameMoon.length; i++) {
	  nameMoon [i] = moons.get(i);
	  }	
	  return nameMoon;
 	  		  
  }
	   
   
	
}
