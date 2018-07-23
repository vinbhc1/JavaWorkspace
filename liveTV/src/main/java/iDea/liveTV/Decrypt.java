package iDea.liveTV;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Decrypt {
	
	
public static void main(String[] args) {
	
	Streaming st = new Streaming();
	String SUrl = st.GetStreamURL();
	
	
	
	System.out.println("Encoded streaming url" + SUrl);
	RestAssured.baseURI="http://api.multitvsolution.com/automatorapi/v5/partner/decrypt";
	RequestSpecification httpRequest = RestAssured.given();
	httpRequest.header("Content-Type","application/json");
	
	
	httpRequest.formParam("Payload", SUrl);

	
	
	//httpRequest.body(eValue);
	
	
	
	Response response = httpRequest.post(RestAssured.baseURI);
	System.out.println(response.getBody().asString());

	System.out.println(response.getContentType());
	
	
	
	

	
	
}

}
