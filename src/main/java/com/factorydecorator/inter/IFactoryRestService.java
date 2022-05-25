package com.factorydecorator.inter;

import com.factorydecorator.imp.ConnectionSql;

public interface IFactoryRestService {
    IConecttion getService(String service);
}
