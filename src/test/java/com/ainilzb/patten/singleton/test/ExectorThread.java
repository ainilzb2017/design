package com.ainilzb.patten.singleton.test;

import com.ainilzb.patten.singleton.lazy.LazyDoubleCheckSingleton;
import com.ainilzb.patten.singleton.lazy.LazySimpleSingleton;
import com.ainilzb.patten.singleton.threadlocal.ThreadLocalSingleton;

//不用线程池，就用两个线程演示全过程
public class ExectorThread implements Runnable{

    public void run() {
//        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName() +":"+ singleton);

//        LazyDoubleCheckSingleton singleton1 = LazyDoubleCheckSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName() +":"+ singleton1);

        ThreadLocalSingleton singleton1 = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() +":"+ singleton1);
    }
}
