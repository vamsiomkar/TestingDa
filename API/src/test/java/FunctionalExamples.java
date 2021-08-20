import java.util.ArrayList;
import java.util.function.Function;

import org.testng.annotations.Test;

public class FunctionalExamples {
	
	
	
	@Test
	public static void mist() {
		Function<String,Integer> fsd=srt->srt.length();
		System.out.println(fsd.apply("Vamsi krishna"));
	}
	
	
	@Test
	public static void testmp() {
	
		ArrayList<Employee> info=new ArrayList<Employee>();
		info.add(new Employee("Suja",225,5000,3));
		info.add(new Employee("oviya",22,5000,2));
		info.add(new Employee("losiya",223,5000,4));
		info.add(new Employee("lasya",25,5000,1));
		
		
		Function<Employee,Boolean> fsd=obj->{
			return  (obj.eid%2==0 && obj.esalary>200);
					
		};
		
		for (Employee employee : info) {
			
			if(fsd.apply(employee)) {
				System.out.println(employee.ename);
			}
			
		}
		
		
		
		
	}

}
