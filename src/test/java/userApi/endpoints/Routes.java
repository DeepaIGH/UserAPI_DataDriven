package userApi.endpoints;

//post: https://userapi-8877aadaae71.herokuapp.com/uap/createusers
//get all:   https://userapi-8877aadaae71.herokuapp.com/uap/users
//get id:https:   //userapi-8877aadaae71.herokuapp.com/uap/user/{userId}
//get username:   https://userapi-8877aadaae71.herokuapp.com/uap/users/username/{userFirstName}
//put id:https:   //userapi-8877aadaae71.herokuapp.com/uap/updateuser/{userId}
//delete id:Endpoint : https://userapi-8877aadaae71.herokuapp.com/uap/deleteuser/username/{userfirstname} 
//delete username:    https://userapi-8877aadaae71.herokuapp.com/uap/deleteuser/{userId}

public class Routes { 
	
	
	public static String base_url="https://userapi-8877aadaae71.herokuapp.com/uap";
	
	public static String post_url= base_url+"/createusers";
	public static String getAll_url=base_url+"/users";
	public static String getById_url=base_url+"/user/{userId}";
	public static String getByUserName_url=base_url+"/users/username/{userFirstName}";
	public static String Put_url=base_url+"/updateuser/{userId}";
	public static String DeleteByUserName_url=base_url+"/deleteuser/username/{userFirstname}";
	public static String deleteById_url =base_url+"/deleteuser/{userId}";
	
	

}
