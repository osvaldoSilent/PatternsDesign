package com.proxyredone.interf;

import com.proxyredone.model.Count;

public interface ICount {
    Count addAmount(Count c, double amount);
    Count takeOutAmount(Count c, double amount);
    double getAmount(Count c);
}
