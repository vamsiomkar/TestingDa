package getAssertions;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class AssertStatus {
	@BeforeClass
	public static void basicdata() {
		RestAssured.baseURI = "https://reqres.in/api";
		RestAssured.basePath = "/users";
	}
	@Test
	public static void AssertStatuCode() {
		given()
		.contentType("application/json")
		.when()
		.get("?page=2")
		.then()
		.statusCode(200)                        //This is used to verify status code
		.statusLine("HTTP/1.1 200 OK")          //This is used to verify status line
		.log()
		.all();
	}

}
