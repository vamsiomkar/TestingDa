import org.testng.annotations.Test;

interface Ride{
	
	public void selectCar(String CarName);
}


public class ParameterLamda {

	
	@Test
	public static void ridding() {
		Ride ride =(carName)->System.out.println("user is riding "+carName);
		ride.selectCar("Benze");
		
		//OR
		
		Ride rid =carName->System.out.println("user is riding "+carName);
		rid.selectCar("Benze");	
	}
	
	
}
