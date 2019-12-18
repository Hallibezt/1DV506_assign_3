package hk222su_assign3;

public class PointMain {
	public static void main(String[] args) {
		
		Point point1 = new Point();
		Point point2 = new Point (3,4);
		System.out.println("The point is: " + point1.toString());
		System.out.println("The point is: " + point2.toString());
		
		if (point1.isEqualTo(point2))
			System.out.println("Points are equal");		
		
		
		double dist = point1.distanceTo(point2);
		System.out.println("The distance between points are: "+dist);
		
		
		point1.moveToXY(8,2);
		point2.move(5,-2);	
		
		
		if (point1.isEqualTo(point2))
			System.out.println("Points are equal");		
		
	}

}
