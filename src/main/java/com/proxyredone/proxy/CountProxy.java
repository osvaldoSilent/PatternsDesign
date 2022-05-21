package com.proxyredone.proxy;

import com.proxyredone.imp.CountImp;
import com.proxyredone.interf.ICount;
import com.proxyredone.model.Count;

public class CountProxy implements ICount {
    CountImp countImp;
    @Override
    public Count addAmount(Count c, double amount) {
        countImp=new CountImp();
        return countImp.addAmount(c,amount);
    }

    @Override
    public Count takeOutAmount(Count c, double amount) {
        countImp=new CountImp();
        return countImp.takeOutAmount(c,amount);
    }

    @Override
    public double getAmount(Count c) {
        return c.getAmount();
    }
}
