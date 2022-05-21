package com.proxyredone;

import com.proxyredone.interf.ICount;
import com.proxyredone.model.Count;
import com.proxyredone.proxy.CountProxy;

public class app {
    public static void main(String[] args) {
        Count count= new Count();
        count.setIdUser(1);
        count.setUser("Osvaldo");
        count.setAmount(100);
        ICount c = new CountProxy();

        System.out.println("Count of "+ count.getUser() +" has "+ count.getAmount() + " euros" );
        c.addAmount(count,100);
        System.out.println("Count of "+ count.getUser() +" has "+ count.getAmount() + " euros" );
        c.takeOutAmount(count,200);
        System.out.println("Count of "+ count.getUser() +" has "+ count.getAmount() + " euros" );

    }
}
