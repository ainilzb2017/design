package com.ainilzb.patten.factory.abstractfactory;

import com.ainilzb.patten.factory.ICourse;

//要求所有子工厂都实现这个工厂
//一个品牌的抽象
//抽象工厂不符合开闭原则
//优点：扩展性强
public interface ICourseFactory {
    ICourse createCourse();

    INote createNote();

    IVideo createVideo();

}
