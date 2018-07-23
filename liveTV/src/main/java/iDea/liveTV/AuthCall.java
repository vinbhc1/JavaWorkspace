package iDea.liveTV;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

public class AuthCall {
	

	public String GatAuthToken(){
	
	RestAssured.baseURI= "http://api.multitvsolution.com/automatorapi/v5/partner/auth";
	RequestSpecification httpRequest = RestAssured.given();
	httpRequest.header("Content-Type", "application/json");
	httpRequest.header("Authorization","MlV3YTlMN3lKQm1SNzZzZWdlcHd4VHlNOUxGNXJRVmJXOStFZDhoZVFoUWFIdndteE94ejVhaVY0M1RXZWlQMw==");
		
	io.restassured.response.Response response = httpRequest.request(Method.GET);
	
	
	String AuthTokenResp = response.getBody().asString() ;
	
	return AuthTokenResp;
	
	
}
	
	

}


