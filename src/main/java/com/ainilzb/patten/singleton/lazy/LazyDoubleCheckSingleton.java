package com.ainilzb.patten.singleton.lazy;

public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton(){}

    //适中的方案
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazy == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazy == null) {
                    lazy = new LazyDoubleCheckSingleton();
                    //CPU执行时候会换成JVM指令
                    //指令重排序问题，volatile
                    //1.分配内存给对象
                    //2.初始化对象
                    //3.将初始化好的对象和内存地址建立关联，赋值
                    //4.用户初次访问
                }
            }
        }
        return lazy;
    }
}
