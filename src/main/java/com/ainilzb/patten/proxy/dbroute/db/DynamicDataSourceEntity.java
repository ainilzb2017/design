package com.ainilzb.patten.proxy.dbroute.db;

import com.sun.istack.internal.localization.NullLocalizable;

public class DynamicDataSourceEntity {
    public final static String DEFAULT_SOURCE = null;
    public final static ThreadLocal<String> local =new ThreadLocal<String>();
    private DynamicDataSourceEntity(){};

    public static String get(){
        return local.get();
    }

    public static void restore(){
        local.set(DEFAULT_SOURCE);
    }


    public static void set(String source){
        local.set(source);
    }
    public static void set(int year){
        local.set("DB_"+year);
    }



    //DB_2018
    //DB_2018

}
