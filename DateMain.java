package hk222su_assign3;

public class DateMain {
 public static void main (String[] args) {
	 
	 
	 DateFormat date = new DateFormat(2010, 4, 31, '/', 'b');
	 DateFormat date1 = new DateFormat(2016, 2, 29, '/', 'b');
	 DateFormat date2 = new DateFormat(2015, 2, 29, '/', 'm');
	 DateFormat date3 = new DateFormat(2014, 2, 29, '/', 'l');
	 DateFormat date4 = new DateFormat(2020, 2, 29, '/', 'l');
	 DateFormat date5 = new DateFormat(1900, 2, 29, '-', 'b');
	 //Testing what happens if I forget to set punctuation and format
	 DateFormat lateDate = new DateFormat();
	 lateDate.setYear(1904);
	 lateDate.setMonth(4);
	 lateDate.setDay(4);
	 
	 System.out.println(date.getDate(false));
	 System.out.println(date1.getDate(true));
	 System.out.println(date2.getDate(false));
	 System.out.println(date3.getDate(true));
	 System.out.println(date4.getDate(false));
	 System.out.println(date5.getDate(true));
	 System.out.println(lateDate.getDate(false));
	 
	 
 }
}
