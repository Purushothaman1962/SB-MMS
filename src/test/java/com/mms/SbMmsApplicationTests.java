package com.mms;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mms.bean.Movie;
import com.mms.controller.MMSController;


@TestMethodOrder(OrderAnnotation.class)
@SpringBootTest
class SbMmsApplicationTests {
	
	@Autowired
	MMSController controller;
	
	String insert;
	String update;
	String delete;
	String result;
	String result1;
	List<Movie> list = new ArrayList<Movie>();
	List<Movie> list1 = new ArrayList<Movie>();
	Movie mv = new Movie(201,"Leo","Thriller","Tamil","2hr30mins");
	Movie mv1 = new Movie(301,"Leo","Thriller","Tamil","2hr30mins");
	Movie mv2;
	Movie mv3;
	
	@Test
	@Order(1)    
	void testPerformInsert() {
		insert="Inserted";
		result=controller.performInsert(mv);
		assertEquals(insert,result);
	}
	
	@Test
	@Order(2)
	void testPerformUpdate() {
		update="Updated";
		result=controller.PerformUpdate(mv1);
		assertEquals(update,result);
	}
	
	@Test
	@Order(3)
	void testPerformDelete() {
		delete="Deleted";
		result=controller.performDelete(201);
		result1=controller.performDelete(301);
		assertEquals(delete,result);
	}

}
