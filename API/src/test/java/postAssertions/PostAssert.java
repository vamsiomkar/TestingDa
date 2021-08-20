package postAssertions;import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PostData.DataSource;
import io.restassured.RestAssured;
public class PostAssert {
	public static HashMap<String,String>pos=new HashMap();
	
	@BeforeClass
	public static void prequist() {
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/create";
		pos.put("name",DataSource.getName());
		pos.put("age",DataSource.getAge()); 
		pos.put("salary",DataSource.getSalary()); 
	}
	
	@Test
	public static void test() {
		given().contentType("application/json").body(pos).when().post().then().log().all();
	}
	
	//@Test
	public static void test1() {
		given().when().get().then().body("data.id", equalTo("156")).log().all();
	}

}
