import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.Address;
import com.jdc.mkt.entity.Employee;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaFactory {

	protected static EntityManagerFactory emf ;
	
	@BeforeAll
        @SuppressWarnings("unused")
	static void init() {
		emf = Persistence.createEntityManagerFactory("relation-demo");
	}
	
	@AfterAll
	static void closeEmf() {
		if(null != emf && emf.isOpen()) {
			emf.close();
		}
	}
	@Test
	void test() {
		var em = emf.createEntityManager();
		var address = new Address();
		var employee = new Employee();
		employee.setFirstName("John");
		employee.setLastName("Doe");
		employee.setEmail("l2V8o@example.com");
		address.setCurrentAddress("Dhaka");
		address.setParmententAddress("Chittagong");
		
		em.getTransaction().begin();
		em.persist(employee);
		em.persist(address);
		em.getTransaction().commit();
		em.close();
	}
}
