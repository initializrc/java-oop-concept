import java.util.ArrayList;

// membuat template dengan karakteristik ArrayList
public class GenericClass<E>{
    ArrayList<E> list = new ArrayList<E>();

    // untuk menambah data
    public void push(E e){
        list.add(e);
    }

    // untuk mengambil jumlah data
    public int getSize(){
        return list.size();
    }

    // untuk menghapus data
    public E pop(){
        E e = list.get(getSize() - 1);
        list.remove(getSize() - 1);

        return e;
    }
}
