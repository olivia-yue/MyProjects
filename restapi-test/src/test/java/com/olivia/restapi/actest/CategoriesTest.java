package com.olivia.restapi.actest;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

public class CategoriesTest extends SetUpRestAPITest {
	
	@Parameters("categoryId")
	@Test(description = "Check detailes of the item that its category id is 6327.")
	public void getSpecificItemDetails(@Optional("6327") long categoryId) {
		
		RestAssured.defaultParser = Parser.JSON;
		Response response = given().when().get("/{categoryId}/Details.json?catalogue=false", categoryId);
		
		response.then().statusCode(200)
		.body("Name", equalTo("Carbon credits"))
		.body("CanRelist", equalTo(true))
		.body("Promotions.findAll { it.Name == 'Gallery'}.Description", hasItem(containsString("2x larger image")));	
	
	}
} 