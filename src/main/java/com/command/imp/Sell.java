package com.command.imp;

import com.command.interf.Order;
import com.command.model.Stock;

public class Sell implements Order {
    Stock stock;
    public Sell(Stock stock){
        this.stock = stock;
    }

    @Override
    public void execute() {
        if(stock.getQuantity()<=0){
            System.out.println("no more");
        }else{
            System.out.println(
                    stock.getProduct() + " is sell by " +stock.getPrice()
                            + " the stock was of "+stock.getQuantity()
                            + " and now is of "+(stock.getQuantity()-1)
            );
            stock.setQuantity((stock.getQuantity() - 1));
        }
    }
}
