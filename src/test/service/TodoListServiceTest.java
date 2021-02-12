package test.service;

import entity.Todolist;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {
    public static void main(String[] args) {
        testRemoveTodoList();
    }

    public static void testShowTodoList(){
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.data[0] = new Todolist("Belajar Java");
        todoListRepository.data[1] = new Todolist("Belajar Python");
        todoListRepository.data[2] = new Todolist("Belajar Golang");



        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();
    }

    public static void  testAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Belajar Java v2");
        todoListService.addTodoList("Belajar Python v2");
        todoListService.addTodoList("Belajar Golang v2");

        todoListService.showTodoList();
    }

    public static void testRemoveTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Belajar Java v2");
        todoListService.addTodoList("Belajar Python v2");
        todoListService.addTodoList("Belajar Golang v2");

        todoListService.showTodoList();

        todoListService.removeTodoList(2);

        todoListService.showTodoList();

    }
}
