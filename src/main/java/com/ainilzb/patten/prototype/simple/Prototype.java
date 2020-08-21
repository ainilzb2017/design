package com.ainilzb.patten.prototype.simple;


//深克隆
//浅克隆：只简单克隆地址，存在隐患
//对象的地址和对象的值
public interface Prototype {
    Prototype clone();
}
