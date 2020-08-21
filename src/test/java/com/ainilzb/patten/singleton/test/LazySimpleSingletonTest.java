package com.ainilzb.patten.singleton.test;

import com.ainilzb.patten.singleton.lazy.LazySimpleSingleton;

public class LazySimpleSingletonTest {
    
    public static void main(String[] args) {
//        System.out.println(LazySimpleSingleton.getInstance());
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());

        t1.start();
        t2.start();

        System.out.println("Exector End");


    }
}
