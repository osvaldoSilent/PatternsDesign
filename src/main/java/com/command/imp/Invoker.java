package com.command.imp;

import com.command.interf.Order;
import com.command.model.Stock;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    List<Order> orderList;
    public Invoker(){
        this.orderList = new ArrayList<>();
    }
    public void addOrder(Order order){
        orderList.add(order);
    }
    public void runOrders(){
        for (Order order : orderList) {
            order.execute();
        }
    }


}
