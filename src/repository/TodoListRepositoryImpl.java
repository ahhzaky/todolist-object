package repository;

import entity.Todolist;

public class TodoListRepositoryImpl implements TodoListRepository{

    public Todolist[] data = new Todolist[10];

    @Override
    public Todolist[] getAll() {
        return data;
    }

    public boolean isFull(){
        //  apakah di sudah penuh jika dia ada yang null maka ia masih kosong jika tidak masih ada
        var isFull = true;
        for (int i = 0; i< data.length; i++){
            if (data[i] == null){
                // model masih ada yang kosong
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    public void  resizeIfFull(){
        // jika penuh , kita resize ukuran array 2x lipat
        if (isFull()) {
            var temp = data;
            data = new Todolist[data.length * 2];

            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }
    }

    @Override
    public void add(Todolist todolist) {
        // panggil method
        resizeIfFull();

        // tambahkan ke posisi yang data arraynya null
        for (var i = 0; i < data.length; i++){
            // cek apakah indexnya null baru di masukkan
            if(data[i] == null){
                // todolist dari para meter
                data[i] =  todolist;
                break; // selesai jika sudah dimasukkan ke yang null
            }
        }
    }

    @Override
    public boolean remove(Integer number) {
        if (number - 1 >= data.length){
            return false;

        }else if (data[number - 1] == null){
            return false;
        }else {
            for (int i = (number - 1); i < data.length; i++) {
                if (i == data.length - 1) {
                    data[i] = null;
                } else {
                    data[i] = data[i+1];
                }
            }
            return true; // maka ia bisa di hapus
        }
    }
}
