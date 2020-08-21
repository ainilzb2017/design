package com.ainilzb.patten.singleton.threadlocal;

public class ThreadLocalSingleton {

    //这是注册式容器单例
    //底层是map存储，把线程名作为key，把相应的操作作为value，实现线程内安全的单例模式。
    //伪线程安全
    //使用ThreadLocal来实现多数据源动态切换
    //将spring源码时候，会了解手写ORM且实现多数据源动态切换
    //数据源路由
    private ThreadLocalSingleton(){}

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }

}
