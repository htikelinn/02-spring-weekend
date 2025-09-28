package com.jdc.mkt.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;

import com.jdc.mkt.utils.anno.Connector;
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> b27e848 (update test)
=======
>>>>>>> c1472228983a317981676c25ffba6e7cfe0e2c8b
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@Connector
@TestMethodOrder(OrderAnnotation.class)
public class JpaFactory {

	static EntityManagerFactory emf;
	// public static PrintLogger logger;
	EntityManager em;
	
	@BeforeAll
	static void init() {
		emf = Persistence.createEntityManagerFactory("06-entitymanager");
		// logger = PrintLogger.getInstance(JpaFactory.class);
	}
	
	@AfterAll
	static void closeEmf() {
		if(null != emf && emf.isOpen())
			emf.close();
	}
	
	@BeforeEach
	void createEm() {
		em = emf.createEntityManager();		
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
	@AfterEach
	void log() {
		
		//logger.printTableByStringQuery("select * from category_tbl");
		//logger.printTableByStringQuery("select * from product_tbl");
=======
=======
>>>>>>> c1472228983a317981676c25ffba6e7cfe0e2c8b
	// @AfterEach
	// void log() {
	// 	logger.printTableByStringQuery("select * from category_tbl");
	// 	logger.printTableByStringQuery("select * from product_tbl");
<<<<<<< HEAD
>>>>>>> b27e848 (update test)
=======
>>>>>>> c1472228983a317981676c25ffba6e7cfe0e2c8b
			
	// }
	
}
