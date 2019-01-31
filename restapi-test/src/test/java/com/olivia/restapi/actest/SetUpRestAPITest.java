package com.olivia.restapi.actest;

import org.testng.annotations.BeforeClass;
import io.restassured.RestAssured;
import java.util.ResourceBundle;

public class SetUpRestAPITest {
	
	private static final ResourceBundle settingsBundle = ResourceBundle.getBundle("settings");
	
	@BeforeClass
	public static void setUp() {
		String port = System.getProperty("server.port");
		if(port == null) {
			RestAssured.port = Integer.valueOf(settingsBundle.getString("port"));
		}
		else {
			RestAssured.port = Integer.valueOf(port);
		}
		
		String basePath = System.getProperty("server.base");
		if(basePath == null) {
			RestAssured.basePath = settingsBundle.getString("base.path");
		}
		else {
			RestAssured.basePath = basePath;
		}
		
		String baseURI = System.getProperty("server.host");
		if(basePath == null) {
			RestAssured.baseURI = settingsBundle.getString("base.uri");
		}
		else {
			RestAssured.baseURI = baseURI;
		}
		
	}

}
