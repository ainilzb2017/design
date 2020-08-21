package com.ainilzb.patten.prototype;

import com.ainilzb.patten.prototype.simple.ConcretePrototypeA;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {
    public static void main(String[] args) {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();

        concretePrototypeA.setName("Tom");
        concretePrototypeA.setAge(18);
        List hobbies = new ArrayList<String>();
        concretePrototypeA.setHobbies(hobbies);

        Client client = new Client();
        ConcretePrototypeA copy = (ConcretePrototypeA)client.startClone(concretePrototypeA);
        System.out.println(copy);

//        ConcretePrototypeA copy = (ConcretePrototypeA) concretePrototypeA.clone();
//        System.out.println();

        System.out.println("克隆对象中引用类型地址的值:" + copy.getHobbies());
        System.out.println("原对象中的引用类型地址的值:" + concretePrototypeA.getHobbies());
        System.out.println("对象地址比较：" + (copy.getHobbies() == concretePrototypeA.getHobbies()));


    }
}
