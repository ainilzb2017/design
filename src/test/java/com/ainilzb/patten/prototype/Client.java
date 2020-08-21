package com.ainilzb.patten.prototype;

import com.ainilzb.patten.prototype.simple.Prototype;

public class Client {
//    private Prototype prototype;
//    public Client(Prototype prototype){
//        this.prototype = prototype;
//    }

    public Prototype startClone(Prototype concretePrototype){
        return concretePrototype.clone();
    }
}
