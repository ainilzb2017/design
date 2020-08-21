package com.ainilzb.patten.singleton.test;

import com.ainilzb.patten.singleton.register.ContainerSingleton;

public class ContainerSingletonTest {
    public static void main(String[] args) {

        //发令枪
        try {
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                public void handler() {
                    Object obj =  ContainerSingleton.getBean("com.ainilzb.patten.singleton.test.Pojo");
                    System.out.println(System.currentTimeMillis() + ":" + obj);
                }
            },10,6);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
