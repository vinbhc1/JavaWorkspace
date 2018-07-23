package iDea.liveTV;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class EncryptAPI {

	
	
	public String Encrypt() {
				
		RestAssured.baseURI ="http://api.multitvsolution.com/automatorapi/v5/partner/encrypt";
		RequestSpecification request = RestAssured.given();
		
		request.formParam("Payload", "{\"type\":\"live\",\"id\":\"2037\"}");
		Response response = request.post(RestAssured.baseURI);
		
		
		return response.getBody().asString();
		
		/*System.out.println(response.getBody().asString());
		System.out.println(response.statusCode());
		*/
	
		//{\"type\":\"live\",\"id\":\"2037\"}
		
	}

}
