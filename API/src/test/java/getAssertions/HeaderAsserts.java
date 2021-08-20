package getAssertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class HeaderAsserts {

	@BeforeClass
	public static void basicdata() {
		RestAssured.baseURI = "https://reqres.in/api";
		RestAssured.basePath = "/users";
	}

	@Test
	public static void AssertingHeaders() {

		given()
		
		.when()
		
		.get("?page=1")
		
		
		.then()
		    .headers("Content-Type", equalTo("application/json; charset=utf-8"))
		     .headers("Content-Type", equalTo("application/json; charset=utf-8"))
		     .headers("Transfer-Encoding", equalTo("chunked"))
		     .headers("Connection", equalTo("keep-alive"))
		    //.headers("x-powered-by:", equalTo("Express"))
		    .headers("via", equalTo("1.1 vegur"))
	     	.headers("Cache-Control", equalTo("max-age=14400"))
	    	//.headers("CF-Cache-Status", equalTo("HIT"))
		    //.headers("Age", equalTo("235"))
		   .headers("Vary", equalTo("Accept-Encoding"))
		   .headers("Server", equalTo("cloudflare"))
		  //.headers("CF-RAY", equalTo("64c39f42ab550fd6-MRS"))
		   .headers("Content-Encoding", equalTo("gzip")).log()
			.all();

	}
	
	@Test
	public static void SoftAssertingHeaders() {

		given().when().get("?page=1").then().headers("Content-Type", equalTo("application/json; charset=utf-8"))
		.headers("Content-Type", equalTo("application/json; charset=utf-8"))
		.headers("Transfer-Encoding", equalTo("chunked"))
		.headers("Connection", equalTo("keep-alive")
		,"x-powered-by:", equalTo("Express")
		,"via", equalTo("1.1 vegur")
		,"Cache-Control", equalTo("max-age=14400")
		,"CF-Cache-Status", equalTo("HIT")
		,"Age", equalTo("235")
		,"Vary", equalTo("Accept-Encoding")
		,"Server", equalTo("cloudflare")
		,"CF-RAY", equalTo("64c39f42ab550fd6-MRS")
		,"Content-Encoding", equalTo("gzip")).log()
				.all();

	}

}
