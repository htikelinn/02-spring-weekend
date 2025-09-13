
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author uhtin
 */
public class JpaFactory {

	protected static EntityManagerFactory emf ;
	
	@BeforeAll
        @SuppressWarnings("unused")
	static void init() {
		emf = Persistence.createEntityManagerFactory("inheritance-mappings");
	}
	
	@AfterAll
        @SuppressWarnings("unused")
	static void closeEmf() {
		if(null != emf && emf.isOpen()) {
			emf.close();
		}
	}
	@Test
	void inheritanceTest() {
	}

}
