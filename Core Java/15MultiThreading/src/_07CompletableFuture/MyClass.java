package _07CompletableFuture;

import java.util.List;

public class MyClass implements Runnable{
    List<Integer> list;

    MyClass(List<Integer> list){
        this.list = list;
    }

    @Override
    public void run() {
        list.add(100);
    }
}
