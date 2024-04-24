package userApi.endpoints;

//import com.github.scribejava.core.model.Response;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import userApi.payload.User;

import static io.restassured.RestAssured.*;

public class UserEndPoints {
	

	public static io.restassured.response.Response CreateUser(User payload) {
		io.restassured.response.Response response=given().auth().basic("Numpy@gmail.com", "userAPI").header("Content-type", "application/json").and().body(payload).when().post(Routes.post_url);
		return response;
		
	}
	
	public static io.restassured.response.Response getAllUser() {
		io.restassured.response.Response response=given().auth().basic("Numpy@gmail.com", "userAPI").when().get(Routes.getAll_url);
		return response;
		
	}
	
	public static Response getUserByUserName(String userFirstName) {
		Response response=(Response) given().auth().basic("Numpy@gmail.com", "userAPI").pathParam("userFirstName", userFirstName).when().get(Routes.getByUserName_url);
		return response;
		
	}
	public static Response getUserByUserId(String userId) {
		Response response=(Response) given().auth().basic("Numpy@gmail.com", "userAPI").pathParam("userId", userId).when().get(Routes.getById_url);
		return response;
		
	}
	public static Response updateByUserId(int userId,User payload) {
		Response response=(Response) given().auth().basic("Numpy@gmail.com", "userAPI").contentType(ContentType.JSON).accept(ContentType.JSON).body(payload).pathParam("userId", userId).when().put(Routes.Put_url);
		return response;
		
	}
	public static Response deleteUserByUserId(int userId) {
		Response response=(Response) given().auth().basic("Numpy@gmail.com", "userAPI").pathParam("userId", userId).when().delete(Routes.deleteById_url);
		return response;
		
	}
	public static Response deleteUserByUserName(String userFirstname) {
		Response response=(Response) given().auth().basic("Numpy@gmail.com", "userAPI").pathParam("userFirstname", userFirstname).when().delete(Routes.DeleteByUserName_url);
		return response;
		
	}

}
