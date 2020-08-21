package com.ainilzb.patten.factory.factorymethod;

import com.ainilzb.patten.factory.ICourse;
import com.ainilzb.patten.factory.JavaCourse;

public class JavaCourseFactory extends ICourseFactory {

    public ICourse create() {
        return new JavaCourse();
    }
}
