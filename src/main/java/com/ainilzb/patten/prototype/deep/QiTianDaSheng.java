package com.ainilzb.patten.prototype.deep;


import java.io.*;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Tom.
 */
public class QiTianDaSheng extends Monkey implements Cloneable,Serializable {

    public JinGuBang jinGuBang;

    //深克隆的原因是每个猴子都需要一根金箍棒
    public  QiTianDaSheng(){
        //只是初始化
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    //克隆方法，采用的是深克隆
    //可能会出现单例被破坏的问题
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
//        return INSTANCE;//或者写readResolve方法
    }


    public Object deepClone(){
        try{

            //内存中完成操作，对象读写，总是通过字节码直接操作
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //完整的新对象
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            QiTianDaSheng copy = (QiTianDaSheng)ois.readObject();
            copy.birthday = new Date();
            return copy;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }


    public QiTianDaSheng shallowClone(QiTianDaSheng target){

        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.height = target.height;
        qiTianDaSheng.weight = target.height;

        qiTianDaSheng.jinGuBang = target.jinGuBang;
        qiTianDaSheng.birthday = new Date();
        return  qiTianDaSheng;
    }


//    用到原型模式的例子：
//    ArrayList<?> arr =
    //ArrayList是把内部的元素一个一个迭代，再进行赋值

}
