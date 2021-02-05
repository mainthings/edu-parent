package com.edu.factorymethod;

import com.edu.dto.NetDo;
import com.edu.simplefactory.ItDo;

/**
 * @Description net 工厂
 * @author: GT
 * @Date: 2021/2/5 15:02
 * @Version 1.0
 */
public class NetFactoryMethod implements IHrFactoryMethod {
    @Override
    public ItDo getHrFactory() {
        return new NetDo();
    }
}