package com.examples;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<EvenNumber> le = new ArrayList<>();
        List<? extends NaturalNumber> ln = le;
        NaturalNumber nm = new NaturalNumber(35);
        //ln.add(nm);
    }


}
