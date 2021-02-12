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
        System.out.println("MENAMBAH TODOLIST");

        var todo = InpuUtil.input("Todo (x Jika Batal)");

        if (todo.equals("x")){
            // batal
        } else {
            todoListService.addTodoList(todo);
        }
    }

    /**
     * hapus todo dari list
     */
    public void  removeTodoList(){
        System.out.println("MENGHAPUS TODOLIST");

        var number = InpuUtil.input("Nomor yang dihapus (x Jika Batal)");

        if (number.equals("x")){
            // batal
        } else {
            todoListService.removeTodoList(Integer.valueOf(number));
            }
        }

}
