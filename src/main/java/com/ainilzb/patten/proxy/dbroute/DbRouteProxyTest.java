package com.ainilzb.patten.proxy.dbroute;

import com.ainilzb.patten.proxy.dbroute.proxy.OrderServiceStaticProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DbRouteProxyTest {
    public static void main(String[] args) {

            Order order = new Order();
            order.setCreateTime(new Date().getTime());


            IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
            orderService.createOrder(order);
    }

}




//public class DbRouteProxyTest {
//    public static void main(String[] args) {
//        try {
//            Order order = new Order();
//
////            order.setCreateTime(new Date().getTime());
//
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//            Date date = sdf.parse("2017/02/01");
//            order.setCreateTime(date.getTime());
//
//            IOrderService orderService = (IOrderService)new OrderServiceDynamicProxy().getInstance(new OrderService());
//            orderService.createOrder(order);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//    }
//
//}

