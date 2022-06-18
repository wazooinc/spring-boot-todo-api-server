package com.example.springboottodoapiserver.controllers;

import com.example.springboottodoapiserver.models.TodoItem;
import com.example.springboottodoapiserver.repositories.TodoItemRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todoitems")
public class TodoItemController {

    private TodoItemRepository todoItemRepository;

    public TodoItemController(TodoItemRepository todoItemRepository) {
        this.todoItemRepository = todoItemRepository;
    }

    @GetMapping("")
    public List<TodoItem> findAllTodoItems() {
        return (List<TodoItem>) todoItemRepository.findAll();
    }
}
