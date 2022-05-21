package com.proxy.proxy;

import com.proxy.imp.ImpCount;
import com.proxy.interf.ICount;
import com.proxy.model.Count;

public class ProxyCount implements ICount {
    @Override
    public void connect(Count c) {
        ImpCount count = new ImpCount();
        count.connect(c);
    }
}
