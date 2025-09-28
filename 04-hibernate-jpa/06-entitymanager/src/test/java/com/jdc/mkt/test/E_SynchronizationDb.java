package com.jdc.mkt.test;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.Product;

public class E_SynchronizationDb extends JpaFactory{

	@Test
	void test() {

<<<<<<< HEAD
<<<<<<< HEAD
		Thread opeOne = OperationOne(5000);
		Thread opeTwo = OperationTwo(15000);
		opeOne.start();
		opeTwo.start();
		Thread.sleep(1500);

	}

	private Thread OperationOne(double balance) {
		return new Thread(() -> {
			var em = emf.createEntityManager();
			var a1 = em.find(Account.class, 1);
			
			try {
				em.getTransaction().begin();
				System.out.println("=====  Before update opertaion one ======");

				System.out.println("===== (One) Before Update Balance :" + a1.getBalance() + " ======");

				Thread.sleep(800);
				
				em.refresh(a1);
				
				a1.setBalance(a1.getBalance() + balance);
				System.out.println("=====  After update opertaion one ======");

				System.out.println("=====(One)After Update Balance :" + a1.getBalance() + " ======");

				em.getTransaction().commit();
				em.close();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
=======
=======
>>>>>>> c1472228983a317981676c25ffba6e7cfe0e2c8b
		em.getTransaction().begin();
		var p = em.find(Product.class, 1);
		p.setName("Banana");
		em.flush();
		
		em.refresh(p);
		var p1 = em.find(Product.class, 1);
		
		System.out.println(p1.getName());
		
		em.getTransaction().commit();
		em.close();
<<<<<<< HEAD
	}

	@Test
	@Order(1)
	void test2() throws InterruptedException {
		var t1 = OperationOne();
		// var t2 = OperatonTwo();
		t1.join();
	}

<<<<<<< HEAD
	private Object OperatonTwo() {
>>>>>>> b27e848 (update test)
=======
	// private Object OperatonTwo() {
>>>>>>> b0bb33f (Some settings are change)
		
	// 	return null;
	// }

	private Thread OperationOne() {
		em.getTransaction().begin();
		System.out.println("=== Before UPdate Operation one ===");

		return null;
=======
>>>>>>> c1472228983a317981676c25ffba6e7cfe0e2c8b
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
