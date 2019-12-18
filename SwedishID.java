package hk222su_assign3;



public class SwedishID {
	private DateFormat birthday = new DateFormat();	
	private int checksum;
	private boolean valid;
	
	public SwedishID(String id) {		
		int year = Integer.parseInt(id.substring(0,4)) ;	
		int month = Integer.parseInt(id.substring(4,6));
		int day = Integer.parseInt(id.substring(6,8));
		int checksum = Integer.parseInt(id.substring(9,id.length()));		
		this.checksum = checksum;
		this.birthday.setYear(year);
		this.birthday.setMonth(month);
		this.birthday.setDay(day);		
		this.birthday.setFormat('b');
		this.birthday.setPunctuation('!');		
	   }	
	
	public String showID() {
		String checksum1 = Integer.toString(checksum);
		if (checksum1.length()== 3) {
			checksum1 = "0"+checksum1;
		}
		if (checksum1.length()== 2) {
			checksum1 = "00"+checksum1;
		}
		if (checksum1.length()== 1) {
			checksum1 = "000"+checksum1;
		}
		if (checksum1.length()== 0) {
			checksum1 = "0000"+checksum1;
		}
		String id = birthday.getDate(true) + "-" + checksum1;
		return id;		
	}
	
	public boolean isFemale() {
		if(((checksum/10) % 10) % 2 == 0) {
		return true;}
		else
		return false;		
	}
	
	public int comparedTo(SwedishID check) {
		int number = 0;
		int year =Integer.parseInt(this.birthday.getDate(true).substring(0,4));
		int month = Integer.parseInt(this.birthday.getDate(true).substring(4, 6));
		int day = Integer.parseInt(this.birthday.getDate(true).substring(6, 8));
		int year1 =Integer.parseInt(check.birthday.getDate(true).substring(0,4));
		int month1 = Integer.parseInt(check.birthday.getDate(true).substring(4, 6));
		int day1 = Integer.parseInt(check.birthday.getDate(true).substring(6, 8));
		if(year==year1) {
			if(month == month1) {
				if (day==day1){
					number = 0;
					return number;}
				if (day < day1) {
						number = -1;
						return number;}
				if (day>day1) {
						number = 1;
						return number;}
				}
				if (month < month1) {
					number = -1;
					return number;}
				if (month>month1) {
					number = 1;
					return number;}
				}
			
		if(year < year1) {
			number =-1;
			return number;}
		if(year > year1)
			number =1;
			return number;		
	}
	
	public boolean validID() {
		String checksum11 = Integer.toString(checksum);
		if (checksum11.length()== 3) {
			checksum11 = "0"+checksum11;
		}
		if (checksum11.length()== 2) {
			checksum11 = "00"+checksum11;
		}
		if (checksum11.length()== 1) {
			checksum11 = "000"+checksum11;
		}
		if (checksum11.length()== 0) {
			checksum11 = "0000"+checksum11;
		}
		int one = Integer.parseInt(this.birthday.getDate(true).substring(2, 3)) * 2;
		int two = Integer.parseInt(this.birthday.getDate(true).substring(3, 4)) * 1;
		int three = Integer.parseInt(this.birthday.getDate(true).substring(4, 5)) *2;
		int four = Integer.parseInt(this.birthday.getDate(true).substring(5, 6)) *1 ;
		int five = Integer.parseInt(this.birthday.getDate(true).substring(6, 7))* 2;
		int six = Integer.parseInt(this.birthday.getDate(true).substring(7, 8)) * 1;
		int seven = Integer.parseInt(checksum11.substring(0, 1))*2;
		int eight =Integer.parseInt(checksum11.substring(1, 2)) *1 ;
		int nine = Integer.parseInt(checksum11.substring(2, 3))*2;
		if (one >= 10) { 
			one = (one/10) + (one %10);
		}
		if (seven >= 10) {
			seven = (seven/10) + (seven%10);
		}
		if (eight >= 10) {
			eight = (eight/10) + (eight % 10);
		}
		if (nine >= 10) {
			nine = (nine/10) +(nine %10);
		}
		int sum = 10 - ((one + two + three + four + five + six + seven + eight +nine)%10);
		if (sum==10) {sum = sum%10;}
		int ten = Integer.parseInt(checksum11.substring(3, 4));
		
		if(ten == sum) {
			this.valid = true;
			return this.valid;
		}		
		this.valid = false;
		return this.valid;		
	}

}
