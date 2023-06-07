package HW4z4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    private T[] data;


    public DataContainer(T[] data) {
        this.data = data;
    }

    public void add(T element) {
        data = Arrays.copyOf(data, data.length + 1);
        data[data.length - 1] = element;
    }

    public T get(int index) {
        return data[index];
    }

    public void sort(Comparator<T> comparator) {
        Arrays.sort(data, comparator);
    }

    public void print() {
        for (T element : data) {
            System.out.println(element);
        }
    }


}