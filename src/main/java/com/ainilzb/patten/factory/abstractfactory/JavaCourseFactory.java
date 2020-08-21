package com.ainilzb.patten.factory.abstractfactory;

import com.ainilzb.patten.factory.ICourse;
import com.ainilzb.patten.factory.JavaCourse;

public class JavaCourseFactory  implements ICourseFactory{

    public ICourse createCourse() {
        return new JavaCourse();
    }

    public INote createNote() {
        return new JavaNote();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }
}
