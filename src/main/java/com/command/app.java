package com.command;

import com.command.imp.Buy;
import com.command.imp.Invoker;
import com.command.imp.Sell;
import com.command.model.Stock;

public class app {


    public static void main(String[] args) {
        Stock stock = new Stock("TVs",100,5);
        Invoker invoker = new Invoker();
        invoker.addOrder(new Buy(stock));
        invoker.addOrder(new Sell(stock));
        invoker.addOrder(new Sell(stock));
        invoker.addOrder(new Sell(stock));
        invoker.addOrder(new Sell(stock));
        invoker.addOrder(new Sell(stock));
        invoker.addOrder(new Sell(stock));
        invoker.addOrder(new Sell(stock));

        invoker.runOrders();
    }


}
