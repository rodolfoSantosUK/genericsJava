package generics;

import java.util.Arrays;
import java.util.List;

public class GenericsDemo {

    public static void main(String[] args) {

        Container<String> stringStore = new Store<>();
        stringStore.set("Java");
        System.out.println(stringStore.get());

        Container<Integer> integerStore = new Store<>();
        integerStore.set(1);
        System.out.println(integerStore.get());

        Container<List<Integer>> listIntegerStore = new Store<>();
        listIntegerStore.set(Arrays.asList(1,2,3));
        System.out.println(listIntegerStore.get());

    }

}


interface Container<T> {

    void set(T a);

    T get();
}

class Store<T> implements Container<T> {

    private T a;

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }
}


