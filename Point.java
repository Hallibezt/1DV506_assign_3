package hk222su_assign3;

public class Point {
	private int pointX;
	private int pointY;
	
	public Point() {}
	
	public Point( int pointX, int pointY) {
		setPointX(pointX);
		setPointY(pointY);
		
	}	
		
	public void setPointX(int pointX) {
	    this.pointX=pointX;
		
	}
	public void setPointY(int pointY) {
	    this.pointY=pointY;
		
	}
	
	public String toString(){
		return "(" + this.pointX + (",")+ this.pointY + ")";
	}
	
	//Cast in object and if objects X value and objects Y value is the same of this objects - return true else false
	public boolean isEqualTo(Point point) {
		if (this.pointX == point.pointX && this.pointY == point.pointY ) {		  
			   return true;}
		else return false;		
		
	}
	//Cast in object - find distance between x values and y values and use them values in pythagoras to calculate distance c
	public double distanceTo(Point point) {
		int distanceX = this.pointX - point.pointX;
		int distanceY = this.pointY - point.pointY;
		double finalDistance = (Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2)));
		
		return finalDistance;
		
	}
	
	
	public void move(int x, int y) {
		this.pointX = this.pointX + x;
		this.pointY = this.pointY + y;			
	}
	
	public void moveToXY(int x, int y) {
		this.pointX = x;
		this.pointY =y;			
	}
	
	

}
