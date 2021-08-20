import java.util.function.Predicate;

import org.testng.annotations.Test;

interface Cab
 {
	public void testcar();
}

public class Lamda1 {
	
	
	@Test
	public void run() {
		/*testDrive drive=new testDrive();
		drive.testcar();*/
		
		Cab drive=()->System.out.println("Driving the car");
		drive.testcar();
		
	}
	@Test
	public void run1() {
		Predicate<String> pst=value->(value.length()>4);
		System.out.println(pst.test("Vamsi"));
		
	}
	
	
}
