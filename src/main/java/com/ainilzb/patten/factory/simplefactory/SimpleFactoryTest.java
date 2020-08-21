package com.ainilzb.patten.factory.simplefactory;

import com.ainilzb.patten.factory.ICourse;
import com.ainilzb.patten.factory.JavaCourse;
import org.slf4j.LoggerFactory;

import java.util.Calendar;

public class SimpleFactoryTest {
    public static void main(String[] args) {
//        ICourse course=new JavaCourse();
//        course.record();

//        CourseFactory factory=new CourseFactory();
//        ICourse course=factory.create("java");
//        course.record();

//        CourseFactory factory=new CourseFactory();
//        ICourse course=factory.create("com.ainilzb.patten.factory.PythonCourse");
//        course.record();

//        CourseFactory factory=new CourseFactory();
//        ICourse course=factory.create(JavaCourse.class);
//        course.record();

        //使用到简单工厂的一些类，可以适当看下源码。
//        Calendar
//        LoggerFactory.getLogger();
//        快捷键：按住ctrl+alt+B，找到方法所有的实现类。

        //客户端只需要传入参数，就可以获得所需要的对象，不需要知道创建的细节。
        //缺点：不易扩展，违背开闭原则。

    }
}
