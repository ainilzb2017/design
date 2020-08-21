package com.ainilzb.patten.factory.factorymethod;

import com.ainilzb.patten.factory.ICourse;

//抽象类和接口的区别：抽象类里面可以写公共逻辑，即抽象类中可以有具体的方法
public abstract class ICourseFactory {
    public void preCreate(){

    }
    abstract ICourse create();
}
