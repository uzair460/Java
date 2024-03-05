/**
 * A test class to test the creation of different car objects and the use of the setters and getters methods.
 * @author A. Razak
 *
 */
public class testcar {
	
	/**
	 * The maim method.
	 * @param args
	 */
	 public static void main (String[] args)
	 {
	  car car1 = new car("Toyota", "Corolla" , 2003);
	  car car2 = new car("Nissan", "Murano" , 2004);
	  car car3 = new car("Infinity", "Mazda" , 2013);
	   
	  car1.setMake("BMW");
	  car1.printDetails();
	  System.out.println(car1.getYear());
	 
	  car2.setModel("Altima");
	  car2.printDetails();
	  System.out.println(car2.getMake());
	   
	  car3.setYear(2012);
	  car3.printDetails();
	  System.out.println(car3.getModel());
	 
	 
	 }

}