package com.practice.microservices;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.practice.microservices.entity.Consumer;
import com.practice.microservices.entity.repos.ConusmerInterface;

@SpringBootTest
class ConsumerDataApplicationTests {
	
	@Autowired
	private ConusmerInterface repo;

	@Test
	void testcreateConstomer() {
		Consumer consumer =new Consumer();
		consumer.setName("Mahitha");
		consumer.setEmail("mahitha@gmail.com");
		repo.save(consumer);
	}
	
	@Test
	void testUpdateConsumer() {
		Consumer consumer=repo.findById(1l).get();
		
		consumer.setName("Lakshmi Mahitha");
		repo.save(consumer);
	}
	@Test
	void testRetriveRecors() {
		Consumer consumer=repo.findById(2l).get();
		System.out.println(consumer);
	}
	
	@Test
	void testDeleteRecords() {
		Consumer conusmer=repo.findById(1l).get();
		repo.delete(conusmer);
	}

}
