import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaFactory {

	protected static EntityManagerFactory emf ;
	
	@BeforeAll
        @SuppressWarnings("unused")
	static void init() {
		emf = Persistence.createEntityManagerFactory("inheritance-mappings");
	}
	
	@AfterAll
	static void closeEmf() {
		if(null != emf && emf.isOpen()) {
			emf.close();
		}
	}
	@Test
	void inheritanceTest() {
	}
}

