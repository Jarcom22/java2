package Tugas_Dasar;

import java.util.*;

public class ContohCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Item 1");

        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.addFirst("Antrean 1");

        System.out.println("ArrayList: " + list);
        System.out.println("ArrayDeque: " + deque);
    }
}