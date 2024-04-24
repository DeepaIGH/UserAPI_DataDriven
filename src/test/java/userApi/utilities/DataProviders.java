package userApi.utilities;
import java.io.IOException;


import org.testng.annotations.*;
//import com.github.scribejava.core.model.Response;
//
//
//import io.restassured.http.ContentType;
//import io.restassured.response.ResponseOptions;
//import io.restassured.response.Validatable;
//import io.restassured.response.ValidatableResponse;
//import userApi.endpoints.UserEndPoints;
//import userApi.payload.User;

public class DataProviders {
	
	@DataProvider(name="Data")
	public String[][] getAllData () throws IOException{
		
		//String path= System.getProperty("user.dir")+"//testData//DataDrivenAPI.xlsx";
		String path = System.getProperty("user.dir") + "//testData//DDAPI.xlsx";;
	XLUtility xl=new XLUtility(path);
	int rownum	=xl.getRowCount("Sheet1");
	int colcount=xl.getCellCount( "Sheet1", 1);
	String apidata[][]=new String[rownum][colcount];
	for(int i=1;i<=1;i++) {
		
		for(int j=0;j<colcount;j++) {
			apidata[i-1][j]=xl.getCellData( "Sheet1", i, j);
		}
	}
		
	
		return apidata;
		
	}
	
	
	@DataProvider(name="userFirstname")
	public String[] getPlotNumber () throws IOException{
		
		String path= System.getProperty("user.dir")+"//testData//DataDrivenAPI.xlsx";
	XLUtility xl=new XLUtility(path);
	int rownum	=xl.getRowCount("Sheet1");
	int colcount=xl.getCellCount( "Sheet1", 1);
	String apidata[]=new String[rownum];
	for(int i=1;i<=rownum;i++) {
		
		for(int j=0;j<colcount;j++) {
			apidata[i-1]=xl.getCellData( "Sheet1", i, 5);
		}
	}
		
	
		return apidata;
		
	}

}
