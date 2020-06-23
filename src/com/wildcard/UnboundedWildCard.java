package com.wildcard;

import com.model.Person;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildCard {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String>  ls = Arrays.asList("one", "two", "three");
        printList1(li);
        printList1(ls);

        Person p1 = new Person(1,"ravi",34,"bam");
        Person p2 = new Person(2,"ved",5,"bangalore");
        Person p3 = new Person(3,"shivay",1,"bangalore");
        Person p4 = new Person(4,"ashish",22,"bam");

        List<Person> pList = Arrays.asList(p1,p2,p3,p4);
        printList1(pList);

    }

    public static void printList(List<? extends Object> objects){
        for(Object obj: objects){
            System.out.println(obj);
        }
    }

    public static void printList1(List<?> list) {
        for (Object elem: list)
            System.out.print(elem + " ");
        System.out.println();
    }
}
