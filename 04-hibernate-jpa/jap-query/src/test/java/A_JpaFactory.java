
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author uhtin
 */
@TestMethodOrder(OrderAnnotation.class)
public class A_JpaFactory {

	protected static EntityManagerFactory emf;
	protected EntityManager em;
	
	@BeforeAll
	protected static void createEmf() {
		emf = Persistence.createEntityManagerFactory("query");
	}
	@AfterAll
	protected static void closeEmf() {
		if(null != emf && emf.isOpen())
			emf.close();
	}
	@BeforeEach
	protected void createEm() {
		em = emf.createEntityManager();
		System.out.println("\n ================================================ \n");
	}
	@AfterEach
	protected void closeEm() {
		if(null != em && em.isOpen())
			em.close();
		System.out.println("\n ================================================ \n");
	}
    @Test
    void inheritanceTest() {
        // Test code here
    }
}
