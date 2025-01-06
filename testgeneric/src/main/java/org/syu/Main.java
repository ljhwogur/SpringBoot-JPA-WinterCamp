package org.syu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box<Integer> a = new Box<>();
        a.setItem(3);

        Box<Man> b = new Box<>();
        b.setItem(new Man(3,4));

        Man x = b.getItem();

        System.out.println("a=>" + a.getItem());
        System.out.println("b=>" + x.sum());
    }
}