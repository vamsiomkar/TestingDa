import java.util.ArrayList;
import java.util.function.Predicate;

import org.testng.annotations.Test;

public class PredicateConditions {

	@Test
	public void Andconditiontes() {
		ArrayList<Employee> Data = new ArrayList<>();
		Data.add(new Employee("Urvashi", 420, 30000, 5));
		Data.add(new Employee("neha", 42, 220000, 3));
		Data.add(new Employee("shriya", 410, 420000, 10));
		Data.add(new Employee("tamman", 220, 1420000, 7));

		Predicate<Employee> con1 = oj1 -> (oj1.eid == 42 && oj1.esalary > 4000);
		Predicate<Employee> con2 = oj2 -> (oj2.eexperiency > 2);
        System.out.println("This is the testing sameple for AND");
		for (Employee employee : Data) {
			
			if (con1.and(con2).test(employee)) {
				System.out.println(employee.ename);

			}
			 

		}

	}
	
	@Test
	public void ORconditiontes() {
		ArrayList<Employee> Data = new ArrayList<>();
		Data.add(new Employee("Urvashi", 420, 30000, 5));
		Data.add(new Employee("neha", 42, 220000, 3));
		Data.add(new Employee("shriya", 410, 420000, 10));
		Data.add(new Employee("tamman", 220, 1420000, 7));

		Predicate<Employee> con1 = oj1 -> (oj1.eid == 42 && oj1.esalary > 4000);
		Predicate<Employee> con2 = oj2 -> (oj2.eexperiency > 2);
		 System.out.println("This is the testing sameple for OR");
		for (Employee employee : Data) {
			if (con1.or(con2).test(employee)) {
				System.out.println(employee.ename);

			}
		

		}

	}
	@Test
	public void Negateconditiontes() {
		ArrayList<Employee> Data = new ArrayList<>();
		Data.add(new Employee("Urvashi", 420, 30000, 5));
		Data.add(new Employee("neha", 42, 220000, 3));
		Data.add(new Employee("shriya", 410, 420000, 10));
		Data.add(new Employee("tamman", 220, 1420000, 7));

		Predicate<Employee> con1 = oj1 -> (oj1.eid == 42 && oj1.esalary > 4000);
		Predicate<Employee> con2 = oj2 -> (oj2.eexperiency > 2);
		 System.out.println("This is the testing sameple for negate");
		for (Employee employee : Data) {	 
			if (con1.negate().test(employee)) {
				System.out.println(employee.ename);

			}

		}

	}


}
