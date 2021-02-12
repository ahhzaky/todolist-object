package view;

import service.TodoListService;
import util.InpuUtil;

public class TodoListView {

    private TodoListService todoListService;

    public TodoListView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    /**
     * menampilkan todo list
     */
    public void showTodoList(){
        while (true) {
            todoListService.showTodoList();

            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            // input dari user
            var input = InpuUtil.input("Pilih");

            if (input.equals("1")){
                addTodoList();
            } else if (input.equals("2")){
                removeTodoList();
            } else if (input.equals("x")){
                break;
            }
            else {
                System.out.println("Pilihan tidak ada");
            }
        }
    }

    /**
     * menambahkan Todo ke list
     */
    public void addTodoList(){

    }

    /**
     * hapus todo dari list
     */
    public void  removeTodoList(){

    }
}
