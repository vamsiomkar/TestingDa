package practiceWork;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class GetRequests11072021 {
	
	@BeforeClass
	public static void prequesit() {
		RestAssured.baseURI="https://reqres.in/api";
		RestAssured.basePath="/users?page=2";
	}
	
	@Test
	public static void Step1() {

		Response respose = given().when().get();
		
		respose.then().body("page",equalTo(1));
		respose.then().body("data[0].first_name", equalTo("George"));
		Assert.assertEquals(respose.path("data[1].first_name"), "Janet");
		
		SoftAssert sof=new SoftAssert();
		sof.assertEquals(respose.path("data[1].first_name"), "Janet1");
		
		sof.assertAll();
		respose.then().log().all();
		
		
	}

}
