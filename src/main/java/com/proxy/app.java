package com.proxy;

import com.proxy.interf.ICount;
import com.proxy.model.Count;
import com.proxy.proxy.ProxyCount;

public class app {
    public static void main(String[] args) {
        ICount c = new ProxyCount();
        c.connect(new Count("12345","Osvaldo"));
    }
}
