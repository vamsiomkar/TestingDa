package getAssertions;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Datalist.Datum;
import Datalist.PersonalData;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.List;
public class complexone {
	@BeforeClass
	public static void basicdata() {
		RestAssured.baseURI = "https://reqres.in/api";
		RestAssured.basePath = "/users";
	}
	
	
	@Test
	public static void AssertStatuCode() {
		Response response = given()
		.contentType("application/json")
		.when()
		.get("?page=2");
		
		PersonalData pers=response.as(PersonalData.class ,ObjectMapperType.GSON);
		List<Datum> datainfo = pers.getData();
		SoftAssert soft =new SoftAssert();
		for (Datum datum : datainfo) {
			soft.assertTrue(datum.getId() == 7);
			soft.assertEquals(datum.getAvatar(), "https://reqres.in/img/faces/7-image.jpg");
			soft.assertEquals(datum.getFirstName(), "Lindsay");
			soft.assertAll();

		}
		 
		
		response.then().log().all();
		
		
		
		
	}
}
