package com.ainilzb.patten.factory.factorymethod;

import com.ainilzb.patten.factory.ICourse;
import com.ainilzb.patten.factory.JavaCourse;
import com.ainilzb.patten.factory.PythonCourse;

public class PythonCourseFactory extends ICourseFactory {

    public ICourse create() {
        return new PythonCourse();
    }
}
