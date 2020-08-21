package com.ainilzb.patten.singleton.hungry;

//饿汉式单例模式：
//缺点：浪费内存空间
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungrySingleton;
    static {
        hungrySingleton = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){}

    public static HungryStaticSingleton genInstance(){
        return hungrySingleton;
    }
}
