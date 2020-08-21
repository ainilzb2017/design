package com.ainilzb.patten.singleton.lazy;

public class LazySimpleSingleton {
    private static LazySimpleSingleton lazy = null;

    private LazySimpleSingleton(){}

    //加synchronized关键字，有线程进来，不允许第二个线程进入，第二个线程为监听monitor状态
    //JDK1.6之后对synchronized性能优化了不少，不可避免还是存在一定性能问题
    public synchronized static LazySimpleSingleton getInstance(){
        if(lazy == null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
