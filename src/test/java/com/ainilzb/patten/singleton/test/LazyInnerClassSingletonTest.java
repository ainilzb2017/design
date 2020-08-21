package com.ainilzb.patten.singleton.test;

import com.ainilzb.patten.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;
import java.util.Date;

public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
//        try {
//            //显然破坏了单例
//            Class<?> clazz = LazyInnerClassSingletonTest.class;
//            Constructor c = clazz.getDeclaredConstructor(null);
//            c.setAccessible(true);//强制访问
//            Object o1 = c.newInstance();
////            Object o2 = LazyInnerClassSingleton.getInstance();
//            Object o2 = new LazyInnerClassSingleton();
//            System.out.println(o1 == o2);
//
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        System.out.println(new Date());


    }
}
