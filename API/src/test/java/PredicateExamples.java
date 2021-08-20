import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.function.Predicate;


class Employee{
	public String ename;
	public  int eid;
	public  int esalary; 
	public int eexperiency;
	
	
	Employee(String name,int id,int salary, int experiency){
		ename=name;
		eid=id;
		esalary=salary;
		eexperiency=experiency;
	}
}






public class PredicateExamples {
	
	@Test(priority=0)
	public static void intBasic() {
		Predicate<Integer> pds=num->num>20;
		System.out.println(pds.test(11));
	}
	
	
	@Test(priority=1)
	public static void intBasic2() {
		Predicate<Integer> pds=num->num%2==0;
		System.out.println(pds.test(24));
	}
	
	
	@Test(priority=2)
	public static void StringBasic() {
		Predicate<String> pds=str->str.length()>0;
		System.out.println(pds.test("Welcome to technical discussion"));
	}
	
	
	@Test(priority=3)
	public static void StringBasic2() {
		Predicate<String> pds=str->str.length()%2==0;
		System.out.println(pds.test("Vamsi krishna"));
	}
	
	
	@Test(priority=4)
	public static void UsingObject() {
		Employee emp=new Employee("Urvashi",420,420000,20);
		Predicate<Employee> poj=ojs->(ojs.eid>400 && ojs.esalary>4000 && ojs.eexperiency>3);
		System.out.println(poj.test(emp));
	}
	
	
	@Test(priority=5)
	public static void mulitpleValues() {
		
		Predicate<Employee> poj=ojs->(ojs.eid>400 && ojs.esalary>4000 && ojs.eexperiency>3);
		
		
		ArrayList<Employee>Data=new ArrayList<>();
		Data.add(new Employee("Urvashi",420,30000,5));
		Data.add(new Employee("neha",42,220000,3));
		Data.add(new Employee("shriya",410,420000,10));
		Data.add(new Employee("tamman",220,1420000,7));
		
		for (Employee emp : Data) {
			System.out.println(poj.test(emp));
		}
			
	}
	
}
