package com.ainilzb.patten.factory.simplefactory;

import com.ainilzb.patten.factory.ICourse;
import com.ainilzb.patten.factory.JavaCourse;
import com.ainilzb.patten.factory.PythonCourse;

public class CourseFactory {
//    public ICourse create(String name){
//        if("java".equals(name)){
//            return new JavaCourse();
//        }else {
//            return new PythonCourse();
//        }
//    }

//    public ICourse create(String className) {
//        try {
//            if (!(null == className || "".equals(className))) {
//                return (ICourse) Class.forName(className).newInstance();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    public ICourse create(Class clazz) {
        try {
            if (null != clazz) {
                return (ICourse) clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
