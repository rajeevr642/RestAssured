package com.ust.rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Rest {
	String accesToken;
//  @Test
//  public void f() {
//	  Integer idVal = 15;
//	  RestAssured.baseURI = "https://petstore.swagger.io/";
//	  RestAssured.basePath = "v2";
//	 
//	  Response response = null;
//	 
//	  try {
//	   response = RestAssured.given().pathParam("id", idVal)
//	    .when()
//	    .get("/pet/{id}");
//	  } catch (Exception e) {
//	   e.printStackTrace();
//	  }
//	 
//	  System.out.println("Response :" + response.asString());
//	  System.out.println("Status Code :" + response.getStatusCode());
//  }
  
//	@Test
//	public void test() {
//		String idVal = "100";
//		  RestAssured.baseURI = "https://petstore.swagger.io/";
//		  RestAssured.basePath = "v2";
//		 
////		  Response response = null;
////		 
////		  try {
////		   response = RestAssured.given().pathParam("id", idVal)
////		    .when()
////		    .get("/pet/{id}");
////		  } catch (Exception e) {
////		   e.printStackTrace();
////		  }
////		 
////		  System.out.println("Response :" + response.asString());
////		  System.out.println("Status Code :" + response.getStatusCode());
//		 
//	}
//	
//	@Test
//	public void createUser()
//	{
//		  RestAssured.baseURI = "https://petstore.swagger.io/";
//		  RestAssured.basePath = "v2";
//		User user = new User(001,"id1","rajeev","ra","r@gmail.com","test","123",1);
//		RequestSpecification req = RestAssured.given().log().all().contentType(ContentType.JSON).body(user);
//		Response res =  req.post("/user");
//		res.then().log().all();
//		res.then().body("code", equalTo(200));
//		System.out.println("header-----"+res.getHeader("Content-Type"));
//		//res.then().body("findall{it.code>0}.message",hasItem("1")); Need to try in collections
//	}
	
//	@Test(priority=1)
//	public void auth2()
//	{
//		RestAssured.baseURI = "https://api.sandbox.paypal.com";
//
//		RestAssured.basePath = "v1";
//
//		Response res = RestAssured.given().log().all().param("grant_type", "client_credentials").auth().preemptive()
//				.basic("AcLJYXbewnk-8kbIQXIOPIe3AXXXB4WbxWC6x7hPK06jlxpFeIitmBtpT0MR-UWATGyVo44HIM5kw3Ow",
//						"EGhmuQyuFzUozIsWCaEUkERrmKBMucrOz4dAONqOXwPtmc6ZIB87_As-CN7326-vg--0H44S9Gc3jV0J")
//				.post("/oauth2/token");
//		res.prettyPrint();
//		accesToken = res.jsonPath().getString("access_token");
//	}
//	
//	@Test(priority=2)
//	public void doingPaymentWithOauth2Autentication()
//	{
//		String rootPath = System.getProperty("user.dir");
//		String filePath = rootPath+ "/testdata/payment.json";
//		System.out.println("Path-------------"+filePath);
//		File file = new File(filePath);
//		RestAssured.baseURI = "https://api.sandbox.paypal.com";
//		RestAssured.basePath = "v1";
//		
//		Response res = RestAssured.given().contentType(ContentType.JSON).log().all().auth().oauth2(accesToken).body(file).post("/payments/payment");
//		
//		System.out.println("Status---"+ res.getStatusCode());
//		
//	}
// @Test
//	public void oAuthOneTest() {
//		Response res = RestAssured.given().log().all().baseUri("https://api.twitter.com/1.1/statuses").auth()
//				.oauth("tpm97q7gPXm4g3EA0oUmtmBCq", "UyFugasDCBN9HfaT0uDe9Sbtvs5Vdh6LfznQxAqFhwgUTQACaT",
//						"945645824456953856-ZIjXUDRrzQ4dGSKkT294tvqcIZy1GKl",
//						"RY0CXsAwTWDmsuPJGV6QOJJ1XwjkSYuTL8pYUNVYk8b4v")
//				.queryParam("status", "This tweet was created using rest assured 834711").post("/update.json");
//		Assert.assertEquals(res.getStatusCode(), 200);
//		res.prettyPrint();
//	}



	
//	@Test
//	public void basicAuthenticaion()
//	{
//		RequestSpecification request = 	RestAssured.given().baseUri("http://restapi.demoqa.com/authentication").auth().basic("ToolsQA", "TestPassword");
//	
//	request.log().all();
//	Response res = request.get("/CheckForAuthentication");
//	res.prettyPrint();
//	}
	
	
//	@Test
//	public void createPet()
//	{
//		  RestAssured.baseURI = "https://petstore.swagger.io/";
//		  RestAssured.basePath = "v2";
//		String petInfo = "{\n" + 
//				"  \"id\": 20,\n" + 
//				"  \"category\": \n" + 
//				"      {\n" + 
//				"    \"id\": 1,\n" + 
//				"    \"name\": \"cat1\"\n" + 
//				"     },\n" + 
//				" \n" + 
//				"  \"name\": \"doggie\",\n" + 
//				"  \"photoUrls\": [\n" + 
//				"    \"urltest\"\n" + 
//				"  ],\n" + 
//				"  \"tags\": [\n" + 
//				"    {\n" + 
//				"      \"id\": 1,\n" + 
//				"      \"name\": \"tag1\"\n" + 
//				"    },\n" + 
//				"    {\n" + 
//				"      \"id\": 2,\n" + 
//				"      \"name\": \"tag2\"\n" + 
//				"    }\n" + 
//				"  ],\n" + 
//				"  \"status\": \"available\"\n" + 
//				"}s";
//		
//		RequestSpecification request = RestAssured.given().contentType(ContentType.JSON).body(petInfo);
//				request.log().all();
//				Response res = request.post("/pet");
//				res.then().log().all();
//				res.then().log().body();
//				res.then().log().headers();
//				res.then().log().ifError();
//		Assert.assertEquals(res.getStatusCode(),200);
//		Assert.assertTrue(res.getBody().asString().contains("doggie"));
		
//	}
//	
	@DataProvider
	public Object[][] dpGetWithParam() {
		Object[][] testDatas = new Object[][] { 
			new Object[] { 1, 1,"tom","jerry","www.google.com","www.ust.com","www.pst.com",11,"testing",12,"resting","available" },
			new Object[] {2, 11,"tomy","jerry","www.google.com","www.ust.com","www.pst.com",13,"testing",15,"resting","available" } };
		return testDatas;
	}
	
	@Test(dataProvider = "dpGetWithParam")
	public void createPetWithData(int petId, int cId, String cName, String name, String p1, String p2, String p3, int tId, String tName, int tId_one,String tNameOne, String status )
	{
		  RestAssured.baseURI = "https://petstore.swagger.io/";
		  RestAssured.basePath = "v2";
		Category c = new Category(cId,cName);
		Tag t = new Tag(tId,tName);
		Tag t1 = new Tag(tId_one,tNameOne);
		String[] ph = new String[] {p1,p2,p3};
		Tag[] ar = new Tag[] {t,t1};
		Pet pt = new Pet(petId,c,name,ph,ar,status);
		RequestSpecification request = RestAssured.given().contentType(ContentType.JSON).body(pt);
		request.log().all();
		Response res = request.post("/pet");
		res.then().log().all();
		System.out.println(res.getHeader("Content-Type"));
	}

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
