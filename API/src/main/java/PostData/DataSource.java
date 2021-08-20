package PostData;

public class DataSource {
	
	private static  String name;
	private static  String  salary;
	private static  String  age;
	
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		DataSource.name = "UshaRani";
		//DataSource.name = name;
	}
	public static String getSalary() {
		return salary;
	}
	public static void setSalary(String salary) {
		//DataSource.salary = salary;
		DataSource.salary = "50k";
	}
	public static String getAge() {
		return age;
	}
	public static void setAge(String age) {
		//DataSource.age = age;
		DataSource.age = "32";
	}
	
	

}
