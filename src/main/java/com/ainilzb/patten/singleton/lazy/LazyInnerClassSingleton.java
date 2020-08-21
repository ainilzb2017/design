package com.ainilzb.patten.singleton.lazy;

//全程没有用到synchronized关键字
//性能最优的一种写法
public class LazyInnerClassSingleton {

    //虽然构造方法有了，但是逃不过反射的法眼，可以被反射到
    public LazyInnerClassSingleton(){
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不允许构建多个实例");
        }
    }
    //懒汉式单例
    //LazyHolder里面的逻辑需要等到外面方法调用时才执行
    //巧妙利用了内部类的特性
    //JVM底层执行逻辑，完美地避免了线程安全问题
    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
