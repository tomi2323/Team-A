package services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;

import entity.Reply;
import entity.Users;
import manager.ManagerHelper;

@Path("/userservice")
public class Userservice {

	
	@GET
	@Path("user")
	public Users getuser(@QueryParam("id") int id) {
		
		return ManagerHelper.getusermanager().get(id);
	}
	@GET
	@Path("deleteUser")
	public Reply deleteUser(@QueryParam("id")int id){
		return ManagerHelper.getusermanager().deleteUser(id);
	}
	@GET
	@Path("getUserByUsernameAndPass")
	public Users getUserByUsernameAndPass (@QueryParam("username") String username, @QueryParam("password") String password) {
		if (username.equals(username)&&password.equals(password)) {
			return ManagerHelper.getusermanager().getUserByUsernameAndPass(username, password);	
	}else{
		return null;	
	}
		
	}
}




