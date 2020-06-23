package com.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperWildCard {

    public static void main(String[] args) {
        List<Long> list = Arrays.asList(1l,2l,3l,4l,5l);
        System.out.println("sum of longs = " + sumOfList(list));

        List<Integer> li = Arrays.asList(1, 2, 3);
        System.out.println("sum of Integers = " + sumOfList(li));

        List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
        System.out.println("sum of doubles= " + sumOfList(ld));

        List<? super Integer> numbers = new ArrayList<>();
        //this is not going to work
        numbers.add(2);   // COMPILE ERROR

    }

    //this will work only for number not generic one
    private static long sum(List< Number> values){

        long total =0;
        for (Number num : values ) {
            total = total + (int)num;
        }
        return total;
    }

    //this will for generic
    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }
}
