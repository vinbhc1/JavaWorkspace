package idea.tz.com.idea.tz.com;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;



public class App extends RestConstants
{
    public static void main( String[] args )
    {
       
    	
    	App a = new App();
    	
    	RestAssured.baseURI= "https://con.ideamovieclub.net";
    	
    	RequestSpecification httpRequest = RestAssured.given();
    	httpRequest.header("Content-Type", "application/json");
    	
    //io.restassured.response.Response response = httpRequest.request(Method.GET, "/v1/livestreams?iosbuildversion=2.2.6");
    	
    	io.restassured.response.Response response = httpRequest.request(Method.GET, a.LiveTV );
    	
    	
    	
    	int PAGE_SIZE = response.optjson;
        JSONArray jsonArray = ((JSONArray) response).optJSONArray("LiveTvArr");
Object tvList;
		//            if (null != jsonArray)
//             PAGE_SIZE = jsonArray.length ();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jObject;
            ContentAPIResponse item = new ContentAPIResponse();

            try {
                jObject = jsonArray.getJSONObject(i);
                item.setAssetId("" + jObject.optInt("id"));
                item.setChannelId("" + jObject.optString("channel_id"));
                item.setMovieName(jObject.optString("name"));
                item.setDescription(jObject.optString("description"));
                item.setImageUrl(jObject.optString("image_url"));
                item.setMovieName(jObject.optString("program_name"));
                item.setVendor_content_id(jObject.optString("content_id"));
                item.setContent_Id(jObject.optString("content_id"));
                item.setCpCode(jObject.optString("cp_code"));
                item.setVendor_content_id(jObject.optString("vendor_id"));
                item.setMovieUrl(jObject.optString("steam_url"));
                item.setShareText(jObject.optString("share_text"));
                item.setShareLink(jObject.optString("share_link"));
                item.setContentType(ContentType.LIVE_CHANNEL);
                ((Object) tvList).add(item);

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return tvList;
    }
    	
    	/*
    	
    	System.out.println(response);
    	
    	
  

    	
    	//ResponseBody<?> body = response.getBody();
    	
    	//ContentAPIResponse ct = body.as(ContentAPIResponse.class);
    	
    	//System.out.println(ct.name);
    	
    	int StatusCode = response.getStatusCode();
    	
    	Assert.assertEquals(StatusCode, 200, "Correct status code");
    	
    	//String responeBody = response.getBody().asString();
    	
    	System.out.println(response.headers());
    	//System.out.println(response.get);
    	System.out.println("Status Code" + response.getStatusCode());
    	
    	System.out.println(response.getBody().asInputStream());
    	
    	
    	System.out.println(response.header("Content-Type"));
    	
    	
    	
    	//System.out.println(response.getBody().asString());
    	
    //	JsonPath je = response.jsonPath();
    	
    	List<String> allBooks = je.getList("[0].cp_code");                  //("[0].name");
    	 
    	// Iterate over the list and print individual book item
    	for(String book : allBooks)
    	{
    		System.out.println("Book: " + book);
    	}
    	
    	
    	
    	
    	//System.out.println(j);
    	
    		
    	
    	Headers allHeaders = response.headers();
    	 
    	// Iterate over all the Headers
    	for(Header header : allHeaders)
    	{
    		//System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
    	}
    	*/
    	
    }
}
