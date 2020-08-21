package com.ainilzb.patten.singleton.hungry;

public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){}

    public static HungrySingleton genInstance(){
        return hungrySingleton;
    }
}
