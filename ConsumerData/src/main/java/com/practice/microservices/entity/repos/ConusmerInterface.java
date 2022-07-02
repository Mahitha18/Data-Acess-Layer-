package com.practice.microservices.entity.repos;

import org.springframework.data.repository.CrudRepository;

import com.practice.microservices.entity.Consumer;

public interface ConusmerInterface extends CrudRepository<Consumer , Long> {

}
