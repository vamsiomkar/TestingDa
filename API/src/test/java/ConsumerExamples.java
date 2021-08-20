import java.util.ArrayList;
import java.util.function.Consumer;

import org.testng.annotations.Test;

public class ConsumerExamples {
	@Test
	public static void test() {
		
		
		ArrayList<Employee> info=new ArrayList<Employee>();
		info.add(new Employee("Suja",225,5000,3));
		info.add(new Employee("oviya",22,5000,2));
		info.add(new Employee("losiya",223,5000,4));
		info.add(new Employee("lasya",25,5000,1));
		
		
		Consumer<Employee> css=obj->System.out.println(obj.ename);
		
		for (Employee employee : info) {
			css.accept(employee);
		}
		
		
	}
	
	

}
