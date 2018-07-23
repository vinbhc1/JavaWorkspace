package idea.tz.com.idea.tz.com;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AuthenticationBasic {
	
	
	public static void main(String[] args) {
		
		RestAssured.baseURI = "http://restapi.demoqa.com/authentication/CheckForAuthentication";
		RequestSpecification request = RestAssured.given();
		
		//RestAssured.authentication =
		
		//request.given().auth().form("ToolsQA", "TestPassword");
		
		request.given().auth().basic("ToolsQA", "TestPassword");
		
		
		Response res = request.get();
		
		System.out.println(res.statusCode());
		System.out.println(res.getBody().asString());
		
	}
	



}
