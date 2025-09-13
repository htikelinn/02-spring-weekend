package com.jdc.mkt.test;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.Product;

public class E_SynchronizationDb extends JpaFactory{

	@Test
	void test() {

		em.getTransaction().begin();
		var p = em.find(Product.class, 1);
		p.setName("Banana");
		em.flush();
		
		em.refresh(p);
		var p1 = em.find(Product.class, 1);
		
		System.out.println(p1.getName());
		
		em.getTransaction().commit();
		em.close();
	}

	@Test
	@Order(1)
	void test2() throws InterruptedException {
		var t1 = OperationOne();
		// var t2 = OperatonTwo();
		t1.join();
	}

	// private Object OperatonTwo() {
		
	// 	return null;
	// }

	private Thread OperationOne() {
		em.getTransaction().begin();
		System.out.println("=== Before UPdate Operation one ===");

		return null;
	}
}
