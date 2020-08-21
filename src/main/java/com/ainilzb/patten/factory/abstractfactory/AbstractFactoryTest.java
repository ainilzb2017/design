package com.ainilzb.patten.factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        factory.createCourse().record();
        System.out.println(factory.createNote());
        System.out.println(factory.createVideo());


    }
}
