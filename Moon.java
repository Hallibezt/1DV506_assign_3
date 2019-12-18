package hk222su_assign3;

public class Moon {
	private String name = "unknown moon";
	private double diameter;
	
	public Moon() {}
	public Moon (String moonName, double moonDiameter) {
		setName(moonName);
		setName (moonDiameter);
	}
	
	
	public String getName(){
		return name;
	}
	
	public void setName(String moonName) {
		if (moonName.equals(""))
			name = "unknown moon";
		else
			name = moonName;
	}
	
	public double getDiameter() {
		return diameter;		
	}
	
	public void setName (double moonDiameter) {
		if(moonDiameter > 0)
			diameter = moonDiameter;
		else
			diameter = 0;
	}
	
	

}
