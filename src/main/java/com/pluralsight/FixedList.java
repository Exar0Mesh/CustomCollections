package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private int maxSize;
    private List<T> items;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>(maxSize);
    }



    private void add(T item) {
        if (maxSize > 0) {
            items.add(item);
            maxSize--;
        } else {
            System.out.println("Error, reached Max Size");
        }
    }

    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println(numbers.getItems());
    }

    public List<T> getItems() {
        return items;
    }

    public int getMaxSize() {
        return maxSize;
    }
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
}
