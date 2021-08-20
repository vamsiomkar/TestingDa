package getAssertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class AssertBody {

	@BeforeClass
	public static void basicdata() {
		RestAssured.baseURI = "https://reqres.in/api";
		RestAssured.basePath = "/users";
	}
	
	@Test
	public static void BodySupportSection() {
		given().when().get("?page=2").then()
		.body("support.url", equalTo("https://reqres.in/#support-heading"))
		.body("support.text", equalTo("To keep ReqRes free, contributions towards server costs are appreciated!")).log().all();
	}
	
	@Test
	public static void ParentInfo() {
		
		given().when().get("?page=2").then()
		.body("page", equalTo(2))
		.body("per_page", equalTo(6))
		.body("total", equalTo(12))
		.body("total_pages", equalTo(2))
		.log().all();
	}
	
	@Test
	public static void SoftAssertParentInfo() {
		given().when().get("?page=2").then()
		.body("page", equalTo(2)
		,"per_page", equalTo(6)
		,"total", equalTo(12)
		,"total_pages", equalTo(2))
		.log().all();
	}
	
	
	
	@Test
	public static void listofitmes() {
		given().when().get("?page=2").then()
		.body("data.id", hasItems(7,8,9,10,11,12))
		.log();
	}
	
	
	@Test
	public static void vst() {
		given().when().get("?page=2").then()
		.body("data.first_name[3]", equalTo("Byron"))
		.log();	
		
	}
	
	
	
	
	
	
	
	
	
	
}
