import java.util.function.Function;
import java.util.function.Supplier;

import org.testng.annotations.Test;

public class SupplierExamples {

	
	@Test
	public static void mist() {
		Supplier<String> sus=()->"Vamsi";
		
		System.out.println(sus.get());
	}
	
	
	
}
