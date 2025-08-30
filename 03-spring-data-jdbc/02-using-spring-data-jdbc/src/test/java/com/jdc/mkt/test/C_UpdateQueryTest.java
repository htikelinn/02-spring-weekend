package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.mkt.AppConfig;
import com.jdc.mkt.dao.C_JdbcTemplate_UpdateService;
import com.jdc.mkt.dto.Person;
import com.jdc.mkt.dto.Person.Days;

@TestMethodOrder(OrderAnnotation.class)
@SpringJUnitConfig(classes = AppConfig.class)
public class C_UpdateQueryTest {

	@Autowired
	C_JdbcTemplate_UpdateService service;
	
	@Test
	@Order(3)
	@DisplayName("3.update person_tbl with object var args")
	@Sql(scripts = {
			"classpath:/person.sql",
			"classpath:/insert.sql"
	})
	void testThree(@Value("${p.update.name.age.and.day}")String query) {
		var p = new Person();
		p.setName("Sopheia");
		p.setAge(30);
		p.setDay(Days.SUNDAY);
		var key = service.updatePersonWithObjectParams(query,"Juergen Hoeller",43,Days.MONDAY,1);
		System.out.println("Primary Key :"+key);
	}
	
	@Test
	@Order(2)
	@DisplayName("2.insert person_tbl with params types and values")
	@Sql(scripts = {
			"classpath:/person.sql",
			"classpath:/insert.sql"
	})
	void testTwo(@Value("${p.prep.insert}")String query) {
		var p = new Person();
		p.setName("Sopheia");
		p.setAge(30);
		p.setDay(Days.SUNDAY);
		var row = service.insertPersonWithParamsTypesAndValue(query,p);
		assertEquals(1, row);
	}
	
	@Test
	@Order(1)
	@DisplayName("1.insert person_tbl using with generate keys")
	@Sql(scripts = {
			"classpath:/person.sql",
			"classpath:/insert.sql"
	})
	void testOne(@Value("${p.prep.insert}")String query) {
		var p = new Person();
		p.setName("Sopheia");
		p.setAge(30);
		p.setDay(Days.SUNDAY);
		var key = service.insertPersonWithCreatorAndKeyHolder(p);
		System.out.println("Primary Key :"+key);
	}
}
