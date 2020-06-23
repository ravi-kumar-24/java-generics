package com.wildcard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LowerBondedWildCard {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        addNumbers(list);
        list.forEach(System.out::println);
        List<? extends Integer> intList = new ArrayList<>();
        List<? extends Number>  numList =intList;

        List<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        append(numbers, 3);
    }

    public static void append(Collection<? super Integer> integers, int n) {
        for (int i = 1; i <= n; i++) {
            integers.add(i);
        }
    }
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
}
