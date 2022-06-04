package com.command.imp;

import com.command.interf.Order;
import com.command.model.Stock;

public class Buy implements Order {
    Stock stock;
    public Buy(Stock stock){
        this.stock = stock;
    }


    @Override
    public void execute() {
        System.out.println(
                stock.getProduct() + " is bought by " +stock.getPrice()
                        + " the stock was of "+stock.getQuantity()
                        + " and now is of "+(stock.getQuantity()+1)
        );
        stock.setQuantity((stock.getQuantity() + 1));

    }
}
