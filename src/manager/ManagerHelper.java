package manager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;





public class ManagerHelper {

	public static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("team");


		
	
	
	public static UserManager getusermanager() {

		return new UserManager(entityManagerFactory.createEntityManager());

	}
	
	

	
	
}