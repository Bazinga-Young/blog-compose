package com.bazinga.blog.ToDoApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class InMemoryToDoRepository {
    private static final AtomicLong currentId = new AtomicLong();
    private static final Map<Long, ToDoItem> todoItemMemory = new ConcurrentHashMap<>();

    public static List<ToDoItem> findAll() {
        return new ArrayList<>(todoItemMemory.values());
    }

    public ToDoItem findById(Long id) {
        return todoItemMemory.get(id);
    }

    public static Long insert(ToDoItem toDoItem) {
        Long id = currentId.incrementAndGet();
        toDoItem.setId(id);
        todoItemMemory.putIfAbsent(toDoItem.getId(), toDoItem);
        return id;
    }

    public static void update(ToDoItem toDoItem) {
        todoItemMemory.replace(toDoItem.getId(), toDoItem);
    }

    public static void delete(ToDoItem toDoItem) {
        todoItemMemory.remove(toDoItem.getId());
    }
}
