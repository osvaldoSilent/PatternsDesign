package com.proxyredone.imp;


import com.proxyredone.interf.ICount;
import com.proxyredone.model.Count;

public class CountImp implements ICount {


    @Override
    public Count addAmount(Count c, double amount) {
        c.setAmount(c.getAmount()+amount);
        return c;
    }

    @Override
    public Count takeOutAmount(Count c, double amount) {
        c.setAmount(c.getAmount()-amount);
        return c;
    }

    @Override
    public double getAmount(Count c) {
        return c.getAmount();
    }
}
