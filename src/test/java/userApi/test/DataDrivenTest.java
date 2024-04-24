package userApi.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

//import com.github.scribejava.core.model.Response;
import static io.restassured.RestAssured.*;
import userApi.endpoints.UserEndPoints;
import userApi.payload.User;
import userApi.utilities.DataProviders;

public class DataDrivenTest {
	@Test(priority = 1, dataProvider = "Data", dataProviderClass = DataProviders.class)
	public void testPostUser(String plotnumber, String street, String state, String country, String zipcode,
	                          String firstname, String lastname, String contactnumber, String emailid)
	{
		User userPayload=new User();
		userPayload.setPlotNumber(plotnumber);
		userPayload.setStreet(street);
		userPayload.setState(state);
		userPayload.setCountry(country);
		userPayload.setZipCode(Integer.parseInt(zipcode));
		userPayload.setUser_first_name(firstname);;
		userPayload.setUser_last_name(lastname);;
		userPayload.setUser_contact_number(Integer.parseInt(contactnumber));
		userPayload.setUser_email_id(emailid);
		
		io.restassured.response.Response response=UserEndPoints.CreateUser(userPayload);
		Assert.assertEquals(response.getStatusCode(), 201);
		
		String statusLine=	response.statusLine();
		System.out.println("Status line:"+statusLine);
		Assert.assertEquals(statusLine, "Created");
		
		long responseTime=response.getTime();
		Assert.assertTrue(responseTime<2000);
		
		String header1 =response.header("Content-Type"); 
		Assert.assertEquals(header1, "application/json");
		
		String cookie =response.getCookie("JSESSIONID"); 
		Assert.assertTrue(cookie!=null);
	}
//	@Test(priority=2)
//	public void testGetAllUser() {
//	io.restassured.response.Response response=UserEndPoints.getAllUser();
//response.then().log().all();
//Assert.assertEquals(response.getStatusCode(),200);
//
//
//	String statusLine=	response.statusLine();
//	System.out.println("Status line:"+statusLine);
//	Assert.assertEquals(statusLine, "HTTP/1.1 200 ");
//
//	long responseTime=response.getTime();
//	Assert.assertTrue(responseTime<2000);
//
//	String header1 =response.header("Content-Type"); 
//	Assert.assertEquals(header1, "application/json");
//
//
//
//	String cookie =response.getCookie("JSESSIONID"); 
//	Assert.assertTrue(cookie!=null);
//
//
//}
	
//	@Test(priority=3,dataProvider="userFirstname",dataProviderClass=DataProviders.class)
//	public void testGetUserByname(String firstname ) {
//		Response response=(Response) UserEndPoints.getUserByUserName(firstname);
//		Assert.assertEquals(response.getStatusCode(), 200);
//
//		String statusLine=	response.statusLine();
//		System.out.println("Status line:"+statusLine);
//		Assert.assertEquals(statusLine, "HTTP/1.1 200 ");
//
//		long responseTime=response.getTime();
//		Assert.assertTrue(responseTime<2000);
//
//		String header1 =response.header("Content-Type"); 
//		Assert.assertEquals(header1, "application/json");
//
//
//
//		String cookie =response.getCookie("JSESSIONID"); 
//		Assert.assertTrue(cookie!=null);
//
//	}
	
//	@Test(priority=4,dataProvider="userFirstname",dataProviderClass=DataProviders.class)
//	public void testDeleteUserByname(String firstname ) {
//		
//		Response response=(Response) UserEndPoints.deleteUserByUserName(firstname);
//		//Assert.assertEquals(response.g, 201);
//		
//		String statusLine=	response.statusLine();
//		//System.out.println("Status line:"+statusLine);
//		//Assert.assertEquals(statusLine, "HTTP/1.1 200 ");
//
//		long responseTime=response.getTime();
//		Assert.assertTrue(responseTime<2000);
//
//		String header1 =response.header("Content-Type"); 
//		Assert.assertEquals(header1, "application/json");
//
//
//
//		String cookie =response.getCookie("JSESSIONID"); 
//		Assert.assertTrue(cookie!=null);
//	}
//	

}
