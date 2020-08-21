package com.ainilzb.patten.factory.factorymethod;

import com.ainilzb.patten.factory.ICourse;
import org.slf4j.ILoggerFactory;
import org.slf4j.LoggerFactory;

public class FactoryMenthodTest {
    public static void main(String[] args) {
        ICourseFactory factory=new PythonCourseFactory();
        ICourse course =factory.create();
        course.record();

        //工厂方法模式的例子有：
//        LoggerFactory.getLogger();
//        ILoggerFactory

//        优点：只用关心产品所对应的工厂，无需关心创建细节。
//        缺点：类的个数过多，增加系统的抽象性和理解难度。


    }
}
