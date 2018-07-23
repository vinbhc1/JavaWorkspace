package iDea.liveTV;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Streaming {

	public String  GetStreamURL() {
		// TODO Auto-generated method stub
		
		
		AuthCall ac = new AuthCall();
		String AV = ac.GatAuthToken();
		EncryptAPI ev1 = new EncryptAPI();
		String eValue1= ev1.Encrypt();
		
		
		System.out.println(eValue1);
		System.out.println(AV);
		
		RestAssured.baseURI= "http://api.multitvsolution.com/automatorapi/v5/partner/stream";
		RequestSpecification request = RestAssured.given();
		
		//Headers
		request.header("Content-Type","application/x-www-form-urlencoded");
		request.header("Authorization", AV);
		
		request.queryParam("Payload", eValue1);
		
		Response res = request.request(Method.GET);
		
		System.out.println(res.getBody().asString());
		
		
		return res.getBody().asString();
		
		

	}

}
