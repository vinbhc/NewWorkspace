package idea.tz.com.idea.tz.com;



import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		RestAssured.baseURI ="http://restapi.demoqa.com/customer";
		RequestSpecification request = RestAssured.given();
		
		JSONObject requestParams = new JSONObject();
		
		requestParams.put("FirstName", "Virender"); // Cast
		requestParams.put("LastName", "Singh");
		requestParams.put("UserName", "simpleuse2111r001");
		requestParams.put("Password", "password2");
		requestParams.put("Email",  "requeszt@gmail.com");
		
		request.header("Content-Type", "application/json");
		
		request.body(requestParams.toString());

		// Post the request and check the response
		Response response = request.get("/register");
		
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getBody().asString());
		
	}

}
