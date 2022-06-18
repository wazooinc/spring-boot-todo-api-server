package com.example.springboottodoapiserver.repositories;


import com.example.springboottodoapiserver.models.TodoItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {
}
