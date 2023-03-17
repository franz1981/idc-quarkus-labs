package com.example;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo,Long> {

    List<Todo> findAllByOrderByOrder();
}
