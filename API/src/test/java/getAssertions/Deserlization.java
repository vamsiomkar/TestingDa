package getAssertions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Datainfo.Data;
import Datainfo.Datas;
import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Deserlization {
	
	
	@BeforeClass
	public static void basicdata() {
		RestAssured.baseURI = "https://reqres.in/api";
		RestAssured.basePath = "/users/2";
	}
	
	@Test
	public static void datainfo() {
		Response response = given().when().get();
		Datas dts = response.as(Datas.class, ObjectMapperType.GSON);
		Data values = dts.getData();
		Assert.assertTrue(values.getId() == 2);
		response.then().log().all();

	}
	
	@Test
	public static void Support() {
		Response response = given().when().get();
		Datas dts = response.as(Datas.class, ObjectMapperType.GSON);
		 Datainfo.Support values = dts.getSupport();
		Assert.assertEquals(values.getText(), "To keep ReqRes free, contributions towards server costs are appreciated!");
		Assert.assertEquals(values.getUrl(), "https://reqres.in/#support-heading");
		response.then().log().all();

	}

}
