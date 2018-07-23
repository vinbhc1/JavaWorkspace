import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

public class HomeAPI extends RestConstants {
	
public static void main(String[] args) {
	
	RestAssured.baseURI= "https://con.ideamovieclub.net";
	
	RequestSpecification httpRequest = RestAssured.given();
	
	io.restassured.response.Response response = httpRequest.request(Method.GET, "LiveTv");
	
	String responeBody = response.getBody().asString();
	
	System.out.println(responeBody);
	
	
	
}

}
