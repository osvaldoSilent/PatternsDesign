package com.proxy.imp;

import com.proxy.interf.ICount;
import com.proxy.model.Count;

public class ImpCount implements ICount {

    Count cuenta;

    @Override
    public void connect(Count cuenta) {
        System.out.println("Imp count executed "+cuenta.getUser());
    }
}
